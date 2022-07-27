import java.awt.*;

public class Hello {
    public static void main(String[] args) {
        Hello h=new Hello();
        h.buildInvite();
    }
    public void buildInvite(){
        Frame f=new Frame();
        Label l=new Label("Party at Tim's");
        Button b=new Button("you bet");
        Button c=new Button("show me");
        Panel p=new Panel();
        p.add(l);
    }
}
