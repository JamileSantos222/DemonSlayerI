package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MiniaturasFragment extends Fragment {
    RecyclerView idRecyclerViewMiniatura;
    List<Miniatura> lstMiniatura;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_miniaturas, container, false);

        idRecyclerViewMiniatura = view.findViewById(R.id.idRecyclerViewMiniatura);

        lstMiniatura = new ArrayList<>();
        lstMiniatura.add(new Miniatura(R.drawable.muzan, "Muzan"));
        lstMiniatura.add(new Miniatura(R.drawable.tajiro, "Tanjiro"));
        lstMiniatura.add(new Miniatura(R.drawable.nezuko, "Nezuko"));
        lstMiniatura.add(new Miniatura(R.drawable.zenitzu, "Zenitzu"));
        lstMiniatura.add(new Miniatura(R.drawable.rengoku, "Rengoku"));
        lstMiniatura.add(new Miniatura(R.drawable.inosuke, "Inosuke"));
        lstMiniatura.add(new Miniatura(R.drawable.shinobo, "Shinobo"));

        AdaptadorMiniatura adaptadorMiniatura = new AdaptadorMiniatura(getContext(), lstMiniatura);

        idRecyclerViewMiniatura.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        idRecyclerViewMiniatura.setAdapter(adaptadorMiniatura);

        return view;
    }
}