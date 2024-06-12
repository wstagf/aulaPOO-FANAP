// Superclasse
public class Animal {
    public void comer() {
        System.out.println("Animal está comendo");
    }
}

// Subclasse que herda de Animal
public class Cachorro extends Animal {
    public void latir() {
        System.out.println("Cachorro está latindo");
    }
    
    // Sobrescrevendo o método comer da superclasse
    @Override
    public void comer() {
        System.out.println("Cachorro está comendo ração");
    }
}

// Uso da herança
public class TesteHeranca {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.comer(); // Chama o método sobrescrito da subclasse
        meuCachorro.latir(); // Chama o método da subclasse
    }
}