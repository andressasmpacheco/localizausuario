package br.com.local.appgooglemapslocalizausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Localizacao extends AppCompatActivity {
    Button meu_botao;
    EditText lat, longi;
    int ilat, ilongi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao);

        meu_botao =  findViewById(R.id.botao_local);
        lat = findViewById(R.id.latitude);
        longi = findViewById(R.id.longitude);
        ilat = lat.getText().toString();

        meu_botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Localizacao.class);
            }
        });
    }
}