package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /** Instanciando a classe file com o caminho do arquivo*/
        File file = new File("c:\\temp\\in.txt");
        /* Criando o scanner que fará a leitura do arquivo */
        Scanner sc = null;

        /** tentativa */
        try {
            /* Instanciando o scanner */
            sc = new Scanner(file);
            /* Lendo as linhas do arquivo, enquanto tiver novas linhas faça...  */
            while (sc.hasNextLine()) {
                /* exibe no console  */
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
