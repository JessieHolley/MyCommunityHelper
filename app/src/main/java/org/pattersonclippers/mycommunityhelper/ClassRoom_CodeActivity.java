package org.pattersonclippers.mycommunityhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ClassRoom_CodeActivity extends AppCompatActivity {

    EditText PasswordET;

    Button JoinTT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_room_code);

        PasswordET = (EditText) findViewById(R.id.PasswordET);
        JoinTT = (Button) findViewById(R.id.JoinTT);



        JoinTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(PasswordET.getText().toString().equals(""))
            }
        });
    }
}