public class lab3 {
   public static void main(String[] args){
      System.out.println("Лабораторна робота №2: " + "робота з масивами у Java");
      System.out.println("Виконав: студет гр. ПОс-11 " + "Михальчук Василь");

      String[] predmety={"Комп'ютерні мережі","Операційні системи","Прикладне та Web-програмування"};
      System.out.println("Ми вивчаємо наступні дисципліни:");
      for (String predmet : predmety) {
         System.out.println(predmet);
      }
      String[] PREDMETY=new String[3];
      PREDMETY[0]="Комп'ютерні мережі";
      PREDMETY[1]="Операційні системи";
      PREDMETY[2]="Прокладне та Web-програмування";
      System.out.println("Найбільше з перелічуваних мені подобається дисципліна"+PREDMETY[2]);

      String[] KURATOR=new String[4];
      KURATOR[0]="Саварин П. В.";
      KURATOR[1]="Кабак В. В.";
      KURATOR[2]="Мельничук Ю. Є.";
      KURATOR[3]="Сушик О. Г.";

      String[] zvannja={"доцент","професор"};

      System.out.println("Куратор групи ІФ-31 є: "+KURATOR[3]);
      System.out.println("Він"+zvannja[0]+"кафедри ЦОТ \n");

      System.out.print(new String(new char[]{'с','т','у','д','е','н','т',' ','і','в','а','н','о','в',' ','і','в','а','н'}));

      String[] [] szCoords = new String[2][4];
      int i,j;
      for (i=0; i<2; i++)
         for(j=0;j<3;j++)
         {
            szCoords [i] [j] ="Точка з координатами:("+i+","+j+ ")" ;
         }
         System.out.println("\n\n Масив координат точки:");
         for(i=0; i<2; i++)
            for(j=0;j<3;j++)
            {
               System.out.println(szCoords [i] [j]);
            }
   System.out.println("\n Закріплення матеріалу: \n");
   System.out.println("\n Програма виведення Трикутника Паскаля: \n");
   PascalTriangle.nmain();
   }
}
class PascalTriangle{
   public static final int LINES = 10;
   public static void nmain(){
      int[][] p = new int[LINES][];
         for (int i = 0; i < LINES; i++) {
            p[i] = new int[i + 1];
            p[i][0] = p[i][i] = 1;
            for (int j = 1; j < i; j++) {
               p[i][j] = p[i - 1][j - 1] + p[i - 1][j];
            }
         }
         for (int i = 0; i < LINES; i++) {
            for (int j = 0; j <= i; j++) {
               System.out.print(p[i][j] + " ");
            }
            System.out.println();
      }
   }
}
