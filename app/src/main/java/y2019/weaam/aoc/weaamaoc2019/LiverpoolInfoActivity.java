package y2019.weaam.aoc.weaamaoc2019;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LiverpoolInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liverpool_info);


    }

    public void onClick(View v) {

        Intent i = new Intent(this, LiverpoolRosterActivity.class);
        startActivity(i);
    }
}
