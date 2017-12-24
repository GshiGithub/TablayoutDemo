package com.example.asus.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ASUS on 2017/12/19.
 */

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {

    private List<MyData> dataList ;
    static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView name ;
        private TextView number;
        private ImageView uri;
        public ViewHolder(View itemView) {
            super(itemView);
            uri = (ImageView)itemView.findViewById(R.id.View_1);
            name = itemView.findViewById(R.id.View_2);
            number = itemView.findViewById(R.id.number);

        }
    }
    public MyListAdapter(List<MyData> data_list){
        dataList = data_list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.data_,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
         MyData data = dataList.get(position);
         holder.uri.setImageResource(data.getUri());
         holder.name.setText(data.getName());
         holder.number.setText(data.getNumber());
    }

    @Override
    public int getItemCount() {

        return dataList.size();
    }




}
