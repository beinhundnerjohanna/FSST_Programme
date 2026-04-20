package groceries.list;

public class ShoppingListProcessor {
    private String rawText;
    private String[] items;

    public ShoppingListProcessor(String rawText){
        this.rawText = rawText;
        processList();
    }

    public void processList(){
        items = new String[rawText.split(",").length];
        items = rawText.split(",");

        for (int i = 0; i < items.length; i++) {
            items[i]=items[i].trim().toUpperCase();
        }
    }

    public int getItemCount(){
        if(items==null){
            return -1;
        }

        return items.length;
    }

    public boolean containsItem(String item){
        for (int i = 0; i < items.length; i++) {
            if(items[i].equals(item)){
                return true;
            }
        }

        return false;
    }

    public String getLongestItem(){
        String longest = "";

        for (int i = 0; i < items.length; i++) {
            if(items[i].length()>longest.length()){
                longest = items[i];
            }
        }
        return longest;
    }

    public void printSummary(){
        for (int i = 0; i < items.length; i++) {
            System.out.println(i+1+". "+items[i]);
        }
    }
}
