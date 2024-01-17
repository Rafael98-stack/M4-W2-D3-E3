import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Product {
    Long id;
    String name;
    String category;
    Double price;
public Product(){

}
public void getInserisciLibri (){
    System.out.println("Inserisci quanti Libri devono essere inseriti");
    Scanner scanner = new Scanner(System.in);
    Set<String> col1= new HashSet<>();
    int Quantita = scanner.nextInt();
    System.out.println("Inserisci quali Libri devono essere inseriti");

    for(int i = 0; i <Quantita;i++){
        String name = scanner.next();
        col1.add(name);
    }


}

}
