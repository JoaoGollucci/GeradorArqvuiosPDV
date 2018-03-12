/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteMain;

/**
 *
 * @author joao.golluci
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class GeradorArquivo {
 
  public  void GeraArquivo(String linha, int linhas, String titulo, String[] listaStr, List lista ) throws IOException  {
//    Scanner ler = new Scanner(System.in);
    
    
    
    
//    GregorianCalendar calendar = new GregorianCalendar();
//     String data, ano, mes, dia, hora, minuto, segundo;
//    
//     data=java.time.Instant.now().toString();
//     
//     ano=(String) data.subSequence(0, 4);
//     mes=(String) data.subSequence(5, 7);
//     dia=(String) data.subSequence(8, 10);
//     hora=Integer.toString(calendar.get(Calendar.HOUR_OF_DAY));
//     minuto=(String) data.subSequence(14, 16);
//     segundo=(String) data.subSequence(17, 19);
     
     
//     System.out.println(data);
//     System.out.println(ano);
//     System.out.println(mes);
//     System.out.println(dia);
//     
//     System.out.println(hora);
//     System.out.println(minuto);
//     System.out.println(segundo);
 
//    System.out.printf("Informe o Pedido SAP: \n");
//    pedidoSap = ler.next();
//    System.out.printf("Informe o IMEI: \n");
//    imei = ler.next();
//    System.out.printf("Informe o SIMCARD: \n");
//    simcard = ler.next();
//    System.out.printf("Informe o MSISDN: \n");
//    msisdn = ler.next();
//    System.out.printf("Informe o UF: \n");
//    uf = ler.next();
//    System.out.printf("Informe a Data (yyyymmdd):  \n");
//    data = ler.next();
//    System.out.printf("Quantidade de Linhas:  \n");
//    linhas = ler.next();
    
//    ASSOCIACAO.PSIEBEL.90"+uf+"."+pedidoSap+"X"+ano+".X"+mes+""+dia+".X"+hora+minuto+segundo+
    FileWriter arq = new FileWriter(titulo);
    PrintWriter gravarArq = new PrintWriter(arq);
 
    listaStr = (String[]) lista.toArray (new String[0]);
    for (int i = 0; i < listaStr.length; i++) {
    		gravarArq.printf(listaStr[i]);
    	}
//    gravarArq.printf(linha);
    gravarArq.printf("F0000"+linhas);
 
    arq.close();
 
    JOptionPane.showMessageDialog(null, "Arquivo Gerado com Sucesso! \n");
  }
  
  public String geraLinha(String pedidoSap, String uf, String imei, String simcard, String msisdn){
      
        GregorianCalendar calendar = new GregorianCalendar();
     String data, ano, mes, dia, hora, minuto, segundo;
    
     data=java.time.Instant.now().toString();
     
     ano=(String) data.subSequence(0, 4);
     mes=(String) data.subSequence(5, 7);
     dia=(String) data.subSequence(8, 10);
     hora=Integer.toString(calendar.get(Calendar.HOUR_OF_DAY));
     minuto=(String) data.subSequence(14, 16);
     segundo=(String) data.subSequence(17, 19);
      
      
         String linha;
         
         linha = "R"+pedidoSap+"      "+ano+mes+dia+"90"+uf+""+pedidoSap+"E            1267NAC"+imei+""+simcard+"0"+msisdn+"    00012 000000"+pedidoSap+"%n";
         
         return linha;
     }
  
  
  public String geraTitulo(String pedidoSap, String uf, String imei, String simcard, String msisdn){
      
        GregorianCalendar calendar = new GregorianCalendar();
     String data, ano, mes, dia, hora, minuto, segundo;
    
     data=java.time.Instant.now().toString();
     
     ano=(String) data.subSequence(0, 4);
     mes=(String) data.subSequence(5, 7);
     dia=(String) data.subSequence(8, 10);
     hora=Integer.toString(calendar.get(Calendar.HOUR_OF_DAY));
     minuto=(String) data.subSequence(14, 16);
     segundo=(String) data.subSequence(17, 19);
      
      
         String titulo;
         
         titulo = "ASSOCIACAO.PSIEBEL.90"+uf+"."+pedidoSap+"X"+ano+".X"+mes+""+dia+".X"+hora+minuto+segundo+".txt";
         
         return titulo;
     }
 
}

