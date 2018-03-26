package org.aks.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructInterface {
	
	MapStructInterface INSTANCE = Mappers.getMapper(MapStructInterface.class);
	
	@Mapping(source = "seatCount", target = "numberOfSeats" )
	Car CarDtoToCar(CarDto carDto);
	
}
