package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

// 생성자를 통해서 받아들이고 세터가 없고 모든 필드가 전부 final 인 경우

import java.time.Month;
import java.time.Year;

public record Reading(String customer, double quantity, Month month, Year year) {
}
