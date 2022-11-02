package wooSecondWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Baseball {
    public static void main(String[] args) {
        Baseball baseball = new Baseball();
        // TODO: 프로그램 구현
        List<Integer> computer = baseball.selectRandomNumbers();
        System.out.println(computer);

        List<Integer> user = baseball.selectNumbers();
        System.out.println(user);

    }

    // TODO : 컴퓨터가 숫자를 랜덤으로 선택하여 리턴
    public List<Integer> selectRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!numbers.contains(randomNumber)){
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }

    // TODO : 사용자가 숫자를 선택한 숫자를 리턴
    public List<Integer> selectNumbers(){
        String inputNumber = Console.readLine();

        // TODO : 사용자가 잘못된 값을 입력할 시 IllegalArgumentException 발생
        if (inputNumber.length() != 3 || inputNumber.contains("0"))
            throw new IllegalArgumentException();

        // TODO : 사용자가 선택한 숫자를 List에 담아 리턴
        List<Integer> numbers = new ArrayList<>();
        for (char number : inputNumber.toCharArray())
            numbers.add(Character.getNumericValue(number));

        return numbers;
    }

}
