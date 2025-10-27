package Atividade10;

public class Empresa {
   public static void main(String[] args) {


       // Criando funcionário usando o primeiro construtor
       Funcionario funcionario1 = new Funcionario("Ana Souza", "123.456.789-00");
       funcionario1.setCargo("Analista de Sistemas");
       funcionario1.setSalario(4500.00);


       // Criando funcionário usando o segundo construtor
       Funcionario funcionario2 = new Funcionario("Carlos Silva", "987.654.321-00",
               "Gerente de Projetos", 7500.00);


       // Criando um projeto associando um dos funcionários
       Projeto projeto = new Projeto("Sistema ERP", "30/12/2025", funcionario2);


       // Exibindo os dados dos funcionários
       System.out.println("=== Dados dos Funcionários ===");
       System.out.println(funcionario1);
       System.out.println(funcionario2);


       // Exibindo os dados do projeto
       System.out.println("\n=== Dados do Projeto ===");
       projeto.exibirDetalhes();
   }
}
