package com.abhishekvenunathan.newact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = findViewById(R.id.listView);

        final ArrayList<String> friends = new ArrayList<>();
        friends.add("Abhishek");
        friends.add("Abhishek2");
        friends.add("Abhishek3");
        friends.add("Abhishek4");
        friends.add("Abhishek5");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,friends);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

                intent.putExtra("friends",friends.get(i));
                startActivity(intent);
            }
        });
    }

}
