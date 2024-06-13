package Service;

import Model.*;

import java.util.*;

public class Menu {


    private Scanner reader = new Scanner(System.in);

    private List<Challenge> challengesDatabase = new ArrayList<>(Arrays.asList(
            new Challenge("Desafio 1", "Descrição do Desafio 1", "Easy", 10),
            new Challenge("Desafio 2", "Descrição do Desafio 2", "Medium", 20),
            new Challenge("Desafio 3", "Descrição do Desafio 3", "Hard", 30),
            new Challenge("Desafio 4", "Descrição do Desafio 1", "Easy", 10),
            new Challenge("Desafio 5", "Descrição do Desafio 2", "Medium", 20),
            new Challenge("Desafio 6", "Descrição do Desafio 3", "Hard", 30)
    ));


    private LeaderBoard leaderBoard = new LeaderBoard();
    private Achievements userAchievements = new Achievements();
    private Lepic Lepic = new Lepic(); // precisa da lista
    private int aux = 0;

    public  void Initializer(){
        System.out.println("Seu nome -> ");
        String userName = reader.nextLine();
        System.out.println(" Se indentifique, pressione... ");
        System.out.println(" 1 - Aluno ");
        System.out.println(" 2 - Professor");
        int userInput = reader.nextInt();

        if(userInput == 1){
            Student StudentInitializer = new Student(userName,"Student",0);
            ShowMenuStudent(StudentInitializer);
        } else if (userInput == 2 ) {
            Teacher TeacherInitializer = new Teacher(userName, "Teacher");
            ShowTeacherMenu(TeacherInitializer);
        }

    }
    //Lado da LEPIC - PROFESSOR
    public void ShowTeacherMenu(Teacher Initializer){

    }


    public void ShowMenuStudent(Student Initializer) {
        leaderBoard.getUsersRank().add(Initializer);
        while (true) {
            String menu = """
                    1. Iniciar Sessão de Treinamento 
                    2. Ver todos Desafios 
                    3. Ver Ranking
                    4. Ver Conquistas
                    5. reservar equipamento equipamento 
                    6.avaliar app 
                    7. Acionar Suport 
                    0. Sair
                    Selecione a sua opção ->                             
                    """;
            System.out.println(menu);
            int userInput = reader.nextInt();
            switch (userInput) {
                case 1 -> intoSessionTraining(Initializer);
                case 2 -> intoChallenge();
                case 3 -> viewRanking();
                case 5 -> Lepic.bookMaterial();
                case 6 ->recomandation(Initializer);
                case 7 ->openSuport(Initializer);
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

    public void intoSessionTraining(Student Initializer) {

        TrainnerSession sessionInitializer = new TrainnerSession(Initializer, challengesDatabase);

        sessionInitializer.ShowInfoUser();
        sessionInitializer.showUserChallenges();

        System.out.println("Gostaria de iniciar a trilha 1 para sim 2 para não:");
        int userInput = reader.nextInt();

        if (userInput == 1) {
            if (aux < challengesDatabase.size()) {
                System.out.println("Inicializando desafio");
                Challenge actualChallenge = challengesDatabase.get(aux);
                System.out.println(actualChallenge);
                actualChallenge.completeChallenge(Initializer);
                actualChallenge.setComplet(true);
                userAchievements.addCertificate("Certificado para " + actualChallenge.getNome());

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
        List<Student> topUsers = leaderBoard.getFiveFirstPosition();
        System.out.println("Ranking dos 5 melhores:");
        for (int i = 0; i < topUsers.size(); i++) {
            Student student = topUsers.get(i);
            System.out.println((i + 1) + ". " + student.getName() + " - Pontos: " + student.getPoints());
        }
    }

    public void viewAchievements() {
        if (userAchievements.getCertificates().isEmpty()) {
            System.out.println("Não há achievements disponíveis.");
        } else {
            userAchievements.displayAchievementDetails();
        }
    }

    public void recomandation(User user){
        System.out.println("De 0 a 10  o quanto você recomendaria o app para um amigo ");
        int avalit = reader.nextInt();
        System.out.println(" De uma nota de 0 a 10 para o app");
        int score = reader.nextInt();
         int useravaliation = user.evaluateApp(avalit, score);
        System.out.println(useravaliation);
    }

    public void openSuport(User user){
        System.out.println("Qual a ocorrencia ?");
        String userCall = reader.nextLine();
        user.requestSuport(userCall);
    }

    public void checkPointment(Student student){
        System.out.println(" Qual dia seria o agendamento, este sao os disponiveis");



    }

}
