package Service;

import Model.User;

import java.util.Scanner;

public class Menu {
    public void ShowMenu(){
        User UserLog = new User();
        Scanner reader = new Scanner(System.in);
        String menu = """
            1. Iniciar Sessão de Treinamento
            2. Ver Desafios
            3. Ver Feedback
            4. Ver Ranking
            5. Iniciar Simulação VR
            6. Usar Ferramenta de Cirurgia AR
            7. Acompanhar Progresso
            8. Configurar Ambiente de Simulação
            9. Ver Pontuação   
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
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }

}
