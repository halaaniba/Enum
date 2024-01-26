enum tipoForma{
    TRIANGOLO,
    RETTANGOLO

}
public class Rettangolo implements Forma{
    double altezza;
    double base;
    tipoForma tipo ;
    public Rettangolo(double altezza,double base, tipoForma tipo) {
        this.altezza = altezza;
        this.base = base ;
        this.tipo = tipo;
    }

    public double calcolaArea(){
     return base * altezza;
}
}
