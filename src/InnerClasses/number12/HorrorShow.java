package innerClasses.number12;
interface Monster{
    void menace();
    void destroy();
}

interface Lethal{
    void kill();
}

public class HorrorShow {
    public Monster DangerousMonster(){
        return new Monster() {
            @Override
            public void menace() {}
            public void destroy(){}
        };
    }
    public  Lethal vampire(){
        return new Lethal() {
            @Override
            public void kill() {
            }
            void drinkBlood(){}
        };
    }
    class DragonZilla {
        public void menace(){}
        public void destroy() {}
    }

    class VeryBadVampire {
        public void menace(){}
        public void destroy() {}
        public void kill() {}
        public void drinkBlood() {}
    }

    static void u(Monster b){b.menace();}
    static void v(HorrorShow d){
        d.DangerousMonster().menace();
        d.DangerousMonster().destroy();
    }
    static void w(Lethal l){l.kill();}

    public static void main(String[] args) {
//        Monster barney = new DragonZilla();
//        u(barney);
//        v(barney);
//        Vampire vlad = new VeryBadVampire();
//        u(vlad);
//        v(vlad);
//        w(vlad);
    }
}
