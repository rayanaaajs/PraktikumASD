package CM2;

public class NodeAntrian {
    Pembeli data;
    int noAntrian;
    NodeAntrian next;
    NodeAntrian prev;

    public NodeAntrian(Pembeli data, int noAntrian){
        this.data = data;
        this.noAntrian = noAntrian;
        this.next = null;
        this.prev = null;
    }

}
