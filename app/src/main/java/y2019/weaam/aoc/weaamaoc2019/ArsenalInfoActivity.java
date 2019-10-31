package y2019.weaam.aoc.weaamaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArsenalInfoActivity extends AppCompatActivity implements View.OnClickListener {

    Button prarsenal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arsenal_info);
        prarsenal = findViewById(R.id.prarsenal);
        prarsenal.setOnClickListener(this);


    }

    public void onClick(View v) {


        if(v==prarsenal){
            Intent i = new Intent(this, ArsenalRosterActivity.class);
            startActivity(i);}


    }
}
