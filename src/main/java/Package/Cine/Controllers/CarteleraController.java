package Package.Cine.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import Package.Cine.Web.ServicioWebCine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarteleraController {

    @Autowired
    private ServicioWebCine servicioWebCine;

    @GetMapping("/cartelera")
    public String mostrarCartelera(Model model) {
        model.addAttribute("peliculas", servicioWebCine.getCartelera());
        return "cartelera";
    }
}

