package com.movie.ticketbooking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest
class MovieticketbookingApplicationTests {

	@Test
	void contextLoads() {
	}




}






//@Autowired
//private SeatService seatService;
//
//@Autowired
//private SeatRepo seatRepo;
//
//@Test
//void bookSeatTest() {
//	Seat demoSeat = new Seat(101, "A23", "Deluxe",350.0,new Ticket());
//	Seat newSeat = seatService.bookSeat(demoSeat);
//	assertEquals(demoSeat.getSeatId(), newSeat.getSeatId());
//}
//
//@Test
//void deleteSeatTest() {
//	seatRepo.deleteById(68);
//	assertThat(seatRepo.existsById(68));
//}
//
//private void assertThat(boolean existsById) {
//	// TODO Auto-generated method stub
//	
//}