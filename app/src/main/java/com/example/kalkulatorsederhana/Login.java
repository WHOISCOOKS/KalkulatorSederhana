package com.example.kalkulatorsederhana;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kalkulatorsederhana.R;

public class Login extends AppCompatActivity {

    // Define your UI elements
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;

    // Define your credentials (for demonstration purposes)
    private static final String CORRECT_USERNAME = "user";
    private static final String CORRECT_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize UI elements
        editTextUsername = findViewById(R.id.txtEmail);
        editTextPassword = findViewById(R.id.txtPassword);
        buttonLogin = findViewById(R.id.btnLogin);

        // Set OnClickListener for the login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input values from EditText fields
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Check if username and password match the correct credentials
                if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                    // If the credentials are correct, display a toast and proceed to the next activity
                    Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    // Here, you can start the next activity or perform other actions
                } else {
                    // If the credentials are incorrect, display a toast
                    Toast.makeText(Login.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
