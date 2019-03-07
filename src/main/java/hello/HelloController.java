package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import java.util.List;

@RestController
public class HelloController {

    @Value("${content}")
    private String content;

    @Autowired
    private IDongleInterface dongleRepository;
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!"+ content ;
    }

    @GetMapping(value="/all")
    public List<Dongle> findAll(){
        return dongleRepository.findAll();
    }

    @GetMapping(value="/space/{space}")
    public Dongle findBySpace(@PathVariable final String space){
        return dongleRepository.findBySpace(space);
    }

    @PostMapping(value = "/load")
    public Dongle load(@RequestBody final Dongle dongle) {
        dongleRepository.save(dongle);
        return dongleRepository.findBySpace(dongle.getSpace());

    }
}
