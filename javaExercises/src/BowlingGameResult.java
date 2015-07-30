import java.util.ArrayList;
import java.util.List;

public class BowlingGameResult implements BowlingGameResultCalculator {
	private final static int MAX_ROUNDS = 10;
	private final static int ALL_PINS = 10;
	
	public List<Round> rounds =  new ArrayList<Round>();
	int prevRollPoints = 10;
	
	@Override
	public void roll(int numberOfPins) {
		if(prevRollPoints != ALL_PINS && !rounds.isEmpty() && rounds.get(rounds.size() - 1).getSecondRollPoints() == null){
			rounds.get(rounds.size() - 1).setSecondRollPoints(numberOfPins);
		}
		else{
			rounds.add(new Round(numberOfPins));
		}
		prevRollPoints = numberOfPins;
	}

	@Override
	public int score() {
		if(rounds.size() <= MAX_ROUNDS){
			return countPoints(rounds.size());
		}
		return countPoints(MAX_ROUNDS);
	}

	@Override
	public boolean isFinished() {
		if(rounds.size() == 10 && !rounds.get(9).isBonus()){
			return true;
		}
		if(rounds.size() >= 11 && rounds.get(9).isBonus()){
			return true;
		}
		return false;
	}
	
	private int countPoints(int numberOfRounds){
		int points = 0;
		for(int i = 0; i < numberOfRounds; i++){
			if(rounds.get(i).isBonus()){
				if(rounds.get(i).isStrike() && rounds.get(i+1).isStrike()){
					points += rounds.get(i).sum(rounds.get(i+1), rounds.get(i+2));
				}
				else{
					points += rounds.get(i).sum(rounds.get(i+1));
				}
			}
			else{
				points += rounds.get(i).sum();
			}
		}			
		return points;
	}
}