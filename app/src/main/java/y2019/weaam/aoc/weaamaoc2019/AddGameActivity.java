package y2019.weaam.aoc.weaamaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddGameActivity extends AppCompatActivity {

    //1, properties definition
    EditText editTextGameName , editTextDate;
    Button buttonPickTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);

        editTextGameName=findViewById(R.id.editTextGameName);
        editTextDate=findViewById(R.id.editTextDate);
        buttonPickTime=findViewById(R.id.buttonPickTime);




    }

}
