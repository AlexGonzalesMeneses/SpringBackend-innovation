/**
 * @author: Alex Yerson Gonzales Meneses.
 */

package com.sales.market.service;

import com.sales.market.model.ItemInventory;
import com.sales.market.model.ItemInventoryEntry;

import java.util.List;
import java.util.Optional;

public interface ItemInventoryService extends GenericService<ItemInventory> {
    Optional<List<ItemInventory>> checkInventory();
    ItemInventory updateInventory(ItemInventoryEntry itemInventoryEntry);
}