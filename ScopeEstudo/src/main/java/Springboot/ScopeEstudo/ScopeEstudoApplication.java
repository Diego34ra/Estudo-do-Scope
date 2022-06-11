package Springboot.ScopeEstudo;

import Springboot.ScopeEstudo.App.SistemadeMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScopeEstudoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScopeEstudoApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(SistemadeMensagem sistema) throws Exception {
		return args ->{
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindoas();
		};
	}

}
