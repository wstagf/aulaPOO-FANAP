public class Pessoa {
    private String nome; // Atributo privado
    private int idade;   // Atributo privado

    // Método público para acessar o atributo nome
    public String getNome() {
        return nome;
    }

    // Método público para modificar o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método público para acessar o atributo idade
    public int getIdade() {
        return idade;
    }

    // Método público para modificar o atributo idade
    public void setIdade(int idade) {
        if (idade > 0) { // Validação simples
            this.idade = idade;
        }
    }
}