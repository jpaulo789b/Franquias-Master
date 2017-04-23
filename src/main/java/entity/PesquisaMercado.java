package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by harlock on 23/04/17.
 */
@Entity
public class PesquisaMercado implements Serializable {
    private static final long serialVersionUID = -370016001147031854L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PESQUISA_MERCADO")
    private Integer idf;
    @Temporal(TemporalType.DATE)
    private Date dtdapesquisa;
    private String reconhecimentodoproblema;
    private String resolução;
    private String avaliacaodasalternativas;
    @Enumerated(EnumType.ORDINAL)
    private Enum<Viabilidade> situacao;
    private String conclusao;
    enum Viabilidade{
    apto,naoapto,inviavel
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public Date getDtdapesquisa() {
        return dtdapesquisa;
    }

    public void setDtdapesquisa(Date dtdapesquisa) {
        this.dtdapesquisa = dtdapesquisa;
    }

    public String getReconhecimentodoproblema() {
        return reconhecimentodoproblema;
    }

    public void setReconhecimentodoproblema(String reconhecimentodoproblema) {
        this.reconhecimentodoproblema = reconhecimentodoproblema;
    }

    public String getResolução() {
        return resolução;
    }

    public void setResolução(String resolução) {
        this.resolução = resolução;
    }

    public String getAvaliacaodasalternativas() {
        return avaliacaodasalternativas;
    }

    public void setAvaliacaodasalternativas(String avaliacaodasalternativas) {
        this.avaliacaodasalternativas = avaliacaodasalternativas;
    }

    public Enum<Viabilidade> getSituacao() {
        return situacao;
    }

    public void setSituacao(Enum<Viabilidade> situacao) {
        this.situacao = situacao;
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }
}
