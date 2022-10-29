public class IntroduccionProgTema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Cristian");
        persona.setEdad(38);
        persona.setTelefono(77777777);

        System.out.println("Nombre: "+persona.getNombre()+" Edad: "+persona.getEdad()+ " Telefono: "+persona.getTelefono());

    }

   public static class Persona{
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return telefono;
    }

    }
}
