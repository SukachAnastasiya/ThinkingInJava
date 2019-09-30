package innerClasses.number8;

public class ITry {
    void call(){
        Risk risk=new Risk();
        System.out.println(risk.you);
    }
    class Risk{
        private String you="Oh shit";
    }

    public static void main(String[] args) {
        ITry attempt = new ITry();
        attempt.call();
    }
}
