public class Main {
    public static void main(String[] args) {

        var result = someWork(10, 30);
        System.out.println(result.getFirst());
        System.out.println(result.getSecond());
    }

    public  static Pair someWork(int firstNumber, int secondNumber) {
        firstNumber += (10 * 2)-firstNumber; //some work
        secondNumber += (10 * 3)+firstNumber;

        return new Pair(firstNumber, secondNumber);
    }
}