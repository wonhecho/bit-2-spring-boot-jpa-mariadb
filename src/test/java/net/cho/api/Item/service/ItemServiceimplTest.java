package net.cho.api.Item.service;

import net.cho.api.Item.domain.Item;
import net.cho.api.Item.repository.Itemrepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.BDDMockito.given;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ItemServiceimplTest {
    private ItemServiceimpl itemService;
    @Mock
    Itemrepository itemrepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
        itemService = new ItemServiceimpl(itemrepository);

    }
    @Test
    void findAll() {
        Item item = Item.builder().itemBrand("A").itemName("B").itemColor("C").build();
//        given(itemService.findAll().size()).willReturn(1);
        assertThat(item.getItemName(), is(equalTo("B")));

    }

    @Test
    void save() {
    }

    @Test
    void findById() {
    }

    @Test
    void existsById() {
    }

    @Test
    void count() {
    }

    @Test
    void deleteAll() {
    }

    @Test
    void deleteById() {
    }
}