package services;

import dao.PesquisaMercadoDAO;
import entity.PesquisaMercado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by harlock on 23/04/17.
 */

@Service
@Transactional
public class PesquisaMercadoService {

    @Autowired
    private PesquisaMercadoDAO dao;

    @Transactional
    public List<PesquisaMercado> getAllPesquisaMercados(){
        return dao.retornaTodos();
    }
    @Transactional
    public List<PesquisaMercado> getPesquisaMercadosByNome(Integer idPesquisamercado){
        return dao.retornaTodos(idPesquisamercado);
    }
    @Transactional
    public PesquisaMercado createPesquisaMercado(PesquisaMercado PesquisaMercado){
        return dao.inserirPesquisaMercado(PesquisaMercado);
    }
    @Transactional
    public void updatePesquisaMercado(PesquisaMercado PesquisaMercado){
        dao.updatePesquisaMercado(PesquisaMercado);
    }
    @Transactional
    public void deletePesquisaMercado(PesquisaMercado PesquisaMercado){
        dao.deletePesquisaMercado(PesquisaMercado);
    }

}
