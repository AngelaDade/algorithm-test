package com.company.mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by lipeiyuan on 2018/4/4.
 */
public class BagTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String totalSizeStr = scanner.nextLine();
            String[] weigthtsStr = scanner.nextLine().split(" ");
            String[] valuesStr = scanner.nextLine().split(" ");
            doBag(totalSizeStr , weigthtsStr , valuesStr);

        }

    }
    public static void doBag(String totalSizeStr , String[] weigthtsStr , String[] valuesStr) {
        int totalSize = Integer.parseInt(totalSizeStr);
        List<Integer> weights = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        weights.add(0);
        values.add(0);
        Stream.of(weigthtsStr).forEach(w -> {weights.add(Integer.parseInt(w));});
        Stream.of(valuesStr).forEach(v -> {values.add(Integer.parseInt(v));});
        int[][] okBag = new int[weights.size()+1][totalSize+1];
        List<Integer> inBagIndex = new ArrayList<>();
        for (int i = 0 ; i < totalSize+1 ; i++) {
            okBag[0][i] = 0;
        }

        //f[i][j] = max{f[i-1][j],f[i-1][j-w[i]]+v[i]}

        for (int currentNumber = 1 ; currentNumber < weights.size()+1 ; currentNumber++) {
            for (int currentSize = 0 ; currentSize < totalSize+1 ; currentSize++) {
                if (weights.get(currentNumber) <= currentSize) {
                    int nonIncludeValue = okBag[currentNumber-1][currentSize];
                    int freeSize = currentSize - weights.get(currentNumber);
                    int includeValue = okBag[currentNumber-1][freeSize] + values.get(currentNumber);
                    if (nonIncludeValue < includeValue) {
                        okBag[currentNumber][currentSize] = includeValue;
                        inBagIndex.add(currentNumber);
                    } else {
                        okBag[currentNumber][currentSize] = nonIncludeValue;
                    }
                }
            }
        }

        System.out.println("最大价值为：" + okBag[weights.size()][totalSize]);
        System.out.print("装入背包的物品编号：");
        inBagIndex.stream().forEach(index -> System.out.println(index));
    }
}
