public class Operacao {
    ContaBancaria objConta;
    String tipoOperacao;
    double valor;

    public Operacao(ContaBancaria objConta, String tipoOperacao, double valor) {
        this.objConta = objConta;
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Operacao{" +
                "objConta=" + objConta +
                ", tipoOperacao='" + tipoOperacao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
