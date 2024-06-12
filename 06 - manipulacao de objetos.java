public class TesteCasa {
    public static void main(String[] args) {
        // Criação de um objeto da classe Casa
        Casa minhaCasa = new Casa();
        
        // Manipulação dos atributos do objeto
        minhaCasa.cor = "Azul";
        minhaCasa.numeroDeQuartos = 3;
        minhaCasa.area = 120.5;
        
        // Chamada do método para exibir detalhes do objeto
        minhaCasa.exibirDetalhes();
    }
}