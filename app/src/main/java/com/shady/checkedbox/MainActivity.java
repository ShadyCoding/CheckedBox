package com.shady.checkedbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox mom;
    private CheckBox dad;
    private CheckBox grandpa;

    private TextView tvResult;
    private Button showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mom = findViewById(R.id.mom);
        dad = findViewById(R.id.dad);
        grandpa = findViewById(R.id.granpa);

        tvResult = findViewById(R.id.tvResult);
        showResult = findViewById(R.id.reslutBtn);

        showResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(mom.getText().toString()+" Status is true "+ mom.isChecked()+ "\n");
                stringBuilder.append(dad.getText().toString()+" Status is true "+ dad.isChecked()+ "\n");
                stringBuilder.append(grandpa.getText().toString()+" Status is true "+ grandpa.isChecked()+ "\n");

                tvResult.setText(stringBuilder);
            }
        });



    }
}
