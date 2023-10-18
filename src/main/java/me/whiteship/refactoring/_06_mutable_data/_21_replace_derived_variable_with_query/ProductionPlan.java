package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    private List<Double> adjustments = new ArrayList<>();
//    : 계산을 통해서 얻게 되는 값은 변수가 아닌 계산 식으로 두는것이 좋다.
//       그리고 그 계산 식은 함수로 제공되는것이 제일 좋다.
//    private double production;

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
//        this.production += adjustment;
    }

    public double getProduction() {
        return this.adjustments.stream().mapToDouble(Double::valueOf).sum();
    }
}
