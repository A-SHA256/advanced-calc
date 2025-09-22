import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public int inum1;
    public int inum2;

    public double dnum1;
    public double dnum2;

    public String operator;
    public boolean isDouble;

    public String inp() {

        while (true)
        {
            while (true) {
                System.out.print("Enter a first number: ");
                if (!scanner.hasNextInt() && !scanner.hasNextDouble()) {
                    System.out.println("Invalid input");
                    scanner.next();
                } else {
                    if (scanner.hasNextInt()) {
                        inum1 = scanner.nextInt();
                        break;
                    } else {
                        isDouble = true;
                        dnum1 = scanner.nextDouble();
                        break;
                    }
                }
            }

            while (true) {
                System.out.print("Enter a second number: ");
                if (!scanner.hasNextInt() && !scanner.hasNextDouble()) {
                    System.out.println("Invalid input");
                    scanner.next();
                } else {
                    if (!isDouble) {
                        if (scanner.hasNextDouble())
                        {
                            int undoubled = (int) scanner.nextDouble();
                            inum2 = undoubled;
                            break;
                        }
                        inum2 = scanner.nextInt();
                        break;
                    } else {
                        dnum2 = scanner.nextDouble();
                        break;
                    }
                }
            }

            while (true) {
                System.out.print("Enter an operator: ");
                if (!scanner.hasNext()) {
                    System.out.println("Invalid input");
                    scanner.next();
                } else {
                    operator = scanner.next();
                    break;
                }
            }
            if (operator.equals("/")) {
                if (!isDouble && inum2 == 0) {
                    System.out.println("Can't divide by 0");
                    continue;
                } else if (isDouble && dnum2 == 0.0) {
                    System.out.println("Can't divide by 0");
                    continue;
                }
            }
            return operator;
        }
    }
}

