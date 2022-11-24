package com.example.tworproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mybutton = findViewById(R.id.button);







        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                EditText myEditText = findViewById(R.id.editTextTextEmailAddress);

                EditText myEditText2 = findViewById(R.id. editTextTextPassword);
                String Email = myEditText.getText().toString();
                Intent i;
                String g1="g";
                i = new Intent(MainActivity.this, MainActivity2.class);
                if(myEditText.getText().toString().equals("Mail")&& myEditText2.getText().toString().equals("1111")||
                        myEditText.getText().toString().equals("Misha")&& myEditText2.getText().toString().equals("2002")||
                        myEditText.getText().toString().equals("Login")&& myEditText2.getText().toString().equals("1234")||
                    myEditText.getText().toString().equals("Admin")&& myEditText2.getText().toString().equals("4357")||
                            myEditText.getText().toString().equals("Weather")&& myEditText2.getText().toString().equals("23553")||
                myEditText.getText().toString().equals("Student")&& myEditText2.getText().toString().equals("7882187")||
                        myEditText.getText().toString().equals("Upiter")&& myEditText2.getText().toString().equals("8787878")){
                    Toast.makeText(getApplicationContext(), "Вход выполнен!",Toast.LENGTH_SHORT).show();
                    startActivity(i);}
                else {
                    Toast.makeText(getApplicationContext(), "Неверный логин или пароль",Toast.LENGTH_SHORT).show();

                }


            }

        });
    }
}