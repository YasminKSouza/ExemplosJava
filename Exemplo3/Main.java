import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Ana", 20);

        Scanner sc = new Scanner(System.in);

        System.out.println("nome: "+ p.getNome() );
        System.out.println("idade: "+ p.getIdade());

        Professor tia = new Professor("Ana", 20, 2500);
        Aluno yass = new Aluno("Yass", 2023, 20);

        System.out.println(tia.getIdade()+ tia.getSalario()+ tia.getNome());
        System.out.println(yass.getNome()+ yass.getMatricula()+ yass.getIdade());


    }
}
