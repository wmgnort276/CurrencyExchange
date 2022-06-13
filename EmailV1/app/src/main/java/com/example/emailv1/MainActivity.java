package com.example.emailv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<CustomItemModel> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // fake the api
        items = new ArrayList<>();
        items.add(new CustomItemModel("Google alert","Google Alert - android","Now android supports multiple voice recognization","11:12 PM"));
        items.add(new CustomItemModel("IMDB","Check out top rated movies this week","Find out the top rated movies this week by editor choice", "9:15 AM"));
        items.add(new CustomItemModel("Dinesh Reddy, Me","Let's get started","I started working on project proposals. Wanted to know", "8:15 AM"));
        items.add(new CustomItemModel("BookMyShow","Will the lost boy find his family?","LION a movie that humanity needs. Online version report spam 97%", "3:25 AM"));
        items.add(new CustomItemModel("MakeMyTrip","A joyous Train Ride in North East!","North East Package starting from Rs31,999/- only!", "9:01 AM"));
        items.add(new CustomItemModel("Disqus ","Check out top rated movies this week","Find out the top rated movies this week by editor choice", "7:02 AM"));
        items.add(new CustomItemModel("Order-Update","Check out top rated movies this week","Find out the top rated movies this week by editor choice", "8:39 AM"));
        items.add(new CustomItemModel("Instapage","Advertisement Enquiry","Hello, I want to buy the advertising space on", "6:15 AM"));
        items.add(new CustomItemModel("Gmail Team","Gmail Business Suite","Your Gmail business suite is expiring today!", "15:15 PM"));
        items.add(new CustomItemModel("Medium Daily Digest","Lead notification from Instapage","Find out the top rated movies this week by editor choice", "22:08 PM"));
        items.add(new CustomItemModel("Codeforces","Check","Congratulations! You just acquired a new lead", "11:25 AM"));
        items.add(new CustomItemModel("Pizza4pi","Check out top rated movies this week","Find out the top rated movies this week by editor choice", "21:50 PM"));

        CustomAdapter adapter = new CustomAdapter(items);
        ListView listView = findViewById(R.id.custom_listview);
        listView.setAdapter(adapter);

    }
}