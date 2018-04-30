package javaapplication20;

import java.util.Arrays;

public class RuffleBag {

    private FoodRuffle[] foodList;

    public RuffleBag(FoodRuffle[] foodList) {
        this.foodList = foodList;

    }

    public RuffleBag filterByType(String type) {
        int count = 0;

        for (int i = 0; i < foodList.length; i++) {
            if (foodList[i].getType().equalsIgnoreCase(type)) {
                count++;
            }
        }
        FoodRuffle[] newFoodList = new FoodRuffle[count];
        RuffleBag foodByType = new RuffleBag(null);
        int i = 0;
        for (int j = 0; j < foodList.length; j++) {
            if (foodList[j].getType().equalsIgnoreCase(type)) {
                newFoodList[i] = foodList[j];
                i++;
            }
        }
        this.foodList = newFoodList;
        foodByType = new RuffleBag(newFoodList);

        return foodByType;
    }

    public FoodRuffle randomPick() {
        System.out.println("What to eat");
        int rand = (int) (Math.random() * (foodList.length));
        System.out.println("I will have " + foodList[rand].getName() + " : " + foodList[rand].getPrice());
        return null;
    }

}
