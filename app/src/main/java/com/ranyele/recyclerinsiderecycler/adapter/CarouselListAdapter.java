package com.ranyele.recyclerinsiderecycler.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.ranyele.recyclerinsiderecycler.R;
import com.ranyele.recyclerinsiderecycler.model.CarouselList;

import java.util.List;

/**
 * Created by ranyeleamorim on 11/11/17.
 */
public class CarouselListAdapter extends RecyclerView.Adapter<CarouselListAdapter.MyViewHolder> {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<CarouselList> mLista;

    public CarouselListAdapter(Context context, List<CarouselList> list){
       this.mContext = context;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mLista = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mLayoutInflater.inflate(R.layout.view_row_list_content, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.imvImagem.setImageResource(mLista.get(position).getImagem());
        holder.cbvFavorito.setChecked(mLista.get(position).getFavorito() == 1);
        holder.txvTitulo.setText(mLista.get(position).getTitulo());
        holder.txvSubTitulo.setText(mLista.get(position).getDescricao());
        holder.rbvAvaliacao.setNumStars(mLista.get(position).getPontuacao());
        holder.txvSecao.setText(mLista.get(position).getLabelPontuacao());
    }

    @Override
    public int getItemCount() {
        return mLista.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imvImagem;
        TextView txvTitulo;
        TextView txvSubTitulo;
        TextView txvSecao;
        RatingBar rbvAvaliacao;
        CheckBox cbvFavorito;

        MyViewHolder(View itemView) {
            super(itemView);
            imvImagem = itemView.findViewById(R.id.imvImagem);
            cbvFavorito = itemView.findViewById(R.id.cbvFavorito);
            txvTitulo = itemView.findViewById(R.id.txvTitulo);
            txvSubTitulo = itemView.findViewById(R.id.txvSubTitulo);
            txvSecao = itemView.findViewById(R.id.txvSecao);
            rbvAvaliacao = itemView.findViewById(R.id.rbvAvaliacao);
        }

    }
}

