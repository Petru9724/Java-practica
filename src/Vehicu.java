abstract class Vehicu {

    String marca;
    int viteza;

    Vehicu(String marca, int viteza) {
        this.marca = marca;
        this.viteza = viteza;
    }

    abstract void pornesteMotorul();

    void infoVehicu() {
        System.out.println("Marca" + marca + "Viteza maxima :" + viteza);
    }
}
        interface  Electric{
             void incarcaBateria();
        }
        //MasinaElectrica extinde Vehicul, implementează Electric

    class MasinaElectrica extends Vehicu implements Electric{
         MasinaElectrica (String marca, int viteza){
             super(marca, viteza);
         }
         void  pornesteMotorul(){
             System.out.println(marca + "Porneste motorul...");

         }

        @Override
        public void incarcaBateria() {
            System.out.println("Se incarca bateria masinii electrice " + marca);
        }
    }
    class TrotinetaElectrica extends Vehicu implements Electric{
    TrotinetaElectrica(String marca, int viteza ){
        super(marca, viteza);
    }

        @Override
        void pornesteMotorul() {
            System.out.println(marca+ "porneste motorul mic electric...");
        }

        @Override
        public void incarcaBateria() {
            System.out.println("Se incarca bateria trotinetei" + marca);
        }
    }
          class Main {
        public static void main(String[] args) {
            MasinaElectrica Tesla = new MasinaElectrica("tesla model 2", 300);
            TrotinetaElectrica xiaomi = new TrotinetaElectrica("xiaomi pro", 20);

            Tesla.infoVehicu();
            Tesla.pornesteMotorul();
            Tesla.incarcaBateria();

            System.out.println("......................");

            xiaomi.infoVehicu();
            xiaomi.pornesteMotorul();
            xiaomi.incarcaBateria();
        }

}



