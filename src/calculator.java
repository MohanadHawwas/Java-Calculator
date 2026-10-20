    import java.util.Scanner;
    public class calculator {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your first number: ");
            double firstNumber =  scanner.nextDouble();

            System.out.print("Choose your operator (+, -, * or /)");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter your second number: ");
            double secondNumber =  scanner.nextDouble();

        if(operator == '+'){
            System.out.print(firstNumber + " + " + secondNumber + " = ");
            System.out.println(firstNumber + secondNumber);
        }else if(operator == '-'){
            System.out.print(firstNumber + " - " + secondNumber + " = ");
            System.out.println(firstNumber - secondNumber);
        }else if (operator == '*'){
            System.out.print(firstNumber + " * " + secondNumber + " = ");
            System.out.println(firstNumber * secondNumber);
        }else if (operator == '/'){
            if(secondNumber == 0){
                System.out.println("Cannot divide by zero!");
            }else{
            System.out.print(firstNumber + " / " + secondNumber + " = ");
            System.out.println(firstNumber / secondNumber);
            }
        }else if(operator != '+' && operator != '-' && operator != '*' && operator != '/'){
            System.out.println("Invalid Operator!");
        }
        scanner.close();
        }
    }
