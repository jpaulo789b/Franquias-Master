package services;

import dao.PesquisaMercadoDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import entity.PesquisaDeMercado;
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
    public List<PesquisaDeMercado> getAllPesquisaMercados(){
        return dao.retornaTodos();
    }
    @Transactional
    public List<PesquisaDeMercado> getPesquisaMercadosByNome(Integer idPesquisamercado){
        return dao.retornaTodos(idPesquisamercado);
    }
    @Transactional
    public PesquisaDeMercado createPesquisaMercado(PesquisaDeMercado PesquisaMercado){
        return dao.inserirPesquisaMercado(PesquisaMercado);
    }
    @Transactional
    public void updatePesquisaMercado(PesquisaDeMercado PesquisaMercado){
        dao.updatePesquisaMercado(PesquisaMercado);
    }
    @Transactional
    public void deletePesquisaMercado(PesquisaDeMercado PesquisaMercado){
        dao.deletePesquisaMercado(PesquisaMercado);
    }

}
