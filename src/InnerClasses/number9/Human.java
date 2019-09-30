package innerClasses.number9;
import innerClasses.number9.Processing;

public class Human {
    Processing hasLiver(){
//        Processing processing=new Liver();
//        return processing;
       return new Liver();
       }
       Processing hasNotLiver(){
        Processing processing=new Liver();
        Liver liver=(Liver)processing;
        return liver;
       }
    private class Liver implements Processing{
        public void alcohol(){
            System.out.println("I'm filtrating alcohol");
        }
    }
}
