package br.com.dayanemt.dentistmanager.model;

import br.com.dayanemt.dentistmanager.enums.ItemType;
import br.com.dayanemt.dentistmanager.enums.Units;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class StorageItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Double quantity;

    private Double unityCostPrice;

    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    @Enumerated(EnumType.STRING)
    private Units unit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StorageItem storageItem = (StorageItem) o;
        return Objects.equals(id, storageItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

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

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
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
