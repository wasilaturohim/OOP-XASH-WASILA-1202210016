public class Handphone extends Perangkat {
    boolean fingerprint;
    String kata;

    public Handphone(String drive, int ram, double processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    
    @Override
    public void informasi(){
        if(fingerprint == true){
            kata = "memiliki fingerprint";
        }
        else{
            kata = "tidak memiliki fingerprint";
        }
        System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+"GB dan processor secepat "+processor+" Selain itu handphone ini "+kata);
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon No "+no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_hp1+" dan ke No "+no_hp2);
    }
}
