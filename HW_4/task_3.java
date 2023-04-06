/** Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. 
*   Используйте итератор.
*/



package HW_4;

import java.util.Arrays;
import java.util.List;
 
public class task_3 { 
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
 
        long sum = nums.stream().mapToInt(Integer::valueOf).summaryStatistics().getSum();
        System.out.println(nums);
        System.out.println(sum);        // 15
        
    }
}


