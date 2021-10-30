/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import org.w3c.dom.Node;
import org.nfunk.jep.*;

/**
 *
 * @author danil
 */
public class Calculator {
    
    public static String calculate(String expression) {
        JEP myParser = new JEP();
        myParser.addStandardFunctions();
        myParser.addStandardConstants();
        
        myParser.parseExpression(expression);
        Double result = myParser.getValue();
        return result.toString();
        
    }
    
}
