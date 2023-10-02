public class Operazione {
    public static void whatOper(double x, double y, char oper){ //metodo per capire quale operazione
        switch (oper){
            case '+' :
                double addizione = Somma.somma(x,y);
                System.out.println("Il risultato dell'addizione è:  " + addizione);
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
