public class Main {
    public static void main(String[] args) {
         test1( 10);
         test2(10);
    }
  static   void test1(int n)
    {
        if (n == 1)
            return;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++){
                System.out.println("*");
        break;
            }
    }
    //Так как условие if (n == 1) выполняется за постоянное время, то есть имеет сложность O(1).
//
//Внешний цикл выполняется от i = 1 до i <= n, то есть он выполняется n раз.
//
//Внутренний цикл выполняется от j = 1 до j <= n, то есть теоретически он должен выполняться n раз. Однако, сразу после первой итерации внутреннего цикла срабатывает оператор break, который завершает цикл после первого выполнения.
//
//Таким образом, внутренний цикл фактически выполняется только один раз для каждой итерации внешнего цикла.
//
//Следовательно, общее количество итераций блока кода (System.out.println("*"); break;) равно n (по одной на каждую итерацию внешнего цикла).
//
//Временная сложность:
//Так как внутренний цикл выполняется только один раз для каждой итерации внешнего цикла, общая временная сложность составляет O(n).
   static void test2(int n)
    {
        int a = 0;
        for (int i = 0; i < n; i++)
            for (int j = n; j > i; j--)
                a = a + i + j;
    }
//    Внешний цикл выполняется от i = 0 до i < n, то есть он выполняется n раз.
//
//    Для каждой итерации внешнего цикла внутренний цикл начинается с j = n и декрементируется до тех пор, пока j > i.
//
//    Количество итераций внутреннего цикла зависит от значения i. Внутренний цикл выполняется (n - i) раз для каждого значения i.
//
//    Чтобы найти общее количество итераций внутреннего цикла, суммируем (n - i) для всех значений i от 0 до n - 1
//    Это арифметическая прогрессия, сумма которой равна: n(n+1)/2
//   временная сложность — O(n^2)
}