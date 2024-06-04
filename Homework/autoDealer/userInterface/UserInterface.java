package autoDealer.userInterface;

import code.library.var1.UserInput;
import code.requestResponseModelDTO.entity.Product;
import code.rrmDTOFrendly.dto.ResponseForClientAddNewProduct;
import code.rrmDTOFrendly.dto.ResponseProductDto;
import code.rrmDTOFrendly.dto.RequestCreateProductDto;
import code.rrmDTOFrendly.service.ProductService;

import java.util.List;

public class UserInterface {

    ProductService service;
    UserInput userInput;

    public UserInterface(ProductService service, UserInput userInput) {
        this.service = service;
        this.userInput = userInput;
    }

    public void start(){

        while (true){
            System.out.println();
            printMenu();
            int userChoice = userInput.inputInt("Выберите пункт меню:");

            switch (userChoice){
                case 1:
                    inputNewProduct();
                    break;
                case 2:
                    List<ResponseProductDto> products = service.findAll();
                    if (!products.isEmpty()) {
                        for (ResponseProductDto productDto : products) {
                            System.out.println(productDto);
                    }
                    } else {
                        System.out.println("Database is empty!");
                    }
                    break;
                case 3:
                    inputIdForSearch();
                    break;
                case 4:
                    inputNameForSearch();
                    break;


                case 0:
                    System.out.println("Работа приложения завершена");
                    return;
            }
        }

    }

    private void inputNameForSearch() {
        String productName = userInput.inputText("Введите название продукта для поиска:");
        System.out.println(service.findByProductName(productName));
    }

    private void inputIdForSearch() {
        int id = userInput.inputInt("Введите id продукта для поиска :");
        System.out.println(service.findById(id));
    }

    private void inputNewProduct() {
        String productName = userInput.inputText("Введите название продукта:");
        double price = userInput.inputDouble("Введите цену продукта:");
        String productDescription = userInput.inputText("Введите описание продукта:");

        RequestCreateProductDto request = new RequestCreateProductDto(productName,price,productDescription);

        ResponseForClientAddNewProduct response = service.addNewProduct(request);

        if (response.isOk()) {
            System.out.println("Ok");
            System.out.println(response.getResponse());
        } else {
            System.out.println("Error!");
            System.out.println(response.getErrors());
        }
    }



    private void printMenu(){
        System.out.println("1. Ввод нового продукта");
        System.out.println("2. Вывод всех продуктов");
        System.out.println("3. Поиск продукта по id");
        System.out.println("4. Поиск продукта по наименованию");

        System.out.println("0. Exit");

    }

}
