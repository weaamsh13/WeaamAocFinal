package y2019.weaam.aoc.weaamaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddGameActivity extends AppCompatActivity {

    //1, properties definition
    EditText editTextEmail , editTextPassword;
    Button buttonLogIn, buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);

        //2.initialize properties
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextPassword=findViewById(R.id.editTextPassword);

        buttonLogIn=findViewById(R.id.buttonSignIn);
        buttonSignUp=findViewById(R.id.buttonSignUp);
        buttonLogIn.setOnClickListener(this);
        buttonSignUp.setOnClickListener(this);
    }
}
