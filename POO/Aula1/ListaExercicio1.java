

public class ListaExercicio1 {
    public int maiorNum(int num1, int num2, int num3){
        int maior;

        maior = num1;

        if(num1 == num2 || num2 == num3 || num1 == num3 ){
            maior = 0;
        }else if(maior < num2){
            maior = num2;
            if(maior < num3){
                maior = num3;
            }
        }

        return maior;

        
    }

    public static void main(String[] args) {
        ListaExercicio1 t1 = new ListaExercicio1();

        int maior = t1.maiorNum(3,4,1);

        System.out.println(maior);

    }
}