package Sema.abstraction.windowsOffice;

public class Main {
    public static void main(String[] args) {
        WindowsOffice officePackage1=new Word();
        WindowsOffice officePackage2=new Excel();

        officePackage1.add();
        officePackage1.delete();
        officePackage1.update();
        officePackage1.get();

        System.out.println("-----------------");

        officePackage2.add();
        officePackage2.delete();
        officePackage2.update();
        officePackage2.get();


    }
}
