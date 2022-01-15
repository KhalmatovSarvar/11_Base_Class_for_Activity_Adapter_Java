package com.example.a11_base_class_for_activity_adapter_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.ReceiverCallNotAllowedException;
import android.os.Bundle;

import com.example.a11_base_class_for_activity_adapter_java.adapter.DetailsAdapter;
import com.example.a11_base_class_for_activity_adapter_java.model.Member;

import java.util.List;

public class DetailsActivity extends BaseActivity {

    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initViews();

        List<Member> members = prepareMemberList();
        refreshAdapter(members);
    }

    private void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
    }

    private void refreshAdapter(List<Member> members) {
        DetailsAdapter adapter = new DetailsAdapter(context,members);
        recyclerView.setAdapter(adapter);

    }
}