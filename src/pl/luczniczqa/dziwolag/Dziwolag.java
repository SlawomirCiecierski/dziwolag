package pl.luczniczqa.dziwolag;

public class Dziwolag {

    private int pierwszaZmienna, drugaZmienna;

    public int Dziwolag(int pierwszaZmienna, int drugaZmienna) {

        System.out.println("Prawidłowe działanie dodawania");
        return pierwszaZmienna + drugaZmienna;
    }

//    public Dziwolag() {
//    }

    public Dziwolag(int pierwszaZmienna, int drugaZmienna) {
        if (pierwszaZmienna==drugaZmienna) {
            throw new IllegalArgumentException("NIE DZIELIMY PRZEZ =0 ");
        }
        this.pierwszaZmienna = pierwszaZmienna;
        this.drugaZmienna = drugaZmienna;
    }

    public int getPierwszaZmienna() {

        if (pierwszaZmienna == 11) {

            throw new ArithmeticException("NIE DZIELIMY PRZEZ 11");
        }

        this.pierwszaZmienna = pierwszaZmienna;
        return pierwszaZmienna;
    }

    public void setPierwszaZmienna(int pierwszaZmienna) {

    }

    public int getDrugaZmienna() {

        if (drugaZmienna == 10) {

            throw new IllegalArgumentException("NIE DZIELIMY PRZEZ 10");
        }

        return drugaZmienna;
    }

    public void setDrugaZmienna(int drugaZmienna) {

        this.drugaZmienna = drugaZmienna;
    }
}
