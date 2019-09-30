package innerClasses.number6.base;
import innerClasses.number6.interfase.Base;


public class Outer {
    protected class Inner implements Base{
        public Inner(){}
        private String name="Mark";
        @Override
        public String setName() {
            return name;
        }
    }
}
