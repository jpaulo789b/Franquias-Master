package entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by harlock on 23/04/17.
 */
@Entity
public class Franquia implements Serializable {
    private static final long serialVersionUID = -370016001147031854L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FRANQUIA")
    private Integer idf;
    private int id_franquia;
    private int cnpj;
    private String nomefantasia;
    private int valorminimo;
    private int captaldegirominimo;
    private String ramo;

    private Cadastro cadastro;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public int getId_franquia() {
        return id_franquia;
    }

    public void setId_franquia(int id_franquia) {
        this.id_franquia = id_franquia;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public int getValorminimo() {
        return valorminimo;
    }

    public void setValorminimo(int valorminimo) {
        this.valorminimo = valorminimo;
    }

    public int getCaptaldegirominimo() {
        return captaldegirominimo;
    }

    public void setCaptaldegirominimo(int captaldegirominimo) {
        this.captaldegirominimo = captaldegirominimo;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
}
