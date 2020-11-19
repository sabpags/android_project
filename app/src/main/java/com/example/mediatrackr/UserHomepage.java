package com.example.mediatrackr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class UserHomepage extends AppCompatActivity {

    TextView welcomeTitle;
    Button newSearch, viewFavorites, viewProfile, viewRecentSearches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_homepage);
        welcomeTitle = (TextView) findViewById(R.id.welcomeTitle);
        String username = getIntent().getStringExtra("username");
        welcomeTitle.setText("Welcome, " + username);
    }

    public void NewSearch(View view) {
        newSearch = (Button) findViewById(R.id.newSearch);
        Toast.makeText(this, "New Search",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, NewSearch.class);
        startActivity(intent);
    }

    public void ViewFavorites(View view) {
        viewFavorites = (Button) findViewById(R.id.viewFavorites);
        Toast.makeText(this, "View Favorites",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ViewFavorites.class);
        startActivity(intent);
    }

    public void ViewProfile(View view) {
        viewProfile= (Button) findViewById(R.id.viewProfile);
        Toast.makeText(this, "View Profile",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ViewProfile.class);
        startActivity(intent);
    }

    public void ViewRecentSearches(View view) {
        viewRecentSearches = (Button) findViewById(R.id.viewRecent);
        Toast.makeText(this, "View Recent Searches",Toast.LENGTH_SHORT).show();

        final ListView list = findViewById(R.id.recentList);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("this");
        arrayList.add("is");
        arrayList.add("just");
        arrayList.add("a");
        arrayList.add("test");
        arrayList.add("if");
        arrayList.add("it");
        arrayList.add("works");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem=(String) list.getItemAtPosition(position);
                Toast.makeText(UserHomepage.this,clickedItem,Toast.LENGTH_LONG).show();
            }
        });
    }
}