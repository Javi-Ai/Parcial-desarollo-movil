package com.example.parcial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private Button boton_de_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.nombreUsuario);
        password = findViewById(R.id.contrasena);
        boton_de_login = findViewById(R.id.loginButton);

        boton_de_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = username.getText().toString();
                String passText = password.getText().toString();

                if (userText.isEmpty() || passText.isEmpty()) {
                    Toast.makeText(MainActivity.this, "campos incompletos", Toast.LENGTH_SHORT).show();
                } else {
                    if (userText.equals("uac123") && passText.equals("12345678")) {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}