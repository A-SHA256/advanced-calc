public class Checker {
    private final Calculator calc = new Calculator();
    private final Input input = new Input();
    public void check()
    {
        String operator = input.inp();

        if (!input.isDouble)
        {
            switch(operator){
                case "+" -> System.out.printf("%d + %d = %d", input.inum1, input.inum2, calc.add(input.inum1, input.inum2));
                case "-" -> System.out.printf("%d - %d = %d", input.inum1, input.inum2, calc.subtract(input.inum1, input.inum2));
                case "*" -> System.out.printf("%d * %d = %d", input.inum1, input.inum2, calc.multiply(input.inum1, input.inum2));
                case "/" -> System.out.printf("%d / %d = %d", input.inum1, input.inum2, calc.divide(input.inum1, input.inum2));
                case "%" -> System.out.printf("%d %% + %d = %d", input.inum1, input.inum2, calc.modulo(input.inum1, input.inum2));
                default -> System.out.println("Unknown operator!");
            }
        }
        else
        {
            switch(operator){
                case "+" -> System.out.printf("%.2f + %.2f = %.2f", input.dnum1, input.dnum2, calc.add(input.dnum1, input.dnum2));
                case "-" -> System.out.printf("%.2f - %.2f = %.2f", input.dnum1, input.dnum2, calc.subtract(input.dnum1, input.dnum2));
                case "*" -> System.out.printf("%.2f * %.2f = %.2f", input.dnum1, input.dnum2, calc.multiply(input.dnum1, input.dnum2));
                case "/" -> System.out.printf("%.2f / %.2f = %.2f", input.dnum1, input.dnum2, calc.divide(input.dnum1, input.dnum2));
                case "%" -> System.out.printf("%.2f %% %.2f = %.2f", input.dnum1, input.dnum2, calc.modulo(input.dnum1, input.dnum2));
                default -> System.out.println("Unknown operator!");
            }
        }
    }
}
