package cs.lab;
import java.util.Scanner;
import java.util.logging.Logger;

public class Login {
    static final Logger logger = Logger.getLogger(Login.class.getName());

    private String username;
    private String password;

    public Login(){
        Scanner scanner = new Scanner(System.in);
        logger.info("Bienvenido!!!");
        logger.info("Inicie sesión por favor: ");
        logger.info("Usuario: ");
        username = scanner.nextLine();
        logger.info("Contraseña: ");
        password = scanner.nextLine();
        if(password.equals(reverseWord(username))){
            logger.info("Usuario autenticado correctamente");
        }else{
            logger.info("Usuario autenticado incorrectamente :(");
        }
    }

    public Login(String username){
        this.username = username;
        this.password = reverseWord(username);
    }

    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String statusLogin(){
        if(password.equals(reverseWord(username))){
            return "Usuario autenticado correctamente";
        }
        return "Usuario autenticado incorrectamente";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String reverseWord(String s){
        if(s.isEmpty()){
            return s;
        }
        return reverseWord(s.substring(1)) +  s.charAt(0);
    }
}
