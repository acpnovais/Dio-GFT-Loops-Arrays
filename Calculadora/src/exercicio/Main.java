package exercicio;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício calculadora");
        calculadora.soma(3,6);
        calculadora.subtracao(9,1.0);
        calculadora.mutiplicacao(7,8);
        calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Emprestimos
        System.out.println("Exercício empréstimo");
        Emprestimo.carcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.carcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.carcular(1000, 5);

        //Quadrilatero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5, 5);
        Quadrilatero.area(7, 8, 9);
    }
}
