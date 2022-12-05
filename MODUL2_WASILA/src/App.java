public class App {
    public static void main(String[] args) throws Exception {
    
        TransportasiAir transportasi = new TransportasiAir(5, 10000);
        transportasi.informasi();
        transportasi.berlayar();
        transportasi.berlabuh();
        System.out.println("");
        
        Sampan sampan1 = new Sampan(40, 100000, 4);
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlabuh();
        sampan1.berlabuh(4);
        System.out.println("");

        Kapal kapal1 = new Kapal(12, 10100000, "diesel");
        kapal1.informasi();
        kapal1.berlayar();
        kapal1.berlayar(200);
        kapal1.berlabuh();
        System.out.println("");
    }
}
