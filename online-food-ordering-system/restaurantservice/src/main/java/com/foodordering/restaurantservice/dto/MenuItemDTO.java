package com.foodordering.restaurantservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuItemDTO {
    private Long id;

    private String name;

    private Long price;

    private String description;

    private boolean isAvailable;

    private Long menuId;
}
