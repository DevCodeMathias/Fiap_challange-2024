package Service;

import Model.Challenge;
import Model.TrainnerSession;
import Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<String> ListChallenge;

    public Menu() {
        ListChallenge = new ArrayList<>();
    }

    public void ShowMenu(){
       // User UserLog = new User();
        Scanner reader = new Scanner(System.in);
        String menu = """
            1. Iniciar Sessão de Treinamento (Perfil)
            2. Ver Desafios 
            3. Ver Feedback
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
        String NameUser = UserInitializer.getName();
        System.out.println(" Seja bem Vindo " + NameUser);
        System.out.println("Sua pontuação é:");
        //Simula como se o um desafio ja estivesse jogado e marcando como jogado
        //Challenge challengeOne = new Challenge("arco e flecha "," A precisão ao mirar e soltar a flecha exige coordenação entre os movimentos das mãos e dos olhos", "hard");
        //challengeOne.setComplet(true);


    }


    public void intoChallenge(){
        Challenge challengeOne = new Challenge("arco e flecha "," A precisão ao mirar e soltar a flecha exige coordenação entre os movimentos das mãos e dos olhos", "hard");
        Challenge challengeTwo = new Challenge("pintura 3d "," jogador possa usar as mãos para pintar no espaço tridimensional. Isso requer precisão e coordenação para criar formas, desenhos e padrões.", "hard");
        ListChallenge.add(challengeOne.toString());
        ListChallenge.add(challengeTwo.toString());

        for(int i = 0 ; i < ListChallenge.size(); i++){
            System.out.println(ListChallenge.get(i));
        }
    }

}
