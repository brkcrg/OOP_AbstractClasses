public  abstract class GameCalculator {
    public abstract   void  hesapla();

//hesaplaya gelicek olursak kim kullnıyosa herkes overriding etmek zorunda.

    public  final void  gameOver(){
        System.out.println("oyun bitti");

    }

}
//final overriding methodunun kullanılmasını engeller her oyunvu game over olucak anlamında.