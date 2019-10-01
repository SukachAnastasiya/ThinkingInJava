package accesControl.number5;

public class IceCream {
    public String taste1;
    private String taste2;
    protected String taste3;

    public void IceCream1() {
        System.out.println("IceCream with " + taste1);
    }

    private void IceCream2() {
        System.out.println("IceCream with " + taste2);
    }

    protected void IceCream3() {
        System.out.println("IceCream with " + taste3);
    }
    protected void bite(){
        System.out.println("bite()");
    }

}

