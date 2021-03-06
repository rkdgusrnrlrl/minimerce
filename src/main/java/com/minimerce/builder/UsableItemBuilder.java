package com.minimerce.builder;

import com.minimerce.domain.item.UsableItem;

import java.time.LocalDateTime;

/**
 * Created by gemini on 18/04/2017.
 */
public final class UsableItemBuilder {
    protected Long id = 1L;
    protected LocalDateTime createdAt = LocalDateTime.now();
    protected LocalDateTime updatedAt = LocalDateTime.now();
    private Long clientId = 1L;
    private String name = "test-usable-item";
    private int salePrice = 1000;
    private int costPrice = 500;
    private int stock = 50;
    private int usableCount = 1;
    private LocalDateTime availableStartAt = LocalDateTime.now();
    private LocalDateTime availableEndAt = LocalDateTime.now();

    private UsableItemBuilder() {
    }

    public static UsableItemBuilder anUsableItem() {
        return new UsableItemBuilder();
    }

    public UsableItemBuilder withClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }

    public UsableItemBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UsableItemBuilder withSalePrice(int salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    public UsableItemBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public UsableItemBuilder withCostPrice(int costPrice) {
        this.costPrice = costPrice;
        return this;
    }

    public UsableItemBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public UsableItemBuilder withStock(int stock) {
        this.stock = stock;
        return this;
    }

    public UsableItemBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public UsableItemBuilder withUsableCount(int usableCount) {
        this.usableCount = usableCount;
        return this;
    }

    public UsableItemBuilder withAvailableStartAt(LocalDateTime availableStartAt) {
        this.availableStartAt = availableStartAt;
        return this;
    }

    public UsableItemBuilder withAvailableEndAt(LocalDateTime availableEndAt) {
        this.availableEndAt = availableEndAt;
        return this;
    }

    public UsableItem build() {
        UsableItem usableItem = new UsableItem();
        usableItem.setClientId(clientId);
        usableItem.setName(name);
        usableItem.setSalePrice(salePrice);
        usableItem.setId(id);
        usableItem.setCostPrice(costPrice);
        usableItem.setCreatedAt(createdAt);
        usableItem.setStock(stock);
        usableItem.setUpdatedAt(updatedAt);
        usableItem.setUsableCount(usableCount);
        usableItem.setAvailableStartAt(availableStartAt);
        usableItem.setAvailableEndAt(availableEndAt);
        return usableItem;
    }
}
