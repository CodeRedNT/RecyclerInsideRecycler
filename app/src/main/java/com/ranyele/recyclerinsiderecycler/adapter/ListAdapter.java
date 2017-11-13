package com.ranyele.recyclerinsiderecycler.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.ranyele.recyclerinsiderecycler.R;
import com.ranyele.recyclerinsiderecycler.model.MainList;

import java.util.List;

/**
 * Created by ranyeleamorim on 11/11/17.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<MainList> mLista;

    public ListAdapter(Context context, List<MainList> list){
       this.mContext = context;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mLista = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mLayoutInflater.inflate(R.layout.view_row_list, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.txvSecao.setText(mLista.get(position).getTitulo());

        holder.rcvCarrossel.setHasFixedSize(true);

        GridLayoutManager llm = new GridLayoutManager(mContext, 1, GridLayoutManager.HORIZONTAL, false);
        holder.rcvCarrossel.setLayoutManager(llm);

        CarouselListAdapter adapter = new CarouselListAdapter(mContext, mLista.get(position).getListaItemCarrossel());
        holder.rcvCarrossel.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return mLista.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txvSecao;
        RecyclerView rcvCarrossel;
        MyViewHolder(View itemView) {
            super(itemView);

            txvSecao = itemView.findViewById(R.id.txvSecao);
            rcvCarrossel =  itemView.findViewById(R.id.rcvCarrossel);
        }

    }
}

