package com.rafalglowacki;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add((i * i));
            cubes.add((i * i * i));
        }

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains: " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains: " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and cube of " + Math.cbrt(i));
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "art", "but", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));
        System.out.println("===========================================");
        System.out.println("Nature - divine: ");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("Divine - nature: ");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);
        Set<String> diffIntersection = new HashSet<>(nature);
        Set<String> diffUnion = new HashSet<>(nature);
        Set<String> diff3 = new HashSet<>(nature);
        diffUnion.addAll(divine);
        diffIntersection.retainAll(divine);
        diffUnion.removeAll(diffIntersection);
        System.out.println("Nature union Divine - Nature intersection Divine");
        printSet(diffUnion);
        System.out.println("Nature containsAll intersection?");
        System.out.println(nature.containsAll(diffIntersection));
        System.out.println("Nature containsAll union?");
        System.out.println(nature.containsAll(diffUnion));



    }

    public static void printSet(Set<String> set) {
        for (String s : set) {
            System.out.print("\t"+s + " ");
        }
        System.out.println();
    }
}
