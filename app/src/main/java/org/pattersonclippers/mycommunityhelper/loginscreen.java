package org.pattersonclippers.mycommunityhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginscreen extends AppCompatActivity {

    Button Button2;

    EditText ETPassword;

    CharSequence message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button2 = (Button) findViewById(R.id.Button2);
        ETPassword = (EditText) findViewById(R.id.ETpassword);

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ETPassword.getText().toString().equals("StudentPassword123")){
                    Toast.makeText(loginscreen.this, "Welcome", Toast.LENGTH_SHORT);
                    Intent intent= new Intent(loginscreen.this, ClassRoom.class);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(loginscreen.this, "Wrong password, please try again.",Toast.LENGTH_SHORT);
                }
                if(ETPassword.getText().toString().equals("AdminPassword123")){
                    Toast.makeText(loginscreen.this, "Welcome", Toast.LENGTH_SHORT);
                    Intent intent= new Intent(loginscreen.this, AdminActivity.class);
                    startActivity((intent));

                }


            }



        });


        }





    }
