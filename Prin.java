public class Prin {
        public static void main(String[] args) {

                System.out.println("Hello, World");

                String nome = "Israel";
                String verbo = "Estuda";
                System.out.println(nome);
                System.out.println(nome + " " + verbo);

                String nome2 = "Jorge";
                int idade = 45;
                double renda = 4000.0;
                System.out.printf("%s tem %d anos e ganha %.2f reais%n%n", nome2, idade, renda);

                String product1 = "Computer";
                String product2 = "Office desk";
                int age = 30;
                int code = 5290;
                char gender = 'F';
                double price1 = 2100.0;
                double price2 = 650.50;
                double measure = 53.23456;

                System.out.printf("Products: %n%s, which price is %f %n%s, which price is %f %n %nRecord: %d years old, code %d and gender: %c", product1, price1, product2, price2, age, code, gender);


        }

}