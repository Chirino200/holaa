package com.jota.clase2dprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    Button BTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    BTN = (Button)findViewById(R.id.button);
    BTN.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("DEMO","Ejemplo de LOG");
            Log.e("Super Error","Probelmas TEcnic");
        }
    });

    }
}
