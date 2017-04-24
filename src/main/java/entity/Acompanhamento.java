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
    private Franquia franquia;
    private Cadastro cadastro;
    private Enum<Classificacao> classificacao;

    enum Classificacao{
        Pesséssimo,Ruim,Regular,Bom,Ótimo
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId_acompanhamento() {
        return id_acompanhamento;
    }

    public void setId_acompanhamento(int id_acompanhamento) {
        this.id_acompanhamento = id_acompanhamento;
    }

    public Date getDtacompanhamento() {
        return dtacompanhamento;
    }

    public void setDtacompanhamento(Date dtacompanhamento) {
        this.dtacompanhamento = dtacompanhamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Franquia getFranquia() {
        return franquia;
    }

    public void setFranquia(Franquia franquia) {
        this.franquia = franquia;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Enum<Classificacao> getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Enum<Classificacao> classificacao) {
        this.classificacao = classificacao;
    }
}
