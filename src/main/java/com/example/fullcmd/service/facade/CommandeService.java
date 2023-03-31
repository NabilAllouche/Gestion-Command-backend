package com.example.fullcmd.service.facade;

import com.example.fullcmd.bean.Commande;

import java.util.List;

public interface CommandeService {
    Commande findByReference(String reference) ;

    int deleteByReference(String reference) ;

    Commande save(Commande commande) ;


     List<Commande> findAll() ;



}
