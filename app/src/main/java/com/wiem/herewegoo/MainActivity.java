package com.wiem.herewegoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView wordRev;
    EditText word ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        word = findViewById(R.id.Word);
        wordRev = findViewById(R.id.reverse);
        Log.i("My Tag","Here is a Message For u ");
        Log.i("My secd  Tag","Here is a secd Message For u ");


    }
    public void reverseWord(View v){

        String result = "";
        String wordI = word.getText().toString();
        char[] ch = wordI.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }

        wordRev.setText(result);


    }
}
