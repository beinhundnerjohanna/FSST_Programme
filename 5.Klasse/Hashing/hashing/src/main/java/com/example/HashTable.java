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
        table[idx] = entry;
    }
    
    public HashTableEntry get(int key) {
        int idx = hash(key);
        return table[idx];
    }

    public void print(){
        for(int i=0; i< table.length;i++){
            if(table[i] != null)
                System.out.println("Index: "+i+" Key: "+table[i].key+" Value: "+table[i].value);
        }
    }

    public HashTableEntry find(String value){
        int key = HashTableEntry.shiftedSum(value);
        return get(key);
    }
}
