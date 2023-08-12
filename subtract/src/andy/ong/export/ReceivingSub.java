package andy.ong.export;

import andy.ong.subtract.Subtractor;

public class ReceivingSub {

    public int receiver(int k, int p) {
        Subtractor receivingSub = new Subtractor();
        return receivingSub.subtracting(k,p);
    }
}
