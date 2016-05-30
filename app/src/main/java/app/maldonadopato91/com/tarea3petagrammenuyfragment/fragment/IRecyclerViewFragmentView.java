package app.maldonadopato91.com.tarea3petagrammenuyfragment.fragment;

import java.util.ArrayList;

import app.maldonadopato91.com.tarea3petagrammenuyfragment.Mascota;
import app.maldonadopato91.com.tarea3petagrammenuyfragment.adapter.MascotaAdaptador;

/**
 * Created by User on 29/5/2016.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> contactos);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
