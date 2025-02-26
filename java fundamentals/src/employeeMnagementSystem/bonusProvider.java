package employeeMnagementSystem;

public interface bonusProvider {
	
	double bonus_percentage = 0.10;
	
    double calculateBonus(double salary);
}
