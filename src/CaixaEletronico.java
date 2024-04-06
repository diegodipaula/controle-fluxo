public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }else{
            System.out.println("Saldo insuficiente para saque. Saldo atual: " + saldo);
            System.out.println("Valor solicitado: " + valorSolicitado);
        }

        System.out.println(saldo);

    }
}
