/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Victor
 */
public class Suma_ClaseHija extends Operaciones_ClasePadre {
    
    @Override
    public void Operaciones(){
        resultado = valor1 + valor2;
    }
    
}
