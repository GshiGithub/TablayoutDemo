package com.example.asus.myapplication;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private MyPager_Adapter fragmentPagerAdapter;
    private ViewPager viewPager;
    private List<My_frame> fragmentList;
    private List<String> stringList;
    private List<MyData> myDataList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentList = new ArrayList<>();
        stringList = new ArrayList<>();
        tabLayout = findViewById(R.id.my_tab_list);
        for (int i = 0; i < 30; i++) {
            stringList.add("MyTab");
        }
        for (int i = 0; i < 10; i++) {
            MyData myData = new MyData("里脊","110",R.drawable.logo);
            myDataList.add(myData);
        }
        for (int i = 0; i < 30; i++) {
            My_frame my_frame =  new My_frame();
            my_frame.My_frame1(myDataList);
            fragmentList.add(my_frame);
        }
        tabLayout.setTabGravity(100);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        fragmentPagerAdapter = new MyPager_Adapter(this.getSupportFragmentManager(),fragmentList,stringList);
        viewPager = findViewById(R.id.My_viewPager);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
