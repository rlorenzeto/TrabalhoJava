import java.util.Scanner;
import java.util.ArrayList;

public class Escola {
    // perguntar pq colocar static aqui?
    static ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public static void main(String[] args) {
        int opcao = 0;
        Scanner leitor = new Scanner(System.in);

        while (opcao != 6) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1- Cadastrar novo aluno");
            System.out.println("2- Buscar aluno");
            System.out.println("3- Fornecer informações de um aluno");
            System.out.println("4- Atualizar dados de um aluno");
            System.out.println("5- Excluir cadastro de um aluno");
            System.out.println("6- Sair");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    buscarAluno();
                    break;
                case 3:
                    //fornecerInformacoesAluno();
                    break;
                case 4:
                    atualizarDadosAluno();
                    break;
                case 5:
                    excluirCadastroAluno();
            }
        }
    }

    // perguntar pq colocar static aqui faz sumir o erro do case?
    public static void cadastrarAluno() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Digite o endereço do aluno:  ");
        String endereco = leitor.nextLine();
        System.out.println("Digite o email do aluno: ");
        String email = leitor.nextLine();
        System.out.println("Digite o telefone do aluno: ");
        String telefone = leitor.nextLine();
        System.out.println("Digite a idade do aluno: ");
        String idadeDigitada = leitor.nextLine();
        int idade = Integer.parseInt(idadeDigitada);

        alunos.add(new Aluno(nome, endereco, email, telefone, idade));
    }

    public static Aluno buscarAluno() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equalsIgnoreCase(nome) == true) {
                System.out.println("Aluno encontrado!");
                return alunos.get(i);
            }
        }
        System.out.println("Aluno nao encontrado!");
        return null;
    }

    // public static void fornecerInformacoesAluno() {
    //     int i = 0;

    //         Scanner leitor = new Scanner(System.in);
    //         System.out.println("Digite o nome do aluno que deseja saber informacoes: ");
    //         String nome = leitor.nextLine();
    
    //         //System.out.println("Nome: " + alunos.get(i).getNome());
    //         //System.out.println("Endereço: " + alunos.get(i).getEndereco());
    //         //System.out.println("Email: " + alunos.get(i).getEmail());
    //         //System.out.println("Telefone: " + alunos.get(i).getTelefone());
    //         //System.out.println("Idade: " + alunos.get(i).getIdade());
    // }

    public static void atualizarDadosAluno() {
        Scanner leitor = new Scanner(System.in);
        Aluno a = buscarAluno();

        if (a != null) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1- Alterar o nome");
            System.out.println("2- Alterar o endereco");
            System.out.println("3- Alterar o email");
            System.out.println("4- Alterar o telefone");
            System.out.println("5- Sair");
            int opc = leitor.nextInt();

            if (opc == 1) {
                System.out.println("Digite o nome: ");
                String nome = leitor.nextLine();
                a.setNome(nome);
            }
            if (opc == 2) {
                System.out.println("Digite o endereco: ");
                String endereco = leitor.nextLine();
                a.setNome(endereco);
            }
            if (opc == 3) {
                System.out.println("Digite o email: ");
                String email = leitor.nextLine();
                a.setNome(email);
            }
            if (opc == 4) {
                System.out.println("Digite o telefone: ");
                String telefone = leitor.nextLine();
                a.setNome(telefone);
            }
        } else
            System.out.println("Aluno não encontrado");
    }

    public static void excluirCadastroAluno() {
        int i = 0;
        Aluno a = buscarAluno();

        if (a != null) {
            alunos.remove(a);
        } else
            System.out.println("Aluno não encontrado");
    }
}