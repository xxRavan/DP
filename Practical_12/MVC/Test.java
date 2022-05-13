public class Test
{
    public static void main(String[] args) {
        StudentTime view2 = retriveColTimeFromDb();
        StudentTime t = new StudentTime();
        ColTimeView view = new ColTimeView();

        Controller controller = new Controller(t,view);

        controller.setSubjct("English");
        controller.getSubject();


    }
    private static StudentTime retriveColTimeFromDb()
    {
        StudentTime studentTime = new StudentTime();
        studentTime.setColTime("10");
        studentTime.setSubject("English");

        return studentTime;
    }
}
