package br.com.dayanemt.dentistmanager.controller.dto;

import br.com.dayanemt.dentistmanager.enums.ItemType;
import br.com.dayanemt.dentistmanager.enums.Units;

public class StorageItemDTO {

    private Long id;
    private String description;

    private Double storageQuantity;
    private Double unityCostPrice;

    private ItemType itemType;
    private Units unit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getStorageQuantity() {
        return storageQuantity;
    }

    public void setStorageQuantity(Double storageQuantity) {
        this.storageQuantity = storageQuantity;
    }

    public Double getUnityCostPrice() {
        return unityCostPrice;
    }

    public void setUnityCostPrice(Double unityCostPrice) {
        this.unityCostPrice = unityCostPrice;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Units getUnit() {
        return unit;
    }

    public void setUnit(Units unit) {
        this.unit = unit;
    }
}
