package me.dio.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.dominio.model.Barbeiro;
import me.dio.service.BarbeiroService;

@RestController
@RequestMapping("/barbeiros")
public class BarbeiroController {

    private final BarbeiroService barbeiroService;

    public BarbeiroController(BarbeiroService barbeiroService) {
        this.barbeiroService = barbeiroService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Barbeiro> findById(@PathVariable Long id) {
        var barbeiro = barbeiroService.findById(id);
        return ResponseEntity.ok(barbeiro);
    }

    @PostMapping()
    public ResponseEntity<Barbeiro> create(@RequestBody Barbeiro barbeiroToCreate) {
        var barbeiroCreated = barbeiroService.create(barbeiroToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(barbeiroCreated.getId())
        .toUri();
        return ResponseEntity.created(location).body(barbeiroCreated);
    }
}
