package y2019.weaam.aoc.weaamaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextEmail , editTextPassword;
    Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //2.initialize properties
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextPassword=findViewById(R.id.editTextPassword);
        buttonRegister=findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v==buttonRegister) {
            Intent i=new Intent(this,LoginActivity.class);

        startActivity(i);
    }
}}
