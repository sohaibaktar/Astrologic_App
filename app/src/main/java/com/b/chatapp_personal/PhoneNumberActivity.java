package com.b.chatapp_personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.b.chatapp_personal.databinding.ActivityPhoneNumberBinding;
import com.google.firebase.auth.FirebaseAuth;

public class PhoneNumberActivity extends AppCompatActivity {

    ActivityPhoneNumberBinding binding;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPhoneNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        auth = FirebaseAuth.getInstance();

        if (auth.getCurrentUser() != null){
            Intent intent = new Intent(PhoneNumberActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }

        getSupportActionBar().hide();

        binding.phoneBox.requestFocus();

        binding.continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhoneNumberActivity.this,OTP_Activity.class);
                intent.putExtra("phoneNumber",binding.phoneBox.getText().toString());
                startActivity(intent);
            }
        });
    }
}