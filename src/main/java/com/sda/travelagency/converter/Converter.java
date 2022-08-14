package com.sda.travelagency.converter;

public interface Converter <E, D> {

    D fromEntityToDto(E entity);

    E fromDtoToEntity(D dto);
}
