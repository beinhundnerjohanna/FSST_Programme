package groceries.list;

public class Main {
    public static void main(String[] args) {
        ShoppingListProcessor groceries = new ShoppingListProcessor("Brot, Milch, Eier, Kaffee");
        String item = "Eier";

        System.out.println("Elements on list: "+groceries.getItemCount());
        System.out.println("Longest Item on List: "+groceries.getLongestItem());

        if(groceries.containsItem(item.toUpperCase()))
            System.out.println("'"+item+"' is on the list");
        else
            System.out.println("'"+item+"' is NOT on the list");

        groceries.printSummary();
    }
}