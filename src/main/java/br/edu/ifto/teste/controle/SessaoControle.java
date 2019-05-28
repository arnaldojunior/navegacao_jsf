package br.edu.ifto.teste.controle;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Arnaldo Junior
 */
@Named
@RequestScoped
public class SessaoControle {
    
    private String nome = "Sessões Controle";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String goToCompra() {
        return "compra";
    }
    
    public String goToFilmes() {
        return "home";
    }
}
