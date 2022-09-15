public class Store {
    private Order order;


    //Пример с обрабткой сразу
    public void setOrder(String name)  {
        if (name.equals("0")) {
            try {
                throw new HwExcepiton("Нейм заказа не может быть нулем");
            } catch (HwExcepiton e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Заказ " + name + " принят в обработку.");
    }

    //пример с rethrow
    public void getOrder(String name) throws HwExcepiton {
        System.out.println("Заказ" + name + " выдан.");
    }

}
