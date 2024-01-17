import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EsercizioUno {
    public static void main(String[] args) {
        Categoria categoria = () -> System.out.println("!");
getCategoria(categoria);

        }
      static   public void getCategoria(Categoria c){
          Scanner scanner = new Scanner(System.in);
          String scelta = scanner.nextLine();
          System.out.println("La categoria scelta e': "+scelta);
        c.getCategoria();

      }
    }
