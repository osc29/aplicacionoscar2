package com.example.osc29.aplicacionoscar2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button boton;
    Button boton2;
    Button button3;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton=(Button) findViewById(R.id.button);
        boton2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);

        boton.setOnClickListener(this);
        boton2.setOnClickListener(this);
        button3.setOnClickListener(this);

        spin=(Spinner) findViewById(R.id.spinner);

        List list=new ArrayList();
        list.add("thobias young");
        list.add("kobe bryant");
        list.add("lebron james");
        list.add("kevin durant");
        list.add("russel westbrook");
        list.add("tom brady");
        list.add("jamaal charles");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(arrayAdapter);







        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {  //el spinner funciona con adapter en sus metodos,y ne este en concreto,se genera auto el emtodo void

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivity.this,"position"+String.valueOf(spin.getSelectedItem()),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Toast.makeText(getApplicationContext(), "joven Padowan", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:

                Intent inte=new Intent(this,Main2Activity.class);
                startActivity(inte);
                break;
            case R.id.button3:
                Intent inte2=new Intent(this,Main3Activity.class);
                startActivity(inte2);


                break;


        }


    }


    }

