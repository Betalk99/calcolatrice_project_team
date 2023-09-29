import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // input da tastiera

        System.out.println("Dammi il primo valore: ");
        double valUno = in.nextInt();    // input da tastiera
        System.out.println("Scrivere il simbolo dell'operazione da eseguire : ");
        char oper = in.next().charAt(0);  // input da tastiera
        System.out.println("Dammi il secondo valore : ");
        double valDue = in.nextInt();   // input da tastiera




        whatOper(valUno, valDue, oper); //richiamo del metodo per capire tipo di operazione
    }

    public static void whatOper(double x, double y, char oper){ //metodo per capire quale operazione
        switch (oper){
            case '+' :
                break;
            case '-' :
                break;
            case '*' :
                break;
            case '/' :
                break;
            default:
                System.out.println("Operazione errata!");
                break;
        }
    }



}