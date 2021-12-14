import java.util.*;

public class lab5 {
    public static void main(String[] args) {
        Boolean flag = true;
        ArrayList<Integer> valueToRemove = new ArrayList<Integer>();
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(flag){
            System.out.println("Введите число ");
            String str = console.next();
            if(str.equals("quit")) {
                flag = false;
                break;
            }
            try {
                Integer element = Integer.parseInt(str);
                array.add(element);
            } catch(NumberFormatException e) {}
            
        }
        System.out.println("Массив: " + array);
        
        while(!flag) {
            System.out.println("Введите число для удаления ");
            String str = console.next();
            try {
                Integer el = Integer.parseInt(str);
                valueToRemove.add(el);
                flag = true;
            } catch(NumberFormatException e) {}
        }
        array.removeAll(valueToRemove);
        System.out.println("Новый массив: " + array);
        console.close();
    }
}
