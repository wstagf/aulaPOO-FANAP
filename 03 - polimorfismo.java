public class Animal {
    public void fazerSom() {
        System.out.println("Animal faz som");
    }
}

public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Cachorro late");
    }
}

public class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Gato mia");
    }
}

// Uso do polimorfismo
public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal meuAnimal1 = new Cachorro();
        Animal meuAnimal2 = new Gato();
        
        meuAnimal1.fazerSom(); // Chama o método fazerSom da classe Cachorro
        meuAnimal2.fazerSom(); // Chama o método fazerSom da classe Gato
    }
}