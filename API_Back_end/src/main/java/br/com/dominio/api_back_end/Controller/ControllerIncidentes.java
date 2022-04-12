package br.com.dominio.api_back_end.Controller;


import br.com.dominio.api_back_end.Model.ModelIncidentes;
import br.com.dominio.api_back_end.Repositories.RepositoryIncidentes;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ControllerIncidentes {

    private RepositoryIncidentes repositoryIncidentes;

    @GetMapping(path="/incidentes/{nome}")
    public List<ModelIncidentes> listar(@PathVariable String nome) {
        String uri = "http://localhost:8080/im-day";
        RestTemplate restTemplate = new RestTemplate();
        ModelIncidentes lista = restTemplate.getForObject(uri, ModelIncidentes.class);
        return repositoryIncidentes.findByNome(nome);
    }

    @GetMapping(path="/incidentes/todos")
    public List<ModelIncidentes> listar() {
        String uri = "http://localhost:8080/im-day";
        RestTemplate restTemplate = new RestTemplate();
        ModelIncidentes lista = restTemplate.getForObject(uri, ModelIncidentes.class);
        return repositoryIncidentes.findAll();
    }
}
