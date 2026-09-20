package raissa.balancetech;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionarioActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionario);

        Button btnQuestionario= findViewById(R.id.btnQuestionario);

        btnQuestionario.setOnClickListener(v -> {
            Intent intent = new Intent(QuestionarioActivity.this, RefeicaoActivity.class);
            startActivity(intent);
        });
    }
}