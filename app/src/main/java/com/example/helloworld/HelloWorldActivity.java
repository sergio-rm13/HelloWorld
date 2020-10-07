package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.TextView;

public class HelloWorldActivity extends AppCompatActivity {
    private TextView tvMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);

        tvMessage = findViewById(R.id.tvMessage);
        //tvMessage.setText(R.string.msgBye);//Pongo adiós mundo en tiempo de ejecuión
        tvMessage.setText(getResources().getText(R.string.msgBye));

        //tvMessage.setTextColor(getResources().getColor(R.color.dark_grey));
        //Recomiendan usar una nueva clase ContextCompat esto hace referencia al contexto
        tvMessage.setTextColor(ContextCompat.getColor(this,R.color.dark_grey));

    }
}