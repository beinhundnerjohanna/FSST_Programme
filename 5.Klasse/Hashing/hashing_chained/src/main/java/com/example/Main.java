package com.example;

public class Main {
    public static void main(String[] args) {

        int[] htSizes = { 10, 20, 30, 50,
                100, 200, 300, 500,
                1000, 2000, 3000, 5000,
                10000, 20000, 30000, 50000,
                100000, 200000, 300000, 500000, 1000000 };

        // Table erzeugen
        HashTable ht1 = new HashTable(7);

        // Elemente einfügen
        feedTable(ht1);
        ht1.print();
        
        HashTableEntry FoundCountry = ht1.find("China");
        if (FoundCountry != null)
            System.out.println(FoundCountry.country + " gefunden! Index: " + FoundCountry.key % 7);
        else
            System.out.println("nicht gefunden");

        System.out.println(ht1.countEmpty());
        System.out.println(ht1.countCollisions());
        System.out.println(ht1.maxLength());
        System.out.println(ht1.avgLength());

        for (int m : htSizes) {
            HashTable ht = new HashTable(m);

            feedTable(ht);

            // Anzahl der freien Stellen ermitteln
            int empty = ht.countEmpty();

            // Anzahl der Kollisionen ermitteln
            int collisions = ht.countCollisions();

            // Längste Liste ermitteln
            int maxLength = ht.maxLength();

            // Durschnittliche Länge ermitteln
            double avgLength = ht.avgLength();

            // Ausgeben der Tabelle
            System.out
                    .println("Size: " + m + " | Empty: " + empty + " | Collisions: " + collisions + " | Longest List: "
                            + maxLength + " | average Length:" + avgLength);
        }
    }

    /**
     * Funktion zum Befüllen der Hash-Table mit key-value-Paaren
     * 
     * @param table Hash-Table, die befüllt werden soll
     */
    public static void feedTable(HashTable table) {
        table.put(new HashTableEntry("Indien", 1425000000));
        table.put(new HashTableEntry("China", 1425000000));
        table.put(new HashTableEntry("USA", 333000000));
        table.put(new HashTableEntry("Indonesien", 275000000));
        table.put(new HashTableEntry("Pakistan", 235000000));
        table.put(new HashTableEntry("Nigeria", 218000000));
        table.put(new HashTableEntry("Brasilien", 215000000));
        table.put(new HashTableEntry("Bangladesch", 171000000));
        table.put(new HashTableEntry("Russland", 143000000));
        table.put(new HashTableEntry("Mexiko", 127000000));
        table.put(new HashTableEntry("Japan", 125000000));
        table.put(new HashTableEntry("Äthiopien", 123000000));
        table.put(new HashTableEntry("Philippinen", 115000000));
        table.put(new HashTableEntry("Ägypten", 111000000));
        table.put(new HashTableEntry("Kongo (Dem Rep)", 99000000));
        table.put(new HashTableEntry("Vietnam", 98000000));
        table.put(new HashTableEntry("Iran", 88000000));
        table.put(new HashTableEntry("Türkei", 85000000));
        table.put(new HashTableEntry("Deutschland", 84000000));
        table.put(new HashTableEntry("Thailand", 71000000));
        table.put(new HashTableEntry("Frankreich", 67000000));
        table.put(new HashTableEntry("Vereinigtes Königreich", 67000000));
        table.put(new HashTableEntry("Tansania", 65000000));
        table.put(new HashTableEntry("Südafrika", 59000000));
        table.put(new HashTableEntry("Italien", 58000000));
        table.put(new HashTableEntry("Myanmar", 54000000));
        table.put(new HashTableEntry("Kenia", 54000000));
        table.put(new HashTableEntry("Kolumbien", 51000000));
        table.put(new HashTableEntry("Südkorea", 51000000));
        table.put(new HashTableEntry("Spanien", 48000000));
        table.put(new HashTableEntry("Argentinien", 46000000));
        table.put(new HashTableEntry("Algerien", 45000000));
        table.put(new HashTableEntry("Sudan", 45000000));
        table.put(new HashTableEntry("Ukraine", 41000000));
        table.put(new HashTableEntry("Uganda", 47000000));
        table.put(new HashTableEntry("Irak", 42000000));
        table.put(new HashTableEntry("Polen", 38000000));
        table.put(new HashTableEntry("Kanada", 38000000));
        table.put(new HashTableEntry("Marokko", 37000000));
        table.put(new HashTableEntry("Saudi-Arabien", 36000000));
        table.put(new HashTableEntry("Usbekistan", 35000000));
        table.put(new HashTableEntry("Malaysia", 33000000));
        table.put(new HashTableEntry("Angola", 35000000));
        table.put(new HashTableEntry("Mosambik", 33000000));
        table.put(new HashTableEntry("Ghana", 33000000));
        table.put(new HashTableEntry("Jemen", 33000000));
        table.put(new HashTableEntry("Nepal", 30000000));
        table.put(new HashTableEntry("Venezuela", 28000000));
        table.put(new HashTableEntry("Madagaskar", 30000000));
        table.put(new HashTableEntry("Kamerun", 29000000));
        table.put(new HashTableEntry("Elfenbeinküste", 28000000));
        table.put(new HashTableEntry("Niger", 26000000));
        table.put(new HashTableEntry("Australien", 26000000));
        table.put(new HashTableEntry("Taiwan", 23500000));
        table.put(new HashTableEntry("Sri Lanka", 22000000));
        table.put(new HashTableEntry("Burkina Faso", 22000000));
        table.put(new HashTableEntry("Mali", 21000000));
        table.put(new HashTableEntry("Chile", 19000000));
        table.put(new HashTableEntry("Rumänien", 19000000));
        table.put(new HashTableEntry("Kasachstan", 19000000));
        table.put(new HashTableEntry("Sambia", 19000000));
        table.put(new HashTableEntry("Ecuador", 18000000));
        table.put(new HashTableEntry("Niederlande", 18000000));
        table.put(new HashTableEntry("Syrien", 18000000));
        table.put(new HashTableEntry("Guatemala", 18000000));
        table.put(new HashTableEntry("Senegal", 17000000));
        table.put(new HashTableEntry("Tschad", 17000000));
        table.put(new HashTableEntry("Somalia", 17000000));
        table.put(new HashTableEntry("Kambodscha", 17000000));
        table.put(new HashTableEntry("Zimbabwe", 16000000));
        table.put(new HashTableEntry("Süd-Sudan", 12000000));
        table.put(new HashTableEntry("Ruanda", 13000000));
        table.put(new HashTableEntry("Benin", 13000000));
        table.put(new HashTableEntry("Haiti", 11000000));
        table.put(new HashTableEntry("Tunesien", 12000000));
        table.put(new HashTableEntry("Belgien", 11500000));
        table.put(new HashTableEntry("Bolivien", 12000000));
        table.put(new HashTableEntry("Kuba", 11000000));
        table.put(new HashTableEntry("Jordanien", 11000000));
        table.put(new HashTableEntry("Griechenland", 10700000));
        table.put(new HashTableEntry("Tschechien", 10500000));
        table.put(new HashTableEntry("Dominikanische Republik", 11000000));
        table.put(new HashTableEntry("Portugal", 10000000));
        table.put(new HashTableEntry("Aserbaidschan", 10000000));
        table.put(new HashTableEntry("Schweden", 10000000));
        table.put(new HashTableEntry("Honduras", 10000000));
        table.put(new HashTableEntry("Ungarn", 9700000));
        table.put(new HashTableEntry("Vereinigte Arabische Emirate", 9500000));
        table.put(new HashTableEntry("Tadschikistan", 9500000));
        table.put(new HashTableEntry("Weißrussland", 9400000));
        table.put(new HashTableEntry("Österreich", 9100000));
        table.put(new HashTableEntry("Israel", 9300000));
        table.put(new HashTableEntry("Schweiz", 8800000));
        table.put(new HashTableEntry("Papua-Neuguinea", 9000000));
        table.put(new HashTableEntry("Togo", 8500000));
        table.put(new HashTableEntry("Sierra Leone", 8000000));
        table.put(new HashTableEntry("Libyen", 7000000));
        table.put(new HashTableEntry("Laos", 7400000));
        table.put(new HashTableEntry("Paraguay", 7000000));
        table.put(new HashTableEntry("Bulgarien", 6800000));
        table.put(new HashTableEntry("Serbien", 6700000));
        table.put(new HashTableEntry("Singapur", 5600000));
        table.put(new HashTableEntry("Dänemark", 5800000));
        table.put(new HashTableEntry("Finnland", 5600000));
        table.put(new HashTableEntry("Nicaragua", 6700000));
        table.put(new HashTableEntry("Kirgistan", 6700000));
        table.put(new HashTableEntry("Turkmenistan", 6000000));
        table.put(new HashTableEntry("El Salvador", 6300000));
        table.put(new HashTableEntry("Slowakei", 5400000));
        table.put(new HashTableEntry("Norwegen", 5400000));
        table.put(new HashTableEntry("Palästina", 5300000));
        table.put(new HashTableEntry("Costa Rica", 5100000));
        table.put(new HashTableEntry("Neuseeland", 5100000));
        table.put(new HashTableEntry("Irland", 5000000));
        table.put(new HashTableEntry("Liberia", 5200000));
        table.put(new HashTableEntry("Kuwait", 4300000));
        table.put(new HashTableEntry("Panama", 4300000));
        table.put(new HashTableEntry("Kroatien", 4000000));
        table.put(new HashTableEntry("Georgien", 3700000));
        table.put(new HashTableEntry("Eritrea", 3600000));
        table.put(new HashTableEntry("Uruguay", 3500000));
        table.put(new HashTableEntry("Moldawien", 2500000));
        table.put(new HashTableEntry("Mongolei", 3400000));
        table.put(new HashTableEntry("Bosnien und Herzegowina", 3300000));
        table.put(new HashTableEntry("Armenien", 3000000));
        table.put(new HashTableEntry("Litauen", 2800000));
        table.put(new HashTableEntry("Slowenien", 2100000));
        table.put(new HashTableEntry("Lettland", 1900000));
        table.put(new HashTableEntry("Estland", 1300000));
        table.put(new HashTableEntry("Zypern", 1200000));
        table.put(new HashTableEntry("Luxemburg", 660000));
        table.put(new HashTableEntry("Island", 380000));
        table.put(new HashTableEntry("Malta", 520000));
    }
}