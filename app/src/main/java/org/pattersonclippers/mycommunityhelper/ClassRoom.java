package org.pattersonclippers.mycommunityhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class ClassRoom extends AppCompatActivity {

    ImageButton IconIB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        IconIB = (ImageButton) findViewById(R.id.IconIB);
    }
}