package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private int iloscpolubien = 12;
    private TextView licznikpolubien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        licznikpolubien = findViewById(R.id.likeCounter);
        Button likeButton = findViewById(R.id.likeButton);
        Button dislikeButton = findViewById(R.id.dislikeButton);
        Button saveButton = findViewById(R.id.saveButton);


        licznikpolubien.setText(iloscpolubien + " polubień");


        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iloscpolubien++;
                licznikpolubien.setText(iloscpolubien + " polubień"); // Zaktualizuj tekst
            }
        });


        dislikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iloscpolubien > 0) {
                    iloscpolubien--;
                    licznikpolubien.setText(iloscpolubien + " polubień");
                }
            }
        });


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
