package com.example.take1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.take1.R;

import java.util.ArrayList;

public class Category extends RecyclerView.Adapter<Category.ViewCategory> {
    ArrayList<Dashboard_catlist> catlistArrayList;

    public Category(ArrayList<Dashboard_catlist> catlistArrayList) {
        this.catlistArrayList = catlistArrayList;
    }

    @NonNull
    @Override
    public ViewCategory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories,parent,false);
        ViewCategory viewCategory = new ViewCategory(view);
        return viewCategory;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewCategory holder, int position) {
        Dashboard_catlist dashboard_catlist = catlistArrayList.get(position);

        holder.image1.setImageResource(dashboard_catlist.getImage());
        holder.title1.setText(dashboard_catlist.getTitle());
    }

    @Override
    public int getItemCount() {
        return catlistArrayList.size();
    }

    /*holds the view*/
    public static class ViewCategory extends RecyclerView.ViewHolder {

        ImageView image1;
        TextView title1;


        public ViewCategory(@NonNull View itemView) {
            super(itemView);

            image1 = itemView.findViewById(R.id.food_id);
            title1 = itemView.findViewById(R.id.food_title);


        }
    }
}