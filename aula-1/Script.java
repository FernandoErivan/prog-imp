import java.util.Scanner;

public class Script{
public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Digite a sua idade: ");
        int Idade = sc.nextInt();
        if(Idade >= 18){
            System.out.println("Pode tirar a carteira de motorista!");
        }
        else{
            System.out.println("Você ainda não pode tirar a carteira de motorista!");
        }
        if(Idade < 16)
        {
            System.out.println("Você não pode votar!");
        }
        else if(Idade >= 16 && Idade < 18){
             System.out.println("Seu voto é opcional!");
        }
        else if(Idade >= 18 && Idade < 70){
            System.out.println("Seu voto é obrigatório!");
        }
        else{
            ("Você não tem mais obrigação em votar!");
        }

    }
}