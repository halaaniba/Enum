public class Triangolo extends Rettangolo{
    public Triangolo(double altezza,double base,tipoForma tipo){
        super(altezza,base,tipo);
    }


    @Override
    public double calcolaArea(){
        return base * altezza / 2 ;
}
}
