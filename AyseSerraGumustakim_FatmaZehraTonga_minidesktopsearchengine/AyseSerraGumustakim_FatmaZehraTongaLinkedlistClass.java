/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AyseSerraGumustakim_FatmaZehraTonga_minidesktopsearchengine;

import java.util.LinkedList;

/**
 *
 * @author EMRULLAH
 */

/*
public class AyseSerraGumustakim_FatmaZehraTongaLinkedlistClass {

    private LinkedList<String> fileNames;
    private LinkedList<Integer> frequencies;

    public AyseSerraGumustakim_FatmaZehraTongaLinkedlistClass() {
        fileNames = new LinkedList<>();
        frequencies = new LinkedList<>();
    }

    public void add(String fileName) {
        int index = fileNames.indexOf(fileName);
        if (index != -1) {
            int freq = frequencies.get(index);
            frequencies.set(index, freq + 1);
        } else {
            fileNames.add(fileName);
            frequencies.add(1);
        }
    }

    public LinkedList<String> getFileNames() {
        return fileNames;
    }

    public LinkedList<Integer> getFrequencies() {
        return frequencies;
    }
*/

public class  AyseSerraGumustakim_FatmaZehraTongaLinkedlistClass {

    private Node head;
    private LinkedList<String> fileNames;
    private LinkedList<Integer> frequencies;

    
    public AyseSerraGumustakim_FatmaZehraTongaLinkedlistClass() {
        head = null;
        fileNames = new LinkedList<>();
        frequencies = new LinkedList<>();
    }
    
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    
    public void add(String fileName) {
        int index = fileNames.indexOf(fileName);
        if (index != -1) {
            int freq = frequencies.get(index);
            frequencies.set(index, freq + 1);
        } else {
            fileNames.add(fileName);
            frequencies.add(1);
        }
    }
    
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAfter(String data, String search) {
        Node temp = head;

        while (temp != null && !temp.data.equals(search)) {
            temp = temp.next;
        }

        if (temp != null) {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            addLast(data);
        }
    }

    public boolean remove(String data) {
        if (head == null) {
            System.out.println("empty list !");
        } else {
            if (head.data.equals(data)) {
                head = head.next;
                return true;
            } else {
                Node temp = head.next;
                Node prev = head;

                while (temp != null && !temp.data.equals(data)) {
                    prev = temp;
                    temp = temp.next;
                }

                if (temp != null) {
                    prev.next = temp.next;
                    return true;
                } else {
                    System.out.println(data + " not found !");
                }
            }
        }
        return false;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int size() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    LinkedList<String> getFileNames() {
                return fileNames;

    }

    LinkedList<Integer> getFrequencies() {
                return frequencies;    }

    
    private static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
}


