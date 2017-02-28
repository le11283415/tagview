package com.xg.tagandpopupdemo.activity;

import java.util.ArrayList;
import java.util.List;

import com.xg.tagandpopupdemo.R;
import com.xg.tagandpopupdemo.adapter.AdapterDemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private List<String> mList = new ArrayList<>();
    private List<Class> mListActivity = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private AdapterDemo mAdapterDemo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        mList.add("点击跳转FlowTag");
        mListActivity.add(ActivityFlowTag.class);

    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapterDemo = new AdapterDemo(mList);
        mRecyclerView.setAdapter(mAdapterDemo);
        mAdapterDemo.setActivityList(mListActivity);

        View childAt = mRecyclerView.getChildAt(1);
    }

}
