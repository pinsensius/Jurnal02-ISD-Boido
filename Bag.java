public class Bag {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private Integer stok;

    public Bag(String kodeBarang, String jenisBarang, String namaBarang, Integer stok){
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "ATK [kodeBarang=" + kodeBarang + ", jenisBarang=" + jenisBarang + ", namaBarang=" + namaBarang
                + ", stok=" + stok + "]";
    }

    
}