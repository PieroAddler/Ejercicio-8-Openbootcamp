public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(21);
        persona1.setNombre("Addler");
        persona1.setTelefono(987654321);
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int newEdad){
        this.edad = newEdad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int newTelefono){
        this.telefono = newTelefono;
    }
}