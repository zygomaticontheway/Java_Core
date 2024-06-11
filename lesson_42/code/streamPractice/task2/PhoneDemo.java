package streamPractice.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PhoneDemo {
    public static void main(String[] args) {

        List<Phone> phones = new ArrayList<>();

        phones.add(new Phone("iPhone", 1000.00));
        phones.add(new Phone("Samsung", 950.00));
        phones.add(new Phone("Huawei", 750.00));
        phones.add(new Phone("Motorola", 620.00));
        phones.add(new Phone("Nokia", 620.00));
        phones.add(new Phone("Xiaomi", 900.00));


        // отобрать названия уникальных телефонов с ценой более 700


        Set<String> modelsNames = phones.stream()
                .filter(x -> x.getPrice() > 700)
                .map(phone -> phone.getPhone())
                .collect(Collectors.toSet());

        System.out.println(modelsNames);


        modelsNames.clear();

        for (Phone phone : phones){
            if (phone.getPrice() > 700){
                modelsNames.add(phone.getPhone());
            }
        }

        System.out.println(modelsNames);

    }
}
