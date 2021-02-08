package AbstractTypes;

import java.util.ArrayList;

public class Register {
    protected ArrayList<Nameable> studentRegister;

    public Register(ArrayList<Nameable> People) {
        this.studentRegister = People;
    }

    public ArrayList<String> getRegister() {
        ArrayList<String> studentNames =  new ArrayList<>();
        for(Nameable student : studentRegister) {
            studentNames.add(student.getName());
        }
        return studentNames;
    }
}
