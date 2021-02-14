package modelo;

public class Data implements Comparable<Data>{
  private int dia;
  private int mes;
  private int ano;

  public Data(int dia, int mes, int ano){
    if(dia > 31 || dia < 1)  throw new IllegalArgumentException("Erro! Dia inexistente");

    if(mes > 12 || mes < 1)  throw new IllegalArgumentException("Erro! Dia inexistente");

    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }
  public Data(String data){
    this(Integer.parseInt(data.substring(0, 2)),
    Integer.parseInt(data.substring(3, 5)),
    Integer.parseInt(data.substring(6, 10)));
  }


  public int getDia(){
    return this.dia;
  }
  public int getMes(){
    return this.mes;
  }
  public int getAno(){
    return this.ano;
  }

  @Override
  public boolean equals(Object outroObjeto) {
    if (this == outroObjeto)
      return true;
    if (null == outroObjeto)
      return false;
    if (outroObjeto instanceof Data) {
      Data outraData = (Data) outroObjeto;
      if ((this.dia == outraData.dia)&&(this.mes == outraData.mes)&&(this.ano == outraData.ano))
        return true;
    }
    return false;
  }

  @Override
  public int compareTo(Data dt) {

    if (this.ano > dt.ano)
      return 1;
    if(this.mes > dt.mes)
      return 1;
    if(this.dia > dt.dia)
      return 1;
    if(this.ano < dt.ano)
      return -1;
    if(this.mes < dt.mes)
      return -1;
    if(this.dia < dt.dia){
      return -1;
    }
    return 0;
  }
}
