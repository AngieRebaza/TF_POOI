package Package.Cine.Controllers;
import Package.Cine.Web.ServicioWebCine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import Package.Cine.Objetos.Productos;
import java.util.LinkedHashMap;

@Controller
public class DulceriaController {
    @Autowired
    private ServicioWebCine servicioWebCine;

    @GetMapping("/dulceria")
    public String mostrarDulceria(Model model) {
        LinkedHashMap<String, Productos> productos = servicioWebCine.getProductos();
        model.addAttribute("p", productos);
        return "dulceria";

    }
}
