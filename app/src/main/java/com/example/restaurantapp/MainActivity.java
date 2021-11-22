package com.example.restaurantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submitBtn;
    CheckBox checkBoxPizza;
    CheckBox checkBoxBurger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitBtn=findViewById(R.id.button);
        checkBoxBurger=findViewById(R.id.checkBoxBurger);
        checkBoxPizza=findViewById(R.id.checkBoxPizza);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int billAmnt=0;
                StringBuffer result=new StringBuffer();
                result.append("Selected items");
                if(checkBoxBurger.isChecked()){
                    result.append("|Burger");
                    billAmnt+=170;
                }
                if(checkBoxPizza.isChecked()){
                    result.append("|Pizza");
                    billAmnt+=160;
                }
                Toast.makeText(getApplicationContext(),result+"| total amount:"+billAmnt,Toast.LENGTH_LONG).show();
            }
        });

    }
}