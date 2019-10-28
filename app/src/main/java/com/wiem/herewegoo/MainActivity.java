package com.wiem.herewegoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
//        int[] myIntegerArray = {1,2,3,4,5,6,7,8,9};
//
//        Log.i("Tag",myIntegerArray[myIntegerArray.length - 1] + "");



    }
    public void reverseWord(View v){

//        int nbAge = Integer.parseInt(age.getText().toString());
//        if(age.getText().toString() == ""  ){
//            Toast.makeText(this,"you need to enter your age please !! " , Toast.LENGTH_SHORT).show();
//
//        } else if( nbAge < 18 ) {
//            qualified.setText("Congratulation , You'r qualified !!");
//        }else {
//            qualified.setText("Bad news , u're not qualified!!");
//        }
        String result = "";
        String wordI = word.getText().toString();
        char[] ch = wordI.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }

        wordRev.setText(result);


    }
}
