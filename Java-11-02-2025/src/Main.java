public class Main {
    public static void main(String[] args) {

        System.out.println("\nComo Funciona o Incremento ? seguem os exemplos i e j");

        int i = 5;
        int j = 5;

        int resultado1 = i++;
        int resultado2 = ++j;

        System.out.println("\n(resultado1 = i++) Vai declarar resultado1 = i e depois adicionar +1 ao 5, ou seja resultado1 = 5 e i vai ser igual a 6");
        System.out.println("i =" + i + " | " + "Resultado1 = " + resultado1);
        System.out.println("\n(resultado2 = ++j) Vai adicionar +1 ao 5 e depois declarar resultado2 = j, ou seja j vai ser igual a 6 e resultado2 = 6");
        System.out.println("j =" + j + " | " + "Resultado2 = " + resultado2 + "\n");


        System.out.println("=============FOR=============");

        System.out.println("for(inicio;inicio<final;inicio++)");

        for(int inicio = 0;inicio<10;inicio++){
                    System.out.println(inicio);
                }

        System.out.println("=============WHILE=============");

        i= 0;
        System.out.println("while(condição)");
        while(i<10){
            i++;
            System.out.println(i);
        }

        System.out.println("=============BREAK=============");

        for(i=0;i<=10;i++){
            System.out.println(i);
            if (i == 5)
                break;
        }
        System.out.println("=============CONTINUE=============");

        for(i=0;i<=10;i++){
            if(i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}