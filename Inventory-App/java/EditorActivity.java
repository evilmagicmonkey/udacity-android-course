package com.example.android.inventoryapp;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.NavUtils;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;

import com.example.android.inventoryapp.data.InventoryContract.InventoryEntry;

public class EditorActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    private static final int EXISTING_INVENTORY_LOADER = 0;
    private Uri mCurrentInventoryUri;

    private EditText mProductNameText;
    private EditText mProductPriceText;
    private TextView mProductQuantityText;
    private EditText mSupplierNameText;
    private EditText mSupplierPhoneNumberText;

    final int MAX_QUANTITY = 50;

    private boolean mInventoryHasChanged = false;

    private View.OnTouchListener mTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            mInventoryHasChanged = true;
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);
        Button button = findViewById(R.id.buttonCall);

        Intent intent = getIntent();
        mCurrentInventoryUri = intent.getData();

        if (mCurrentInventoryUri == null) {
            setTitle(R.string.editor_activity_title_add_inventory);
            invalidateOptionsMenu();
            button.setVisibility(View.GONE);
        } else {
            setTitle(R.string.editor_activity_title_edit_inventory);
            getSupportLoaderManager().initLoader(EXISTING_INVENTORY_LOADER, null, this);
        }

        mProductNameText = findViewById(R.id.edit_product_name);
        mProductPriceText = findViewById(R.id.edit_product_price);
        mProductQuantityText = findViewById(R.id.quantity_text_view);
        mSupplierNameText = findViewById(R.id.edit_supplier_name);
        mSupplierPhoneNumberText = findViewById(R.id.edit_supplier_phone_number);
        final TextView quantityView = findViewById(R.id.quantity_text_view);

        mProductNameText.setOnTouchListener(mTouchListener);
        mProductPriceText.setOnTouchListener(mTouchListener);
        mProductQuantityText.setOnTouchListener(mTouchListener);
        mSupplierNameText.setOnTouchListener(mTouchListener);
        mSupplierPhoneNumberText.setOnTouchListener(mTouchListener);

        findViewById(R.id.decrement).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentQuantity = quantityView.getText().toString();
                if (TextUtils.isEmpty(currentQuantity) || currentQuantity == null) {
                    currentQuantity = String.valueOf(1);
                }
                int quantityInt = Integer.parseInt(currentQuantity);
                if (quantityInt <= 0) {
                    Toast.makeText(getApplicationContext(), R.string.quantity_decrement_warning, Toast.LENGTH_SHORT).show();
                } else {
                    quantityInt--;
                    quantityView.setText(String.valueOf(quantityInt));
                }
            }
        });

        findViewById(R.id.increment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentQuantity = quantityView.getText().toString();
                if (TextUtils.isEmpty(currentQuantity) || currentQuantity == null) {
                    currentQuantity = String.valueOf(1);
                }
                int quantityInt = Integer.parseInt(currentQuantity);
                if (quantityInt == MAX_QUANTITY) {
                    Toast.makeText(getApplicationContext(), R.string.quantity_increment_warning, Toast.LENGTH_SHORT).show();
                } else {
                    quantityInt++;
                    quantityView.setText(String.valueOf(quantityInt));
                }
            }
        });


    }

    private void showUnsavedChangesDialog(
            DialogInterface.OnClickListener discardButtonClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.unsaved_changes_dialog_msg);
        builder.setPositiveButton(R.string.discard, discardButtonClickListener);
        builder.setNegativeButton(R.string.keep_editing, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public void onBackPressed() {
        if (!mInventoryHasChanged) {
            super.onBackPressed();
            return;
        }
        DialogInterface.OnClickListener discardButtonClickListener =
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                };

        showUnsavedChangesDialog(discardButtonClickListener);
    }

    private void saveInventory() {
        String productNameString = mProductNameText.getText().toString().trim();
        String productPriceString = mProductPriceText.getText().toString().trim();
        String productQuantityString = mProductQuantityText.getText().toString().trim();
        String supplierNameString = mSupplierNameText.getText().toString().trim();
        String supplierPhoneNumberString = mSupplierPhoneNumberText.getText().toString().trim();

        if (mCurrentInventoryUri == null &&
                TextUtils.isEmpty(productNameString) &&
                TextUtils.isEmpty(productPriceString) &&
                TextUtils.isEmpty(supplierNameString) &&
                TextUtils.isEmpty(supplierPhoneNumberString)) {
            Toast.makeText(this, getString(R.string.insert_details_toast), Toast.LENGTH_SHORT).show();
            return;
        }
        ContentValues values = new ContentValues();

        if (!TextUtils.isEmpty(productNameString)) {
            values.put(InventoryEntry.COLUMN_PRODUCT_NAME, productNameString);
        } else {
            Toast.makeText(this, getString(R.string.product_name_required), Toast.LENGTH_SHORT).show();
            return;
        }

        if (!TextUtils.isEmpty(supplierNameString)) {
            values.put(InventoryEntry.COLUMN_SUPPLIER_NAME, supplierNameString);
        } else {
            Toast.makeText(this, getString(R.string.supplier_name_required), Toast.LENGTH_SHORT).show();
            return;
        }

        if (!TextUtils.isEmpty(productPriceString)) {
            values.put(InventoryEntry.COLUMN_PRODUCT_PRICE, productPriceString);
        } else {
            Toast.makeText(this, getString(R.string.price_required), Toast.LENGTH_SHORT).show();
            return;
        }

        if (!TextUtils.isEmpty(supplierPhoneNumberString)) {
            values.put(InventoryEntry.COLUMN_SUPPLIER_PHONE_NUMBER, supplierPhoneNumberString);
        } else {
            Toast.makeText(this, getString(R.string.phone_number_required), Toast.LENGTH_SHORT).show();
            return;
        }


        int quantity = 0;
        if (!TextUtils.isEmpty(productQuantityString)) {
            quantity = Integer.parseInt(productQuantityString);
        }

        values.put(InventoryEntry.COLUMN_PRODUCT_QUANTITY, quantity);

        if (mCurrentInventoryUri == null) {
            Uri newUri = getContentResolver().insert(InventoryEntry.CONTENT_URI, values);
            if (newUri != null) {
                Toast.makeText(this, getString(R.string.editor_insert_inventory_successful),
                        Toast.LENGTH_SHORT).show();
                finish();
            }
        } else {
            int rowsAffected = getContentResolver().update(mCurrentInventoryUri,
                    values, null, null);
            if (rowsAffected != 0) {
                Toast.makeText(this, getString(R.string.editor_update_inventory_successful),
                        Toast.LENGTH_SHORT).show();
                finish();
            }
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_editor, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        if (mCurrentInventoryUri == null) {
            MenuItem menuItem = menu.findItem(R.id.action_delete);
            menuItem.setVisible(false);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_save:
                saveInventory();
                return true;
            case R.id.action_delete:
                showDeleteConfirmationDialog();
                return true;
            case android.R.id.home:
                if (!mInventoryHasChanged) {
                    NavUtils.navigateUpFromSameTask(EditorActivity.this);
                    return true;
                }
                DialogInterface.OnClickListener discardButtonClickListener =
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                NavUtils.navigateUpFromSameTask(EditorActivity.this);
                            }
                        };
                showUnsavedChangesDialog(discardButtonClickListener);
        }
        return super.onOptionsItemSelected(item);
    }


    @NonNull
    @Override
    public Loader<Cursor> onCreateLoader(int i, @Nullable Bundle bundle) {

        String[] projection = {
                InventoryEntry._ID,
                InventoryEntry.COLUMN_PRODUCT_NAME,
                InventoryEntry.COLUMN_PRODUCT_QUANTITY,
                InventoryEntry.COLUMN_PRODUCT_PRICE,
                InventoryEntry.COLUMN_SUPPLIER_NAME,
                InventoryEntry.COLUMN_SUPPLIER_PHONE_NUMBER};

        return new CursorLoader(this,
                mCurrentInventoryUri,
                projection,
                null,
                null,
                null);
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        if (cursor == null || cursor.getCount() < 1) {
            return;
        }
        if (cursor.moveToFirst()) {

            int productNameColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_PRODUCT_NAME);
            int priceColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_PRODUCT_PRICE);
            int quantityColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_PRODUCT_QUANTITY);
            int supplierNameColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_SUPPLIER_NAME);
            int phoneNumberColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_SUPPLIER_PHONE_NUMBER);

            String productName = cursor.getString(productNameColumnIndex);
            String supplierName = cursor.getString(supplierNameColumnIndex);
            final String phoneNumber = cursor.getString(phoneNumberColumnIndex);
            final int price = cursor.getInt(priceColumnIndex);
            final int quantity = cursor.getInt(quantityColumnIndex);


            mProductNameText.setText(productName);
            mSupplierNameText.setText(supplierName);
            mSupplierPhoneNumberText.setText(phoneNumber);
            mProductPriceText.setText(Integer.toString(price));
            mProductQuantityText.setText(Integer.toString(quantity));

            Button button = findViewById(R.id.buttonCall);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    dialContactPhone(getString(R.string.area_code) + phoneNumber);
                }
            });


        }
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

        mProductNameText.setText("");
        mSupplierNameText.setText("");
        mProductQuantityText.setText("");
        mProductPriceText.setText("");
        mSupplierPhoneNumberText.setText("");
    }

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }

    private void showDeleteConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.delete_product_dialog_msg);
        builder.setPositiveButton(R.string.delete, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                deleteInventory();
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void deleteInventory() {
        if (mCurrentInventoryUri != null) {
            int rowsDeleted = getContentResolver().delete(mCurrentInventoryUri, null, null);
            if (rowsDeleted == 0) {
                Toast.makeText(this, getString(R.string.editor_delete_product_failed),
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, getString(R.string.editor_delete_product_successful),
                        Toast.LENGTH_SHORT).show();
            }
        }
        finish();
    }
}






