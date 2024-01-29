package OOP.Interfaces.FormExample;


public class FormsManagement {
    private Form[] forms = new Form[10];


    public void addForm(Form from) {
        for (int i = 0; i < forms.length; i++) {
            if (forms[i] == null) {
                forms[i] = from;
                break;
            }
        }
    }
}
