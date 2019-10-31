package y2019.weaam.aoc.weaamaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManchesterunitedInfoActivity extends AppCompatActivity implements View.OnClickListener{

    Button prmanu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manchesterunited_info);
        prmanu = findViewById(R.id.prmanu);
        prmanu.setOnClickListener(this);


    }

    public void onClick(View v) {


        if(v==prmanu){
            Intent i = new Intent(this, ManchesterunitedRosterActivity.class);
            startActivity(i);}


    }
}
