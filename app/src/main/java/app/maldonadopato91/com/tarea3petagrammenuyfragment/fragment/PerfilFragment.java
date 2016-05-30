package app.maldonadopato91.com.tarea3petagrammenuyfragment.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

import app.maldonadopato91.com.tarea3petagrammenuyfragment.Mascota;
import app.maldonadopato91.com.tarea3petagrammenuyfragment.R;
import app.maldonadopato91.com.tarea3petagrammenuyfragment.adapter.MascotaAdaptador;


public class PerfilFragment extends Fragment {

    ArrayList mascotas;
    RecyclerView rvPerfil;
    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_perfil, container, false);


        //ADAPTER
        //---------------------------------------------------------------------------------
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.per1,0, ""));
        mascotas.add(new Mascota(R.drawable.per2, 0, ""));
        mascotas.add(new Mascota(R.drawable.per3, 0,""));
        mascotas.add(new Mascota(R.drawable.per4, 0,""));
        mascotas.add(new Mascota(R.drawable.per5, 0, ""));
        mascotas.add(new Mascota(R.drawable.per6, 0, ""));
        mascotas.add(new Mascota(R.drawable.per7, 0, ""));
        mascotas.add(new Mascota(R.drawable.per8, 0, ""));
        mascotas.add(new Mascota(R.drawable.per9, 0, ""));

        rvPerfil = (RecyclerView) v.findViewById(R.id.rv_perfil);
        rvPerfil.setHasFixedSize(true);
        final GridLayoutManager glm= new GridLayoutManager(getActivity(),3,GridLayoutManager.VERTICAL,false);
        rvPerfil.setLayoutManager(glm);
        MascotaAdaptador adapter = new MascotaAdaptador(mascotas, getActivity());
        rvPerfil.setAdapter(adapter);


        //FIN ADAPTER
        //-------------------------------------------------------------------------------------

        return v;
    }

}
