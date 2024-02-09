package objetos;

public class Rectangulo implements Comparable<Rectangulo>{
protected int altura;
protected int ancho;

public Rectangulo(int altura, int ancho){
    this.altura=altura;
    this.ancho=ancho;
}

    public int getAltura() {
        return altura;
    }

    public int getAncho() {
        return ancho;
    }
    public int getArea(){
    return altura* ancho;
    }

    @Override
    public String toString() {
        return "Area rectangulo=" + getArea();
    }

    @Override
    public int compareTo(Rectangulo o) {
            int x=0;
            if (getArea()< o.getArea()){
                x=1;
            } else if (getArea()>o.getArea()) {
                x=-1;
            } else {
                x=0;
            }
            return x;
        }
    }