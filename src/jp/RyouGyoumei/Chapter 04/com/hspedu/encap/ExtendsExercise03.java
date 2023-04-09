package com.hspedu.encap;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "IBM");
        NotePad notePad = new NotePad("intell", 16, 500, "black");

        pc.printInfo();
        notePad.printInfo();
    }
}
