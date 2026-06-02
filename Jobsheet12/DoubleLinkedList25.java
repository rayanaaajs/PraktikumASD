package Jobsheet12;

public class DoubleLinkedList25 {
    Node25 head;
    Node25 tail;

    public DoubleLinkedList25(){
        head = null;
        tail = null;

    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Mahasiswa25 data){
        Node25 newNode = new Node25(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;    
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa25 data){
        Node25 newNode = new Node25(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa25 data){
        Node25 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        Node25 newNode = new Node25(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { //node baru disisipkan ditengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);

        
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node25 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        Node25 current = tail;
        System.out.println("data dicetak dari belakang kedepan");
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        Mahasiswa25 dataDihapus = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Data berhasil dihapus:");
        dataDihapus.tampil();
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        Mahasiswa25 dataDihapus = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        System.out.println("Data berhasil dihapus:");
        dataDihapus.tampil();
    }


}
