package com.example.asus.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ASUS on 2017/12/22.
 */

public class My_frame extends Fragment {

    List<MyData> myDataList = new ArrayList<>();

    public void My_frame1(List<MyData> myDataList) {
        this.myDataList = myDataList;
    }




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frame_son, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.my_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        MyListAdapter myListAdapter = new MyListAdapter(this.myDataList);
        recyclerView.setAdapter(myListAdapter);
        return view;
    }




}
