/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;

/**
 *
 * @author Ildevana

*/
@ManagedBean(name="reservaBean")
public class Reserva {

    protected EntityManager em;
    private Cliente cliente;
    private Mesa mesa;
    private int data;
    private EnumTurno enumTurno;
    
    public Reserva(){}

    public Reserva(Cliente cliente, Mesa mesa, int data, EnumTurno enumTurno) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.data = data;
        this.enumTurno = enumTurno;
    }
    
    public Reserva saveReserva(ActionEvent actionEvent){
        Reserva res = new Reserva(cliente, mesa, data, enumTurno);
        em.persist(res);
        return res;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setEnumTurno(EnumTurno enumTurno) {
        this.enumTurno = enumTurno;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public int getData() {
        return data;
    }

    public EnumTurno getEnumTurno() {
        return enumTurno;
    }

}
