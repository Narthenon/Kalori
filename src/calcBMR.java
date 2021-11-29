/*
* File: ButtonPanel.java
* Author: Barabás Gergő
* Copyright: 2021, Barabás Gergő
* Group: Szoft V
* Date: 2021-11-29
* Github: https://github.com/Narthenon/
* Licenc: GNU GPL
*/
public class CalculatorBMR {
    public static String run(String maleOrFemale){
        double height;
        double weight;
        double age;
        double kal;
        System.out.println(maleOrFemale);
                
        //férfi
        if (maleOrFemale.equals("Férfi") || maleOrFemale.equals("F")) { 
        kal = (9.247 * weight + 3.098 * height - (4.330 * age +447.593));
            System.out.println("Férfi kiválasztva");

        //nő
        } else if (maleOrFemale.equals("Nő") || maleOrFemale.equals("N")){
                kal = (13.397 * weight + 4.799 * height - (5.667 * age +88.362));
            System.out.println("Nő kiválasztva");
        }

        return 
                Math.round(kal);



            }
        }