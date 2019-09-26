package y2019.weaam.aoc.weaamaoc2019;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.addgame:
                Intent i=new Intent(this,AddGameActivity.class);
                startActivity(i);
                break;

            case R.id.gamelist:
                i = new Intent(this,GamelistActivity.class);
                startActivity(i);
                break;

            case R.id.logout:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Are you sure you want to quit?");
                builder.setCancelable(true);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent c = new Intent(MainActivity.this,LoginActivity.class);
                        startActivity(c);
                    }
                });
                builder.setNegativeButton("No", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                break;







        }
        return true;

    }







    @Override
    public boolean onLongClick(View v) {
        return false;
    }




}
