package com.example.Blockchain_App.Core;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Blockchain_App.Blockchain.Blockchain_user_registration;
import com.example.Blockchain_App.Blockchain.Blockchain_user_verification;
import com.example.Blockchain_App.R;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity
{

    private Button btn_reg, btn_verify,btn_logout;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mAuth = FirebaseAuth.getInstance();
        init();

        btn_reg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent blockchain_reg_intent = new Intent(getApplicationContext(), Blockchain_user_registration.class);
                startActivity(blockchain_reg_intent);

            }
        });


        btn_verify.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent blockchain_verify_intent = new Intent(getApplicationContext(), Blockchain_user_verification.class);
                startActivity(blockchain_verify_intent);
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logout();
            }
        });

    }

    private void init()
  {
       btn_reg = findViewById(R.id.btn_blockchain_reg);
       btn_verify = findViewById(R.id.btn_blockchain_verify);
       btn_logout = findViewById(R.id.btn_logout);
   }

   private void Logout()
   {
       FirebaseAuth.getInstance().signOut();
       Intent logoutIntent = new Intent(getApplicationContext(), Activity_SignIn.class);
       startActivity(logoutIntent);
       finish();
   }
}
















