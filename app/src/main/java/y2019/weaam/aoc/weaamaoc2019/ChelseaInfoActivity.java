package y2019.weaam.aoc.weaamaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class  ChelseaInfoActivity extends AppCompatActivity implements View.OnClickListener {

    Button prchelsea;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chelsea_info);
        prchelsea = findViewById(R.id.prchelsea);
        prchelsea.setOnClickListener(this);


    }

    public void onClick(View v) {


        if(v==prchelsea){
            Intent i = new Intent(this, ChelseaRosterActivity.class);
            startActivity(i);}


    }
}
