package MathLib;

import java.util.ArrayList;

public class Math {

    // Evaluates a math expression from a string
    public static int eval(String expression) {
        // Supported operations
        Character[] operations = {'+', '-', '*', '/'};

        // Removes all non-visible characters
        expression = expression.replaceAll("\\s+","");

        for(Character c : operations) {
            if(expression.contains(c.toString())) {
                // Get the index of the operation
                int opPos = expression.indexOf(c);

                // Check the left and the right side of the operation
                int a = Integer.valueOf(expression.substring(0, opPos));
                int b = Integer.valueOf(expression.substring(opPos + 1, expression.length()));

                switch(c) {
                    case '+': return a+b;
                    case '-': return a-b;
                    case '*': return a*b;
                    case '/': return a/b;
                }

            }
        }

        return 0;
    }
}