package com.xg.tagandpopupdemo.interfaces;

import java.util.List;

import com.xg.tagandpopupdemo.view.FlowTagLayout;

/**
 * Created by yefeng on 2017/2/28.
 * Modified by xxx
 */

public interface OnTagSelectListener {
    void onItemSelect(FlowTagLayout parent, List<Integer> selectedList);
}
