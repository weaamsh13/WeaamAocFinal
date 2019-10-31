package y2019.weaam.aoc.weaamaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeicestercityInfoActivity extends AppCompatActivity implements View.OnClickListener{

    Button prleicester;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leicestercity_info);
        prleicester = findViewById(R.id.prleicester);
        prleicester.setOnClickListener(this);


    }

    public void onClick(View v) {


        if(v==prleicester){
            Intent i = new Intent(this, LeicesterCityRosterActivity.class);
            startActivity(i);}


    }
}
