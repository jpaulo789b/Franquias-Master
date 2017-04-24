package services;

import dao.ImovelDAO;
import entity.Imovel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by harlock on 23/04/17.
 */

@Service
@Transactional
public class ImovelService {

    @Autowired
    private ImovelDAO dao;

    @Transactional
    public List<Imovel> getAllImovels(){
        return dao.retornaTodos();
    }
    @Transactional
    public List<Imovel> getImovelsByNome(Integer idImovel){
        return dao.retornaTodos(idImovel);
    }
    @Transactional
    public Imovel createImovel(Imovel Imovel){
        return dao.inserirImovel(Imovel);
    }
    @Transactional
    public void updateImovel(Imovel Imovel){
        dao.updateImovel(Imovel);
    }
    @Transactional
    public void deleteImovel(Imovel Imovel){
        dao.deleteImovel(Imovel);
    }

}
