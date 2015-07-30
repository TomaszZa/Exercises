public class Round {
	private Integer firstRollPoints;
	private Integer secondRollPoints;
	private final static int ALL_PINS = 10; 
	
	public Integer getSecondRollPoints(){
		return secondRollPoints;
	}
	
	public void setSecondRollPoints(Integer secondRollPoints){
		this.secondRollPoints = secondRollPoints;
	}
	
	public Round(int firstRollPoints){
		this.firstRollPoints = firstRollPoints;
		this.secondRollPoints = null;
	}
	
	public int sum(){
		if(secondRollPoints == null){
			return firstRollPoints;			
		}
		return firstRollPoints + secondRollPoints;		
	}
	
	public int sum(Round nextRound){
		if(this.isSpare()){
			return this.sum() + nextRound.firstRollPoints;			
		}
		return this.sum() + nextRound.sum();
	}
	
	public int sum(Round firstNextRound, Round secondNextRound){
		return this.sum() + firstNextRound.sum() + secondNextRound.firstRollPoints;
	}
	
	public boolean isStrike(){
		if(firstRollPoints == ALL_PINS){
			return true;			
		}
		return false;	
	}
	
	public boolean isSpare(){
		if(secondRollPoints != null && firstRollPoints + secondRollPoints == ALL_PINS){
			return true;			
		}
		return false;
	}
	
	public boolean isBonus(){
		if(this.isSpare() || this.isStrike()){
			return true;			
		}
		return false;
	}
}
