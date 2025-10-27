package Atividade10;

public class Funcionario extends Pessoa {
   private String cargo;
   private double salario;


   // Construtor 1 - recebe apenas nome e cpf
   public Funcionario(String nome, String cpf) {
       super(nome, cpf);
   }


   // Construtor 2 - recebe todos os atributos
   public Funcionario(String nome, String cpf, String cargo, double salario) {
       super(nome, cpf);
       this.cargo = cargo;
       this.salario = salario;
   }


   // Getters e Setters
   public String getCargo() {
       return cargo;
   }
   public void setCargo(String cargo) {
       this.cargo = cargo;
   }


   public double getSalario() {
       return salario;
   }
   public void setSalario(double salario) {
       this.salario = salario;
   }


   // Método toString sobrescrito
   @Override
   public String toString() {
       return super.toString() +
               ", Cargo: " + cargo +
               ", Salário: R$ " + String.format("%.2f", salario);
   }
}

