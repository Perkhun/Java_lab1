public class Task_3 {
    public static void main(String[] args) {

        System.out.println("Факторіал числа 3:   " + FactorialOfNumber(3));
        System.out.println("Факторіал числа 6:   " + FactorialOfNumberRecurs(6));
    }

      //обчислення факторіалу через цикл
      static int FactorialOfNumber(int length) {
          int result = 1;
          for (int i = 1; i <= length; i ++) {
              result = result * i;
          }
          return result;
      }


    //обчислення факторіалу через рекурсію
    static int FactorialOfNumberRecurs(int length) {
        if (length == 1) {
            return 1;
        }
        else {
            return length * (FactorialOfNumberRecurs(length - 1));
        }
    }

}
