package br.com.etecia.myapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Detalhes do Item"); // Opcional: título
        }


        // Pegando referencias do layooooout!!!
        TextView tvNome = findViewById(R.id.tvNome);
        TextView tvDescricao = findViewById(R.id.tvDescricao);
        TextView tvPreco = findViewById(R.id.tvPreco);
        ImageView ivImagem = findViewById(R.id.ivImagem);

        // dados do Inteent
        if (getIntent() != null) {
            tvNome.setText(getIntent().getStringExtra("nome"));
            tvDescricao.setText(getIntent().getStringExtra("descricao"));
            tvPreco.setText(getIntent().getStringExtra("preco"));
            ivImagem.setImageResource(getIntent().getIntExtra("imagem", 0));
        }

    }
    @Override
    public boolean onSupportNavigateUp() {
        finish(); // espero que volte pra tela MDSSSSSS!!!
        return true;
    }

}
