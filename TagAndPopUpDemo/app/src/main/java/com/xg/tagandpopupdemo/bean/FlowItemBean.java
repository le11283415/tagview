package com.xg.tagandpopupdemo.bean;

/**
 * Created by yefeng on 2017/2/28.
 * Modified by xxx
 */

public class FlowItemBean {

    public int position;
    public boolean isSelect;

    public FlowItemBean(int item, boolean isSelect) {
        this.position = item;
        this.isSelect = isSelect;
    }
}
