package com.example.bird.Login;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bird.R;

public class LoginActivity extends AppCompatActivity {

    EditText edtUserName=findViewById(R.id.edtUserName);
    EditText edtPass=findViewById(R.id.edtPass);
    Button btnLogin=findViewById(R.id.btnLogin);
    Button btnHelp=findViewById(R.id.btnHelp);
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
