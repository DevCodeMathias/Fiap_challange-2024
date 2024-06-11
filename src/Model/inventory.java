package Model;

import java.util.List;
import java.util.Stack;

public class inventory {
    private Stack<String> vr;

    public Stack<String> getVr() {
        return vr;
    }

    public void setVr(Stack<String> vr) {
        this.vr = vr;
    }

    public inventory() {

       this.vr = new Stack<>();
        for (int i = 0; i < 20; i++) {
            vr.push("Glass Vr");
        }
    }

    public  void popMaterial(){
        this.vr.pop();
    }

    public int returnAvailable() {
        if (vr != null) {
            return vr.size();
        }
        return 0;
    }

}


