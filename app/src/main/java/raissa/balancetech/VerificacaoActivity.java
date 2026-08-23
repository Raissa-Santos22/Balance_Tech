package raissa.balancetech;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class VerificacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.verificacao);

        Button btnVerificacao = findViewById(R.id.btnVerificacao);

        btnVerificacao.setOnClickListener(v -> {

            Intent intent = new Intent(
                    VerificacaoActivity.this,
                    MainActivity.class
            );

            startActivity(intent);
        });
    }
}