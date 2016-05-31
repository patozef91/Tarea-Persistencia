package app.maldonadopato91.com.tarea3petagrammenuyfragment;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import app.maldonadopato91.com.tarea3petagrammenuyfragment.adapter.MascotaAdaptador;

public class MascotasFavoritas extends AppCompatActivity {
    ImageView imagenDerecha;
    ArrayList mascotas;
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);
        Toolbar miActionBar= (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        ((TextView) findViewById(R.id.toolbar_title)).setText("Petagram");
        imagenDerecha=((ImageView)findViewById(R.id.imagenDerecha));
        imagenDerecha.setVisibility(View.INVISIBLE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.gray_puppy,0, "Crystal"));
        mascotas.add(new Mascota(R.drawable.lambo, 0, "Lamborghini"));
        mascotas.add(new Mascota(R.drawable.nacho, 0,"Nacho"));
        mascotas.add(new Mascota(R.drawable.prada, 0,"Prada"));
        mascotas.add(new Mascota(R.drawable.vidal, 0, "Vidal"));


        RecyclerView rvMascotasFav = (RecyclerView)findViewById(R.id.rv_detalle);
        rvMascotasFav.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotasFav.setLayoutManager(llm);
        rvMascotasFav.setClickable(false);
        rvMascotasFav.setEnabled(false);
        rvMascotasFav.setLayoutFrozen(true);
        rvMascotasFav.setItemAnimator(new DefaultItemAnimator());
        MascotaAdaptador adapter = new MascotaAdaptador(mascotas, activity);//paso listado al adaptador
        rvMascotasFav.setAdapter(adapter);

    }
}
