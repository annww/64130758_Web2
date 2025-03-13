package ntu.hongdta.service;

import org.springframework.stereotype.Service;

@Service
public class BMIService {
	public double calculateBMI(double weight, double height) {
		if(height<= 0 || weight <= 0) {
			return 0;
		}
		double bmi = weight/(height*height);
		return Math.round(bmi*100.0)/100.0;
	}
	
	public String getBMICategory(double bmi) {
		if(bmi > 18.5f) {
			return "Bình thường";
		}
		else if(bmi >= 25) {
			return "Thừa cân";
		}
		else if (bmi >= 30) {
			return "Béo phì";
		}
		else return "Gầy";
	}
}
