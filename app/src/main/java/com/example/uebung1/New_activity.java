package com.example.uebung1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class New_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_activity);
    }

    public void starteNewActivity(){
        Intent intent = new Intent(this, New_activity.class);
//        intent.putExtra("die Lösung:", "Ein Text");
//        intent.putExtra("die Lösung:", MainActivity..onClick);

        startActivity(intent);
    }
}
