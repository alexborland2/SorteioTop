package com.example.sorteiotop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view) {
        TextView texto = findViewById(R.id.txtResultado);

        // Crie uma instância de Random
        Random random = new Random();

        // Gere um número aleatório entre 1 e 10 (ajuste os limites conforme necessário)
        int numeroAleatorio = random.nextInt(10) + 1;

        // Atualize o texto com o número aleatório gerado
        texto.setText(String.valueOf(numeroAleatorio));
    }

}