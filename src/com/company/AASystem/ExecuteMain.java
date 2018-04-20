package com.company.AASystem;

import java.util.Scanner;

/**
 * Created by lipeiyuan on 2018/4/15.
 * 双门洞AA制算法，1.王涵静 2.张洋 3.王艺璇 4.李沛源
 */
public class ExecuteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double jing = scanner.nextDouble();
            double yang = scanner.nextDouble();
            double xuan = scanner.nextDouble();
            double yuan = scanner.nextDouble();
            Solution.solution(jing,yang,xuan,yuan);
        }

    }
}
