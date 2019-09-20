package y2019.weaam.aoc.weaamaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener
{

    //components
    TextView tvEmail, tvPassword;
    Button buttonSignIn, buttonSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String password = getIntent().getStringExtra("password");

        String email = getIntent().getStringExtra("email");

        tvEmail = findViewById(R.id.tvEmail);
        tvPassword = findViewById(R.id.tvPassword);

        tvEmail.setText(email);
        tvPassword.setText(password);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating objects for components
        buttonSignIn = findViewById(R.id.buttonSignIn);
        buttonSignUp = findViewById(R.id.buttonSignUp);

        buttonSignIn.setOnClickListener(this);
        buttonSignUp.setOnClickListener(this);

        buttonSignUp.setOnLongClickListener(this );

    }

    @Override
    public void onClick(View v) {
        if (v == buttonSignIn) {
            Toast.makeText(this, "Sign In", Toast.LENGTH_LONG).show();


        }
        else {
            Toast.makeText(this, "Sign Up", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }


}
