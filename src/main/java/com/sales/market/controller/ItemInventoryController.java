/**
 * @author: Alex Yerson Gonzales Meneses.
 */

package com.sales.market.controller;

import com.sales.market.dto.ItemInventoryDto;
import com.sales.market.model.ItemInventory;
import com.sales.market.service.ItemInventoryEntryService;
import com.sales.market.service.ItemInventoryService;
import com.sales.market.service.GenericService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/iteminventorys")
public class ItemInventoryController extends GenericController<ItemInventory, ItemInventoryDto> {
    private ItemInventoryService service;

    public ItemInventoryController(ItemInventoryService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

//    @PostMapping
//    protected ItemInventoryDto save(@RequestBody ItemInventoryDto element) {
//        return toDto((ItemInventory) getService().save(toModel(element)));
//    }

    @GetMapping("/stock")
    protected ResponseEntity<List<ItemInventoryDto>> getStock() {
        return service.checkInventory().map(itemInventories -> new ResponseEntity<>(toDto(itemInventories), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}