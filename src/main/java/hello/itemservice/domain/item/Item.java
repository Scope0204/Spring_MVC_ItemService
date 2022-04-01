package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item {

    private Long id;
    private String itemName;
    private Integer price; // int는 Null이 들어가지 않기때문
    private Integer quantity;

    public Item(){
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
