package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

public record TelephoneNumber(String areaCode, String number) {

//
//    private final String areaCode;
//
//    private final String number;
//
//    public TelephoneNumber(String areaCode, String number) {
//        this.areaCode = areaCode;
//        this.number = number;
//    }
//
//    public String areaCode() {
//        return areaCode;
//    }
//
//    public String number() {
//        return number;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        TelephoneNumber that = (TelephoneNumber) o;
//        return Objects.equals(areaCode, that.areaCode) && Objects.equals(number, that.number);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(areaCode, number);
//    }
}
