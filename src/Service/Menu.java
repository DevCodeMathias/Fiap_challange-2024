package Service;

import Model.Challenge;
import Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Challenge> ListChallenge;

    public Menu() {
        ListChallenge = new ArrayList<>();
    }

    public void ShowMenu(){
        User UserLog = new User();
        Scanner reader = new Scanner(System.in);
        String menu = """
            1. Iniciar Sessão de Treinamento
            2. Ver Desafios //vai me mostra uma lista de desafios
            3. Ver Feedback
            4. Ver Ranking
            0. Sair
            Selecione a sua opção ->                             
            """;
        System.out.println(menu);
        int userInput = reader.nextInt();
        switch (userInput) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            case 4:
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

    }

    public void intoChallenge(){
        Challenge challengeOne = new Challenge();
        Challenge challengeTwo = new Challenge();
        ListChallenge.add(challengeOne);
        ListChallenge.add(challengeTwo);

    }

}
