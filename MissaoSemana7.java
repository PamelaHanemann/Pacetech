package missaosemana7;

import java.util.Scanner;

public class MissaoSemana7 {

    public static void main(String[] args) {

        Empregado Funcionario1 = new Empregado("", "", 0.00f);

        Scanner leitor = new Scanner(System.in);

        System.out.println("Funcionario 1: Informe o primeiro nome:");
        Funcionario1.setPrimeiroNome(leitor.next());

        System.out.println("Funcionario 1: Informe o sobrenome:");
        Funcionario1.setSobrenome(leitor.next());

        System.out.println("Funcionario 1: Informe o salario mensal:");
        Funcionario1.setSalarioMensal(leitor.nextFloat());

        System.out.println("");

        Empregado Funcionario2 = new Empregado("", "", 0.00f);
        System.out.println("Funcionario 2: Informe o primeiro nome:");
        Funcionario2.setPrimeiroNome(leitor.next());
        System.out.println("Funcionario 2: Informe o sobrenome:");
        Funcionario2.setSobrenome(leitor.next());
        System.out.println("Funcionario 2: Informe o salario mensal:");
        Funcionario2.setSalarioMensal(leitor.nextFloat());   
        
        System.out.println("O empregado " + Funcionario1.getPrimeiroNome() + " " + Funcionario1.getSobrenome() + " recebe o salario de R$ " + Funcionario1.getSalarioMensal() + ", com o aumento de 10% passará a receber: R$ " + Funcionario1.getAumentoSalario());
        System.out.println("O empregado " + Funcionario2.getPrimeiroNome() + " " + Funcionario2.getSobrenome() + " recebe o salario de R$ " + Funcionario2.getSalarioMensal() + ", com o aumento de 10% passará a receber: R$ " + Funcionario2.getAumentoSalario());
    }

}
