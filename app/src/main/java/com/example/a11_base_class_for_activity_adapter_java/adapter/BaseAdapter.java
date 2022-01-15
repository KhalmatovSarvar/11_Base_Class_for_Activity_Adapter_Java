package com.example.a11_base_class_for_activity_adapter_java.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a11_base_class_for_activity_adapter_java.model.Member;
import com.example.a11_base_class_for_activity_adapter_java.network.BaseServer;

import java.util.ArrayList;
import java.util.List;

public class BaseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements BaseServer {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    protected List<Member> prepareMemberList(){
        List<Member> members = new ArrayList<>();

        for(int i = 0; i < 15; i++){
            members.add(new Member("Sarvar"+i,"Khalmatov"+i));
        }
        return members;
    }

    protected static boolean isEmpty(final String s){
        return s == null||s.trim().isEmpty();
    }
}
