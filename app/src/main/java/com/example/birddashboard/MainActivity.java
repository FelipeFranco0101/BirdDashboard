package com.example.birddashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton button1 = findViewById(R.id.imageButton1);
        ImageButton button2 = findViewById(R.id.imageButton2);
        ImageButton button3 = findViewById(R.id.imageButton3);
        ImageButton button4 = findViewById(R.id.imageButton4);
        ImageButton button5 = findViewById(R.id.imageButton5);
        ImageButton button6 = findViewById(R.id.imageButton6);


        View.OnClickListener onClickListener = v -> {
            String buttonText = v.getContentDescription().toString();
            MenuSlideActivity.option = buttonText;
            // Mostrar el mensaje de Toast con el texto del botón
            Toast.makeText(MainActivity.this, "Clic en el botón: " + buttonText, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), MenuSlideActivity.class);
            startActivity(intent);
        };

        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
    }

    @Override
    public void onClick(View v) {

    }
}