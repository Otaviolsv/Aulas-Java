package Ex4;

public class ContaBancaria{
    String titular;
    double saldo;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Sacando " + valor);
    }

    public void depositar(double valor) {
        this.saldo += saldo;
        System.out.println("Depositando " + valor);
    }

    public void exibirInfo(){
        System.out.println("==== Conta ====");
        System.out.println("Titular: %s | Saldo: %.2f\n" );
        System.out.println("----------");
    }
}

