package Ali.aastudy.Encapsulation.Task;

public class TaskMain {

    public static void main(String[] args) {

        TaskQuestion taskQuestion = new TaskQuestion();

        taskQuestion.setBalconyAvailable(true);
        taskQuestion.setRoomCount(1);
        System.out.println(taskQuestion.getPrice());

        taskQuestion.setBalconyAvailable(false);
        taskQuestion.setRoomCount(1);
        System.out.println(taskQuestion.getPrice());

        taskQuestion.setBalconyAvailable(true);
        taskQuestion.setRoomCount(0);
        System.out.println(taskQuestion.getPrice());

        taskQuestion.setBalconyAvailable(false);
        taskQuestion.setRoomCount(0);
        System.out.println(taskQuestion.getPrice());

        taskQuestion.setBalconyAvailable(false);
        taskQuestion.setRoomCount(5);
        System.out.println(taskQuestion.getPrice());
    }
}
