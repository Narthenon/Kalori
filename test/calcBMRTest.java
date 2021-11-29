/*
* File: ButtonPanel.java
* Author: Barabás Gergő
* Copyright: 2021, Barabás Gergő
* Group: Szoft V
* Date: 2021-11-29
* Github: https://github.com/Narthenon/
* Licenc: GNU GPL
*/
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class calcBMRTest{
    @Test
    void calcBMRTest(){
        double weight = 30;
        double height = 35;
        double age = 200;

        double exceptedBmr = 123;
        double actualBMR = calcBMR.calcMainBMR(weight, height ,age);
        assertEquals(exceptedBmr, actualBMR, 123);
            
    }
    @Test
    void calcBMRTest(){
        double weight = 500;
        double height = 35;
        double age = 50;

        double exceptedBmr = 123;
        double actualBMR = calculator.calcMainBMR(weight, height ,age);
        assertEquals(exceptedBmr, actualBMR, 123);
            
    }
    @Test
    void calcBMRTest(){
        double weight = 70;
        double height = 500;
        double age = 20;

        double exceptedBmr = 123;
        double actualBMR = calculator.calcMainBMR(weight, height ,age);
        assertEquals(exceptedBmr, actualBMR, 123);
            
    }
}

