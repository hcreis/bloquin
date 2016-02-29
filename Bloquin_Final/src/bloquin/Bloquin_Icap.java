package bloquin;

import java.io.*;

public class Bloquin_Icap {

    private String tudo;

    public void buscaIcap(String login, String icap, String periodo) {

        File diretorioDeImagens = new File("c:\\Suporte");

        File[] imagensDoDiretorio = diretorioDeImagens.listFiles();

        for (File imagensDoDiretorio1 : imagensDoDiretorio) {

            tudo = imagensDoDiretorio1.getPath();

            if (tudo.contains(icap)) {

                System.out.printf("Conteudo do arquivo : " + tudo + "\n");

                try {

                    FileReader arq = new FileReader(tudo);
                    BufferedReader lerArq = new BufferedReader(arq);

                    FileWriter arq_grava = new FileWriter("c:\\temp\\Log-Icap" + login + "." + periodo + ".txt", true);
                    BufferedWriter bw = new BufferedWriter(arq_grava);

                    String linha = lerArq.readLine();

                    try {

                        while (linha != null) {

                            linha = lerArq.readLine();

                            if (linha.contains(login)) {
                                System.out.printf("%s\n ", linha);

                                for (int i = 0; i < 1; i++) {

                                    System.out.printf("%s\n ", linha);
                                    bw.write(linha);
                                    bw.newLine();

                                }

                            }

                        }

                        bw.close();

                    } catch (NullPointerException e) {

                        System.out.printf("Login não encontrado: \n" + e.getMessage());

                    }

                } catch (IOException e) {

                    System.out.printf("Erro na Abertura do Arquivo: %s. \n" + e.getMessage());
                }

            }
        }
    }
}
