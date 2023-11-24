package Practice.OOPS;

public interface Atmosphere {

    void weather(String str);
}
interface Cosmos{
    void energy(String str);
}

class Universe implements Atmosphere,Cosmos{
    String seasonChange;
    String energy;
    @Override
    public void weather(String str) {
        seasonChange=str;
    }

    @Override
    public void energy(String str) {
    energy=str;
    }

    @Override
    public String toString() {
        return "Universe{" +
                "seasonChange='" + seasonChange + '\'' +
                ", energy='" + energy + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Universe atmosphere=new Universe();
        atmosphere.weather("Monsoon");
        atmosphere.energy("Electromagnetic Radiations ");
        System.out.println(atmosphere);
    }
}