public class Senior implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Переписывает код trainee");
    }

    @Override
    public void create(Database database) {
        System.out.println("Фиксит базу данных");
    }

    @Override
    public void create(Test test) {
        System.out.println("Выполняет надежный тест");
    }
}
