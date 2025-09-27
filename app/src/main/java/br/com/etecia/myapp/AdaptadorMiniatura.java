package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorMiniatura extends RecyclerView.Adapter<AdaptadorMiniatura.ViewHolder> {
    private Context context;
    private List<Miniatura> lstMiniatura;

    public AdaptadorMiniatura(Context context, List<Miniatura> lstMiniatura) {
        this.context = context;
        this.lstMiniatura = lstMiniatura;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);

        view = inflater.inflate(R.layout.modelo_miniatura, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idTituloMiniatura.setText(lstMiniatura.get(position).getTituloMiniatura());
        holder.imgCardMiniatura.setImageResource(lstMiniatura.get(position).getImgMiniatura());
    }

    @Override
    public int getItemCount() {
        return lstMiniatura.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCardMiniatura;
        TextView idTituloMiniatura;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCardMiniatura = itemView.findViewById(R.id.imgCardMiniatura);
            idTituloMiniatura = itemView.findViewById(R.id.idTituloMiniatura);
        }
    }
}