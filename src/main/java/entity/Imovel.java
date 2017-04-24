package entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by harlock on 23/04/17.
 */
@Entity
public class Imovel implements Serializable {
    private static final long serialVersionUID = -370016001147031854L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_IMOVEL")
    private Integer idf;
    @Type(type="true_false")
    @Column
    private Boolean localVistoriado;
    @Type(type="true_false")
    @Column
    private Boolean pesquisaDeMercado;
    @Type(type="true_false")
    @Column
    private Boolean imovelPropio;

    private Pessoa pessoa;
    private Franquia franquia;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public Boolean getLocalVistoriado() {
        return localVistoriado;
    }

    public void setLocalVistoriado(Boolean localVistoriado) {
        this.localVistoriado = localVistoriado;
    }

    public Boolean getPesquisaDeMercado() {
        return pesquisaDeMercado;
    }

    public void setPesquisaDeMercado(Boolean pesquisaDeMercado) {
        this.pesquisaDeMercado = pesquisaDeMercado;
    }

    public Boolean getImovelPropio() {
        return imovelPropio;
    }

    public void setImovelPropio(Boolean imovelPropio) {
        this.imovelPropio = imovelPropio;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Franquia getFranquia() {
        return franquia;
    }

    public void setFranquia(Franquia franquia) {
        this.franquia = franquia;
    }
}
