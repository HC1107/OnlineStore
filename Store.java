import java.util.ArrayList;
/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/
public class Store {
  private double profit;
  private ArrayList<ItemForSale> itemsForSale = new ArrayList<>();

  public Store() {
    this.profit = 0;
  }

  public void addItem(ItemForSale itemName) {
    itemsForSale.add(itemName);
  }

  public void sellItem(String itemName) {
    for (int i = 0; i < itemsForSale.size(); i++ ) {
      if (itemsForSale.get(i).getName().equals(itemName)) {
        profit += itemsForSale.get(i).getPrice();
        itemsForSale.remove(i);
        break;
      }
    }
  }

  public void showItems() {
    if (itemsForSale.size() <= 0) {
      System.out.println("No items available for sale.");
    }

    for (int i = 0; i < itemsForSale.size(); i++) {
      System.out.println(itemsForSale.get(i).toString());
    }
  }

  public String creator(String itemName) {
    for (ItemForSale item: itemsForSale) {
      if (item.getName().equals(itemName)) {
        if (item instanceof Book) {
          return ((Book) item).getAuthor().getName();
        }
        else if (item instanceof Movie) {
          return ((Movie) item).getCreator();
        }
      }
    }
    return "Item not found.";
  }

  public double getProfit() {
    return profit;
  }
}
