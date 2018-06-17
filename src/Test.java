import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println("Podaj imię: ");
        String firName = scan.nextLine();
        //System.out.println("Podaj nazwisko: ");
        String lasName = scan.nextLine();
        //System.out.println("Podaj wiek: ");
        int age = scan.nextInt();
        //System.out.println("Podaj nr pesel: ");
        String pesl = scan.nextLine();

        Person person = null;

        try{
            person = new Person(firName,lasName,age,pesl);
        }catch (NameUndefinedException blad1){
            System.out.println("za krótkie nazwisko!");
        }catch (IncorrectAgeException blad2){
            System.out.println("wiek jest nieprawidłowy");
        }finally {
            System.out.println(person);
        }
    }
}
