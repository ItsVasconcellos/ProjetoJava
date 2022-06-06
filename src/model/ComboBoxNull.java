/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class ComboBoxNull extends RuntimeException{
    @Override
    public String getMessage(){
        return "Por favor escolha uma opção válida do combobox";
    }
}
