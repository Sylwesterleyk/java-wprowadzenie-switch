class Salarys{
    public static void main(String[] args) {

        int salarys[] = {100, 2000, 2500};       // pensja pracownika do wyboru
        int salaryChosen = salarys[2];           // wybrana pensja

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
        System.out.println("Pensja po podwyżce wynosi " + (raise + salaryChosen) + "zł.");
        System.out.println("Wynagordzenie wzrosło o " + (raise / salaryChosen * 100) + " procent.");
    }
}