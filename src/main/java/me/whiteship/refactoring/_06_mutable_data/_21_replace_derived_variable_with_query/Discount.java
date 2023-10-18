package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

public class Discount {

    //    private double discountedTotal; // 기존의 변수에 대해서 파생된 변수. 최대한 제거하는 것이 좋음
    private double discount;

    private double baseTotal;

    public Discount(double baseTotal) {
        this.baseTotal = baseTotal;
    }

    public double getDiscountedTotal() {
        return this.baseTotal - this.discount;
    }

    public void setDiscount(double number) {
        this.discount = number;
    }
}
