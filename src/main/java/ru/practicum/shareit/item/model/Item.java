package ru.practicum.shareit.item.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.coyote.Request;
import ru.practicum.shareit.user.model.User;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Long id;
    private String name;
    private String description;
    private Boolean available;
    private User owner;
    private Request request;

}
