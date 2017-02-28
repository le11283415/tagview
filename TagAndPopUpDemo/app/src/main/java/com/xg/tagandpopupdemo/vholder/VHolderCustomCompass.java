package com.xg.tagandpopupdemo.vholder;

import com.xg.tagandpopupdemo.R;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


/**
 * Created by yefeng on 2017/2/14.
 * Modified by xxx
 */

public class VHolderCustomCompass extends RecyclerView.ViewHolder {

    private final TextView mTextView;

    public VHolderCustomCompass(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.tv);
    }

    public void bindViewData(final String item, final Class aClass) {
        mTextView.setText("点击开启:"+ item);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            itemView.getContext().startActivity(new Intent(itemView.getContext(),aClass));
            }
        });
    }
}
