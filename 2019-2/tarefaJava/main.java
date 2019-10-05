public class main {

    public static void main(String[] args) {

        triangulo t1 = new triangulo();
        t1.altura = t1.leAtura();
        t1.base = t1.leBase();

        t1.areaTriangulo(t1.altura, t1.base);

        System.out.println(t1);

        triangulo t2 = new triangulo();
        t2.altura = t2.leAtura();
        t2.base = t2.leBase();

        t1.areaTriangulo(t2.altura, t2.base);

        System.out.println(t2);


        Data d1 = new Data();
        d1.ler();

        System.out.println(d1);

        Data d2 = new Data();
        d2.ler();

        System.out.println(d2);

        Hora h1 = new Hora();
        h1.ler();

        System.out.println(h1);

        Hora h2 = new Hora();
        h2.ler();

        System.out.println(h2);
    }
}
