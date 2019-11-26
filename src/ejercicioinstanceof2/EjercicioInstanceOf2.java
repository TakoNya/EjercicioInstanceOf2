package ejercicioinstanceof2;

class Animal{}
interface Felino{}
class Perro extends Animal{}
class Gato extends Animal implements Felino{}

public class EjercicioInstanceOf2 {

        public static void main(String[] args) {
            Animal simba = new Animal();
            Perro boby = new Perro();
            Gato azrael = new Gato();
            System.out.println("¿Simba es un animal? " + (simba instanceof Animal));
            System.out.println("¿Simba es un perro? " + (simba instanceof Perro));
            System.out.println("¿Simba es un felino? " + (simba instanceof Felino));
            System.out.println("¿Boby es un animal? " + (boby instanceof Animal));
            System.out.println("¿Boby es un perro? " + (boby instanceof Perro));
            System.out.println("¿Boby es un felino? " + (boby instanceof Felino));
            System.out.println("¿Azrael es un animal? " + (azrael instanceof Animal));
            //System.out.println("¿Azrael es un perro? " + (azrael instanceof Perro));
            System.out.println("¿Azrael es un gato? " + (azrael instanceof Gato));
            System.out.println("¿Azrael es un felino? " + (azrael instanceof Felino));
        
    }
    
}
