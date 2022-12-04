public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat("Aspire", 32,3.00);
        perangkat1.informasi();
        System.out.println("");

        Laptop laptop1 = new Laptop("Acer", 16, 5.00,true);
        laptop1.informasi();
        laptop1.bukaGame("The Sims");
        laptop1.kirimEmail("wasila222@gmail.com");
        laptop1.kirimEmail("silacantik@gmail.com","pisces@gmail.com");
        System.out.println("");

        Handphone handphone1 = new Handphone("Iphone",512,7.00, true);
        handphone1.informasi();
        handphone1.telfon(628952334);
        handphone1.kirimSMS(628121314);
        handphone1.kirimSMS(628223344,628957890);
        System.out.println("");
    }
}
