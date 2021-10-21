package com.example.skillycoursetwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.skillycoursetwo.Adapter.AdapterOrang;
import com.example.skillycoursetwo.Model.ModelOrang;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterOrang adapter;
    private ArrayList<ModelOrang> orangArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        addData();

        recyclerView = (RecyclerView) findViewById(R.id.rvlistcontent);

        adapter = new AdapterOrang(orangArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ViewActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        orangArrayList = new ArrayList<>();
        orangArrayList.add(new ModelOrang("Tsuyuri Chan", "14", "cewe"));
        orangArrayList.add(new ModelOrang("Fadly Yonk", "12", "cowo"));
        orangArrayList.add(new ModelOrang("Ariyandi Nugraha", "23", "cowo"));
        orangArrayList.add(new ModelOrang("Aham Siswana", "43", "cowo"));
    }
}