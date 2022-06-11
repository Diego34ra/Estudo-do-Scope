package Springboot.ScopeEstudo.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemadeMensagem {

    @Autowired
    private Remetente teste;

    @Autowired
    private Remetente timeTecnico;

    public void enviarConfirmacaoCadastro(){
        System.out.println(teste);
        System.out.println("Cadastro feito com sucesso");
    }
    public void enviarMensagemBoasVindoas(){
        timeTecnico.setEmail("Tecnico@hotmail.com");
        System.out.println(timeTecnico);
        System.out.println("Bem-vindo ao time Tecnico.");
    }
}
