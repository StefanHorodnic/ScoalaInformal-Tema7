public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String operator = args[2];

        System.out.print(operationResult(operator, a,b));
    }

    private static String operationResult(String inputOperator, int a, int b){

        String prefix = "Rezultatul operației matematice este ";

        return switch (inputOperator) {
            case "-" -> prefix + (a - b);
            case "+" -> prefix + (a + b);
            case "*" -> prefix + a * b;
            case "/" -> prefix + (float) a / (float) b;
            default -> "";
        };
    }
}
