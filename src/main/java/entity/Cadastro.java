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


}
