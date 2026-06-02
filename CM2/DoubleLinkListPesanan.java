package CM2;

public class DoubleLinkListPesanan {
    NodePesanan head;
    NodePesanan tail;

    public DoubleLinkListPesanan(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addLast(Pesanan data){
        NodePesanan newNode = new NodePesanan(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortByName(){
        if (isEmpty() || head == tail) return;
        boolean swapped;
        NodePesanan current;
        do {
            swapped = false;
            current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void printLaporan(){
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        sortByName();

        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        NodePesanan current = head;
        int totalPendapatan = 0;

        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            totalPendapatan += current.data.harga;
            current = current.next;
        }
        System.out.println("======================================");
        System.out.println("Total Pendapatan: Rp " + totalPendapatan);
    }
}
