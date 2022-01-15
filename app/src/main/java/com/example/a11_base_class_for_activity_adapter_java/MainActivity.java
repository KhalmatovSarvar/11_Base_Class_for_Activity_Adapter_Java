package com.example.a11_base_class_for_activity_adapter_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.a11_base_class_for_activity_adapter_java.adapter.MainAdapter;
import com.example.a11_base_class_for_activity_adapter_java.model.Member;

import java.net.ContentHandler;
import java.util.List;

public class MainActivity extends BaseActivity {

    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        List<Member> members = prepareMemberList();
        refreshAdapter(members);
    }
    private void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
    }

    private void refreshAdapter(List<Member> members) {
        MainAdapter adapter = new MainAdapter(this, members);
        recyclerView.setAdapter(adapter);
    }

    public void openItemDetails(Member member){
        Intent intent = new Intent(context,DetailsActivity.class);
        startActivity(intent);
    }


}