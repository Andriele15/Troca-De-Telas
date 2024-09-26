package br.ulbra.trocadetelas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btTelaPrincipal, btTela2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        CarregarTelaPrincipal();
    }

    public void CarregarTelaPrincipal(){
        setContentView(R.layout.activity_main);
        btTela2 = (Button) findViewById(R.id.btTela2);
        btTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTela2();
            }
        });
    }

    public void CarregarTela2(){
        setContentView(R.layout.tela2);
        btTelaPrincipal = (Button) findViewById(R.id.btTelaPrincipal);
        btTelaPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTelaPrincipal();
            }
        });
    }


}