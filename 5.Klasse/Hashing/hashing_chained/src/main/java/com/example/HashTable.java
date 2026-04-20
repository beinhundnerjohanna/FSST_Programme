package com.example;

public class HashTable {
    HashTableEntry[] table;

    public HashTable(int M) {
        table = new HashTableEntry[M];
    }

    private int hash(int hashValue) {
        int index = hashValue % table.length;
        if (index < 0) {
            index = -index;
        }
        return index;
    }

    public void put(HashTableEntry entry) {
        int idx = hash(entry.key);

        if (table[idx] != null) {
            entry.next = table[idx];
        }
        table[idx] = entry;

    }

    public HashTableEntry get(int key) {
        int idx = hash(key);

        HashTableEntry tmp = table[idx];
        while (true) {
            // nichts da?
            if (tmp == null) {
                return null;
            } else if (tmp.key == key) {
                return tmp;
            } else {
                tmp = tmp.next;
            }
        }
    }

    public HashTableEntry find(String value) {
        int key = HashTableEntry.shiftedSum(value);
        return get(key);
    }

    public void print() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                System.out.printf("[%2d]", i);
                table[i].print();
            }
        }
    }

    public int countEmpty() {
        int empty = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                empty++;
            }
        }
        return empty;
    }

    public int countCollisions() {
        int collisions = 0;
        HashTableEntry tmp;
        for (int i = 0; i < table.length; i++) {
            tmp = table[i];
            while (tmp != null) {
                if (tmp.next != null) {
                    collisions++;
                }
                tmp = tmp.next;
            }
        }
        return collisions;
    }

    public int maxLength(){
        int max = 0;
        HashTableEntry tmp;
        for (int i = 0; i < table.length; i++) {
            int count = 0;
            if(table[i]!=null)
                count++;

            tmp = table[i];
            while (tmp != null) {
                if (tmp.next != null) {
                    count++;
                }else{
                    if(count > max){
                        max = count;
                    }
                }
                tmp = tmp.next;
            }
        }
        return max;
    }

    public float avgLength(){
        float avg = 0;
        int count;
        int listenAnzahl = 0;
        HashTableEntry tmp;
 
        for(int i = 0; i< table.length;i++){
            if(table[i] != null){
                count = 1;
                listenAnzahl ++;
               
                tmp = table[i];
                while(tmp.next != null){
                    count ++;
                    tmp = tmp.next;
                }
                avg += count;
            }
        }
        return avg / listenAnzahl;
    }
}
