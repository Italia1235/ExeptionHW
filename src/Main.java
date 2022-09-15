import java.io.FileOutputStream;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        Store store = new Store();
        store.setOrder("Заказ 123");

        try {
            store.getOrder("Заказ 123");
            throw new HwExcepiton("Сами пишем, что выдаст");
        } catch (HwExcepiton e) {
            System.out.println(e.getMessage());
        }


    }


    //пример с блоком  try-with-resources
    public void tryWithResurs() throws HwExcepiton {
        try (FileOutputStream output = new FileOutputStream("/m")) {
            output.write(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

