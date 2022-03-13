import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int elementos;

        elementos = Integer.parseInt(JOptionPane.showInputDialog("Diguite la cantidad de elementos del areglo"));
        Scanner entrada = new Scanner(System.in);

        char[] Letras = new char[elementos];
        System.out.println("Diguite los elementos del arreglo");
        for (int i = 0; i < elementos; i++) {
            System.out.println((i + 1) + ".Diguite un caracter");
            Letras[i]= entrada.next().charAt(0);

        }
        System.out.print("\n Los caracteres del arreglo son-->");
        for(int i=0; i< elementos;i++){
            System.out.print(Letras[i]+" ");

        }
    }

}
