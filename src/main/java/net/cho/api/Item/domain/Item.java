package net.cho.api.Item.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.cho.api.order.Domain.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
@Table(name="items")

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Item_id")
    private long itemId;

    @Column(name = "item_brand")
    private String itemBrand;

    @Column(name = "model_no")
    private String modelNo;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_color")
    private String itemColor;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "sold_out")
    private Boolean soldOut;

    @OneToMany(mappedBy = "item")
    private List<Order> orders = new ArrayList<>();

    @Builder
    public Item(String itemBrand, String itemName,String itemColor){
        this.itemBrand = itemBrand;
        this.itemName = itemName;
        this.itemColor = itemColor;
    }
    @Override public String toString(){
        return String.format("아이템 스펙: %s, %s, %s ",itemBrand, itemName,itemColor);}
}
