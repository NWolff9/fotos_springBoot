package fotos.envio.envio_fotos.Controller;

import fotos.envio.envio_fotos.foto.Disco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/fotos")
public class FotosController {
    @Autowired
    private Disco disco;
    @PostMapping
    public  void upload(@RequestParam MultipartFile foto){
        disco.salvarFotos(foto);

    }
}
