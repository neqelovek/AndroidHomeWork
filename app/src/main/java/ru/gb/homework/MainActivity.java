package ru.gb.homework;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView nameText;
    private Integer argument1;
    private Integer argument2;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.name_view_Text);
        Button clickButton = findViewById(R.id.name_Button);

        clickButton.setOnClickListener(v -> nameText.setText("Cool"));

        Button button = findViewById(R.id.name_Button2);
        final EditText editText1 = findViewById(R.id.name_edit_Text1);
        final EditText editText2 = findViewById(R.id.name_edit_Text2);
        final TextView textView = findViewById(R.id.name_view_Text2);
        final TextView textView2 = findViewById(R.id.name_view_Text3);

        @SuppressLint("UseSwitchCompatOrMaterialCode")
        final Switch switch1 = findViewById(R.id.name_Switch);

        switch1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked)  {
                textView2.setText("Система охраны включена");
            } else {
                textView2.setText("");


            }
        });



        button.setOnClickListener(v -> {
            try {
                argument1 = Integer.valueOf(editText1.getText().toString());
                argument2 = Integer.valueOf(editText2.getText().toString());
                if (argument1.equals(argument2)){
                    textView.setText("Равно!");
                } else {
                    textView.setText("Не равно!");
                }
            } catch (NumberFormatException e) {
                textView.setText("Введите число!");
            }
        });

    }
}