public class Controller
{
    private StudentTime model;
    private ColTimeView view;

    public Controller(StudentTime model, ColTimeView view)
    {
        this.model = model;
        this.view = view;

    }

    public void setSubjct(String subject)
    {
        model.setSubject(subject);
    }

    public String getSubject()
    {
        String sub = model.getSubject();
        if (sub.equalsIgnoreCase("10"))
        {
            return model.getSubject();
        }

        return sub;
    }


}
