package org.pattersonclippers.mycommunityhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Loginscreen extends AppCompatActivity {

    Button Button2;

    EditText ETpassword;

    CharSequence message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button2 = (Button) findViewById(R.id.Button2);
        ETpassword = (EditText) findViewById(R.id.ETpassword);

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ETpassword.getText().toString().equals("Studentpassword123")){
                    Toast.makeText(Loginscreen.this, "Welcome", Toast.LENGTH_SHORT);
                    Intent intent= new Intent(Loginscreen.this, ClassRoom.class);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(Loginscreen.this, "Wrong password, please try again.",Toast.LENGTH_SHORT);
                }
            }

        });


        }





    }
