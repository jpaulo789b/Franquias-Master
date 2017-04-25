/**
 * This file was generated by the Jeddict
 */
package entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author aluno
 */
@Entity
public class FichaDeSelecao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private float montanteInicial;

    @Basic
    private String pais;

    @Basic
    private String estado;

    @Basic
    private String cidade;

    @Basic
    private boolean nomeLimpo;

    @Basic
    private String endereco_da_franquia;

    @OneToOne(targetEntity = Franquia.class)
    private Franquia franquia;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getMontanteInicial() {
        return this.montanteInicial;
    }

    public void setMontanteInicial(float montanteInicial) {
        this.montanteInicial = montanteInicial;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean isNomeLimpo() {
        return this.nomeLimpo;
    }

    public void setNomeLimpo(boolean nomeLimpo) {
        this.nomeLimpo = nomeLimpo;
    }

    public String getEndereco_da_franquia() {
        return this.endereco_da_franquia;
    }

    public void setEndereco_da_franquia(String endereco_da_franquia) {
        this.endereco_da_franquia = endereco_da_franquia;
    }

    public Franquia getFranquia() {
        return this.franquia;
    }

    public void setFranquia(Franquia franquia) {
        this.franquia = franquia;
    }

}
