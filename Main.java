public class Main {
    public static void main(String[] args){
        TokoAbc<ATK> toko = new TokoAbc<>(5);
        TokoAbc<Bag> bag = new TokoAbc<>(5);
        
        toko.addItem(new ATK("A001", "Alat Tulis", "Pencil", 10));
        toko.addItem(new ATK("A002", "Alat Tulis", "Pulpen", 10));
        toko.addItem(new ATK("B001", "Buku", "Buku A5", 10));
        toko.addItem(new ATK("B002", "Kertas", "Kertas A4", 10));
        toko.addItem(new ATK("B003", "Kertas", "Karton", 10));
        bag.addItem(new Bag("C001", "Tas", "Eiger", 10));
        bag.addItem(new Bag("C002", "Tempat Pensil", "Tempat Pensil ATK", 10));
        bag.addItem(new Bag("C003", "Tas", "Converse", 10));
        bag.addItem(new Bag("C004", "Tempat Pensil", "Fabercastle", 10));
        bag.addItem(new Bag("C005", "Tempat Pensil", "Fabercastle Super", 10));

        // toko.setData(0, new Bag());
        

        toko.setData(0,new ATK("A001","Buku","Buku A4",10));
        toko.removeData(0);

        toko.toString();
        bag.toString();
        bag.display();
        toko.display();
    }
}
