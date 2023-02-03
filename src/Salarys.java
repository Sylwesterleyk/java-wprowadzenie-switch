class Salarys {
    public static void main(String[] args) {

        int salarys[] = {100, 2000, 2500};       // pensja pracownika do wyboru
        int salaryChosen = salarys[0];           // wybrana pensja

        System.out.println("Pensja pracownika wynosi " + salaryChosen + "zł.");        //wyświetlenie wybranej pensji

        double raise = 0;

        switch (salaryChosen) {
            case 100:
                raise = 1000;
                break;
            case 2000:
                raise = 200;
                break;
            case 2500:
                raise = 25;
                break;
        }
        double percent = raise / salaryChosen * 100; //obliczanie procentowego wzrostu pensji

        if (percent%1==0){          //zastosowanie warunku dla wyświtlania wyniku w formie liczby naturalnej, gdy to możliwe
            int percent1 = (int)percent;
            int raise1 = (int)raise;
            System.out.println("Wynagordzenie wzrosło o " + (percent1) + " procent.");
            System.out.println("Pensja po podwyżce wynosi " + (raise1 + salaryChosen) + "zł.");
        } else {
            System.out.println("Wynagordzenie wzrosło o " + (percent) + " procent.");
            System.out.println("Pensja po podwyżce wynosi " + (raise + salaryChosen) + "zł.");
        }
    }
}