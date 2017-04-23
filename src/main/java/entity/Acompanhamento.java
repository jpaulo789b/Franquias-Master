package entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by harlock on 23/04/17.
 */
public class Acompanhamento implements Serializable {
    private static final long serialVersionUID = -370016001147031854L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACOMPANHAMENTO")
    private int id_acompanhamento;
    private Date dtacompanhamento;
    private String descricao;
    private Enum<Classificacao> classificacao;

    enum Classificacao{
        Pesséssimo,Ruim,Regular,Bom,Ótimo
    }
}
