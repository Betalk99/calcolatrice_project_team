import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // input da tastiera

        boolean stay = false;
        while(!stay) {

            System.out.println("Dammi il primo valore: ");
            double valUno = in.nextDouble();    // input da tastiera
            System.out.println("Scrivere il simbolo dell'operazione da eseguire : ");
            char oper = in.next().charAt(0);  // input da tastiera
            System.out.println("Dammi il secondo valore : ");
            double valDue = in.nextDouble();   // input da tastiera


            Operazione.whatOper(valUno, valDue, oper);  //richiamo del metodo per capire tipo di operazione

            EvenOdd.evenOdd(valUno, valDue, in);

            System.out.println("Vuoi continuare? Y(yes)/N(No) ");
            char risp = in.next().charAt(0);
            if(risp == 'N'){
                stay = true;
            }

        }

    }





}