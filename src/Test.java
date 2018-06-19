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
        scan.nextLine();
        //System.out.println("Podaj nr pesel: ");
        String pesl = scan.nextLine();

        Person person = null;

        try{
            person = new Person(firName,lasName,age,pesl);
            System.out.println(person.toString());
        }catch (NameUndefinedException blad1){
            System.out.println(blad1.getMessage());
        }catch (IncorrectAgeException blad2){
            System.out.println(blad2.getMessage());
        }finally {
            System.out.println(person);
        }
    }
}
