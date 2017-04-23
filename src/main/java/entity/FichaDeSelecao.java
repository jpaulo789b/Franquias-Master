package entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by harlock on 23/04/17.
 */
@Entity
public class FichaDeSelecao  implements Serializable {
    private static final long serialVersionUID = -370016001147031854L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FICHADESELECAO")
    private Integer idf;
    private Float montanteInicial ;
    private String pais;
    private String estado;
    private String cidade;
    @Type(type="true_false")
    @Column
    private Boolean nomeLimpo;
    private String endereco_da_franquia;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public Float getMontanteInicial() {
        return montanteInicial;
    }

    public void setMontanteInicial(Float montanteInicial) {
        this.montanteInicial = montanteInicial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Boolean getNomeLimpo() {
        return nomeLimpo;
    }

    public void setNomeLimpo(Boolean nomeLimpo) {
        this.nomeLimpo = nomeLimpo;
    }

    public String getEndereco_da_franquia() {
        return endereco_da_franquia;
    }

    public void setEndereco_da_franquia(String endereco_da_franquia) {
        this.endereco_da_franquia = endereco_da_franquia;
    }
}
