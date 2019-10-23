package y2019.weaam.aoc.weaamaoc2019;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.JobIntentService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static android.widget.Toast.makeText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    //1, properties definition
    EditText editTextEmail , editTextPassword;
    Button buttonLogIn, buttonSignUp;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        //2.initialize properties
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextPassword=findViewById(R.id.editTextPassword);

        buttonLogIn=findViewById(R.id.buttonSignIn);
        buttonSignUp=findViewById(R.id.buttonSignUp);
        buttonLogIn.setOnClickListener(this);
        buttonSignUp.setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

    public void signIn (String email, String password){
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("FirebaseAuth", "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent i=new Intent(LoginActivity.this,MainActivity.class);
                            i.putExtra("email" , editTextEmail.getText().toString());
                            i.putExtra("password" , editTextPassword.getText().toString());
                            startActivity(i);
                            //updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("FirebaseAuth", "signInWithEmail:failure", task.getException());
                            Toast.makeText(LoginActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            //updateUI(null);
                        }

                        // ...
                    }
                });
    }



    @Override
    public void onClick(View v) {
        if(v==buttonLogIn){
            if(editTextEmail.getText().toString().equals("")|| editTextPassword.getText().toString().equals("")){
                Toast.makeText(this,"Empty Password or Email",Toast.LENGTH_LONG).show();
            }
            else{ signIn(editTextEmail.getText().toString(),editTextPassword.getText().toString() );}

        }
        else{
            Intent i=new Intent(this,SignUpActivity.class);
            startActivity(i);

        }
    }
}



