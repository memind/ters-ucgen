import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int donguSayisi, basamak, bosluk, yildiz;
        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz: ");
        donguSayisi = inp.nextInt();
        
        for (basamak = donguSayisi; basamak > 1; basamak--){
            for (bosluk = basamak-1; bosluk < donguSayisi; bosluk++){System.out.print(" ");}
            for (yildiz = (basamak-1)*2-1 ; yildiz > 0; yildiz--){System.out.print("*");}
            System.out.println("");
        }
    }
}