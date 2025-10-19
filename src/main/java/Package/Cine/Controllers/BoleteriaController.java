package Package.Cine.Controllers;
import Package.Cine.Objetos.PeliculasCartelera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import Package.Cine.Web.ServicioWebCine;
import Package.Cine.Objetos.PeliculasCartelera;

@Controller
@RequestMapping("/boleteria")

public class BoleteriaController {
    @Autowired
    private ServicioWebCine servicioWebCine;

    @GetMapping("/{titulo}")
    public String mostrarBoleteria(@PathVariable String titulo, Model model) {
        PeliculasCartelera pelicula = servicioWebCine.getCartelera()
                .stream()
                .filter(p -> p.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);

        model.addAttribute("p", pelicula);
        return "boleteria";
    }

}
