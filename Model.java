public class Model {

// Calculator functions
    private double addition(double value1, double value2){
        return value1 + value2;
    }

    private double subtraction(double value1, double value2){
        return value1 - value2;
    }

    private double multiplikation(double factor1, double factor2){
        return factor1 * factor2;
    }

    private double division(double divided, double divisor){
        return divided / divisor;
    }

    private double root(double number){
        return Math.sqrt(number);
    }

    private double power(double number, int exponent){
        return Math.pow(number, exponent);
    }

    private double modulo(double number1, double number2){
        return number1 % number2;
    }

    private double naturalLogarithm(double number){
        return Math.log(number);
    }

    private double Logartihm(double number){
        return Math.log10(number);
    }

    private double sinus(double number){
        return Math.sin(number);
    }

    private double cosinus(double number){
        return Math.cos(number);
    }

    private double tangent(double number){
        return Math.tan(number);
    }

    private double arcsinus(double number){
        return Math.asin(number);
    }

    private double arccosinus(double number){
        return Math.acos(number);
    }

    private double arctangent(double number){
        return Math.atan(number);
    }
}
