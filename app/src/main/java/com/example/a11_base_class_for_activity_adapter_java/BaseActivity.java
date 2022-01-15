package com.example.a11_base_class_for_activity_adapter_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a11_base_class_for_activity_adapter_java.model.Member;
import com.example.a11_base_class_for_activity_adapter_java.network.BaseServer;

import java.util.ArrayList;
import java.util.List;

public class BaseActivity extends AppCompatActivity implements BaseServer {

   protected String getServer(){
       if(IS_TESTER){
           return SERVER_DEVELOPMENT;
       }
       return SERVER_DEPLOYMENT;
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