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

            //System.out.println(text.substring(0, text.lastIndexOf(" ")).toUpperCase());
            //String[] textDo = (text.split(" "));
            //String[] t9 = text.split(" ");

            if(text.length() > 4){
//                if(text.substring(0,3).toUpperCase().equals("ADD")){
//
//                    list.addToList(text.substring(4));
//                }else

                    if(text.toUpperCase().matches("ADD [^0-9]+")){
                    list.addToList(text.substring(4));

                }else if(text.toUpperCase().matches("(ADD|EDIT) \\d+ a-zA-Z+? A-Z+?")){
                    String t2 = text.substring(0,4).toUpperCase();
                    //System.out.println(t2);
                    if(t2.equals("ADD ")){
                        String[] textArray = (text.replaceAll("\\D+", " ").trim()).split(" ");
                        int[] a = new int[textArray.length];
                        for (int i = 0; i < textArray.length; i++) {
                            a[i] = Integer.valueOf(textArray[i]);
                        }
                        System.out.println(a[0]);
                        list.addToListIndex(a[0], text.substring(4)); // исправить немедленно)))))) и тд!!!!!
                    }
                    if (t2.equals("EDIT")){
                        System.out.println("edit");
                    }
                }else if(text.toUpperCase().matches("(DELL) \\d+")){
                    System.out.println("DELL");
                }

                //else if (text.substring(0,3).toUpperCase().equals("ADD") && )


            }else if(text.length() == 4){
                if(text.toUpperCase().equals("LIST")){
                    System.out.println("Команда LIST!");
                    list.getToDoList();
                }
            }



        }
    }
}
