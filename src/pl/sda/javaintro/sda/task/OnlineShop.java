package pl.sda.javaintro.sda.task;

import pl.sda.javaintro.sda.task.item.ItemModel;
import pl.sda.javaintro.sda.task.user.UserModel;

public class OnlineShop {
    public static void main(String[] args) {
        UserModel user1 = new UserModel("Karol","Broda",35);
        System.out.println(user1);
        UserModel user2 = new UserModel("Damian","Kowlaski",15);
        System.out.println(user2);


        ItemModel item1 = new ItemModel("titlee","description",854);
        System.out.println(item1);
        ItemModel item2 = new ItemModel("title2","description2",521);
        System.out.println(item2);
        // TODO
    }
}
