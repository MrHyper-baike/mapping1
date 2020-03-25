package kg.megacom.mappers;

import kg.megacom.model.City;
import kg.megacom.model.House;
import kg.megacom.model.dto.CityHouse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClassMapper {
    ClassMapper INSTANCE= Mappers.getMapper(ClassMapper.class);
    @Mappings({
            @Mapping(source = "id", target = "cityId"),
            @Mapping(source = "name", target = "cityName"),
            @Mapping(source = "id", target = "houseId"),
            @Mapping(source = "name", target = "houseName")
    })
    CityHouse cityAndHouseToCytyDto (City city, House house);

}
