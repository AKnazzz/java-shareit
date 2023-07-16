package ru.practicum.shareit.item.mapper;

import ru.practicum.shareit.item.dto.ItemDto;
import ru.practicum.shareit.item.model.Item;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ItemMapper {

    private ItemMapper() {
    }

    public static ItemDto itemToDto(Item item) {
        if (item == null) {
             throw new IllegalArgumentException("Item can not be null.");
        }

        return ItemDto.builder()
                .id(item.getId())
                .name(item.getName())
                .description(item.getDescription())
                .available(item.getAvailable())
                .owner(item.getOwner())
                .request(item.getRequest())
                .build();
    }

    public static Item dtoToItem(ItemDto itemDto) {
        if (itemDto == null) {
            throw new IllegalArgumentException("ItemDto can not be null.");
        }

        return Item.builder()
                .id(itemDto.getId())
                .name(itemDto.getName())
                .description(itemDto.getDescription())
                .available(itemDto.getAvailable())
                .owner(itemDto.getOwner())
                .request(itemDto.getRequest())
                .build();
    }

    public static List<ItemDto> listItemsToListDto(Collection<Item> items) {
        return items.stream().map(ItemMapper::itemToDto).collect(Collectors.toList());
    }

}