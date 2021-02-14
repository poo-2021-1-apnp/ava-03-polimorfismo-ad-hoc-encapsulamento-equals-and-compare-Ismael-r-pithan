import java.util.Arrays;
import java.util.Scanner;
import modelo.Data;
import modelo.Dinheiro;
import modelo.Veiculo;



class App {
  public static void main(String[] args) {

    Dinheiro d1 = new Dinheiro(2, 30);
    Dinheiro d2 = new Dinheiro(5, 80);
    d1.somar(d2);
    System.out.println(d1.getReais() == 8);
    System.out.println(d1.getCentavos() == 10);

    Dinheiro bufunfa = new Dinheiro(1, 1);
    bufunfa.imprimir(); // R$ 1,01

    Dinheiro d3 = new Dinheiro(3, 45);
    System.out.println(d3.getReais() == 3);
    System.out.println(d3.getCentavos() == 45);

    Dinheiro d4 = new Dinheiro(200);
    System.out.println(d4.getReais() == 200);
    System.out.println(d4.getCentavos() == 0);

    Dinheiro d5 = new Dinheiro("R$ 345,75");
    System.out.println(d5.getReais() == 345);
    System.out.println(d5.getCentavos() == 75);

    Dinheiro d6 = new Dinheiro("R$ 1000000,11");
    System.out.println(d6.getReais() == 1000000);
    System.out.println(d6.getCentavos() == 11);

    Dinheiro d7 = new Dinheiro("R$ 2567,89");
    System.out.println(d7.getReais() == 2567);
    System.out.println(d7.getCentavos() == 89);

    Dinheiro d8 = new Dinheiro(9.75);
    System.out.println(d8.getReais() == 9);
    System.out.println(d8.getCentavos() == 75);

    Dinheiro d9 = new Dinheiro(17.569); // é truncado nas duas casas, nãoarredondado!
    System.out.println(d9.getReais() == 17);
    System.out.println(d9.getCentavos() == 56);
    System.out.println("----------------------------------------------");

    d3.soma(d4); System.out.println(d3.getReais() == 203);
    System.out.println(d3.getCentavos() == 45);

    d5.soma(100); System.out.println(d5.getReais() == 445);
    System.out.println(d5.getCentavos() == 75);


    d6.soma(1.90); System.out.println(d6.getReais() == 1000002);
    System.out.println(d6.getCentavos() == 01);

    d7.soma("R$ 998817,86986");
    System.out.println(d7.getReais() == 1001385 ); // == 1001385
    System.out.println(d7.getCentavos() == 75);

    System.out.println("----------------------------------------------");
    //Dinheiro d8 = new Dinheiro(8, 98);
    //Dinheiro d9 = new Dinheiro(8, 99);
    // Dinheiro d10 = null;
    // Dinheiro d11 = new Dinheiro(8, 98);
    // Dinheiro d12 = d8;

    //System.out.println(d8.equals(d9) == false);
    //System.out.println(d8.equals(d10) == false);
    //System.out.println(d8.equals(d11) == true);
    //System.out.println(d8.equals(d12) == true);

    //System.out.println(new Dinheiro(3.43).equals(new Dinheiro(3, 43)));
    //System.out.println(new Dinheiro("R$ 8,97").equals(new Dinheiro(8, 97)));
    //System.out.println(!new Dinheiro("R$ 5,43").equals(null));


    Dinheiro d12 = new Dinheiro(4, 30);
    Dinheiro d13 = new Dinheiro(987, 14);
    Dinheiro d14 = new Dinheiro(0, 1);
    Dinheiro d15 = new Dinheiro(17, 9);
    Dinheiro d16 = new Dinheiro(4, 30);

    // Todas estas assertivas devem imprimir true
    System.out.println(d12.compareTo(d13) < 0);
    System.out.println(d12.compareTo(d14) > 0);
    System.out.println(d12.compareTo(d15) < 0);
    System.out.println(d12.compareTo(d16) == 0);

    Comparable d17 = new Dinheiro(8);
    Comparable d18 = new Dinheiro(9);
    Comparable d19 = new Dinheiro(8);
    System.out.println(d17.compareTo(d18) < 0);
    System.out.println(d17.compareTo(d19) == 0);
    System.out.println(d18.compareTo(d17) > 0);

    Dinheiro[] dindin = { d12, d13, d14, d15, d16 };

    // Classifique em ordem crescente através de java.util.Arrays
    Arrays.sort(dindin); System.out.println(dindin[0].equals(d14));
    System.out.println(dindin[1].equals(d12));
    System.out.println(dindin[2].equals(d12));
    System.out.println(dindin[3].equals(d15));
    System.out.println(dindin[4].equals(d13));


    System.out.println("----------------------------------------------");
    System.out.println("DATA");
    System.out.println("Teste de casos invalidos: ");
    try {
      Data dt = new Data("31/13/1996");
      System.out.println(dt.getDia() + "/" + dt.getMes() + "/" + dt.getAno());
    } catch (Exception e) {
      System.err.println("Erro! Data invalida");
    }
    try {
      Data dt1 = new Data("32/12/1996");
      System.out.println(dt1.getDia() + "/" + dt1.getMes() + "/" + dt1.getAno());
    } catch (Exception e) {
      System.err.println("Erro! Data invalida");
    }
    try {
      Data dt2 = new Data("0/12/1996");
      System.out.println(dt2.getDia() + "/" + dt2.getMes() + "/" + dt2.getAno());
    } catch (Exception e) {
      System.err.println("Erro! Data invalida");
    }
    try {
      Data dt2 = new Data("12/0/1998");
      System.out.println(dt2.getDia() + "/" + dt2.getMes() + "/" + dt2.getAno());
    } catch (Exception e) {
      System.err.println("Erro! Data invalida");
    }
    try {
      Data dt3 = new Data("12/-5/1998");
      System.out.println(dt3.getDia() + "/" + dt3.getMes() + "/" + dt3.getAno());
    } catch (Exception e) {
      System.err.println("Erro! Data invalida");
    }
    try {
      Data dt4 = new Data("-8/8/1998");
      System.out.println(dt4.getDia() + "/" + dt4.getMes() + "/" + dt4.getAno());
    } catch (Exception e) {
      System.err.println("Erro! Data invalida");
    }
    try {
      Data dt5 = new Data(01,13,1990);
      System.out.println(dt5.getDia()+"/"+dt5.getMes()+"/"+dt5.getAno());
    } catch (Exception e) {
      System.err.println("Erro! Data invalida");
    }
    try {
      Data dt6 = new Data(33, 11, 1990);
      System.out.println(dt6.getDia() + "/" + dt6.getMes() + "/" + dt6.getAno());
    } catch (Exception e) {
      System.err.println("Erro! Data invalida");
    }
    try {
      Data dt7 = new Data(-5, 11, 1990);
      System.out.println(dt7.getDia() + "/" + dt7.getMes() + "/" + dt7.getAno());
    } catch (Exception e) {
      System.err.println("Erro! Data invalida");
    }
    try {
      Data dt8 = new Data(6, -11, 1990);
      System.out.println(dt8.getDia() + "/" + dt8.getMes() + "/" + dt8.getAno());
    } catch (Exception e) {
      System.err.println("Erro! Data invalida");
    }
    System.out.println("----------------------------------------------");
    System.out.println("Testes Equals: ");
    Data dt9 = new Data(01,11,2000);
    Data dt10 = new Data("01/11/2000");
    Data dt11 = new Data(02, 11, 2000);
    Data dt12 = new Data("02/11/2000");
    Data dt13 = new Data(01, 12, 2000);
    Data dt14 = new Data("01/12/2000");
    Data dt15 = new Data(01, 11, 2001);
    Data dt16 = new Data("01/11/2001");
    Data dt17 = new Data(01,11,2000);
    Data dt18 = new Data("01/11/2000");

    System.out.println(dt14.equals(dt16) == false);
    System.out.println(dt12.equals(dt16) == false);
    System.out.println(dt12.equals(dt14) == false);
    System.out.println(dt10.equals(dt12) == false);
    System.out.println(dt10.equals(dt14) == false);
    System.out.println(dt10.equals(dt16) == false);
    System.out.println(dt13.equals(dt15) == false);
    System.out.println(dt11.equals(dt13) == false);
    System.out.println(dt11.equals(dt15) == false);
    System.out.println(dt9.equals(dt17) == true);
    System.out.println(dt9.equals(dt11) == false);
    System.out.println(dt9.equals(dt13) == false);
    System.out.println(dt9.equals(dt15) == false);
    System.out.println(dt9.equals(dt10) == true);
    System.out.println(dt11.equals(dt12) == true);
    System.out.println(dt13.equals(dt14) == true);
    System.out.println(dt15.equals(dt16) == true);
    System.out.println(dt13.equals(dt15) == false);


    System.out.println("----------------------------------------------");
    System.out.println("Testes compareTo: ");

    System.out.println(dt9.compareTo(dt17) == 0);
    System.out.println(dt9.compareTo(dt10) == 0);
    System.out.println(dt10.compareTo(dt18) == 0);
    System.out.println(dt10.compareTo(dt11) == -1);
    System.out.println(dt11.compareTo(dt10) == 1);
    System.out.println(dt13.compareTo(dt9) == 1);
    System.out.println(dt9.compareTo(dt13) == -1);
}
}
