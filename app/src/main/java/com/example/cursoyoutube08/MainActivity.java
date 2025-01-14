package com.example.cursoyoutube08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    String pais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        int nro=(int)(Math.random()*3);

        switch(nro){
            case 0:pais="Corea";break;
            case 1:pais="Japon";break;
            case 2:pais="China";break;
        }
        tv1=findViewById(R.id.tv1);
        tv1.setText("Cual es la bandera de "+pais);
    }
    public void presion(View v){
        ImageButton b=(ImageButton)v;
        if(b.getTag().toString().equals(pais))
            Toast.makeText(this,"Muy bien", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"Es incorrecto señalaste la bandera de "+b.getTag().toString(),Toast.LENGTH_SHORT).show();
    }

}