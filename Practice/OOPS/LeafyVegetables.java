package Practice.OOPS;

abstract class LeafyVegetables {
    int proteinQty;
    public abstract String name(String name);
    public LeafyVegetables(int proteinQty){
        this.proteinQty=proteinQty;
        System.out.println("LeafyVegetable constructor called");
    }
    public int qtyinfo(){
        return proteinQty;
    }
}
class Spinach extends LeafyVegetables{
    String name;
    @Override
    public String name(String name) {
        this.name=name;
        return name;
    }
    public Spinach(int qty){
        super(qty);
        System.out.println("Spinach constructor called");
    }

    public static void main(String[] args) {
        LeafyVegetables spinach=new Spinach(45);

        System.out.println(spinach.name("Spring Onions")+"has "+spinach.qtyinfo()+" grams of protein");
    }
}