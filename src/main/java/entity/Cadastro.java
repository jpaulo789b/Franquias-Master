package entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by harlock on 23/04/17.
 */
@Entity
public class Cadastro extends Pessoa implements Serializable {
    private static final long serialVersionUID = -370016001147031854L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CADASTRO")
    private Integer idf;
    private int id_cadastro;
    private int cnpfFranquia;
    private String NomeFantasiaFranq;
    private String RazaosocialFranquia;
    private String Fiador;
    private int cnpfFranquiado;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public int getId_cadastro() {
        return id_cadastro;
    }

    public void setId_cadastro(int id_cadastro) {
        this.id_cadastro = id_cadastro;
    }

    public int getCnpfFranquia() {
        return cnpfFranquia;
    }

    public void setCnpfFranquia(int cnpfFranquia) {
        this.cnpfFranquia = cnpfFranquia;
    }

    public String getNomeFantasiaFranq() {
        return NomeFantasiaFranq;
    }

    public void setNomeFantasiaFranq(String nomeFantasiaFranq) {
        NomeFantasiaFranq = nomeFantasiaFranq;
    }

    public String getRazaosocialFranquia() {
        return RazaosocialFranquia;
    }

    public void setRazaosocialFranquia(String razaosocialFranquia) {
        RazaosocialFranquia = razaosocialFranquia;
    }

    public String getFiador() {
        return Fiador;
    }

    public void setFiador(String fiador) {
        Fiador = fiador;
    }

    public int getCnpfFranquiado() {
        return cnpfFranquiado;
    }

    public void setCnpfFranquiado(int cnpfFranquiado) {
        this.cnpfFranquiado = cnpfFranquiado;
    }
}
