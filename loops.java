import java.util.ArrayList;

public class loops {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Israel");
        nomes.add("Lara");
        nomes.add("João");
        System.out.println(nomes.get(0)); // imprime "Israel"

        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }


        for (String nome : nomes){
            System.out.println(nome);
        }

        int contador = 0;
        while(contador < 10){
            System.out.println("Estou no while");
            contador++;
        }


    }
}
