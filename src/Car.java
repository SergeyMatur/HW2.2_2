public class Car extends Transport implements Service, Service2 {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку авто");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель авто");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем авто" + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
