package com.xg.tagandpopupdemo.vholder;

import com.xg.tagandpopupdemo.R;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yefeng on 2017/2/28.
 * Modified by xxx
 */

public class VHolderFlowTag extends RecyclerView.ViewHolder {

    private final TextView mTvTag;

    public VHolderFlowTag(View itemView) {
        super(itemView);
        mTvTag = (TextView) itemView.findViewById(R.id.tv_tag);
    }

    public void bindView(String s) {
        mTvTag.setText(s);
    }
}
