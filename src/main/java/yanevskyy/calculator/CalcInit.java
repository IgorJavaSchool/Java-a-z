package yanevskyy.calculator;


    class CalcInit {
    public static void main(String[] args){
       Calculator calculator = new Calculator();
       calculator.add(1,2);
       System.out.println(calculator.result);
       calculator.subtract(1,2);
       System.out.println(calculator.result);
       calculator.div(1,0);
       System.out.println(calculator.result);
       calculator.multiply(1,0);
       System.out.println(calculator.result);
    }
}