package bloquin;

import java.io.*;
import javax.swing.JOptionPane;

public class Bloquin_Cache2 {

    private String tudo;
    
    public void buscaCache2(String login, String cache2, String periodo) {

        File diretorioDeImagens = new File("c:\\Suporte");

        File[] imagensDoDiretorio = diretorioDeImagens.listFiles();

        for (File imagensDoDiretorio1 : imagensDoDiretorio) {

            tudo = imagensDoDiretorio1.getPath();

            if (tudo.contains(cache2)) {

               // System.out.printf("Conteudo do arquivo : " + tudo + "\n");

                try {

                    FileReader arq = new FileReader(tudo);
                    BufferedReader lerArq = new BufferedReader(arq);

                    FileWriter arq_grava = new FileWriter("c:\\temp\\Log-Cache2" + login + "." + periodo + ".txt", true);
                    BufferedWriter bw = new BufferedWriter(arq_grava);
                    String linha = lerArq.readLine();

                    try {

                        while (linha != null) {

                            linha = lerArq.readLine();

                            // System.out.printf("%s\n ", linha);            
                            if (linha.contains(login)) {

                                for (int i = 0; i < 1; i++) {

                                    //System.out.printf("%s\n ", linha);
                                    bw.write(linha);
                                    bw.newLine();

                                }

                            }

                        }
                        bw.close();

                    } catch (NullPointerException e) {

                        //System.out.printf("Login não encontrado: \n" + e.getMessage());
                    }

                } catch (IOException e) {

                    JOptionPane.showMessageDialog(null,"Erro na Abertura do Arquivo: %s. \n " + e.getMessage());
                }

            }
        }
    }
}
