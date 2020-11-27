package est;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Test2 {
    static String[] input;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3285-3764-9934-2453", "3285376499342453", "3285-3764-99342453", "328537649934245", "3285376499342459", "3285-3764-9934-2452"})));
    }

    public static int[] solution(String[] card_numbers) {
        input = new String[card_numbers.length];
        int[] answer = new int[card_numbers.length];

        for (int i = 0; i < card_numbers.length; i++) {
            if (checkCard(card_numbers[i]))
                input[i] = card_numbers[i].replaceAll("-", "");
            else
                input[i] = "None";
        }
        for (int i = 0; i < input.length; i++) {
            if (validation(input[i]))
                answer[i] = 1;
            else
                answer[i] = 0;
        }

        return answer;
    }

    public static boolean checkCard(String card) {  //카드형식 체크
        boolean flag = false;
        if (Pattern.matches("^[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}", card))
            flag = true;
        else if (Pattern.matches("^[0-9]{16}", card))
            flag = true;
        return flag;
    }

    public static boolean validation(String number) {
        if (number.equals("None"))
            return false;

        int num1 = 0, num2 = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            if (i % 2 == 0) {//짝수짝수번째
                int doubleNum = (number.charAt(i) - '0') * 2;
                if (doubleNum >= 10)
                    num1 += doubleNum % 10 + doubleNum / 10;
                 else  //홀수번째
                    num1 += doubleNum;

            } else
                num2 += number.charAt(i) - '0';

        }

        return (num1 + num2) % 10 == 0;
    }
}