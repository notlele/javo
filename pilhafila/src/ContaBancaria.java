public class ContaBancaria {
    private int numero = 0;
    private double saldo = 0;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }


    public static void debitar(double valor) {
        saldo -= valor;
        System.out.println("Saldo: R$" + saldo);
    }
    public static void depositar(double valor) {
        saldo += valor;
        System.out.println("Saldo: R$" + saldo);
    }
}
