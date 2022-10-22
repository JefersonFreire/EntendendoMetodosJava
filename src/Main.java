public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício calculadora!");
        Calculadora.soma(1,4);
        Calculadora.subtracao(15,10);
        Calculadora.multiplicacao(3,2);
        Calculadora.divisao(25,5);

        System.out.println("\nExercício mensagem");
        Mensagem.receberMensagem(12);
        Mensagem.receberMensagem(15);
        Mensagem.receberMensagem(26);

        System.out.println("\nExercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}