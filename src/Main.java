import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(0);
        set2.add(1);
        set2.add(2);
        System.out.println(symmetricDifference(set1,set2));
    }
    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){
        Set<Integer>set=new HashSet<>();
        Set<Integer>set1kopiya=new HashSet<>(set1);
        set1kopiya.retainAll(set2);
        set.addAll(set1);
        set.addAll(set2);
        set.removeAll(set1kopiya);
        return set;
    }}



   /* Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз. Метод
   натыйжаны жаңы set катары кайтарышы керек. Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.

        Мисалы: [1, 2, 3} жана {0, 1, 2]
        Жооп: [0, 3]

public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) методу болушу керек*/