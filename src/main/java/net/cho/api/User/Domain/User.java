package net.cho.api.User.Domain;
import lombok.Data;
import net.cho.api.order.Domain.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="users")

public class User {
    @Id @Column(name="user_id")
    private long userid;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "reg_date")
    private String regDate;

    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();


}
