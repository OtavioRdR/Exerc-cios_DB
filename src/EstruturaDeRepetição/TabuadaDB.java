package EstruturaDeRepetição;

public class TabuadaDB {

    public static void main(String[] args) {

        int tabuadaDb = 5;

        for(int x = 0; x <= 10; x++) {
            System.out.print("Tabuada do: " + tabuadaDb + " | ");
            System.out.print(x + " x " + tabuadaDb + " = ");
            System.out.println(x * tabuadaDb);

        }
    }
}
