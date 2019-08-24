package com.example.lisyscarvalho.bhaskara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CalculaRaizes (View view) {
        EditText editA, editB, editC;
        Double a, b, c;

        editA = findViewById(R.id.a);
        editB = findViewById(R.id.b);
        editC = findViewById(R.id.c);

        a = Double.parseDouble(editA.toString());
        b = Double.parseDouble(editB.toString());
        c = Double.parseDouble(editC.toString());

        MathUtil m = new MathUtil();
        Double[] solucao = m.CalculaRaizes2Grau(a, b, c);

        TextView x1  = findViewById(R.id.x1);
        TextView x2 = findViewById(R.id.x2);

        if (solucao != null) {

            x1.setText("x1: " + solucao[0].toString());
            x2.setText("x2: " + solucao[1].toString());
        } else {
            x1.setText("x1: Sem solução real");
            x2.setText("x2: Sem solução real");
        }
    }
}
