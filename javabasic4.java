public class javabasic4 {
    public static void main(String[] args) {
        mencariHM(90);

    }


    static void mencariHM(int nilai){

        if (nilai >= 0 && nilai <= 20) {
            System.out.println("Anda mendapatkan nilai : E");
        } else if (nilai >= 21 && nilai <= 40) {
            System.out.println("Anda mendapatkan nilai : D");
        } else if (nilai >= 41 && nilai <= 60) {
            System.out.println("Anda mendapatkan nilai : C");
        } else if (nilai >= 61 && nilai <= 80) {
            System.out.println("Anda mendapatkan nilai : B");
        } else if (nilai >= 81 && nilai <= 100) {
            System.out.println("Anda mendapatkan nilai : A");
        } else if (nilai >= 100) {
            System.out.println("Nilai yang diinput melebihi batas");
        }
    }



}
