public class Main{
    public static void main(String[] args){
    int a=27;
    int b=34;
    int n=700;
    int c=a*n;
    int d=550;

        System.out.println("\n Ціна персонального комп'ютера для роботи на данний час коливається в межах"+ n
        + '\u0024'+ "або близько " + d + '\u20AC'+". В національній валюті це близько"+ c + "грн.");
        
        System.out.println("\n Перевірка таблиці ділення");
        int x=15;
        int y= x/2;
        System.out.println("Я знаю результат: \n y="+y);
        double X=15;
        double Y= X/2;
        System.out.println("А результ насправді такий:\n  Y="+Y);

        System.out.println(" \n Так звані\" правила хорошого тону\" при здійсненні"+ "арифметичних операцій в Java:");
        int op1=20;
        int op2=3;
        op1+=op2;
        System.out.println("Сума op1+ op2:" + op1);
        op1-=op2;
        System.out.println("Різниця op1+ op2:" + op1);
        op1*=op2;
        System.out.println("Добуток op1+ op2:" + op1);
        op1/=op2;
        System.out.println("Часка op1+ op2:" + op1);
        op1%=op2;
        System.out.println("Остача від ділення op1+ op2:" + op1);
        
        boolean z=true;
        if (z==true){
            System.out.println("\n Я починаю розуміти мову Java");
        }
        else{
            System.out.println("\n Поки нічого не зрозуміло");
        }

        System.out.println("\n Числа Фібоначчі:");
        int f=1;
        int t=1;
        System.out.println(f);
        while(t<50){
            System.out.println(t);
                t=f+t;
                f=t-f;
        }
    }
}
