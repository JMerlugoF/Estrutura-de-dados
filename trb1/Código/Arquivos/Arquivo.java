package Arquivos;

import java.io.*;

public class Arquivo{

    public static void gravar(String conteudo, String nomeArquivo) throws Exception{
        //abre o arquivo para escrita
        FileOutputStream outFile = new FileOutputStream(new File(nomeArquivo));
        BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

        //escreve no arquivo
        buff.write(conteudo);

        // fecha o arquivo
        buff.close();
        outFile.close();
    }

    public static String[] getLinhas(String nomeArquivo) throws Exception{
        // declaração das variáveis
        
        String linha;
        int i = 0;
        int cont=0;
        //abre o arquivo para leitura
        FileInputStream inFile = new FileInputStream(new File(nomeArquivo));
        BufferedReader buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));
        
        //lê o arquivo para contar quantas linhas têm
        while ((linha = buff.readLine()) != null) {
        	cont++;
        }

        //fecha o arquivo
        buff.close();
        inFile.close();
        
        //abre o arquivo para leitura
        FileInputStream arq = new FileInputStream(new File(nomeArquivo));
        BufferedReader br = new BufferedReader(new InputStreamReader(arq, "UTF-8"));

        //lê a primeira linha do arquivo
        linha = br.readLine();
        
        String[] linhas = new String[cont];
        
        //lê as demais linhas do arquivo
        while ((linha = br.readLine()) != null) {
        	linhas[i++] = linha;
        }
        
        br.close();
        arq.close();

        return linhas;
    }

}