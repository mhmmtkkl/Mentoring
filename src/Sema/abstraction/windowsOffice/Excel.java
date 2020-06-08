package Sema.abstraction.windowsOffice;

public class Excel extends WindowsOffice {
    @Override
    void update() {
        System.out.println("Excel updated");
    }

    @Override
    void get() {
        System.out.println("Excel gets the new feature");
    }
}
