package services;


import dao.FichaDeSelecaoDAO;
import entity.FichaDeSelecao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by harlock on 23/04/17.
 */
public class FichaDeSelecaoService {
    @Autowired
    private FichaDeSelecaoDAO dao;

    @Transactional
    public List<FichaDeSelecao> retornaTodos(){
        return dao.retornaTodos();
    }
    @Transactional
    public List<FichaDeSelecao> retornaTodos(int  id){
        return dao.retornaTodos(id);
    }
    @Transactional
    public FichaDeSelecao inserir(FichaDeSelecao fichaDeSelecao){
        return dao.inserirFichaDeSelecao(fichaDeSelecao);
    }
    @Transactional
    public FichaDeSelecao update(FichaDeSelecao fichaDeSelecao){
        return dao.updateFichaDeSelecao(fichaDeSelecao);
    }
    @Transactional
    public FichaDeSelecao remover(FichaDeSelecao fichaDeSelecao){
        return dao.deleteFichaDeSelecao(fichaDeSelecao);
    }
}
