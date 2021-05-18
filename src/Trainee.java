public class Trainee implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Написание плохого класса");
    }

    @Override
    public void create(Database database) {
        System.out.println("Сломал базу данных");
    }

    @Override
    public void create(Test test) {
        System.out.println("Создает не надежные тесты");
    }
}
