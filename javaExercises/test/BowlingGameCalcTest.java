import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingGameCalcTest {

	@Test
	public void whenRoll5ThenScore5() {
		BowlingGameResult game = new BowlingGameResult();
		game.roll(5);
		assertEquals(5, game.score());
	}
	
	@Test
	public void whenRoll5Roll3ThenScore8() {
		BowlingGameResult game = new BowlingGameResult();
		game.roll(3);
		game.roll(5);
		assertEquals(8, game.score());
	}
	
	@Test
	public void whenRoll10Roll3Roll4ThenScore24() {
		BowlingGameResult game = new BowlingGameResult();
		game.roll(10);
		game.roll(3);
		game.roll(4);
		assertEquals(24, game.score());
	}
	
	@Test
	public void whenRoll7Roll3Roll4ThenScore18() {
		BowlingGameResult game = new BowlingGameResult();
		game.roll(7);
		game.roll(3);
		game.roll(4);
		assertEquals(18, game.score());
	}
	
	@Test
	public void whenRoll10Roll10Roll4Roll1ThenScore44() {
		BowlingGameResult game = new BowlingGameResult();
		game.roll(10);
		game.roll(10);
		game.roll(4);
		game.roll(1);
		assertEquals(44, game.score());
	}
	
	@Test
	public void whenRoll7Roll3Roll10Roll1Roll2ThenScore36() {
		BowlingGameResult game = new BowlingGameResult();
		game.roll(7);
		game.roll(3);
		game.roll(10);
		game.roll(1);
		game.roll(2);
		assertEquals(36, game.score());
	}
	
	@Test
	public void whenRoll10Roll6Roll4Roll1ThenScore32() {
		BowlingGameResult game = new BowlingGameResult();
		game.roll(10);
		game.roll(6);
		game.roll(4);
		game.roll(1);
		assertEquals(32, game.score());
	}
	
	@Test
	public void shouldIsFinishedWhenHaveNotBonusInTenRoundThenTrue() {
		BowlingGameResult game = new BowlingGameResult();
		for(int i = 0; i < 10; i++){
			game.roll(2);
			game.roll(3);			
		}
		assertEquals(true, game.isFinished());
	}
	
	@Test
	public void shouldIsFinishedWhenHaveSpareInTenRoundThenTrue(){
		BowlingGameResult game = new BowlingGameResult();
		for(int i = 0; i < 9; i++){
			game.roll(2);
			game.roll(3);			
		}
		game.roll(6);
		game.roll(4);
		game.roll(3);
		assertEquals(true, game.isFinished());
	}
	
	@Test
	public void shouldIsFinishedWhenHaveStrikeInTenRoundThenTrue(){
		BowlingGameResult game = new BowlingGameResult();
		for(int i = 0; i < 9; i++){
			game.roll(2);
			game.roll(3);			
		}
		game.roll(10);
		game.roll(5);
		game.roll(5);
		assertEquals(true, game.isFinished());
	}
	
	@Test
	public void fullGameTestOneWhenHaveNotBonus(){
		BowlingGameResult game = new BowlingGameResult();
		for(int i = 0; i < 10; i++){
			game.roll(2);
			game.roll(3);			
		}
		assertEquals(50, game.score());
	}
	
	@Test
	public void fullGameTestOneWhenHaveSpareInTenRound(){
		BowlingGameResult game = new BowlingGameResult();
		for(int i = 0; i < 9; i++){ 
			game.roll(2);
			game.roll(3);
		} //score = 45
		game.roll(6);
		game.roll(4);
		game.roll(2);
		assertEquals(57, game.score());
	}
	
	@Test
	public void fullGameTestOneWhenHaveStrikeInTenRound(){
		BowlingGameResult game = new BowlingGameResult();
		for(int i = 0; i < 9; i++){
			game.roll(2);
			game.roll(3);
		}
		game.roll(10);
		game.roll(10);
		game.roll(5);
		assertEquals(70, game.score());
	}
	
	@Test
	public void fullGameTestOnlyStrikeInGame(){
		BowlingGameResult game = new BowlingGameResult();
		
		for(int i = 0; i < 12; i++){
			game.roll(10);
		}
		assertEquals(300, game.score());
	}

}
