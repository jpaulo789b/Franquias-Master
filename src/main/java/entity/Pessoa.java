package entity;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by harlock on 23/04/17.
 */
@Entity
public class Pessoa {

    private int id_pessoa;
    private String nome;
    private Date dtnasc;
    private int cpf;
    private String email;
    private String telefone;
    private int rg;


}
