package com.example.asker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public asker asker;
    public tankci tankci;
    String mesaj = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asker = new asker();
        tankci = new tankci();
        TextView textViewMesaj = findViewById(R.id.textViewMesaj);
        Button buttonAsker = findViewById(R.id.buttonAsker);
        Button buttonTankci = findViewById(R.id.buttonTankci);
        buttonAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = asker.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
        buttonTankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = tankci.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
    }
}