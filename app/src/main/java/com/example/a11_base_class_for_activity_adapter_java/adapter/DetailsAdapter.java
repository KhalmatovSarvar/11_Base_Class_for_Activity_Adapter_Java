package com.example.a11_base_class_for_activity_adapter_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a11_base_class_for_activity_adapter_java.R;
import com.example.a11_base_class_for_activity_adapter_java.model.Member;

import java.util.List;

public class DetailsAdapter extends BaseAdapter{

    private Context context;
    private List<Member> members;

    public DetailsAdapter(Context context, List<Member> members) {
        this.context = context;
        this.members = members;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_layout,parent,false);
        return new CustomViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final Member member =  members.get(position);

        LinearLayout lay_click = ((CustomViewHolder)holder).lay_click;
        TextView first_name  =((CustomViewHolder)holder).first_name;
        TextView last_name  =((CustomViewHolder)holder).last_name;

        first_name.setText(member.getFirstName());
        last_name.setText(member.getLastName());

    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    private class CustomViewHolder extends RecyclerView.ViewHolder {
        View view;
        LinearLayout lay_click;
        TextView first_name, last_name;
        public CustomViewHolder(View v) {
            super(v);
            view = v;
            lay_click = view.findViewById(R.id.lay_click);
            first_name = view.findViewById(R.id.first_name);
            last_name = view.findViewById(R.id.last_name);
        }
    }
}




