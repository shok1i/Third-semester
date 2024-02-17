package Work_24;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        OrderManager om = new OrderManager();
        InternetOrder io = new InternetOrder();
        RestaurantOrder ro = new RestaurantOrder("Ресторанчик");
        boolean goOut = false;
        int var;
        while(true){
            System.out.print("====Добро пожаловать!====\n1 | Интернет заказ\n2 | Заказать на стол\n3 | Менеждер заказов\n--->");
            var = scan.nextInt();
            if(var == 1){
                while(true) {
                    System.out.print("Выберите желаемое действие:\n1 | Добавить позицию\n2 | Удалить позицию\n3 | Удалить все позиции по имени\n4 | Посмотреть все позиции\n5 | Посмотреть общую стоимость\n6 | Отсортировать по цене\n7 | Заказать доставку на адресс\n8 | Вернуться к выбору\n--->");
                    int var2 = scan.nextInt();
                    switch (var2) {
                        case 1:
                            try {
                                System.out.println("Напиток (1) или закуска (2) ->");
                                int var3 = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Введите имя позиции ->");
                                String name = scan.nextLine();
                                System.out.println("Введите стоимость ->");
                                int cost = scan.nextInt();
                                if (var3 == 1) {
                                    Drink item = new Drink(cost, name, "Напиток");
                                    io.addPosition(item);
                                } else {
                                    Drink item = new Drink(cost, name, "Закуска");
                                    io.addPosition(item);
                                }
                                System.out.println("Успешно добавлено!");
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("Некорректный ввод параметров");
                            }
                        case 2:
                            System.out.println("Введите название позиции:");
                            scan.nextLine();
                            String del_name = scan.nextLine();
                            io.removePosition(del_name);
                            System.out.println("Успешно удалено!");
                            break;
                        case 3:
                            System.out.println("Введите название позиции:");
                            scan.nextLine();
                            String all_del_name = scan.nextLine();
                            io.removeAllPositions(all_del_name);
                            System.out.println("Успешно удалено!");
                            break;
                        case 4:
                            Item[] items = io.getItems();
                            for (Item item : items) {
                                System.out.println("Имя: " + item.getName() + " Цена: " + item.getCost() + " Описание: " + item.getDescription());
                            }
                            break;
                        case 5:
                            System.out.println("Общая цена: " + io.getTotalCost());
                            break;
                        case 6:
                            Item[] sort_items = io.getSortedItemsByCost();
                            for (Item item : sort_items) {
                                System.out.println("Имя" + item.getName() + " Цена:" + item.getCost() + " Описание:" + item.getDescription());
                            }
                            break;
                        case 7:
                            System.out.print("Введите адресс доставик в формате: ул. Изюмская д.47к2 подъезд 1 кв. 18\n-->");
                            scan.nextLine();
                            String address = scan.nextLine();
                            System.out.println("Ввидите словосочетание \"Я даю согласие\", если вы даете согласие на обработку персональных данных.");
                            String checker = scan.nextLine();
                            if(checker.equals("Я даю согласие")){
                                System.out.println("Успешно! Ожидайте доставки.");
                                om.addOrder("Адресс доставки: " + address,io);
                                io = new InternetOrder();
                            }
                            else{
                                System.out.println("Отмена операции!");
                            }
                            break;
                        case 8:
                            goOut = true;
                            break;
                        default:
                            break;
                    }
                    if(goOut){
                        goOut = false;
                        break;
                    }
                }
            }
            if(var == 2){
                System.out.print("Выберите желаемое действие:\n1 | Добавить позицию\n2 | Удалить позицию\n3 | Удалить все позиции по имени\n4 | Количество одинаковых блюд\n5 | Посмотреть все блюда\n6 | Общая цена\n7 | Стол на который заказывать\n8 | Вернуться к выбору\n--->");
                var = scan.nextInt();
                switch (var){
                    case 1:
                        try {
                            System.out.println("Напиток (1) или закуска (2) ->");
                            int var3 = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Введите имя позиции ->");
                            String name = scan.nextLine();
                            System.out.println("Введите стоимость ->");
                            int cost = scan.nextInt();
                            if (var3 == 1) {
                                Drink item = new Drink(cost, name, "Напиток");
                                ro.addItem(item);
                            } else {
                                Drink item = new Drink(cost, name, "Закуска");
                                ro.addItem(item);
                            }
                            System.out.println("Успешно добавлено!");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Некорректный ввод параметров");
                        }
                        break;
                    case 2:
                        System.out.println("Введите имя блюда\n-->");
                        scan.nextLine();
                        String del_name = scan.nextLine();
                        ro.remove(del_name);
                        System.out.println("Удалено!");
                        break;
                    case 3:
                        System.out.println("Введите имя блюда\n-->");
                        scan.nextLine();
                        String all_del_name = scan.nextLine();
                        ro.removeAll(all_del_name);
                        System.out.println("Удалено!");
                        break;
                    case 4:
                        System.out.println("Введите имя блюда\n-->");
                        scan.nextLine();
                        String search_name = scan.nextLine();
                        int count = ro.itemQuantity(search_name);
                        System.out.println("Было найдено: " + count + " блюд.");
                        break;
                    case 5:
                        Item[] items = ro.getItems();
                        for (Item item : items) {
                            System.out.println("Имя: " + item.getName() + " Цена: " + item.getCost() + " Описание: " + item.getDescription());
                        }
                        break;
                    case 6:
                        System.out.println("Общая цена: " + ro.getCost());
                        break;
                    case 7:
                        System.out.println("Введите номер стола, на который будет сделан заказ (1-30):");
                        scan.nextLine();
                        String table = scan.nextLine();
                        System.out.println("Напишите ваше имя:");
                        String name = scan.nextLine();
                        System.out.println("Ввидите словосочетание \"Я даю согласие\", если вы даете согласие на обработку персональных данных.");
                        String checker = scan.nextLine();
                        if(checker.equals("Я даю согласие")){
                            System.out.println("Успешно! Ожидайте доставки.");
                            om.addOrder("Стол с заказом: "+name,io);
                            ro = new RestaurantOrder("Ресторанчик");
                        }
                        else{
                            System.out.println("Отмена операции!");
                        }
                    case 8:
                        goOut = true;
                        break;
                    default:
                        break;
                }
                if(goOut){
                    goOut = false;
                    break;
                }
            }
            if(var == 3){
                while (true) {
                    System.out.println("1 | Получить заказ по имени\n2 | Удалить заказ по имени\n3 | Добавить позицию в заказ\n4 | Посмотреть все интернет заказы\n5 | Посмотреть стоимость всех интернет заказов\n6 | Посмотреть стоимость одного блюда из всех заказов\n7 | Вернуться к выбору\n-->");
                    var = scan.nextInt();
                    switch (var) {
                        case 1:
                            System.out.println("Введитье название заказа: ");
                            scan.nextLine();
                            String address = scan.nextLine();
                            Order order = om.getOrder(address);
                            Item[] items = order.getItems();
                            for (Item item : items) {
                                System.out.println("Имя: " + item.getName() + " Цена: " + item.getCost() + " Описание: " + item.getDescription());
                            }
                            break;
                        case 2:
                            System.out.println("Введите имя для удаления: ");
                            scan.nextLine();
                            String del_name = scan.nextLine();
                            om.removeOrder(del_name);
                            System.out.println("Удалено!");
                            break;
                        case 3:
                            try {
                                System.out.println("Напиток (1) или закуска (2) ->");
                                int var3 = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Введите имя позиции ->");
                                String name = scan.nextLine();
                                System.out.println("Введите стоимость ->");
                                int cost = scan.nextInt();
                                System.out.println("Введите название заказа: ");
                                String OrderAddress = scan.nextLine();
                                if (var3 == 1) {
                                    Drink item = new Drink(cost, name, "Напиток");
                                    om.addPosition(OrderAddress, item);
                                } else {
                                    Dish item = new Dish(cost, name, "Закуска");
                                    om.addPosition(OrderAddress, item);
                                }
                                System.out.println("Успешно добавлено!");
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("Некорректный ввод параметров");
                            }
                            break;
                        case 4:
                            List<Order> orders = om.getAllInternetOrders();
                            for (Order IOrders : orders) {
                                Item[] Iitems = IOrders.getItems();
                                for (Item item : Iitems) {
                                    System.out.println("Имя: " + item.getName() + " Цена: " + item.getCost() + " Описание: " + item.getDescription());
                                }
                            }
                            break;
                        case 5:
                            System.out.println("Общая стоимость: " + om.getTotalInternetOrdersCost());
                            break;
                        case 6:
                            System.out.println("Введите название блюда: ");
                            scan.nextLine();
                            String dish = scan.nextLine();
                            System.out.println("Сумма цены этих блюд из всех заказов: " + om.getTotalOrderedDishesCount(dish));
                            break;
                        case 7:
                            goOut = true;
                            break;
                        default:
                            break;
                    }
                    if(goOut){
                        goOut = false;
                        break;
                    }
                }
            }
        }
    }
}