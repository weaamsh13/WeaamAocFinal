package y2019.weaam.aoc.weaamaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TottenhamInfoActivity extends AppCompatActivity implements View.OnClickListener{

    Button prtott;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tottenham_info);
        prtott = findViewById(R.id.prtott);
        prtott.setOnClickListener(this);


    }

    public void onClick(View v) {


        if(v==prtott){
            Intent i = new Intent(this, TottenhamRosterActivity.class);
            startActivity(i);}


    }
}
