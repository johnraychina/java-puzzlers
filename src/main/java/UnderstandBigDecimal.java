import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author 张义 johnraychina@163.com
 */
public class UnderstandBigDecimal {

    public static void main(String[] args) {
        //unscaledVal*10^-scale
        //scale意味着量级的缩小（正数）和放大（负数），ulp对应的是一个量级单位
        //10 缩小1个量级 = 1.0
        BigDecimal number = BigDecimal.valueOf(10, 1);
        System.out.println(number);

        System.out.println(BigDecimal.valueOf(0.1).scale());
        System.out.println(BigDecimal.valueOf(0.1).ulp());

        System.out.println(BigDecimal.valueOf(1).scale());
        System.out.println(BigDecimal.valueOf(1).ulp());

        System.out.println(BigDecimal.valueOf(11).scale());
        System.out.println(BigDecimal.valueOf(11).ulp());

        // 10^-newScale
        // newScale > oldScale，量级更微小，要保持值不变，意味着对整数部分bigMultiplyPowerTen进位，能表达的数据范围更小
        // newScale < oldScale，量级更大，要保持值不变，意味着对整数部分divideAndRound降位，很可能会损失精度
        BigDecimal result = BigDecimal.valueOf(11).setScale(1, RoundingMode.HALF_UP);
        System.out.println(result.scale());
        System.out.println(result.ulp());

    }
}
