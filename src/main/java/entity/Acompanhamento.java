package entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by harlock on 23/04/17.
 */
@Entity
public class Acompanhamento implements Serializable {
    private static final long serialVersionUID = -370016001147031854L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACOMPANHAMENTO")
    private Integer idf;
}
