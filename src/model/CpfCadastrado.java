/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fernando
 */
public class CpfCadastrado extends RuntimeException {
    @Override
    public String getMessage(){
        return "Cpf inválido, pois já foi cadastrado!";
    }
}
