public class Ogretmen extends Kisi {

   private String scilNO;
   private String bolum ;


    public Ogretmen() {
    }

    public Ogretmen(String adSoyad, String kimlikNO, int yas, String scilNO, String bolum) {
        super(adSoyad, kimlikNO, yas);
        this.scilNO = scilNO;
        this.bolum = bolum;
    }

    public String getScilNO() {
        return scilNO;
    }

    public void setScilNO(String scilNO) {
        this.scilNO = scilNO;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "scilNO='" + scilNO + '\'' +
                ", bolum='" + bolum + '\'' +
                super.toString()+
                '}';
    }
}

