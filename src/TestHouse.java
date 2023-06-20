import java.util.Scanner;

public class TestHouse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Creo un'istanza della classe House

        House house = new House();

        //Setto il valore chiedendo all'utente un input

        System.out.println("Inserisci il numero di piani: ");
        int floors = input.nextInt();
        house.setFloorsNumber(floors);

        System.out.println("Inserisci l'indirizzo: ");
        input.nextLine();
        String address = input.nextLine();
        house.setAddress(address);

        System.out.println("Inserisci i nomi degli inquilini (separati da virgole): ");
        String names = input.nextLine();
        house.setResidentsNames(names);

        //Stampo i dettagli di House usando getters e String.format()

        System.out.println("Dettagli della casa: ");
        System.out.println("Piani: " + house.getFloorsNumber());
        System.out.println("Indirizzo: " + house.getAddress());
        System.out.println("Inquilini: " + String.join(", ", house.getResidentsName()));
    }
}