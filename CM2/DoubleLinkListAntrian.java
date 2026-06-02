package CM2;

public class DoubleLinkListAntrian {
    NodeAntrian head;
    NodeAntrian tail;
    int counterAntrian = 1;

    public DoubleLinkListAntrian(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addLast(Pembeli data){
        NodeAntrian newNode = new NodeAntrian(data, counterAntrian++);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + (counterAntrian -1));
    }

    public NodeAntrian removeFirst(){
        if (isEmpty()) {
            return null;
        } 

        NodeAntrian removeNode = head;
        
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return removeNode;

    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        }

        System.out.println("======================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("======================================");
        System.out.printf("%-15s %-15s %-15s\n", "No Antrian", "Nama", "No HP");

        NodeAntrian current = head;
        while (current != null) {
            System.out.printf("%-15d %-15s %-15s\n", current.noAntrian, current.data.namaPembeli, current.data.noHp);
            current = current.next;
        }
    }

    

}
