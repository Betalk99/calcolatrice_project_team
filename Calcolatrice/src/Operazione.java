public class Operazione {
    public static void whatOper(double x, double y, char oper){ //metodo per capire quale operazione
        switch (oper){
            case '+' :
                System.out.println(x +y);
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
