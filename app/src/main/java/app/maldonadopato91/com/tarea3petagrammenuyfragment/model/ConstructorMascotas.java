package app.maldonadopato91.com.tarea3petagrammenuyfragment.model;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;

import app.maldonadopato91.com.tarea3petagrammenuyfragment.Mascota;
import app.maldonadopato91.com.tarea3petagrammenuyfragment.R;
import app.maldonadopato91.com.tarea3petagrammenuyfragment.db.BaseDatos;
import app.maldonadopato91.com.tarea3petagrammenuyfragment.db.ConstantesBaseDatos;

/**
 * Created by User on 29/5/2016.
 */
public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;
    public ConstructorMascotas(Context context){
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){
        BaseDatos db = new BaseDatos(context);
        insertarMascotasaBD(db);
        return db.obtenerTodosLasMascotas();
    }

    public void insertarMascotasaBD(BaseDatos db){

        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Armani");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.ax);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Dior");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.dior);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Crystal");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.gray_puppy);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Lamborghini");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.lambo);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Nacho");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.nacho);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Prada");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.prada);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Vidal");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.vidal);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);
    }


    public int obtenerLikesContacto(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascota(mascota);
    }
}
