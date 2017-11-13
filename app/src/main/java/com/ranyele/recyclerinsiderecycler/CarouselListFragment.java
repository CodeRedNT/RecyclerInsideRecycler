package com.ranyele.recyclerinsiderecycler;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ranyele.recyclerinsiderecycler.adapter.ListAdapter;
import com.ranyele.recyclerinsiderecycler.model.CarouselList;
import com.ranyele.recyclerinsiderecycler.model.MainList;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class CarouselListFragment extends Fragment {
    // Objeto Pai
    private String[] tituloSecao = {"Seção 1", "Seção 2", "Seção 3"};

    // Objeto Filho
    private String[] titulo = {"General Motors", "Volks", "Ford"};
    private String[] subTitulo = {"TNS20172345 - ENVIADO", "TNS222222345 - ENTREGUE", "TNS20172345 - DESVIADO"};
    private String[] dataHora = {"Label 01", "Label 02", "Label 03"};
    private int[] imagem = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    private int[] avaliacao = {2, 5, 0};
    private int[] favorito = {1, 1, 0};

    private final int NUM_REGISTROS = 3;

    public CarouselListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_carousel_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView mRecyclerView = view.findViewById(R.id.rcvLista);
        mRecyclerView.setHasFixedSize(true);

        GridLayoutManager llm = new GridLayoutManager(view.getContext(), 1, GridLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(llm);

        ListAdapter adapter = new ListAdapter(view.getContext(), getLista());
        mRecyclerView.setAdapter(adapter);
    }

    private List<MainList> getLista(){
        List<MainList> mLista = new ArrayList<>();

        for (int i = 0; i < NUM_REGISTROS; i++) {
            List<CarouselList> mListaCarrosel = new ArrayList<>();
            for (int j = 0; j < NUM_REGISTROS; j++) {
                CarouselList itemCarrossel = new CarouselList(imagem[j],  favorito[j], titulo[j], subTitulo[j],  avaliacao[j], dataHora[j]);
                mListaCarrosel.add(itemCarrossel);
            }

            MainList solicitacao = new MainList(tituloSecao[i], mListaCarrosel);
            mLista.add(solicitacao);
        }

        return mLista;
    }
}
