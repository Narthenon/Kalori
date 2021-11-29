/*
* File: ButtonPanel.java
* Author: Barabás Gergő
* Copyright: 2021, Barabás Gergő
* Group: Szoft V
* Date: 2021-11-29
* Github: https://github.com/Narthenon/
* Licenc: GNU GPL
*/
 
package src;

public class App {

    public static void main(String[]args){
        calcBMR calcBar = new calcBMR();
        System.out.println("Napi kalória számláló rogram; Barabás Gergő ,2021.11.29") ;
        System.out.println(calcBar.calcManBMR());
    }
}