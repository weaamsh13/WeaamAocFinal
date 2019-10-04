package y2019.weaam.aoc.weaamaoc2019;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextEmail , editTextPassword;
    EditText editTextFavoriteClub;
    Button buttonRegister;
    Button chooseClub;
    String[] listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        listItems = getResources().getStringArray(R.array.club_list);

        //2.initialize properties
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextPassword=findViewById(R.id.editTextPassword);
        editTextFavoriteClub=findViewById(R.id.editTextFavoriteClub);
        buttonRegister=findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(this);

        chooseClub = findViewById(R.id.buttonClub);
        chooseClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder= new AlertDialog.Builder(SignUpActivity.this);
                mBuilder.setTitle("Choose a Club");
                mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog mDialog = mBuilder.create();
                mDialog.show();


            }
        });
    }

    public void onClick(View v) {
        if(v==buttonRegister) {
            Intent i=new Intent(this,LoginActivity.class);

        startActivity(i);
    }
}
}
