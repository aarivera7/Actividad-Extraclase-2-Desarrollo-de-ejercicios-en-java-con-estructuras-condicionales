/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edades;
import java.util.Scanner;
/**
 *
 * @author adria
 */
public class Edades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Declaracion e inializacion de variables
        int dE, mE, aE,dEa, mEa, aEa, dS, mS, aS;
        dE = 0; mE = 0; aE  = 0; dEa = 0; mEa = 0; aEa = 0; dS = 0; mS = 0; aS = 0;
        
        //Lectura de datos
        System.out.println("Programa para saber tu edad en días, meses y años.");
        System.out.println("Ingrese el dia de su nacimiento");
        dE = leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        mE = leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento");
        aE = leer.nextInt();
        System.out.println("Ingrese que día del mes estas actuamente (en números)");
        dEa = leer.nextInt();
        System.out.println("Ingrese en que mes estas actualmente (en números)");
        mEa = leer.nextInt();
        System.out.println("Ingrese el año actual");
        aEa = leer.nextInt();
        
        //Proceso
        aS = aEa - aE;
        if ((mE <= mEa)&&(mE > 1)){
            if ((dE > dEa)&&(mE == mEa)){
                aS = aS -1;
                mS = (mEa+12)-mE;
                if (mS > 12){
                    mS = mS - 12;
                }
            }else{
                mS = (mEa+12)-mE;
                if (mS > 12){
                    mS = mS - 12;
                }
            }
        }else{
            if ((mEa == 12)&&(mE == 1)){
                aS = aS -1;
                mS = 1;
            }else{
                aS = aS - 1;
                mS = (mEa+12)-mE;
                if (mS > 12){
                    mS = mS - 12;
                }
            }
            if((mE == 1)&&(mEa ==1)){
                aS = aS + 1;
            }
        }
        if (dE <= dEa){
            dS = dEa - dE;
            if (mS == 12){
                mS = mS - 12;
            }
        }else{
            mS = mS - 1;
            dS = (dEa + 30) - dE;
        }
        //Salida de Datos
        System.out.println("Su edad actual es: "+aS+" años, "+mS+" meses y "+dS+" días");
    }
    
}
