package com.jusoft.leetcode.arrays.hindex;

import java.util.*;
import java.util.stream.Collectors;

public class HIndex {
    //Counting sort solution
    public int hIndex(int[] citations) {
        int len = citations.length;

        int[] papers_freq = new int[len+1];
        for(int c: citations) {
            if(c > len) {
                papers_freq[len]++;
            } else {
                papers_freq[c]++;
            }
        }
        int totalCitations = 0;
        for(int i = len; i >= 0; i--) {
            totalCitations += papers_freq[i];
            if(totalCitations >= i) {
                return i;
            }
        }
        return 0;
    }

    public int binarySearchSolution(int[] citations) {
        Arrays.sort(citations);
        int low = 0;
        int high = citations.length -1;
        int totalArticles = citations.length;
        int hindex;
        int mid;
        while(low <= high) {
            mid = low + (high - low) / 2;
            hindex = citations[mid];
            if (hindex == totalArticles - mid) {
                return totalArticles - mid;
            } else if (hindex >= totalArticles - mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return totalArticles - low;
    }
}
