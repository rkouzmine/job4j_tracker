package ru.job4j.poly;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add() {
        store.save("Роман Готовченко");
    }

    public static void main(String[] args) {
        FileStore fileStore = new FileStore();
        Service service = new Service(fileStore);
        service.add();
    }
}
