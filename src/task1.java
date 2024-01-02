import java.util.Stack;

public class task1 {
    public static void main(String[] args) {
        String prim = "3 5 + 7 *";
        System.out.println("Результат вычислений: " + calculate(prim));
    }

    public static int calculate(String expression) {
        String[] tokens = expression.split(" ");

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isNum(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }

    private static boolean isNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}