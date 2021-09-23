/**
 * @author: Alex Yerson Gonzales Meneses.
 */

package com.sales.market.service;

import com.sales.market.model.ItemInventoryEntry;
import com.sales.market.repository.GenericRepository;
import com.sales.market.repository.ItemInventoryEntryRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemInventoryEntryServiceImpl extends GenericServiceImpl<ItemInventoryEntry> implements ItemInventoryEntryService {
    private final ItemInventoryEntryRepository repository;
    private final ItemInventoryService itemInventoryService;
    private final ItemInstanceService itemInstanceService;

    public ItemInventoryEntryServiceImpl(ItemInventoryEntryRepository repository, ItemInventoryService itemInventoryService, ItemInstanceService itemInstanceService) {
        this.repository = repository;
        this.itemInventoryService = itemInventoryService;
        this.itemInstanceService = itemInstanceService;
    }

    @Override
    protected GenericRepository<ItemInventoryEntry> getRepository() {
        return repository;
    }

    @Override
    public ItemInventoryEntry save(ItemInventoryEntry itemInventoryEntry) {
        super.save(itemInventoryEntry);
        itemInventoryService.updateInventory(itemInventoryEntry);
        return repository.save(itemInventoryEntry);
    }
}