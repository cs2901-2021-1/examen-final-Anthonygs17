package cs.lab;
import java.util.Scanner;
import java.util.logging.Logger;

public class Menu {
    static final Logger logger = Logger.getLogger(Menu.class.getName());

    int option;

    public Menu(){}

    public Menu(int option) {
        this.option = option;
    }

    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        logger.info("Elija una de las opciones a continuacion: ");
        logger.info("1. Avance de la vacunacion");
        logger.info("2. Cobertura de la vacunacion");
        logger.info("3. Número de Centros de Vacunación");
        logger.info("4. Número de personas vacunadas parcialmente");
        logger.info("5. Número de personas vacunadas completamente");
        logger.info("6. Dar de alta un centro de vacunacion");
        logger.info("7. Dar de baja un centro de vacunacion");
        logger.info("8. Cerrar sesión");
        option = scanner.nextInt();
        scanner.close();
        chooseOption(option);
    }

    public void chooseOption(int option){
        switch (option){
            case 1:
                logger.info("Actualmente, 50% de personas estan vacunadas");
                break;
            case 2:
                logger.info("Actualmente, 30% de personas estan completamente vacunadas");
                break;
            case 3:
                logger.info("Hay 30 centros de vacunacion");
                break;
            case 4:
                logger.info("Hay 6 564 323 personas vacunadas parcialmente");
                break;
            case 5:
                logger.info("Hay 6 564 323 personas vacunadas completamente");
                break;
            case 6:
                logger.info("Elija el centro de vacunacion para dar de alta");
                break;
            case 7:
                logger.info("Elija el centro de vacunacion para dar de baja");
                break;
            case 8:
                logger.info("Vuelva pronto!");
                break;
            default:
                logger.info("No marco una opcion valida");
        }
    }

}
