public class Matematika {
    int hasil;

    void setTambah(int a, int b) {
        hasil = a + b;
    }

    void setKurang(int a, int b) {
        hasil = a - b;
    }

    void setKali(int a, int b) {
        hasil = a * b;
    }

    void setBagi(int a, int b) {
        hasil = a / b;
    }

    int getHasil() {
        return hasil;
    }
}
