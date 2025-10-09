package POO.Aula6;

import javax.print.attribute.standard.MediaSize.Other;

public class Quadrado {
    public double altura;
    public double largura;

    public boolean equals(Object other) {
        
        if(this == other){
            return true;
        }

        if( other == null) {
            return false;
        }

        Quadrado q = (Quadrado) other;

        boolean alturaEqual = this.altura == q.altura;
        boolean larguraEqual = this.largura == q.largura;

        return alturaEqual && larguraEqual;

        
    }
}
