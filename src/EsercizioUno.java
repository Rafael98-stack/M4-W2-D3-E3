import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EsercizioUno {
    public static void main(String[] args) {
        Set<Product> ListaProdotti = new HashSet<Product>();
        Product prodotto1 = new Product(123123123L, "HarryPotter", "Book", 123.20);
        Product prodotto2 = new Product(432134321L, "JFK", "Book", 100.20);
        Product prodotto3 = new Product(1231233213L, "GOT", "Book", 180.20);
        Product prodotto4 = new Product(32131233L, "LK", "Book", 60.20);
        Product prodotto5 = new Product(4324325L, "Lunar", "Book", 50.20);
        ListaProdotti.add(prodotto1);
        ListaProdotti.add(prodotto2);
        ListaProdotti.add(prodotto3);
        ListaProdotti.add(prodotto4);
        ListaProdotti.add(prodotto5);
        stampaListaProdotti(ListaProdotti);
        stampaCategorieBookPrezzoMaggioreDi100(ListaProdotti);
    }

    public static void stampaListaProdotti(Set<Product> listaProdotti) {
        for (Product prodotto : listaProdotti) {
            System.out.println(prodotto);
        }
    }

    public static void stampaCategorieBookPrezzoMaggioreDi100(Set<Product> listaProdotti) {
        for (Product prodotto : listaProdotti) {
            if ("Book".equals(prodotto.getCategory()) && prodotto.getPrice() > 100) {
                System.out.println("Categoria: " + prodotto.getCategory() +
                        ", Prezzo: " + prodotto.getPrice());
            }
        }
    }
}
