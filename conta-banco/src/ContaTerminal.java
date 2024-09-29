import java.util.Scanner;

public class ContaTerminal {
    // Atributos da conta
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Método para exibir os dados da conta
    public void exibirDados() {
        System.out.println("Dados da Conta:");
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
    }

    // Método principal para execução do programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletando dados do usuário
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        // Criando uma instância da conta
        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

        // Exibindo os dados da conta
        conta.exibirDados();

        // Mensagem personalizada no final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " +
                           "Sua agência é " + agencia + ", conta " + numero + 
                           " e seu saldo R$ " + String.format("%.2f", saldo) + 
                           " já está disponível para saque.");

        scanner.close();
    }
}