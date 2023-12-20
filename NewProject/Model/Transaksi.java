package Model;

public class Transaksi {
   
        private ProdukGas produk;
        private Customer customer;
        private int quantity;
     
        public Transaksi(ProdukGas var1, Customer var2, int var3) {
           this.produk = var1;
           this.customer = var2;
           this.quantity = var3;
        }
       
     
        public int calculateTotal() {
           return this.produk.getHarga() * this.quantity;
        }
     
        public String getTransaksi() {
           String nama = this.customer.getName();
           return "Customer: " + nama + "\nProduct: " + this.produk.getNama() + "\nQuantity: " + this.quantity + "\nTotal: Rp" + this.calculateTotal();
        }
        
        
}
