package com.example.fullcmd.ws.provided;

import com.example.fullcmd.bean.Commande;
import com.example.fullcmd.service.facade.CommandeService;
import com.example.fullcmd.service.impl.CommandeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController()
@RequestMapping("/api/v1/commande")
public class CommandeWs {

    @Autowired
    private CommandeService commandeService ;
    @GetMapping("/reference/{reference}")
    public Commande findByReference(@PathVariable String reference) {
        return commandeService.findByReference(reference);
    }


    @DeleteMapping("/reference/{reference}")
    public int deleteByReference (@PathVariable String reference) {
        return commandeService.deleteByReference(reference);
    }


    @PostMapping("/")
    public Commande save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }
    @GetMapping("/findAll/")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }
}
