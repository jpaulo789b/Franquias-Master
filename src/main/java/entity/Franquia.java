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

























}
