public class Sifaris {
    Meal sifarismeal;
    Drink sifarisdrink;

    public Sifaris(Meal sifarismeal, Drink sifarisdrink) {
        this.sifarismeal = sifarismeal;
        this.sifarisdrink = sifarisdrink;
    }
    public  Sifaris(Meal sifarismeal){
        this.sifarismeal=sifarismeal;
    }
    public  Sifaris(Drink sifarisdrink){
        this.sifarisdrink=sifarisdrink;
    }

    @Override
    public String toString() {
        return "Sifaris{" +
                "sifarismeal=" + sifarismeal +
                ", sifarisdrink=" + sifarisdrink +
                '}';
    }
}
