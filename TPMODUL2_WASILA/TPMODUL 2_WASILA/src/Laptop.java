public class Laptop extends Perangkat {
    boolean webcam;
    String kata;

    public Laptop(String drive, int ram, double processor, boolean webcam){
        super(drive,ram,processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi(){
        if(webcam==true){
            kata="memiliki webcam";
        }
        else{
            kata="tidak memiliki webcam";
        }
        System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+"GB dan processor secepat "+processor+"Ghz. Selain itu laptop ini juga "+kata);

    }

    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game "+nama_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke "+email);
    }
    
    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke "+email1+" dan ke "+email2);

    }



}
