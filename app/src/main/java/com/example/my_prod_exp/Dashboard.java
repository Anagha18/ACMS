package com.example.my_prod_exp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.my_prod_exp.Category_list.Category;
import com.example.my_prod_exp.Category_list.Dashboard_catlist;
import com.example.my_prod_exp.Helper_classes.Rem_list.Dashoboard_Remlist;
import com.example.my_prod_exp.Helper_classes.Rem_list.Reminder;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {

    RecyclerView ReminderList;
    RecyclerView.Adapter adapter;

    RecyclerView CategoryList;
    RecyclerView.Adapter adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);

        ReminderList=findViewById(R.id.reminder_list);
        ReminderList();

        CategoryList=findViewById(R.id.category_list);
        CategoryList();
    }

    private void CategoryList() {
        CategoryList.setHasFixedSize(true);
        CategoryList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<Dashboard_catlist> catlistArrayList = new ArrayList<>();
        catlistArrayList.add(new Dashboard_catlist(R.drawable.food,"Food"));
        catlistArrayList.add(new Dashboard_catlist(R.drawable.med,"Medicines"));
        catlistArrayList.add(new Dashboard_catlist(R.drawable.docum,"Documents"));

        adapter1 = new Category(catlistArrayList);
        CategoryList.setAdapter(adapter1);

    }

    private void ReminderList() {
        ReminderList.setHasFixedSize(true);
        ReminderList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<Dashoboard_Remlist> remlistArrayList = new ArrayList<>();
        remlistArrayList.add(new Dashoboard_Remlist(R.drawable.bread,"Bread","2 days"));
        remlistArrayList.add(new Dashoboard_Remlist(R.drawable.passport,"Passport","5 days"));
        remlistArrayList.add(new Dashoboard_Remlist(R.drawable.der,"Deriphyllin","7 days"));

        adapter=new Reminder(remlistArrayList);
        ReminderList.setAdapter(adapter);
    }
}
