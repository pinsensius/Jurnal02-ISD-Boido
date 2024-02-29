public class ATK {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private Integer stok;

    public ATK(String kodeBarang, String jenisBarang, String namaBarang, Integer stok){
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "ATK [ KodeBarang = " + this.kodeBarang + ", JenisBarang = " + this.jenisBarang + ", NamaBarang = " + this.namaBarang
                + ", Stok = " + this.stok + "]";
    }

    

    
}
