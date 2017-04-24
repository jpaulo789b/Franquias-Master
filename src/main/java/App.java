import entity.Pessoa;
import services.PessoaService;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Pichau on 23/04/2017.
 */
public class App {

    public static void main(String [] args){
        PessoaService ps = new PessoaService();
        Pessoa p= new Pessoa();
        p.setNome("gerivaldo");
        p.setCpf(222222222);
        p.setDtnasc(Calendar.getInstance().getTime());
        p.setEmail("roselvmna@asodk.com");
        p.setRg(2549925);
        p.setTelefone("552525252");
        try{
            ps.createPessoa(p);

        }catch (Exception e){
            System.out.println(e);
        }


    }
}
