public class Car extends Transport implements Service{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку авто");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель авто");
    }

    @Override
    public void check() {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
    }
}
