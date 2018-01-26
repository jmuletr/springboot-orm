package com.esliceu.orm.controller;

import com.esliceu.orm.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GlosesController {
    @Autowired
    private GlosaRepository glosaRepository;
    @Autowired
    private VersRepository versRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @RequestMapping("/getAllGloses")
    public List<Glosa> findAll() {
        return (List) glosaRepository.findAll();
    }

    @RequestMapping("/addGlosa")
    public ResponseEntity<String> glosa(@RequestBody Glosa glosa) {
        glosaRepository.save(glosa);
        return ResponseEntity.ok("ok");
    }

    @RequestMapping("/getAllVers")
    public List<Vers> findAllVers() {
        return (List) versRepository.findAll();
    }

    @RequestMapping("/getAllCategories")
    public List<Categoria> findAllCat() {
        return (List) categoriaRepository.findAll();
    }
}
