package org.pattersonclippers.mycommunityhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ClassRoom_CodeActivity extends AppCompatActivity {

    EditText PasswordET;

    Button JoinTT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_room_code);

        PasswordET = (EditText) findViewById(R.id.PasswordET);
        JoinTT = (Button) findViewById(R.id.JoinTT);



        if(PasswordET.getText().toString().equals("")){
            Toast.makeText(ClassRoom_CodeActivity.this, )

        }


    }


}