package Sema.abstraction.windowsOffice;

public class Word extends WindowsOffice {

    @Override
    void update() {
        System.out.println("Word updated");
    }

    @Override
    void get() {
        System.out.println("Word gets the new features");
    }
}
