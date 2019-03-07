package com.example.uebung1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioButton zentiemeterRadioButton; //
    RadioButton inchRadioButton;
    EditText cmEingabe;
    EditText inchEingabe;
    Button los;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         zentiemeterRadioButton = findViewById(R.id.radioButtonZentimeter);
//        rmeter.setSelected(true); //
//        RadioButton inch = findViewById(R.id.inch)
        inchRadioButton = findViewById(R.id.radioButtonInch);
//        inchRadioButton.setSelected(true);
        zentiemeterRadioButton.setSelected(true);
        cmEingabe = findViewById(R.id.cmNummer);
        inchEingabe = findViewById(R.id.inchNummer);

        los = findViewById(R.id.buttonLos);
//        los.setOnClickListener(View.OnClickListener listen);

        radioGroup = findViewById(R.id.radioGroupButtons);
        los.setOnClickListener(e -> onClick(e));
    }

    public void onClick(View v){
        //double cm = Double.parseDouble(cmEingabe.getText().toString());
        //inchEingabe.setText(String.valueOf(cm*0.393701));
        if(zentiemeterRadioButton.isChecked()){
            double cm = Double.parseDouble(cmEingabe.getText().toString());
            inchEingabe.setText(String.valueOf(cm*0.393701));
        } else{
            double inch = Double.parseDouble(inchEingabe.getText().toString());
            cmEingabe.setText(String.valueOf(inch/0.393701));
        }

    }
}
