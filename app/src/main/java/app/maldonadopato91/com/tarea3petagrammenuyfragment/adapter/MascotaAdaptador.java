package app.maldonadopato91.com.tarea3petagrammenuyfragment.adapter;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/*import com.cristian.fragment.R;
import com.cristian.fragment.pojo.Mascota;*/

import java.util.ArrayList;

import app.maldonadopato91.com.tarea3petagrammenuyfragment.Mascota;
import app.maldonadopato91.com.tarea3petagrammenuyfragment.R;
import app.maldonadopato91.com.tarea3petagrammenuyfragment.model.ConstructorMascotas;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_mascota, viewGroup, false);
        MascotaViewHolder mvh = new MascotaViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota masco=mascotas.get(position);
        mascotaViewHolder.mascotaName.setText(masco.getNombreMasco());
        mascotaViewHolder.mascotaPhoto.setImageResource(masco.getFotoMascota());
        mascotaViewHolder.mascotaLike.setText(String.valueOf(masco.getLikeMasco()));
        mascotaViewHolder.iconoHueso.setTag(mascotaViewHolder);

        mascotaViewHolder.iconoHueso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mascotaViewHolder.iconoHueso.setImageResource(R.drawable.huesodorado);
                ConstructorMascotas constructorContactos = new ConstructorMascotas(activity);
                mascotaViewHolder.mascotaLike.setText(constructorContactos.obtenerLikesContacto(masco) + " " + activity.getString(R.string.pLikes));
            }
        });

    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        private CardView cvMascota;
        private TextView mascotaName;
        private TextView mascotaLike;
        private ImageView mascotaPhoto;
        private ImageView iconoHueso;

        MascotaViewHolder(View itemView) {
            super(itemView);
            cvMascota = (CardView)itemView.findViewById(R.id.cvMascota);
            mascotaName = (TextView)itemView.findViewById(R.id.tvNombreMascota);
            mascotaLike = (TextView)itemView.findViewById(R.id.tvNum);
            mascotaPhoto = (ImageView)itemView.findViewById(R.id.ivMascotaFoto);
            iconoHueso =(ImageView)itemView.findViewById(R.id.ivHuesoBlanco);
        }

    }


    @Override
    public int getItemCount() {
        return mascotas.size();
    }


}
