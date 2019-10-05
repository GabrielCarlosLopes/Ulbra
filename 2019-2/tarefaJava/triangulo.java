import java.util.Scanner;

public class triangulo {

    public double altura;
    public double base;

    public double leAtura(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura do triangulo");
        return scanner.nextDouble();
    }

    public double leBase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do triangulo");
        return scanner.nextDouble();
    }

    public void areaTriangulo(double a, double b){
        double area = a*b/2;

        System.out.println("A AREA DESSE TRIANGULO É: "+area);
    }

    @Override
    public String toString() {
        return "triangulo{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }
}
