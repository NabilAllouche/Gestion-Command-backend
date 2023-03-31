package com.example.fullcmd.service.impl;

import com.example.fullcmd.bean.Commande;
import com.example.fullcmd.dao.CommandeDao;
import com.example.fullcmd.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    private CommandeDao commandeDao ;

    @Override
    public Commande findByReference(String reference) {
        return commandeDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return commandeDao.deleteByReference(reference);
    }

    public Commande save(Commande commande) {
        Commande res=null ;
        if (findByReference(commande.getReference()) == null ) {
            res = commandeDao.save(commande) ;

        }
      return res  ;
    }

    public List<Commande> findAll() {
        return commandeDao.findAll();
    }
}
