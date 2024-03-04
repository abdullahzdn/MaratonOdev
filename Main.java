//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] names = {"enes","mustafa","hamit","mehmet","muhammet"};
        int [] minutes = {170,420,340,530,365};
        Maratonodev m1 = new Maratonodev(names,minutes);
        m1.displayAllMessages();
    }
}