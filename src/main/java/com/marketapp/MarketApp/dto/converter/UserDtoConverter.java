package com.marketapp.MarketApp.dto.converter;

import com.marketapp.MarketApp.dto.UserDto;
import com.marketapp.MarketApp.model.BasketProduct;
import com.marketapp.MarketApp.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class UserDtoConverter {


    public UserDto convertUserToUserDto(User from) {
        return new UserDto(
                from.getId(),
                from.getName(),
                from.getSurname(),
                Objects.requireNonNullElse(from.getProductList(), new ArrayList<>()));


    }

}
