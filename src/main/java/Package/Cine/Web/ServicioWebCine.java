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
    private List<Productos> productosSeleccionados;

    public ServicioWebCine() {
        this.cartelera = new ArrayList<>();
        this.salas = new TreeMap<>();
        this.productos = new LinkedHashMap<>();
        this.boleta = new ArrayList<>();
        this.productosSeleccionados = new ArrayList<>();

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
        productos.put("P1", new Productos(10.0, "Popcorn Salada"));
        productos.put("P2", new Productos(12.0, "Popcorn Dulce"));
        productos.put("P3", new Productos(14.0, "Popcorn Mixta"));

        productos.put("P4", new Productos(5.0, "Chips"));
        productos.put("P5", new Productos(8.0, "Hotdog"));
        productos.put("P6", new Productos(9.0, "Muffins"));
        productos.put("B1", new Productos(3.0, "Agua"));
        productos.put("B2", new Productos(6.0, "Gaseosa"));
        productos.put("B3", new Productos(7.0, "Chicha"));
    }

    public double calcularTotalDulceria() {
        double total = 0.0;
        for (Productos p : productos.values()) {
            total += p.getPrecioSnack();
        }
        return total;
    }

    public double calcularMontoTotal(Set<String> butacasSeleccionadas) {
        double precioEntradas = butacasSeleccionadas.size() * 15.0;
        double precioDulceria = calcularTotalDulceria();
        return precioEntradas + precioDulceria;
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

    public void agregarProductoSeleccionado(Productos p) {
        productosSeleccionados.add(p);

    }

    public void

//por ahora no funciona xd dejenlo ahí quiero ver si se puede hacer una compra despues y que las butacas ya compradas no se puedan seleccionar
    public void registrarCompra(BoletaResumen nuevaboleta) {
        boleta.add(nuevaboleta);
    }
}
