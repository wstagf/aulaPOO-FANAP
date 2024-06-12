// Classe abstrata
abstract class Forma {
    // Método abstrato (sem implementação)
    abstract void desenhar();
}

// Subclasse concreta
class Circulo extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhar um círculo");
    }
}

// Subclasse concreta
class Quadrado extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhar um quadrado");
    }
}

// Uso da abstração
public class TesteAbstracao {
    public static void main(String[] args) {
        Forma forma1 = new Circulo();
        Forma forma2 = new Quadrado();
        
        forma1.desenhar(); // Chama o método desenhar da classe Circulo
        forma2.desenhar(); // Chama o método desenhar da classe Quadrado
    }
}