/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.persistence.EntityManager;

/**
 *
 * @author Ildevana
 */
public class Mesa {

    protected EntityManager em;
    private int idMesa;
    private int qtdPessoas;

    public Mesa(int idMesa, int qtdPessoas) {
        this.idMesa = idMesa;
        this.qtdPessoas = qtdPessoas;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setIdMesa() {
        this.idMesa = idMesa;
    }

    public void setQtdPessoas() {
        this.qtdPessoas = qtdPessoas;
    }

    public boolean mesaOcupada() {
        return this.qtdPessoas > 0;
    }

    public ArrayList<Mesa> allMesas() {        
        return (ArrayList<Mesa>)em.createQuery("SELECT * FROM Mesa").getResultList();
    }
}
