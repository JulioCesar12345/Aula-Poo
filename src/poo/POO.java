/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author julio.gabardo
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Barco meuBarco = new Barco();
        
        meuCarro.setCor("Preto");
        meuCarro.setNumPortas(2);
        meuCarro.setPlaca("asdasd");
        meuCarro.setTipo("fdsf");
        
        
        System.out.println("           Carro               ");
        System.out.println("cor: "+meuCarro.getCor()+" Tipo: "+meuCarro.getTipo()+
                " Portas: "+meuCarro.getNumPortas()+" placa: "+meuCarro.getPlaca());
        
        meuBarco.setCor("Branco");
        meuBarco.setNome("teste");
        meuBarco.setTamanho(30.00);
        meuBarco.setTipo("Mini Barco");
        meuBarco.setTripulacao(9);
        
        System.out.println("           Barco               ");
        System.out.println("cor: "+meuBarco.getCor()+" Tipo: "+meuBarco.getTipo()+
                " Tripulação: "+meuBarco.getTripulacao()+" tamanho: "+meuBarco.getTamanho()+" nome: "+meuBarco.getNome());
        
        
        
    }
    
}
