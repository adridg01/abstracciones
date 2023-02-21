import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Estudiante[] e = new Estudiante[5];
        Estudiante e1 = new Estudiante("Patri", 12, 170);
        Estudiante e2 = new Estudiante("Manuel", 43, 173);
        Estudiante e3 = new Estudiante("Javier", 72, 189);
        Estudiante e4 = new Estudiante("Alicia", 52, 168);
        Estudiante e5 = new Estudiante("Alberto", 35, 189);
        e[0] = e1;
        e[1] = e2;
        e[2] = e3;
        e[3] = e4;
        e[4] = e5;
        System.out.println("sin ordenar");
        for (int x = 0; x<e.length;x++ ){
            System.out.println(e[x].toString());
        }
        Arrays.sort(e);
        System.out.println("ordenados");
        for (int x = 0; x<e.length;x++ ){
            System.out.println(e[x].toString());
        }
    }
}