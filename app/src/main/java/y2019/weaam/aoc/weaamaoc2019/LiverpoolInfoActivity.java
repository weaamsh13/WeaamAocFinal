package y2019.weaam.aoc.weaamaoc2019;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LiverpoolInfoActivity extends AppCompatActivity implements View.OnClickListener {


    Button prliverpool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liverpool_info);
        prliverpool = findViewById(R.id.prliverpool);
        prliverpool.setOnClickListener(this);


    }

    public void onClick(View v) {


        if(v==prliverpool){
        Intent i = new Intent(this, LiverpoolRosterActivity.class);
        startActivity(i);}
    }
}
