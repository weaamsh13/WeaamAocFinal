package y2019.weaam.aoc.weaamaoc2019;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.FileNotFoundException;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int CAMERA_REQUEST = 0;
    private static final int SELECT_IMAGE = 1;
    EditText editTextEmail , editTextPassword;
    Button buttonRegister;
    Button chooseClub;
    String[] listItems;
    ImageView imagePhoto;
    Button buttonCamera;
    Button buttonGallery;
    Bitmap bitmap;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        listItems = getResources().getStringArray(R.array.club_list);

        //2.initialize properties
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextPassword=findViewById(R.id.editTextPassword);
        buttonRegister=findViewById(R.id.buttonRegister);
        buttonCamera=findViewById(R.id.buttonCamera);
        buttonGallery=findViewById(R.id.buttonGallery);
        imagePhoto=findViewById(R.id.imagePhoto);

        buttonRegister.setOnClickListener(this);
        buttonCamera.setOnClickListener(this);
        buttonGallery.setOnClickListener(this);

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

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

    public void signUp(String email, String password){
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("FirebaseAuth", "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent i=new Intent(SignUpActivity.this,LoginActivity.class);
                            startActivity(i);


                            //updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("FirebaseAuth", "createUserWithEmail:failure", task.getException());
                            Toast.makeText(SignUpActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            //updateUI(null);
                        }

                        // ...
                    }
                });

    }

    public void onClick(View v) {


        if(v==buttonRegister) {
            signUp(editTextEmail.getText().toString(),editTextPassword.getText().toString() );
    }
        if(v == buttonCamera) {
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i,CAMERA_REQUEST);
        }
        if(v == buttonGallery){
            Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(i,SELECT_IMAGE);

        }
}



public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //if the request was from camera and the result was OK meaning the camera worked
    if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
        //the image captured is saved in the data object
        bitmap = (Bitmap) data.getExtras().get("data");
        //set image captured to be the new image
        imagePhoto.setImageBitmap(bitmap);
    }
    else if (requestCode == SELECT_IMAGE && resultCode == Activity.RESULT_OK) {
        Uri targetUri = data.getData();
        try{
            bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(targetUri));
            imagePhoto.setImageBitmap(bitmap);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



}
