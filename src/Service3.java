public interface Service3 {
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
