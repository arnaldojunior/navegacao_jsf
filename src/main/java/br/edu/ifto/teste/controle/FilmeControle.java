package br.edu.ifto.teste.controle;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Arnaldo Junior
 */
@Named
@RequestScoped
public class FilmeControle {
    
    private String nome = "Filmes Controle";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String goToSessoes() {
        return "sessoes";
    }
}
