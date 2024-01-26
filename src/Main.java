//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Rettangolo rettangolo = new Rettangolo(40,90,tipoForma.RETTANGOLO);
        Triangolo triangolo = new Triangolo(50,47,tipoForma.TRIANGOLO);
        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());

        }
    }
