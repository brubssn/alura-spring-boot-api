package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("about")
public class AboutController {

    @GetMapping
    public String about() {
        return """
                Projeto Spring Boot 3 da Alura.
                Realizado por Bruna Bassani, em julho de 2023.
                
                Utilização de Spring Boot, Maven, Intellij IDEA Community Edition e Insomnia.
                Criação de API Rest para uma empresa fictícia de serviços médicos.
                """;
    }

}
