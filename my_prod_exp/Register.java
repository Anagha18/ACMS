package com.example.my_prod_exp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.lang.invoke.ConstantCallSite;


public class Register extends AppCompatActivity {

    private EditText fullname,username, userpassword, useremail,conpassword;
    private Button regbutton,logbutton;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setTitle("Signup Form");
        setupUIViews();

        firebaseAuth = FirebaseAuth.getInstance();

        regbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate()){
                    //upload data to the database
                    String user_email = useremail.getText().toString().trim();
                    String user_password = userpassword.getText().toString().trim();

                    firebaseAuth.createUserWithEmailAndPassword(user_email, user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Register.this,Login.class));
                            }
                            else{
                                Toast.makeText(Register.this, "Registration Unsuccessful", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }

    private void setupUIViews(){
        fullname = (EditText)findViewById(R.id.idfullname);
        username = (EditText)findViewById(R.id.idusername);
        userpassword = (EditText)findViewById(R.id.idpass);
        conpassword = (EditText)findViewById(R.id.idconpass);
        useremail = (EditText)findViewById(R.id.idemail);
        regbutton = (Button)findViewById(R.id.idregbutton);
        logbutton = (Button)findViewById(R.id.idlogbutton);
    }

    private Boolean validate(){
        Boolean result = false;
        String vfullname = fullname.getText().toString();
        String vusername = username.getText().toString();
        String vpassword = userpassword.getText().toString();
        String vconpassword = conpassword.getText().toString();
        String vuseremail = useremail.getText().toString();

        if (vfullname.isEmpty() || vusername.isEmpty() || vpassword.isEmpty() || vconpassword.isEmpty() || vuseremail.isEmpty()){
            Toast.makeText(this,"Please enter all the details",Toast.LENGTH_SHORT).show();
        }
        else{
            result = true;
        }
        return result;
    }

    public void btn_Login(View view) {
        startActivity(new Intent(getApplicationContext(),Login.class));
    }
}
