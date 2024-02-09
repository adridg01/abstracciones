package objetos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangulo[] r = new Rectangulo[10];
        Rectangulo r1= new Rectangulo(1,2);
        Rectangulo r2= new Rectangulo(5,5);
        Rectangulo r3= new Rectangulo(10,5);
        Rectangulo r4= new Rectangulo(2,2);
        Rectangulo r5= new Rectangulo(3,8);
        Rectangulo r6= new Rectangulo(10,20);
        Rectangulo r7= new Rectangulo(8,6);
        Rectangulo r8= new Rectangulo(7,3);
        Rectangulo r9= new Rectangulo(9,1);
        Rectangulo r10= new Rectangulo(4,9);

        r[0]=r1;
        r[1]=r2;
        r[2]=r3;
        r[3]=r4;
        r[4]=r5;
        r[5]=r6;
        r[6]=r7;
        r[7]=r8;
        r[8]=r9;
        r[9]=r10;
        Arrays.sort(r);
        System.out.println("Rectangulos ordenados");

        for (int x=0; x<r.length;x++){
            System.out.println(r[x].toString());
        }



    }
}
