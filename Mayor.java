/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebacalculadora;

/**
 *
 * @author Jaime_Alvarez
 * fecha $(date) 
 * hora $(time)
 * @company DAM
 * @author-mail $(e-mail)
 */
public class Mayor {
        public static int mayor(int[] lista){
            int max=Integer.MIN_VALUE;
            for(int indice=0;indice<lista.length;indice++){
                if(lista[indice]>max){
                    max=lista[indice];
                }
            }    
            return max;    
        }
}
