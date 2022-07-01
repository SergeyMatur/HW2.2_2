public interface Service2 {
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
