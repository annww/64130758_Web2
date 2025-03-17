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
	
	public String getBMICategory(double bmi, boolean isAsian) {
		if (isAsian) {
			if (bmi < 17.5) {
                return "Thiếu cân";
            } else if (bmi < 23) { // <= 22.99 có thể viết gọn
                return "Bình thường";
            } else if (bmi < 28) { // <= 27.99 có thể viết gọn
                return "Thừa cân";
            } else {
                return "Béo phì";
            }
		}
		 else { 
		        if (bmi < 18.5) {
		            return "Gầy";
		        } else if (bmi >= 18.5 && bmi < 25) {
		            return "Bình thường";
		        } else if (bmi >= 25 && bmi < 30) {
		            return "Thừa cân";
		        } else {
		            return "Béo phì";
		        }
		    }
		}
	}
