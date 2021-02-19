public class Main {
    public static void printEqual(int num1, int num2, int num3) {
       if(num1 > 0 && num2 > 0 && num3 > 0) {
           int[] array = {num1, num2, num3};
           array.equals(array[0], array[1], array[2]);

       } else {
           System.out.println("Invalid Value");
       }
    }
}
