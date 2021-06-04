package java_rekursif;

/**
 *
 * @author ADVANG4C
 */
public class Java_Rekursif {
    public int getFaktorial(int angka){
        if (angka==0) {//jika dimasukan data0
            return 1;//maka hasil akan 1
        }else{
            return angka*getFaktorial(angka -1);//dikalikan sampai -1
        }
    }
    public static int getPangkat(int x, int y) {
        if(y==0){ //jika dimasukan data0
            return 1; //maka hasil akan 1
        }else{
            return x * getPangkat(x, y-1);//dikalikan x*x berdasarkan nilai y(pangkat) sampai -1
        }
    }
    public static long getFibonacci(long angka){
        if ((angka == 0)||(angka == 1)){
            return angka;
            //angka default 0 dan 1 tetap
        }else{
            return getFibonacci(angka-1)+getFibonacci(angka-2);
            //rumus fibonacci fn = fn1+fn2
            //mengurangi angka -1 default dan -2 diganti jadi nomor 2(index 3)=1, lalu dijumlahkan
        }
    }
    /**
     * @param args he command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Java_Rekursif f = new Java_Rekursif();
        //Faktorial
        System.out.println("Faktorial 5 : "+f.getFaktorial(5));
        //Pangkat
        System.out.println("50 Dipangkatkan 2 = "+getPangkat(50,2));
        //Fibonacci
        for (int i = 0; i <= 10; i++) {
        System.out.printf("Bilangan Fibonaci %d adalah %d\n", i, getFibonacci(i));
        }
        //DeretBilanganGanjil
        System.out.println("Deret Bilangan Ganjil");
        for(int i=0;i<=100;i++){
        if (i%2!=0)
        System.out.print(i+" \n");
        } 
        //Cetak100xNama
        for (int n=0; n<=100; n++){
            System.out.println("Nama : Adi Sepriyadi");   
        }
    }
    
}

