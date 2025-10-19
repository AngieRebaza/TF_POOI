package Package.Cine.Web;
import org.springframework.stereotype.Service;
import java.util.*;
import Package.Cine.Objetos.*;

@Service
public class ServicioWebCine {

    private List<PeliculasCartelera> cartelera;
    private TreeMap<Integer, Salas> salas;
    private LinkedHashMap<String, Productos> productos;
    private List<BoletaResumen> boleta;

    public ServicioWebCine() {
        this.cartelera = new ArrayList<>();
        this.salas = new TreeMap<>();
        this.productos = new LinkedHashMap<>();
        this.boleta = new ArrayList<>();

        datosPeliculas();
        datoSalas();
        datosProductos();
    }

    private void datosPeliculas() {

        cartelera.add(new PeliculasCartelera("Pelicula 1", "Genero 1", 200, 1, "9:00am"));
        cartelera.add(new PeliculasCartelera("Pelicula 2", "Genero 2", 150, 2, "3:00pm"));
        cartelera.add(new PeliculasCartelera("Pelicula 3", "Genero 3", 100, 3, "7:00pm"));
    }

    private void datoSalas() {
        for (int i = 1; i <= 9; i++) {
            salas.put(i, new Salas(i, "Piso " + ((i - 1) / 3 + 1)));
        }
    }

    private void datosProductos () {
        productos.put("P1", new Productos(10.0, "popcorn"));
        productos.put("P2", new Productos(5.0, "Chips"));
        productos.put("P3", new Productos(8.0, "hotdog"));
        productos.put("P4", new Productos(9.0, "Muffins"));
        productos.put("B1", new Productos(3.0, "Agua"));
        productos.put("B2", new Productos(6.0, "Gaseosa"));
        productos.put("B3", new Productos(7.0, "Chicha"));
    }

    public List<PeliculasCartelera> getCartelera() {
        return cartelera;
    }

    public TreeMap<Integer, Salas> getSalas() {
        return salas;
    }

    public LinkedHashMap<String, Productos> getProductos() {
        return productos;
    }

    public List<BoletaResumen> getBoleta() {
        return boleta;
    }

    public void registrarCompra(BoletaResumen nuevaboleta) {
        boleta.add(nuevaboleta);
    }
}
