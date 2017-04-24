package services;


import dao.CadastroDAO;
import entity.Cadastro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by harlock on 23/04/17.
 */
public class CadastroService {
    @Autowired
    private CadastroDAO dao;
    @Transactional
    public List<Cadastro> listaTodos(){
        return dao.retornaTodos();
    }
    @Transactional
    public List<Cadastro> listaTodos(int id){
        return dao.retornaTodos(id);
    }
    @Transactional
    public Cadastro inserir(Cadastro cadastro){
        return dao.inserirCadastro(cadastro);
    }
    @Transactional
    public Cadastro update(Cadastro cadastro){
        return dao.updateCadastro(cadastro);
    }
    @Transactional
    public Cadastro remover(Cadastro cadastro){
        return dao.deleteCadastro(cadastro);
    }
}
