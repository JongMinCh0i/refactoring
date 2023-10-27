package me.whiteship.refactoring._09_feature_envy;

// 기능 편애 클래스
public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    public double calculateBill() {
        return electricityUsage.getBill() + gasUsage.getGasBill();
    }

    private double getBill() {
        return gasUsage.getAmount() * gasUsage.getPricePerUnit();
    }


}
