//
//
//   ¯\_(ツ)_/¯

// исправить немедленно)))))) и тд!!!!!
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ToDoList list = new ToDoList();
        String text;

        for(;;){
            System.out.println("Введите команду...");
            text = scanner.nextLine();
            // реализация простой ввод и вывод
            if(text.length() > 4){
                if(text.toUpperCase().matches("ADD [^0-9]+") && text.toUpperCase().matches("ADD .+?")){
                    list.addToList(text.substring(4));
                }
            }else if(text.length() == 4){
                list.getToDoList();
            }


        }
    }
}
