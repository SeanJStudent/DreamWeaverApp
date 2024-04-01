package edu.utsa.dreamweaver_finalproj;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {   //used as controller for the information that is going to be used/displayed

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //our "main" function (like in Java)
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity);    //displays the layout called "layout (pink text)"

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inputIntent = new Intent(MainActivity.this, SuccessActivity.class);
                startActivity(inputIntent);
            }
        });
    }
}