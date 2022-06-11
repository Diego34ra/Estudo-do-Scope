package Springboot.ScopeEstudo.App;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    @Scope("Prototype")
    public Remetente remetente(){
        System.out.println("Criando um objeto Remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("Alguem@hotmail.com");
        remetente.setNome("Alguem");
        return remetente;
    }
}
