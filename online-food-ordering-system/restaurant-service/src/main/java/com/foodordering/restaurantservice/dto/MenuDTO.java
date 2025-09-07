package com.foodordering.restaurantservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuDTO {
    private Long id;

    private String name;

    private String description;

    private Long restaurantId;

}
