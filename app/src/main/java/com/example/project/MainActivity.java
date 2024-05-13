package com.example.project;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a23jonam";
    private final String JSON_FILE = "mushrooms.json";

    private ArrayList<RecyclerViewItem> items;

    private Gson gson;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gson = new Gson();

        items = new ArrayList<>(Arrays.asList(
                new RecyclerViewItem("Matterhorn"),
                new RecyclerViewItem("Mont Blanc"),
                new RecyclerViewItem("Denali")
        ));

        //new JsonTask(this).execute(JSON_URL);
        new JsonFile(this, this).execute(JSON_FILE);

        adapter = new RecyclerViewAdapter(this, items, new RecyclerViewAdapter.OnClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        RecyclerView view = findViewById(R.id.recycler_view);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);


    }

    @Override
    public void onPostExecute(String json) {
        Log.d("Json_URL","" + json);
        for(RecyclerViewItem r : items) {
            Log.d("svamp", r.getTitle() + "");
        }

        Type type = new TypeToken<ArrayList<RecyclerViewItem>>() {}.getType();
        items = gson.fromJson(json, type);

       //adapter.updateData(items);

    }

}
