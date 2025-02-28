package com.example.baitaptulam.Food;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FoodViewPagerAdapter extends FragmentStatePagerAdapter {
    public FoodViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FlashFoodFragment();
            case 1:
                return new DrinksFragment();
            default:
                return new FlashFoodFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "FlashFood";
            case 1:
                return "Drinks";
            default:
                return "FlashFood";
        }
    }
}
