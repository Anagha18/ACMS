package com.example.my_prod_exp.Helper_classes.Rem_list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.my_prod_exp.R;

import java.util.ArrayList;

/*This adapter holds the values and inserts it into the design
Works as a bridge between the values and the design*/
public class Reminder extends RecyclerView.Adapter<Reminder.ViewReminder> {
    ArrayList<Dashoboard_Remlist> remlistArrayList;

    /*holds the values*/
    public Reminder(ArrayList<Dashoboard_Remlist> remlistArrayList) {
        this.remlistArrayList = remlistArrayList;
    }

    @NonNull
    @Override
    public ViewReminder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.reminder_list_design,parent,false);
        ViewReminder viewReminder= new ViewReminder(view);
        return viewReminder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewReminder holder, int position) {

        Dashoboard_Remlist dashoboard_remlist=remlistArrayList.get(position);

        holder.image.setImageResource(dashoboard_remlist.getImage());
        holder.title.setText(dashoboard_remlist.getTitle());
        holder.dur.setText(dashoboard_remlist.getDuration());
    }

    @Override
    public int getItemCount() {
        return remlistArrayList.size();
    }

    /*holds the view*/
    public static class ViewReminder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title,dur;

        public ViewReminder(@NonNull View itemView) {
            super(itemView);
             //Hooks
            image=itemView.findViewById(R.id.bread_image);
            title=itemView.findViewById(R.id.bread_title);
            dur=itemView.findViewById(R.id.bread_duration);

        }
    }
}
