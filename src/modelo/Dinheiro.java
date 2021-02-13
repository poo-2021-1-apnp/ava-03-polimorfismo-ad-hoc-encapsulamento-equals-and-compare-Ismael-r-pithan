package modelo;
import static java.lang.Integer.parseInt;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Dinheiro implements Comparable<Dinheiro> {

  private int centavos;

  public Dinheiro(int reais, int centavos) {
    this.centavos = reais * 100 + centavos;
  }

  public Dinheiro(int reais){
    this.centavos = reais * 100;
  }


public Dinheiro(String s){
  String[] partes = s.split(" ");
  String[] dinheiro = partes[1].split(",");
  this.centavos += Integer.parseInt(dinheiro[0]) * 100;
  this.centavos += Integer.parseInt(dinheiro[1]);
}


public Dinheiro(double d){
  DecimalFormat decimalFormat = new DecimalFormat("#,##0,00");
  decimalFormat.setRoundingMode(RoundingMode.DOWN);
  decimalFormat.format(this.centavos += d * 100);
}

public int getReais() {
    return this.centavos / 100;
  }

  public int getCentavos() {
    return this.centavos % 100;
  }

  public void somar(Dinheiro d) {
    this.centavos += d.centavos;
  }


public void somar(Dinheiro r,Dinheiro c) {
  this.centavos += c.centavos;
  this.centavos += r.centavos / 100;

}

public void soma(Dinheiro d) {
  this.centavos += d.centavos;
}

public void soma(int i) {
  this.centavos += i * 100;
}

public void soma(double d) {
  this.centavos += d * 100;
}

public void soma(String din) {
  String[] partes = din.split(" ");
  String[] dinheiro = partes[1].split(",");
  this.centavos += (parseInt(dinheiro[0]) * 100);
  this.centavos += parseInt(dinheiro[1].substring(0, 2));

}

  public void imprimir() { // Não é ilegal imprimir Dinheiro? 😏
    System.out.println(
      String.format("R$ %d,%02d", this.getReais(), this.getCentavos())
    );
  }

@Override
public boolean equals(Object outroObjeto){
  if(this == outroObjeto) return true;
  if(null == outroObjeto) return false;
  if(outroObjeto instanceof Dinheiro){
    Dinheiro outroDinheiro = (Dinheiro) outroObjeto;
    if(this.centavos == outroDinheiro.centavos) return true;
  }
  return false;
}

@Override
public int compareTo(Dinheiro o) {

  if(this.centavos > o.centavos) return 1;
  if(this.centavos < o.centavos) return -1;
  return 0;
}



}
