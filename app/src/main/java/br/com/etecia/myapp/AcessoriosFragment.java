package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class AcessoriosFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_acessorios, container, false);


        MaterialCardView cardZenitsu = view.findViewById(R.id.CardZenitzu);
        MaterialCardView cardInosuke = view.findViewById(R.id.CardInosuke);
        MaterialCardView cardShinobu = view.findViewById(R.id.CardShinobu);

        // Zenitsu
        cardZenitsu.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Clicou no Zenitsu", Toast.LENGTH_SHORT).show();


            Intent intent = new Intent(getContext(), DetalheActivity.class);
            intent.putExtra("nome", "Zenitsu Agatsuma");
            intent.putExtra("descricao", "Action Figure articulada do Zenitsu. Possui 10 cm com cores vivas e detalhes exclusivo do personagem. PARCELAMOS 3X sem juros");
            intent.putExtra("preco", "R$ 129,90");
            intent.putExtra("imagem", R.drawable.figurezenitzu);
            startActivity(intent);
        });

        //  Inosuke
        cardInosuke.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), DetalheActivity.class);
            intent.putExtra("nome", "Inosuke Hashibira");
            intent.putExtra("descricao", "Action Figure articulada do Inosuke versão cute. Possui 10 cm com cores vivas do personagem. Com riqueza de detalhes. PARCELAMOS 3X sem juros ");
            intent.putExtra("preco", "R$ 139,90");
            intent.putExtra("imagem", R.drawable.figureinosuke);
            startActivity(intent);
        });

        // Clique na Shinobu
        cardShinobu.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), DetalheActivity.class);
            intent.putExtra("nome", "Shinobu Kocho");
            intent.putExtra("descricao", "Action Figure articulada da Shinobu.");
            intent.putExtra("preco", "R$ 149,90");
            intent.putExtra("imagem", R.drawable.shinobu);
            startActivity(intent);
        });

        return view;
    }
}
