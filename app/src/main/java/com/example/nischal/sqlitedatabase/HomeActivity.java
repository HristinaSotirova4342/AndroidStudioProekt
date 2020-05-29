package com.example.nischal.sqlitedatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView notesId, tasksId;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        notesId = (CardView) findViewById(R.id.notesId);
        tasksId = (CardView) findViewById(R.id.tasksId);

        notesId.setOnClickListener((View.OnClickListener) this);
        tasksId.setOnClickListener((View.OnClickListener) this);



        logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentL = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intentL);
                finish();
                Toast.makeText(HomeActivity.this, "Successfully Logout", Toast.LENGTH_SHORT).show();

            }

        });


    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.tasksId: i = new Intent(HomeActivity.this, WeatherActivity.class);
                startActivity(i);
                break;
            case R.id.notesId: i = new Intent(HomeActivity.this, NotesActivity.class);
                startActivity(i);
                break;
            default:break;
        }
    }
}
