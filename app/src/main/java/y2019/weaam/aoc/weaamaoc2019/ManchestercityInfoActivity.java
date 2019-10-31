package y2019.weaam.aoc.weaamaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManchestercityInfoActivity extends AppCompatActivity implements View.OnClickListener{

    Button prmanc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manchestercity_info);
        prmanc = findViewById(R.id.prmanc);
        prmanc.setOnClickListener(this);


    }

    public void onClick(View v) {


        if(v==prmanc){
            Intent i = new Intent(this, ManchesterCityRosterActivity.class);
            startActivity(i);}


    }
}
