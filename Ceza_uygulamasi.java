// Ýlkay Ýnan
// s26128
package ceza_uygulamasi;
import javax.swing.JOptionPane;

public class Ceza_uygulamasi {

    public static void main(String[] args) {
        String veri1 = JOptionPane.showInputDialog("Hýz miktarýný giriniz.");
        int hiz = Integer.parseInt(veri1);
        String veri2 = JOptionPane.showInputDialog("Tekrar sayýsýný giriniz.");
        int tekrar = Integer.parseInt(veri2);
        
        if (111<=hiz && hiz<=140 && 1<=tekrar && tekrar<=3){
            int baz_ceza = 150;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);

        }
        else if (141<=hiz && hiz<=160 && 1<=tekrar && tekrar<=3){
            int baz_ceza = 375;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        else if (161<=hiz && hiz<=180 && 1<=tekrar && tekrar<=3){
            int baz_ceza = 720;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        else if (181<=hiz && 1<=tekrar && tekrar<=3){
            int baz_ceza = 1200;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        
        
        else if (111<=hiz && hiz<=140 && 4<=tekrar && tekrar<=5){
            int baz_ceza = 350;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        else if (141<=hiz && hiz<=160 && 4<=tekrar && tekrar<=5){
            int baz_ceza = 875;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        else if (161<=hiz && hiz<=180 && 4<=tekrar && tekrar<=5){
            int baz_ceza = 1650;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        else if (181<=hiz && 4<=tekrar && tekrar<=5){
            int baz_ceza = 2800;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        
        
        else if (111<=hiz && hiz<=140 && 6<=tekrar && tekrar<=8){
            int baz_ceza = 800;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        else if (141<=hiz && hiz<=160 && 6<=tekrar && tekrar<=8){
            int baz_ceza = 2000;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        else if (161<=hiz && hiz<=180 && 6<=tekrar && tekrar<=8){
            int baz_ceza = 3800;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        else if (181<=hiz && 6<=tekrar && tekrar<=8){
            int baz_ceza = 6500;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        
        else if (111<=hiz && hiz<=140 && tekrar>8){
            int baz_ceza = 5000;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        else if (141<=hiz && hiz<=160 && tekrar>8){
            int baz_ceza = 11000;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        else if (161<=hiz && hiz<=180 && tekrar>8){
            int baz_ceza = 18000;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        else if (181<=hiz && tekrar>8){
            int baz_ceza = 42000;
            int toplam_ceza = baz_ceza + hiz*2;
            JOptionPane.showMessageDialog(null, baz_ceza, "Baz Ceza",
   JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, toplam_ceza, "Toplam Ceza",
   JOptionPane.ERROR_MESSAGE);
        }
        

         
    }
    
}
