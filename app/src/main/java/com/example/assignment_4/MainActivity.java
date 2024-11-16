package com.example.assignment_4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] bookTypes = {
            "Science", "Fiction", "Thriller", "Fantasy",
            "History", "Biography", "Philosophy", "Art", "Technology",
            "Self-Help"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.Home));

        listView = findViewById(R.id.listView);

        // Use a custom layout for list items
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, bookTypes);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, BookListActivity.class);
                intent.putExtra("bookType", bookTypes[position]);
                startActivity(intent);
            }
        });

    }
}
