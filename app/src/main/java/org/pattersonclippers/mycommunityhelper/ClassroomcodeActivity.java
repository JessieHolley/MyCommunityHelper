package org.pattersonclippers.mycommunityhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class ClassroomcodeActivity extends AppCompatActivity {

    ImageButton iconi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroomcode);

        iconi = (ImageButton) findViewById(R.id.iconi);
    }
}