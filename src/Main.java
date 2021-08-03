import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Hangi Aydayız","Aya göre mevsim hesaplama  / İlk Harf Büyük ! ", JOptionPane.INFORMATION_MESSAGE);
        String ay = JOptionPane.showInputDialog("Ay Girin");
        switch(ay){

            case "Aralık","Ocak","Şubat":  JOptionPane.showMessageDialog(null,"Kış Mevsimi","Mevsim", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Mart","Nisan","Mayıs": JOptionPane.showMessageDialog(null,"İlkbahar Mevsimi","Mevsim",JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Haziran","Temmuz","Ağustos": JOptionPane.showMessageDialog(null,"Yaz Mevsimi","Mevsim",JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Eylül","Ekim","Kasım": JOptionPane.showMessageDialog(null,"Sonbahar Mevsimi","Mevsim",JOptionPane.INFORMATION_MESSAGE);
                break;
            default: JOptionPane.showMessageDialog(null,"HATA!","HATALI GİRİŞ",JOptionPane.ERROR_MESSAGE);
                break;

        }
    }
}