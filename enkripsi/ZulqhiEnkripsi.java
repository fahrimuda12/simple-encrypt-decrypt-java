import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ZulqhiEnkripsi {

    public static void main (String[] args) {
    		ArrayList<String> abjad = new ArrayList<String>();
        abjad.add("A");
        abjad.add("B");
        abjad.add("C");
        abjad.add("D");
        abjad.add("E");
        abjad.add("F");
        abjad.add("G");
        abjad.add("H");
        abjad.add("I");
        abjad.add("J");
        abjad.add("K");
        abjad.add("L");
        abjad.add("M"); 
        abjad.add("N");
        abjad.add("O");
        abjad.add("P"); 
        abjad.add("Q");
        abjad.add("R");
        abjad.add("S");
        abjad.add("T");
        abjad.add("U");
        abjad.add("V");
        abjad.add("W");
        abjad.add("X");
        abjad.add("Y");
        abjad.add("Z");
              
        
       String nama = JOptionPane.showInputDialog("Masukkan Nama : ");
       
       String putarans = JOptionPane.showInputDialog("Masukkan Putaran :");
       int putaran = Integer.parseInt(putarans);
       
       nama = nama.toUpperCase(); 
       
       ArrayList<Character> namaChar  = new ArrayList<Character>();

       for(int i = 0; i<nama.toCharArray().length; i++) 
       {
           namaChar.add(i, nama.charAt(i)); 
       }
       
       ArrayList<String> enkripsi = new ArrayList<String>();
       
       for(int j=0; j<namaChar.size(); j++)
       {
           for(int i = 0; i<abjad.size(); i++)
           {
               if(namaChar.get(j).toString().equals(abjad.get(i))) 
               {

                   
                   int indeksEnkripsi = i + putaran;
                   
                   if(indeksEnkripsi > 24)
                        indeksEnkripsi = indeksEnkripsi % 26;
                    
                    System.out.println("Karakter : " + abjad.get(i) + "  Posisi : " + i + "  Setelah di Putar : " + 
                                    abjad.get(indeksEnkripsi) + "  Posisi : " + indeksEnkripsi);
                    enkripsi.add(abjad.get(indeksEnkripsi));
               }
           }
       }
           System.out.println("Hasil Akhir :" + enkripsi.toString());
    }
    
    
}