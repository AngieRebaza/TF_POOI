package Package.Cine.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import Package.Cine.Objetos.Butacas;
import java.util.*;

@Controller
public class ButacasController {
    @GetMapping("/butacas")
    public String tablaButacas(@RequestParam String pelicula, Model model) {
        List<Butacas> listaButacas = new ArrayList<>();

        char fila = 'A';
        for (int i=1; i<=20; i++) {
            String codigo = fila + String.valueOf(i);
            listaButacas.add(new Butacas(codigo, false));
        }
        model.addAttribute("p", pelicula);
        model.addAttribute("b", listaButacas);
        return "butacas";
    }

}
