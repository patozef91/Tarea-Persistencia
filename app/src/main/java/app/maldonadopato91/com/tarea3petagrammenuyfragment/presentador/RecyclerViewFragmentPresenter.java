package app.maldonadopato91.com.tarea3petagrammenuyfragment.presentador;

import android.content.Context;

import java.util.ArrayList;

import app.maldonadopato91.com.tarea3petagrammenuyfragment.Mascota;
import app.maldonadopato91.com.tarea3petagrammenuyfragment.fragment.IRecyclerViewFragmentView;
import app.maldonadopato91.com.tarea3petagrammenuyfragment.model.ConstructorMascotas;

/**
 * Created by User on 29/5/2016.
 */
public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter{
    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
    }

    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas= constructorMascotas.obtenerDatos();
        mostrarMascotasRV();
    }

    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
