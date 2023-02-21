public class Estudiante implements Comparable<Estudiante>{
    protected String nombre;
    protected int edad;
    protected int altura;
    public Estudiante (String nombre, int edad, int altura){
        this.nombre=nombre;
        this.edad=edad;
        this.altura=altura;
    }

    public int getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Estudiante o) {
        int x= 0;
        if (getAltura()<o.getAltura()) {
            x = 1;
        }else if (getAltura()>o.getAltura()){
            x=-1;
        }else if (getEdad()<o.getEdad()){
            x=1;
        } else if (getEdad()>o.getEdad()) {
            x=-1;
        }
        else {

            x = 0;
        }
        return x;
    }


}
