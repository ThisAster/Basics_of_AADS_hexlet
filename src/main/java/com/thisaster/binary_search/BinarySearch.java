package com.thisaster.binary_search;

import java.util.List;

public class BinarySearch {
    private static final List<String> stopWords = List.of(
            "а", "без", "ближе", "браво", "бы", "вам", "вас", "весь", "во", "все", "всего", "вы"
    );

    public static boolean isStopWord(String candidate) {
        var firstElem = 0;
        var lastElem = stopWords.size() - 1;

        // пока область поиска не пуста
        while (firstElem <= lastElem) {
            var middle = (firstElem + lastElem) / 2;
            // если нашлось слово, то завершаем удачно
            if (candidate.equals(stopWords.get(middle))) {
                return true;
            }
            // если кандидат меньше отбрасываем правую сторону
            if (candidate.compareTo(stopWords.get(middle)) < 0) {
                lastElem = middle - 1;
            }
            // если кандидат больше отбрасываем левую сторону
            else {
                firstElem = middle + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch.isStopWord("без"));
    }
}
