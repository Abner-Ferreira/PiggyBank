package br.com.fiap.piggybank.controllers;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.piggybank.models.Despesa;

@RestController
public class DespesaController {
    
    @GetMapping("/api/despesas")
    public Despesa show(){
        var despesa = new Despesa(new BigDecimal(100), LocalDate.now(), "cinema");

        return despesa;
    }
}
        