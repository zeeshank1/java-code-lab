package dev.zk.interviewq;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.function.IntFunction;

public class SetFeatures {
    public static void main(String[] args) {
        Set<String> set1 = Set.of("A", "B", "C");
        Set<String> set2 = Set.copyOf(set1);
        HashSet<String> hashSet = new HashSet<>(set1);
        hashSet.add("D");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(set1);
        linkedHashSet.add("E");
        TreeSet<String> treeSet = new TreeSet<>(set1);
        treeSet.add("F");
        String[] arr = set1.toArray(new IntFunction<String[]>() {
            public String[] apply(int size) {
                return new String[size];
            }
        });
        Set<String> collected = set1.stream().filter(s -> !s.equals("B")).collect(Collectors.toSet());
        Set<Entry<String>> entrySet = Set.ofEntries(
            Entry.of("X"),
            Entry.of("Y"),
            Entry.of("Z")
        );
        System.out.println("Set.of: " + set1);
        System.out.println("Set.copyOf: " + set2);
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("toArray: " + java.util.Arrays.toString(arr));
        System.out.println("Stream filter: " + collected);
        System.out.println("Set.ofEntries: " + entrySet);
    }

    public static record Entry<T>(T element) {
        public static <T> Entry<T> of(T element) {
            return new Entry<>(element);
        }
    }
}
