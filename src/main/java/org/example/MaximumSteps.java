package org.example;

public class MaximumSteps {
    public static void main(String args[]) {
        int a[] = { -1, -1, -1, -1, -1 };
        int startInd = 0;
        int endInd = 0;
        int n = a.length;
        long sum = 0L;
        long maxsum = 0L;
        int startindex = 0;
        int endindex = 0;
        int len=1;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                startInd = i + 1;
                endInd = i + 1;
                sum = 0;
            } else {
                sum += a[i];
                endInd = i;
                    if(sum>maxsum)
                    {
                        startindex=startInd;
                        endindex= endInd ;
                        maxsum = sum;
                    }
                    else if(sum==maxsum)
                    {
                        if(len< (endInd-startInd+ 1)) {
                            startindex = startInd;
                            endindex = endInd;
                            maxsum = sum;
                            len=endindex-startindex+1;
                        }
                    }


            }
        }


        int answer[] = new int[endindex - startindex + 1];
        int k=0;
        for (int j = startindex; j <= endindex; j++) {
            answer[k] = a[j];k++;
        }

        for(Integer ki:answer)
            System.out.print(ki);
    }
}
