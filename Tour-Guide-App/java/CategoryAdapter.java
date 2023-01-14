package com.example.android.bowerstonetourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MarketFragment();
        } else if (position == 1) {
            return new HomesFragment();
        } else if (position == 2) {
            return new LandmarksFragment();
        } else {
            return new GraveyardFragment();
        }
    }

    public int getCount() {
        return 4;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_market);
        } else if (position == 1) {
            return mContext.getString(R.string.category_homes);
        } else if (position == 2) {
            return mContext.getString(R.string.category_landmarks);
        } else {
            return mContext.getString(R.string.category_graveyard);
        }
    }
}