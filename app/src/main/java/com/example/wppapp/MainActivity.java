package com.example.wppapp;

import static com.example.wppapp.R.id.LayoutEnviarMensagem;
import static com.example.wppapp.R.id.LayoutEnviarNumero;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {
    private TextInputLayout LayoutEnviarNumero;
    private TextInputLayout LayoutEnviarMensagem;

    private TextInputEditText enviarNumero;
    private TextInputEditText enviarMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutEnviarNumero = findViewById(R.id.LayoutEnviarNumero);
        LayoutEnviarMensagem = findViewById(R.id.LayoutEnviarMensagem);

        enviarNumero = findViewById(R.id.enviarNumero);
        enviarMensagem = findViewById(R.id.enviarMensagem);


        View btn = findViewById(R.id.btn);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String num = enviarNumero.getText().toString();
                        String msg = enviarMensagem.getText().toString();

                        Uri link = Uri.parse("https://wa.me/" +"55"+ num + "?text=" + msg);

                        Intent callIntent = new Intent(Intent.ACTION_VIEW, link);
                        startActivity(callIntent);
                    }
                }
        );
    }
}