package com.example.take1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import com.example.take1.Activity_1;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class Category extends RecyclerView.Adapter<Category.ViewCategory> {


    ArrayList<Dashboard_catlist> catlistArrayList;
    public Category(ArrayList<Dashboard_catlist> catlistArrayList) {
        this.catlistArrayList = catlistArrayList;
    }
    public String name="";
    public String name1="";
    @NonNull
    @Override
    public ViewCategory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories,parent,false);
        ViewCategory viewCategory = new ViewCategory(view);
        Button btn = (Button) view.findViewById(R.id.food_title);
        Log.i("String",name);
            btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToMain = new Intent(v.getContext(), Activity_1.class);
                intToMain.putExtra("id",name);
                v.getContext().startActivity(intToMain);

            }
        });

        return viewCategory;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewCategory holder, int position) {
        Dashboard_catlist dashboard_catlist = catlistArrayList.get(position);

        holder.image1.setImageResource(dashboard_catlist.getImage());
        name = dashboard_catlist.getTitle();
        holder.title1.setText(name);

    }

    @Override
    public int getItemCount() {
        return catlistArrayList.size();
    }

    /*holds the view*/
    public static class ViewCategory extends RecyclerView.ViewHolder {

        ImageView image1;
        Button title1;
        //TextView title1;
        //private Button btnFood;

        public ViewCategory(@NonNull View itemView) {
            super(itemView);

            image1 = itemView.findViewById(R.id.food_id);
            title1 = itemView.findViewById(R.id.food_title);


        }
    }
}