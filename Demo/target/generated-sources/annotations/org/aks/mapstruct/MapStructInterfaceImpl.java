package org.aks.mapstruct;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-03-18T01:06:12+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_161 (Oracle Corporation)"
)
public class MapStructInterfaceImpl implements MapStructInterface {

    @Override
    public Car CarDtoToCar(CarDto carDto) {
        if ( carDto == null ) {
            return null;
        }

        Car car = new Car();

        car.setNumberOfSeats( carDto.getSeatCount() );
        car.setMake( carDto.getMake() );
        if ( carDto.getType() != null ) {
            car.setType( Enum.valueOf( CarType.class, carDto.getType() ) );
        }

        return car;
    }
}
