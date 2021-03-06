package com.minimerce.builder;

import com.minimerce.domain.order.detail.OrderOption;
import com.minimerce.domain.order.item.OrderItem;
import com.minimerce.domain.order.status.CancelStatus;
import com.minimerce.domain.order.status.OrderStatus;
import com.minimerce.domain.type.DealType;

import java.time.LocalDateTime;

/**
 * Created by gemini on 04/04/2017.
 */
public final class OrderItemBuilder {
    private Long id = 1L;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
    private String title = "Test Order Item";
    private DealType type = DealType.USABLE;
    private int salePrice = 1000;
    private int costPrice = 500;
    private OrderStatus status = OrderStatus.ORDERED;
    private CancelStatus cancelStatus = CancelStatus.NOT_CANCEL;
    private OrderOption option = new OrderOption();


    private OrderItemBuilder() {
    }

    public static OrderItemBuilder anOrderItem() {
        return new OrderItemBuilder();
    }

    public OrderItemBuilder withId(Long id) {
        this.id = id;
        return this;
    }
    public OrderItemBuilder withOption(OrderOption option) {
        this.option = option;
        return this;
    }

    public OrderItemBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderItemBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public OrderItemBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public OrderItemBuilder withType(DealType type) {
        this.type = type;
        return this;
    }

    public OrderItemBuilder withSalePrice(int salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    public OrderItemBuilder withCostPrice(int costPrice) {
        this.costPrice = costPrice;
        return this;
    }

    public OrderItemBuilder withStatus(OrderStatus status) {
        this.status = status;
        return this;
    }

    public OrderItemBuilder withCancelStatus(CancelStatus cancelStatus) {
        this.cancelStatus = cancelStatus;
        return this;
    }

    public OrderItem build() {
        OrderItem orderItem = new OrderItem();
        orderItem.setId(id);
        orderItem.setCreatedAt(createdAt);
        orderItem.setUpdatedAt(updatedAt);
        orderItem.setTitle(title);
        orderItem.setType(type);
        orderItem.setSalePrice(salePrice);
        orderItem.setCostPrice(costPrice);
        orderItem.setStatus(status);
        orderItem.setCancelStatus(cancelStatus);
        orderItem.setOption(option);
        return orderItem;
    }
}
