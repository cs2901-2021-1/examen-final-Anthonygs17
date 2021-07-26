package cs.lab;
import java.util.Scanner;
import java.util.logging.Logger;

public class Menu {
    static final Logger logger = Logger.getLogger(Login.class.getName());

    int a, b, c, d, e;
    int option;

    public Menu(){
        logger.info("Elija una de las opciones a continuacion: ");
        logger.info("1. Avance de la vacunacion");
        logger.info("2. Cobertura de la vacunacion");
        logger.info("3. Número de Centros de Vacunación");
        logger.info("4. Número de personas vacunadas parcialmente");
        logger.info("5. Número de personas vacunadas completamente");
        logger.info("6. Dar de alta un centro de vacunacion");
        logger.info("7. Dar de baja un centro de vacunacion");
        logger.info("8. Cerrar sesión");
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();

    }

}
