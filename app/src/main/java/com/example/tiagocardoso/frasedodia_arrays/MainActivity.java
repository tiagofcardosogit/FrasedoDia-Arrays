package com.example.tiagocardoso.frasedodia_arrays;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends Activity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private String[] frases = {
            "Não existe dia melhor para recomeçar uma luta ou uma simples dieta que uma segunda-feira.",
            "O sucesso é tão importante como o caminho percorrido para o alcançar!",
            "O passado vive apenas no seu pensamento, por isso determine seu futuro através das ações no presente!",
            "Não desista perante os problemas; lute com mais força porque as dificuldades fazem parte de qualquer caminho.",
            "Chupa que é de Uva!!!!!",
            "Aquel 1% é vagabundooooo!!!!",
            "As falhas de hoje são os degraus para o sucesso de amanhã. Boa semana!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.IdTexto);
        botaoNovaFrase = (Button) findViewById(R.id.idBotaoNovaFrase);



        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int numeroAlatorio = random.nextInt(frases.length);

                textoNovaFrase.setText(frases[numeroAlatorio]);
            }
        });
    }
}
