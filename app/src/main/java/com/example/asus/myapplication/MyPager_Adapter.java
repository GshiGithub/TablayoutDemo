package com.example.asus.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by ASUS on 2017/12/21.
 */

public class MyPager_Adapter extends FragmentPagerAdapter{

    private List<My_frame> fragmentList ;
    private List<String> namelist;
    public MyPager_Adapter(FragmentManager fm, List<My_frame> fragmentList1, List<String> stringList) {
        super(fm);
        this.fragmentList = fragmentList1;
        this.namelist = stringList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }


    @Override
    public int getCount() {
        return namelist.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return namelist.get(position);
    }
}
