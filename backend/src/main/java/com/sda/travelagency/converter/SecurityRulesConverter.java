package com.sda.travelagency.converter;

import com.sda.travelagency.dto.SecurityRulesDto;
import com.sda.travelagency.entity.SecurityRules;
import org.springframework.stereotype.Component;

@Component
public class SecurityRulesConverter implements Converter<SecurityRules, SecurityRulesDto> {

    @Override
    public SecurityRulesDto fromEntityToDto(SecurityRules entity) {
        return new SecurityRulesDto(entity.getTravelRestrictions(), entity.getInsurance());
    }

    @Override
    public SecurityRules fromDtoToEntity(SecurityRulesDto dto) {
        return new SecurityRules(dto.travelRestrictions(), dto.insurance());
    }
}
