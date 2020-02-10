package com.premanandrhea.lab01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button click;
    Button submitButton; // use Alt+Enter to auto-import Button
    int count;
    int x;
    String s;
    EditText responseText;
    TextView displayText;
    TextView displayText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.clickButton);
        responseText=findViewById(R.id.responseEditText);
        displayText=findViewById(R.id.textBox);

        click=findViewById(R.id.clickButton2);
        displayText2=findViewById(R.id.textBox2);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello mom");
                Log.i("testButton", "Hi dad!");
                count++;
                displayText.setText(count+"");
            }
        });
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("You clicked me!!");
                Log.i("testButton", "clikclik");
                x++;
                s = "";
                for(int i = 0; i < x; i++){
                    s += " PLZ";
                }
                displayText2.setText("STOP" + s);
            }
        });
        responseText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    if(responseText.getText().toString().equals("TJ")){
                        displayText.setText("TJ Rocks!");
                        responseText.setText("");
                        responseText.setHint("That's a good name.");
                    }
                }
            }
        });
    }
}

