public class Main {
    public static void main(String[] args) {
      //   test1( 10);
      //   test2(10);
         test3(10);
        test4(10);
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
//Так как внутренний цикл выполняется только один раз для каждой итерации внешнего цикла, общая временная сложность составляет O(n) или Линейная временная сложность.
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
//   временная сложность — O(n^2) или Квадратичная сложность
static void test3(int n)
{
    int i, j, a = 0;
    for (i = n/2; i <= n; i++)
        for (j = 2; j <= n; j = j * 2)
            a = a + n / 2;

}
    //    Внешний цикл начинается с i = n/2 и инкрементируется до n, цикл имеет сложность — O(n);
//
//    Внутренний цикл начинается с j = 2 и умножает j на 2 на каждой итерации, продолжая пока j <= n. Это геометрическая прогрессия. Количество итераций для внутреннего цикла — O(log n), так как j принимает значения 2, 4, 8, ..., n.;
//
//    Поскольку внутренний цикл имеет сложность O(log n), а внешний — O(n), общая временная сложность:  O(n \log n);
   static void test4(int n)
    {
        int a = 0, i = n;
        while (i > 0) {
            a += i;
            i /= 2;
        }
    }
//    Цикл while начинается с i = n, и на каждой итерации i делится на 2.
//
//    Количество раз, которое мы можем делить n на 2 до тех пор, пока i не станет равным 0, равно log_2(n).
//
//    Таким образом, цикл выполняется O(log n) раз.

}