package y2019.weaam.aoc.weaamaoc2019;

import android.content.Intent;
import android.support.v4.app.JobIntentService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    //1, properties definition
    EditText editTextEmail , EditTextPassword;
    Button buttonLogIn, buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //2.initialize properties
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextEmail=findViewById(R.id.editTextPassword);

        buttonLogIn=findViewById(R.id.buttonSignIn);
        buttonSignUp=findViewById(R.id.buttonSignUp);
        buttonLogIn.setOnClickListener(this);
        buttonSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==buttonLogIn){
            if(editTextEmail.getText().toString().equals("")|| editTextPassword.getText().toString().equals("")){
                Toast.makeText(this,"Empty Password or Email",Toast.LENGTH_LONG).show();
            }
            else{ Intent i=new Intent(this,MainActivity.class);
                i.putExtra("email" , editTextEmail.getText().toString());
                i.putExtra("password" , editTextPassword.getText().toString());
                startActivity(i);}

        }
        else{
            Intent i=new Intent(this,SignUpActivity.class);
            startActivity(i);

        }
    }
}



