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
public class ItemInexistente extends RuntimeException {
    @Override
    public String getMessage(){
        return "não foi encontrado no sistema!";
    }
    
}
