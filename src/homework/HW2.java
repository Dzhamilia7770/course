package homework;

public class HW2 {
    public static void main(String [] arg){
        int number = 3;

        number++;
        System.out.println(number);
        String taskLabel = "Task ";
        System.out.println(taskLabel + number);
        char subTask = 'a';
        System.out.println(taskLabel + number + "." + subTask);

        byte x=1;
        byte y=x;
        byte z=3;
        System.out.println(y + z);
        System.out.println(taskLabel + (y + z) + "." + subTask);
    }
}
