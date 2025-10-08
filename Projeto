package Atividade10;


public class Projeto {
   private String nomeProjeto;
   private String prazoEntrega;
   private Funcionario funcionarioResponsavel;


   // Construtor
   public Projeto(String nomeProjeto, String prazoEntrega, Funcionario funcionarioResponsavel) {
       this.nomeProjeto = nomeProjeto;
       this.prazoEntrega = prazoEntrega;
       this.funcionarioResponsavel = funcionarioResponsavel;
   }

   // Método para exibir os detalhes do projeto
   public void exibirDetalhes() {
       System.out.println("=== Detalhes do Projeto ===");
       System.out.println("Projeto: " + nomeProjeto);
       System.out.println("Prazo de Entrega: " + prazoEntrega);
       System.out.println("Responsável: " + funcionarioResponsavel.getNome());
       System.out.println("Cargo: " + funcionarioResponsavel.getCargo());
       System.out.printf("Salário: R$ %.2f%n", funcionarioResponsavel.getSalario());
   }

   @Override
   public String toString() {
       return "Projeto: " + nomeProjeto +
               ", Prazo: " + prazoEntrega +
               ", Responsável: " + funcionarioResponsavel.getNome();
   }
}



