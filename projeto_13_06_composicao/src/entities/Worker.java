package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<HourContract>();

	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department,
			List<HourContract> contracts) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int month, int year) {
		
		Calendar calendar = Calendar.getInstance();
		double sum = baseSalary;
		
		for (HourContract contract : contracts) {
			calendar.setTime(contract.getDate());
			int contractYear = calendar.get(Calendar.YEAR);
			int contractMonth = 1 + calendar.get(Calendar.MONTH);
			
			if (contractMonth == month && contractYear == year) {
				sum += contract.totalValue();
			}
		}
		
		return sum;
	}
}
