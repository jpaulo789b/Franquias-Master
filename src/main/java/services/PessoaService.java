package services;

import dao.PessoaDAO;
import entity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by harlock on 23/04/17.
 */

@Service
@Transactional
public class PessoaService {

    @Autowired
    private PessoaDAO dao = new PessoaDAO();

    @Transactional
    public List<Pessoa> getAllPessoas(){
        return dao.retornaTodos();
    }
    @Transactional
    public List<Pessoa> getPessoasByNome(Integer idPessoa){
        return dao.retornaTodos(idPessoa);
    }
    @Transactional
    public Pessoa createPessoa(Pessoa Pessoa){
        return dao.inserirPessoa(Pessoa);
    }
    @Transactional
    public void updatePessoa(Pessoa Pessoa){
        dao.updatePessoa(Pessoa);
    }
    @Transactional
    public void deletePessoa(Pessoa Pessoa){
        dao.deletePessoa(Pessoa);
    }

}
