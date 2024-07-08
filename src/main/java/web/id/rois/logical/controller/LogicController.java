package web.id.rois.logical.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogicController {
    @GetMapping("/reverse-words")
    public String reverseWords() {
        String input = "italem irad irigayaj iadab itsap ulalreb nalub kusutret gnalali";
        return reverseWords(input);
    }

    @GetMapping("/fizzbuzz")
    public String fizzBuzz() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                result.append(i).append(" FizzBuzz\n");
            } else if (i % 3 == 0) {
                result.append(i).append(" Fizz\n");
            } else if (i % 5 == 0) {
                result.append(i).append(" Buzz\n");
            } else {
                result.append(i).append("\n");
            }
        }
        return result.toString();
    }

    @GetMapping("/fibonacci")
    public String fibonacciSeries() {
        int n = 10;
        StringBuilder result = new StringBuilder();
        int a = 0, b = 1;
        result.append(a).append(" ").append(b).append(" ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            result.append(next).append(" ");
            a = b;
            b = next;
        }
        return result.toString();
    }

    @GetMapping("/max-profit")
    public int maxProfit() {
        int[] prices = {10, 9, 6, 5, 15};
        return maxProfit(prices);
    }

    @GetMapping("/count-numbers")
    public int countNumbers() {
        String[] input = {"2", "h", "6", "u", "y", "t", "7", "j", "y", "h", "8"};
        return countNumbers(input);
    }

    // Fungsi-fungsi yang telah didefinisikan sebelumnya
    public String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord.toString()).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }

    public int countNumbers(String[] input) {
        int count = 0;
        for (String s : input) {
            if (s.matches("\\d")) {
                count++;
            }
        }
        return count;
    }
}
