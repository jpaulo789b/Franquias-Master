package services;

import dao.AcompanhamentoDAO;
import entity.Acompanhamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by harlock on 23/04/17.
 */
public class AcompanhamentoService {
    @Autowired
    private AcompanhamentoDAO dao;

    @Transactional
    public List<Acompanhamento> retornaTodos(){
        return  dao.retornaTodos();
    }
    @Transactional
    public Acompanhamento retornaTodos(int idFranqueado){
        return (Acompanhamento) dao.retornaTodos(idFranqueado);
    }
    @Transactional
    public Acompanhamento inserir(Acompanhamento acompanhamento){
        return dao.inserirAcompanhamento(acompanhamento);
    }
    @Transactional
    public Acompanhamento update(Acompanhamento acompanhamento){
        return dao.updateAcompanhamento(acompanhamento);
    }
    @Transactional
    public Acompanhamento remover(Acompanhamento acompanhamento){
        return dao.inserirAcompanhamento(acompanhamento);
    }
}
