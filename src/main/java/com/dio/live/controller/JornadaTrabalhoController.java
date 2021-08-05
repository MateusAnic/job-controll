package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaService;

public class JornadaTrabalhoController {

    JornadaService jornadaService;

    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    public list<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }

    public List<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") long id) {
        return (List<JornadaTrabalho>) jornadaService.getById(idJornada).orElseThrow(() -> new Exception {
            "jornada não encontrada."
        });
    }
}
