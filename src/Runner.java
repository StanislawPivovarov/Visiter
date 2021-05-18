public class Runner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer trainee = new Trainee();
        Developer senior = new Senior();

        System.out.println("\u001B Работает trainee");
        project.beWritten(trainee);

        System.out.println("***************************");

        System.out.println("\u001B Работает Senior");
        project.beWritten(senior);
    }
}
