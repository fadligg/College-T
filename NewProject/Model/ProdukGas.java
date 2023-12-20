package Model;
public class ProdukGas {   
    private String name;
    private int harga;
    
    public ProdukGas(String name, int harga) {
        this.name = name;
        this.harga = harga;
    }
    
    public String getNama() {
        return name;
    }
    
    public int getHarga() {
        return harga;
    }

}
