/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public abstract class Operaciones_ClasePadre {
    
    protected int valor1;
    protected int valor2;
    protected int resultado;
    
    Scanner sc = new Scanner(System.in);
    
    public void PedidirDatos(){
        System.out.println("Ingrese el valor 1");
        valor1 = sc.nextInt();
        System.out.println("Ingrese el valor 2");
        valor2 = sc.nextInt();
        
    }
    public abstract void Operaciones();
    
    public void MostrarResultado(){
        System.out.println("el Resultado es " +resultado);
    }
    
    
}
