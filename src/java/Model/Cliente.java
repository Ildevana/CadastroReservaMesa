/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Ildevana
 */
@ManagedBean(name="clienteBean")
public class Cliente {
    private int idCliente;
    private String nome;
    private String email;
    private int telefone;
    private int senha;
    
    public Cliente(){
        
    }

    public Cliente(int idCliente, String nome, int senha) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getSenha() {
        return senha;
    }
    
}
