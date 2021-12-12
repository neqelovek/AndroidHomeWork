package ru.gb.homework;


import static java.text.MessageFormat.format;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.text.MessageFormat;


public class MainActivity extends AppCompatActivity {

    private Integer argument1;
    private Integer argument2;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.new_layout);


//
//        Button button = findViewById(R.id.name_Button);
//        final EditText editText1 = findViewById(R.id.name_edit_Text1);
//        final EditText editText2 = findViewById(R.id.name_edit_Text2);
//        final TextView textView1 = findViewById(R.id.name_view_Text1);
//        final TextView textView2 = findViewById(R.id.name_view_Text2);
//
//        @SuppressLint("UseSwitchCompatOrMaterialCode") final Switch switch1 = findViewById(R.id.name_Switch);
//
//        switch1.setOnCheckedChangeListener((buttonView, isChecked) -> {
//            if (isChecked) {
//                textView1.setText("Система охраны включена");
//            } else {
//                textView1.setText("");
//            }
//        });
//
//        button.setOnClickListener(v -> {
//            try {
//                argument1 = Integer.valueOf(editText1.getText().toString());
//                argument2 = Integer.valueOf(editText2.getText().toString());
//                if (argument1.equals(argument2)) {
//                    textView2.setText("Равно!");
//                } else {
//                    textView2.setText("Не равно!");
//                }
//            } catch (NumberFormatException e) {
//                textView2.setText("Введите число!");
//            }
//        });
    }
}