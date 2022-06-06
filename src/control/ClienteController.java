/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteController {
    private ArrayList<Cliente> client;

    public ClienteController(){
        client = new ArrayList();
    }
    
    public void cadastrar(String name,String cpf,int idade,String genre,String band,String email,String cell){
        Cliente cl = new Cliente(name,cpf,idade,genre,band,email,cell);
        client.add(cl);
    }
    
    public ArrayList<Cliente> getClient() {
        return client;
    }

    public void setClient(ArrayList<Cliente> client) {
        this.client = client;
    }
    
    public void excluirCliente(String cpf){
        for(Cliente c: client){
            if(c.getCpf().equals(cpf)){
                client.remove(c);
                break;
            }
        }
    }
}
