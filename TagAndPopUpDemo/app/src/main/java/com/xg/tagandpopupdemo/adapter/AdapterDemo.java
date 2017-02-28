package com.xg.tagandpopupdemo.adapter;

import java.util.ArrayList;
import java.util.List;

import com.xg.tagandpopupdemo.R;
import com.xg.tagandpopupdemo.vholder.VHolderCustomCompass;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by yefeng on 2017/2/14.
 * Modified by xxx
 */

public class AdapterDemo extends RecyclerView.Adapter {


    private List<String> mList = new ArrayList<>();
    private List<Class> mListActivity = new ArrayList<>();

    public AdapterDemo(List<String> list){
    mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_compass_layout, parent, false);
        return new VHolderCustomCompass(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    if(holder instanceof VHolderCustomCompass) {
        ((VHolderCustomCompass) holder).bindViewData(mList.get(position),mListActivity.get(position));
    }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setActivityList(List<Class> listActivity) {
       mListActivity = listActivity;
    }

}
