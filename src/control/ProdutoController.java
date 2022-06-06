/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author Fernando
 */
public class ProdutoController {
    private ArrayList<Produto> products;
    
    public ProdutoController() {
        products = new ArrayList();
    }

    public ArrayList<Produto> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Produto> products) {
        this.products = products;
    }
    
    public void cadastrar(String name,String descrip,double price,String band,int code){
        Produto p1 = new Produto(name,descrip,price,band,code);
        products.add(p1);
    }
    
    public void excluirProduto(int code){
        
        for(Produto p: products){
            if(p.getCodigo() == code){
                products.remove(p);
                break;
            }
        }
    }
}
