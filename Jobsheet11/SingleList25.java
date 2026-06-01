package Jobsheet11;

public class SingleList25 {
    NodeMahasiswa25 head;
    NodeMahasiswa25 tail;

    boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if (!isEmpty()) {
            NodeMahasiswa25 tmp = head;
            System.out.println("Isi Linked list:\t");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa25 input){
        NodeMahasiswa25 ndInput = new NodeMahasiswa25(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa25 input){
        NodeMahasiswa25 ndInput = new NodeMahasiswa25(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa25 input){
        NodeMahasiswa25 ndInput = new NodeMahasiswa25(input, null);
        NodeMahasiswa25 temp = head;
        do {
            if (temp.data.nama.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
           
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa25 input){
        if (index < 0) {
            System.out.println("Index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa25 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa25(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
