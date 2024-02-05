package Klausuren.Klausur_28_07_2023.Afugabe_004;

import java.nio.channels.Pipe;

public class SubjectArea {
    private String name;
    private SubjectArea[] themen = new SubjectArea[5];

    public SubjectArea(String name) {
        this.name = name;
    }

    public SubjectArea[] getThemen() {
        return themen;
    }
}
