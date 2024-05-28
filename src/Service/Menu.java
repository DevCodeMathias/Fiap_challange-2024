package Service;

import Model.Achievements;
import Model.Challenge;
import Model.LeaderBoard;
import Model.TrainnerSession;
import Model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private User userInitializer = new User("Laura", 0);

    private Scanner reader = new Scanner(System.in);
    private List<Challenge> challengesPersonalizes = new ArrayList<>(Arrays.asList(
            new Challenge("Desafio 1", "Descrição do Desafio 1", "Easy", 10),
            new Challenge("Desafio 2", "Descrição do Desafio 2", "Medium", 20),
            new Challenge("Desafio 3", "Descrição do Desafio 3", "Hard", 30)
    ));

    private List<Challenge> challengesDatabase = new ArrayList<>(Arrays.asList(
            new Challenge("Desafio 1", "Descrição do Desafio 1", "Easy", 10),
            new Challenge("Desafio 2", "Descrição do Desafio 2", "Medium", 20),
            new Challenge("Desafio 3", "Descrição do Desafio 3", "Hard", 30),
            new Challenge("Desafio 4", "Descrição do Desafio 1", "Easy", 10),
            new Challenge("Desafio 5", "Descrição do Desafio 2", "Medium", 20),
            new Challenge("Desafio 6", "Descrição do Desafio 3", "Hard", 30)
    ));

    private LeaderBoard leaderBoard = new LeaderBoard();
    private Achievements userAchievements = new Achievements(userInitializer, "Conquistas do Usuário"); // Inicialização aqui

    private int aux = 0;

    public void ShowMenu() {
        leaderBoard.getUsersRank().add(userInitializer);
        while (true) {
            String menu = """
                    1. Iniciar Sessão de Treinamento 
                    2. Ver todos Desafios 
                    3. Ver Ranking
                    4. Ver Conquistas
                    0. Sair
                    Selecione a sua opção ->                             
                    """;
            System.out.println(menu);
            int userInput = reader.nextInt();
            switch (userInput) {
                case 1 -> intoSessionTraining();
                case 2 -> intoChallenge();
                case 3 -> viewRanking();
                case 4 -> viewAchievements();
                case 0 -> {
                    System.out.println("Saindo...");
                    reader.close();
                    return;
                }
                default -> System.out.println("Opção inválida");
            }
        }
    }

    public void intoSessionTraining() {

        TrainnerSession sessionInitializer = new TrainnerSession(userInitializer, challengesPersonalizes);

        sessionInitializer.ShowInfoUser();
        sessionInitializer.showUserChallenges();

        System.out.println("Gostaria de iniciar a trilha 1 para sim 2 para não:");
        int userInput = reader.nextInt();

        if (userInput == 1) {
            if (aux < challengesPersonalizes.size()) {
                System.out.println("Inicializando este desafio");
                Challenge actualChallenge = challengesPersonalizes.get(aux);
                System.out.println(actualChallenge);
                actualChallenge.completeChallenge(userInitializer);

                userAchievements.addCertificate("Certificado para " + actualChallenge.getNome()); // Adiciona certificado
                aux++;
            } else {
                System.out.println("Você já completou todos os desafios personalizados!");
            }
        }
    }

    public void intoChallenge() {
        for (Challenge challenge : challengesDatabase) {
            System.out.println(challenge.displayDetails());
        }
    }

    public void viewRanking() {
        List<User> topUsers = leaderBoard.getFiveFirstPosition();
        System.out.println("Ranking dos 5 melhores:");
        for (int i = 0; i < topUsers.size(); i++) {
            User user = topUsers.get(i);
            System.out.println((i + 1) + ". " + user.getName() + " - Pontos: " + user.getPoints());
        }
    }

    public void viewAchievements() {
        if (userAchievements.getCertificates().isEmpty()) {
            System.out.println("Não há achievements disponíveis.");
        } else {
            userAchievements.displayAchievementDetails();
        }
    }
}
