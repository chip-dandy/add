

//   ¯\_(ツ)_/¯


import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ToDoList list = new ToDoList();
        String text;

        for(;;){
            System.out.println("Введите команду...");
            text = scanner.nextLine();
            if(text.length() > 4){
                if(text.toUpperCase().matches("ADD [^0-9]+") && text.toUpperCase().matches("ADD .+?")){
                    list.addToDoList(text.substring(4));
                }
                if(text.toUpperCase().matches("(ADD|EDIT|DELL) \\d+ .+?")){
                    if(text.toUpperCase().substring(0, 4).equals("ADD ")){

                        if(list.getSize() >  getArray(text)){
                            list.addToListIndex(getArray(text),text);
                        }else {
                            list.addToListIndex(0,"Its a  no work");
                        }
                    }
                }
            }else if(text.length() == 4){
                list.getToDoList();
            }
        }
    }

    private static int getArray(String text) {
        String[] array = (text.replaceAll("\\D+", " ").trim()).split(" ");
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = Integer.valueOf(array[i]);
        }
        return a[0];
    }

}