package model;

public class Stringtest {
    private String palavra;

    public String getPalavra(){
        return palavra;
    }

    public void qntA(){

        if (palavra.contains("a") || palavra.contains("A")) {
            Integer qnt = 0;
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == 'a') {
                    System.out.println("a em minusculo na "+(i+1)+" letra da palavra "+palavra);
                    qnt++;
                }
                if (palavra.charAt(i) == 'A') {
                    System.out.println("a em maisculo na "+(i+1)+" letra da palavra "+palavra);
                    qnt++;
                }
            }
            System.out.println("'a's apareceram "+qnt+ " vezes na palavra "+palavra+"\n");
        }else{
            System.out.println("NÃO há 'a' na palavra "+palavra+"\n");
        }
    }

    public Stringtest(String ins){
        this.palavra = ins;
    }
}
