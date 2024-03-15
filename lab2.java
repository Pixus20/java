public class lab2 {
    public static void main(String[] args){
        System.out.println("Лабораторна робота №2: " + "створення методів та класів у Java");
        System.out.println("Виконав: студет гр. ПОс-11 " + "Михальчук Василь");
        newmet1();
        int result= suma(10, 45);
        System.out.println("Сума чисел"+ result);
        IF.myIF();
        String name="Іван";
        for (int i=0; i<name.length(); i++){
            char napus =name.charAt(i);
            System.out.println(napus);
        }
        Static.method(42);
    }
    static void newmet1(){
        int a=12;
        int b=12;
        if (a<b || a>b){
            System.out.println("числа а і в не рівні мж собою");
        }
        else{
            System.out.println("числа а і в однакові");
        }
    }
    static int suma(int x, int y){
        int suma = x+y;
        return suma;
    }
    class IF {
        static void myIF(){
            System.out.println("Метод пропасується з вказання класу, до якого він"+"відноситься");
        }
    }
    class Static{
        static int l=3;
        static int m;
        static void method(int n){
            System.out.println("x=" +n);
            System.out.println("l=" +l);
            System.out.println("m=" +m);
        }
        static{
            System.out.println("Static-блок ініціалізовано:");
            m=l*4;
        }
    }
}
