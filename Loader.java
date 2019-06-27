

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

            if(text.toUpperCase().matches("LIST")){
                System.out.println("Вывод списка...");
                list.getToDoList();
            }
            if(text.toUpperCase().matches("DELL \\d+")){
                if(list.getSize()>0) {
                    list.deleteToDoList(getArrayDell(text) - 1);
                    System.out.println("Данные удалены...");
                }else {
                    System.out.println("Нет данных для удаления...");
                }
            }

            if(text.toUpperCase().matches("ADD \\D+\\s?.+?")){
                list.addToDoList(text.substring(4));
                System.out.println("Данные внесены в список...");

            }
            if(text.toUpperCase().matches("ADD \\d+ .+?")){
                if(list.getSize() >  getArray(text)){
                    list.addToListIndex(getArray(text),getInTask(text));
                    System.out.println("Данные внесены в список, с индексом...");
                }else {
                    System.out.println("Нет такого индекса. Данные помещаются в конец списка...");
                    list.addToListIndex(list.getSize(),getInTask(text));
                }
            }

            if(text.toUpperCase().matches("EDIT \\d+ .+?")){
                list.changeToDoList(getArray(text), getInTask(text));
                System.out.println("Изменение внесено...");
            }


        }
    }

    private static int getArray(String text) {
        String[] array = (text.replaceAll("\\D+", " ").trim()).split(" ");
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = Integer.valueOf(array[i]);
        }
        return a[0]-1;
    }
    private static int getArrayDell(String text) {
        String[] array = (text.replaceAll("\\D+", " ").trim()).split(" ");
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = Integer.valueOf(array[i]);
        }
        return a[0];
    }
    private static String getInTask(String text){
        String[] txt = text.split(" ");
        String txt2 = "";
        for(int i = 2; i < txt.length; i ++){
            txt2 = txt2 + txt[i] + " ";
        }


        return txt2.trim();
    }

}