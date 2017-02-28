package com.xg.tagandpopupdemo.interfaces;

import com.xg.tagandpopupdemo.view.FlowTagLayout;

import android.view.View;

/**
 * Created by yefeng on 2017/2/28.
 * Modified by xxx
 */
public interface OnTagClickListener {
    void onItemClick(FlowTagLayout parent, View view, int position);
}
