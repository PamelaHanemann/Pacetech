package missaosemana7;

public class Empregado {
        //Atributos da classe empregado
    private String primeiroNome;
    private String sobrenome;
    private float salarioMensal;
    private float aumentoSalario;

    public Empregado(String primeiroNome, String sobrenome, float salarioMensal) {
        this.setPrimeiroNome(primeiroNome);
        this.setSobrenome(sobrenome);
        this.setSalarioMensal(salarioMensal);
    }
    //Metodos da classe Empregado
    
    public double getAumentoSalario(){
        return salarioMensal * 1.1;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal < 0) {
            this.salarioMensal = 0;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }
}