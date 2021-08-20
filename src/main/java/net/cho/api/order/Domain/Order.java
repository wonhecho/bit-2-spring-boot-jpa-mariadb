package net.cho.api.order.Domain;

import lombok.Data;
import net.cho.api.Item.domain.Item;
import net.cho.api.User.Domain.User;

import javax.persistence.*;

@Entity
@Data
@Table(name="orders")

public class Order {
    @Id @Column(name="order_id")
    private long orderId;

    @Column(name="price")
    private long price;

    @Column(name = "order_status")
    private String count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="item_id")
    private Item item;

}
