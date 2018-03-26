package org.aks.mapstruct;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MapstructTest {

	@Test
	public void shouldMapCarToDto() {
		// given
		CarDto carDto = new CarDto("Tesla", 3, "Sedan");

		// when
		Car car = MapStructInterface.INSTANCE.CarDtoToCar(carDto);

		// then
		//assertEquals(car.getMake(), "Tesla");
		/*
		 * assertThat( car ).isNotNull(); assertThat( car.getMake() ).isEqualTo(
		 * "Morris" ); assertThat( car.getSeatCount() ).isEqualTo( 5 ); assertThat(
		 * car.getType() ).isEqualTo( "SEDAN" );
		 */
	}
}
