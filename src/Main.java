public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Octavio");
        System.out.println(p1.getNombre());
        Persona p2 = new Persona();
        p2.setNombre("Jose");
        System.out.println(p2.getNombre());
        p1.caminar();
        p1.mostrarDatos();
        p2.mostrarDatos();


        Auto a1 = new Auto("Nissan");
        System.out.println(a1.getMarca());
        a1.arrcancar();

        p2.setTiene(a1);
        System.out.println(p2.getNombre() +" tiene un " + p2.getTiene().getMarca());


    }

}