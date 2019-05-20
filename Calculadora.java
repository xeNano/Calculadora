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
public class Calculadora {
    private int num1;
    private int num2;
    
    public Calculadora(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int suma(){
        return (num1+num2);
    }
    public int resta(){
        int result;
        if(resta2()){
        result=(num1-num2);
        }else{
            result=num2-num1;
        }
        return result;
    }
    public boolean resta2(){
        if(num1>num2){
            return true;
        }
        else{
            return false;
        }
    }
    public int multiplica(){
        return (num1*num2);
    }
    public int divide(){
        return (num1/num2);
    }
    public String divide2(){
        if(num2==0){
            return null;
        }else{
            int result=num1/num2;
            return String.valueOf(result);
        }
    }

}
