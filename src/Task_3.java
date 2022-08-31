public class Task_3 {
    public static void main(String[] args) {

        System.out.println("Factorial 3:   " + factorialOfNumber(3));
        System.out.println("Factorial 6:   " + factorialOfNumberRecurs(6));
    }

      //cycle
      static int factorialOfNumber(int number) {
          int result = 1;
          for (int i = 1; i <= number; i ++) {
              result = result * i;
          }
          return result;
      }


    //recursion
    static int factorialOfNumberRecurs(int number) {
        if (number == 1) {
            return 1;
        }
        else {
            return number * (factorialOfNumberRecurs(number - 1));
        }
    }

}
