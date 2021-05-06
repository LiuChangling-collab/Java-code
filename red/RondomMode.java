package red;

import java.util.ArrayList;
import java.util.Random;

public class RondomMode implements OpenMode{
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        Random r = new Random();
        for (int i = 0; i < totalCount - 1; i++) {
            int money = 1 + r.nextInt(leftMoney);
            list.add(money);
            leftMoney -= money;
            leftCount--;
        }
        list.add(leftMoney);
        return list;
    }
}
