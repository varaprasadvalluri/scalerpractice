package com.test.scaler.array.interviewques;

import com.test.scaler.practces2D.Print2DMatrix;

import java.util.*;

public class PositiveSubArray {
    public static void main(String[] args) {
        //8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575
        List<Integer> arr = Arrays.asList(-4549634, -3196682, 8455838, -1432628, -263819, -3928366, -5556259, -2114783, 3923939, -4183708);
        List<Integer> ans = new ArrayList<>();
        int curMax = Integer.MIN_VALUE, len = 0;
        int pIndex = 0, index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {//if its negative
                if (curMax < len) {
                    curMax = len;
                    pIndex = index;//0
                    index = i + 1;//cure 1
                }
                len = 0; //its becomes zero
            } else
                len++;
        }
        System.out.println("len -->" + len + " curmax -->" + curMax);
        if (curMax < len) {
            curMax = len;
            pIndex = index;
        }
        int i = pIndex;
        System.out.println("i ->" + i + " e->" + (pIndex + curMax));
        while (i < (pIndex + curMax)) {
            ans.add(arr.get(i));
            i++;
        }
        System.out.println("ans -->" + ans);
    }
}
