import java.util.Scanner;

public class BMICalculator 
{
	public static void main(String[] args) 
	{
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	
	public void readUserData()
	{
		readMeasurementData(readUnitType());
	}
	
	boolean i = true;
	double weight;
	double height;
	int category;
	double bmi;
	
	private String readUnitType()
	{
		String unitType;
		System.out.println("Enter m or i for either metric or imperial calculations");
		Scanner keyboard = new Scanner(System.in);
		
		unitType = keyboard.nextLine();
		keyboard.close();
		if (unitType == "m")
		{
			return "m";
		}
		else if (unitType == "i")
		{
			return "i";
		}
		else
		{
			return "n";
		}
	}
	
	private void readMeasurementData(String unitType)
	{
		if (unitType == "m")
		{
			i = true;
			readMetricData();
		}
		
		if (unitType == "i")
		{
			i = false;
			readImperialData();
		}
	}
	
	private void readMetricData()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your weight in kilograms");
		weight = keyboard.nextDouble();
		
		System.out.println("Enter your height in meters");
		height = keyboard.nextDouble();
		
		keyboard.close();
	}
	
	private void readImperialData()
	{		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your weight in pounds");
		weight = keyboard.nextDouble();
		
		System.out.println("Enter your height in inches");
		height = keyboard.nextDouble();
		
		keyboard.close();
	}
	
	public void calculateBmi()
	{
		
		if (i == true)
		{
			bmi = getWeight() / getHeight();
			category = calculateBmiCategory(bmi);
		}
		else
		{
			bmi = (703 * getWeight()) / getHeight();
			category = calculateBmiCategory(bmi);
		}
			
	}
	
	private int calculateBmiCategory(double bmi)
	{
		int bmiCategory = 0;
		
		if (bmi <= 18.5)
		{
			bmiCategory = 1;
		}
		else if (bmi > 18.5 || bmi <= 24.9)
		{
			bmiCategory = 2;
		}
		else if (bmi >= 25 || bmi < 30)
		{
			bmiCategory = 3;
		}
		else if (bmi >= 30)
		{
			bmiCategory = 4;
		}
		
		
		return bmiCategory;
		
	}
	
	public void displayBmi()
	{
		System.out.println("Your BMI is" + bmi);
		
		if (getBmiCategory() == 1)
		{
			System.out.println("Your BMI Category is Underweight");
		}
		
		if (getBmiCategory() == 2)
		{
			System.out.println("Your BMI Category is Normal Weight");
		}
		if (getBmiCategory() == 3)
		{
			System.out.println("Your BMI Category is Overweight");
		}
		if (getBmiCategory() == 4)
		{
			System.out.println("Your BMI Category is Obese");
		}
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public int getBmiCategory()
	{
		return category;
	}
}

