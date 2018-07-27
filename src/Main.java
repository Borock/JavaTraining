public class Main {

    public static void rownanieKwadratowe(int a, int b, int c){

        if(a == 0){
            System.out.println("To nie jest równanie kwadratowe");
        }
        else{
            double delta = (b*b) - (4 * a * c);
            if (delta == 0){
                int x = (-b)/(2*a);
                System.out.println("Istnieje jedno rozwiązanie podwójne: x = " + x);
            }
            else if (delta < 0){
                System.out.println("Równanie nie ma rozwiązania w zbiorze liczb rzeczywistych");
            }
            else {
                double x1 = ((-b) - Math.sqrt(delta)) / (2*a);
                double x2 = ((-b) + Math.sqrt(delta)) / (2*a);
                System.out.println("Istnieją dwa rozwiązania: x1 = " + x1 + " oraz x2 = " + x2);
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("Podaj wspolczynnik a równania: ");
        String a = System.console().readLine();
        System.out.println("Podaj wspolczynnik b równania: ");
        String b = System.console().readLine();
        System.out.println("Podaj wspolczynnik c równania: ");
        String c = System.console().readLine();


        rownanieKwadratowe(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c));

    }
}
