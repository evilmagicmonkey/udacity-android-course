package com.example.android.inventoryapp;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.android.inventoryapp.data.InventoryContract.InventoryEntry;

public class InventoryCursorAdapter extends CursorAdapter {

    public InventoryCursorAdapter(Context context, Cursor c) {
        super(context, c, 0 /* flags */);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }

    @Override
    public void bindView(View view, final Context context, Cursor cursor) {

        TextView productNameTextView = view.findViewById(R.id.product_name);
        TextView quantityTextView = view.findViewById(R.id.product_quantity);
        TextView priceTextView = view.findViewById(R.id.product_price);
        TextView sellButton = view.findViewById(R.id.sell_button);

        int productNameColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_PRODUCT_NAME);
        int quantityColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_PRODUCT_QUANTITY);
        int priceColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_PRODUCT_PRICE);

        String productName = cursor.getString(productNameColumnIndex);
        String quantity = cursor.getString(quantityColumnIndex);
        String price = cursor.getString(priceColumnIndex);
        final int productQuantity = cursor.getInt(quantityColumnIndex);

        productNameTextView.setText(productName);
        quantityTextView.setText(quantity);
        priceTextView.setText(price);
        final int id = cursor.getInt(cursor.getColumnIndex(InventoryEntry._ID));

        sellButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int newQuantity = productQuantity - 1;
                Uri quantityUri = ContentUris.withAppendedId(InventoryEntry.CONTENT_URI, id);
                ContentValues values = new ContentValues();

                if (productQuantity > 0) {
                    values.put(InventoryEntry.COLUMN_PRODUCT_QUANTITY, newQuantity);
                }
                context.getContentResolver().update(quantityUri, values, null, null);
            }
        });
    }
}
