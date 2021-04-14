import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a3 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a1 = scanner.nextInt();
        int a0 = scanner.nextInt();
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        MyFunction myFunction = new MyFunction(a3, a2, a1, a0, a, b);
        myFunction.function();

    }
}

class MyFunction {
    private int a3,a2,a1,a0;
    private float a,b;

    public MyFunction(int a3, int a2, int a1, int a0, float a, float b) {
        this.a3 = a3;
        this.a2 = a2;
        this.a1 = a1;
        this.a0 = a0;
        this.a = a;
        this.b = b;
    }

    public void function (){
        if (f(a) * f(b) < 0){
            if (f((a + b) / 2) == 0){
                System.out.printf("%.2f",(a + b) / 2 );
            }else if (f((a + b) / 2) * f(a) < 0){
                b = (a + b) / 2;
                function();
            }else if (f( (a + b) / 2) * f(b) < 0){
                a = (a + b) / 2;
                function();
            }else if (b - a < 0.1){
                System.out.printf("%.2f",(a + b) / 2);
            }
        }
    }


    public float f(float x){
            return  (a3*x*x*x + a2*x*x + a1*x + a0);
    }

}