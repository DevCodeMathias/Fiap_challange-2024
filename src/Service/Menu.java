package Service;

import Model.Challenge;
import Model.TrainnerSession;
import Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    // protótipo do banco de dados
    private Scanner reader = new Scanner(System.in);
    private   List<Challenge> challengesPersonalizes = List.of(
            new Challenge( "Desafio 1", "Descrição do Desafio 1", "Easy", 10),
            new Challenge( "Desafio 2", "Descrição do Desafio 2", "Medium", 20),
            new Challenge( "Desafio 3", "Descrição do Desafio 3", "Hard", 30)
    );

    private   List<Challenge> challengesDatabase = List.of(
            new Challenge( "Desafio 1", "Descrição do Desafio 1", "Easy", 10),
            new Challenge( "Desafio 2", "Descrição do Desafio 2", "Medium", 20),
            new Challenge( "Desafio 3", "Descrição do Desafio 3", "Hard", 30),
            new Challenge( "Desafio 1", "Descrição do Desafio 1", "Easy", 10),
            new Challenge( "Desafio 2", "Descrição do Desafio 2", "Medium", 20),
            new Challenge( "Desafio 3", "Descrição do Desafio 3", "Hard", 30)
    );

    public void ShowMenu(){
       // User UserLog = new User();

        String menu = """
            1. Iniciar Sessão de Treinamento 
            2. Ver todos Desafios 
            4. Ver Ranking
            0. Sair
            Selecione a sua opção ->                             
            """;
        System.out.println(menu);
        int userInput = reader.nextInt();
        switch (userInput) {
            case 1:
                IntoSessionTrainig();
                break;
            case 2:
                intoChallenge();
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
    public  void IntoSessionTrainig(){

        User UserInitializer = new User("Laura");
        TrainnerSession Sessioninittilizer = new TrainnerSession(UserInitializer,challengesPersonalizes);
        Sessioninittilizer.ShowInfoUser();
        Sessioninittilizer.showUserChallenges();
    }

    public void intoChallenge(){
        for(int i = 0 ; i < challengesDatabase.size(); i++){
            System.out.println(challengesDatabase.get(i));
        }
    }

}
