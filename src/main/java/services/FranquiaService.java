package services;


import dao.FranquiaDAO;
import entity.Franquia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by harlock on 23/04/17.
 */
public class FranquiaService {
    @Autowired
    private FranquiaDAO dao;
    @Transactional
    public List<Franquia> listatodos(){
        return dao.retornaTodos();
    }
    @Transactional
    public List<Franquia> listatodos(int id){
        return dao.retornaTodos(id);
    }
    @Transactional
    public Franquia insere(Franquia franquia){
        return  dao.inserirFranquia(franquia);
    }
    @Transactional
    public Franquia franquia(Franquia franquia){
        return dao.updateFranquia(franquia);
    }
    @Transactional
    public Franquia remove(Franquia franquia){
        return dao.deleteFranquia(franquia);
    }
}
