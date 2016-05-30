package app.maldonadopato91.com.tarea3petagrammenuyfragment;

/**
 * Created by User on 22/5/2016.
 */
public class Mascota {
    private int id;
    private int fotoMascota;
    private int likeMasco=0;
    private String nombreMasco;

    public Mascota() {
    }

    public Mascota(int fotoMascota, int likeMasco, String nombreMasco) {
        this.fotoMascota = fotoMascota;
        this.likeMasco = likeMasco;
        this.nombreMasco = nombreMasco;
    }

    public int getLikeMasco() {
        return likeMasco;
    }

    public void setLikeMasco(int likeMasco) {
        this.likeMasco = likeMasco;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public String getNombreMasco() {
        return nombreMasco;
    }

    public void setNombreMasco(String nombreMasco) {
        this.nombreMasco = nombreMasco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}