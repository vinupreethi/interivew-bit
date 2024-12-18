package org.example;

public class SmallestPalindromeWorking {


    public static void main(String args[])
    {
        String a="99999";

        int i=0;
        int j=a.length()-1;
        int mid=((i+j)/2);
        int low=mid-1;
        int high=mid+1;
        int middle1=mid;
        int flag=0;
        for(int ik=0;ik<a.length();ik++)
        {
            if(a.charAt(ik)!=a.charAt(a.length()-1-ik))
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            int carry=1;

            StringBuilder sbr = new StringBuilder(a);
            int last=a.length()-1;
            while (last >= 0 && carry != 0) {
                int answer = sbr.charAt(last) - '0';
                answer = answer + carry;
                carry = answer / 10;
                answer = answer % 10;
                char ans = (char) (answer + '0');
                sbr.setCharAt(last, ans);
                 last--;
            }
            if(carry==1)
                sbr.insert(0,carry);
            a = sbr.toString();


        }

            if (a.length() % 2 == 0) {


                low = mid;
                high = mid + 1;

                while (low >= 0 && high <= a.length() - 1) {
                    if (a.charAt(low) > a.charAt(high)) {

                        a = copyLowToHigh(a, 0, a.length() - 1);
                        break;
                    } else if (a.charAt(low) < a.charAt(high)) {
                        int carry = 1;
                        StringBuilder sbr = new StringBuilder(a);
                        while (middle1 >= 0 && carry != 0) {
                            int answer = sbr.charAt(middle1) - '0';
                            answer = answer + carry;
                            carry = answer / 10;
                            answer = answer % 10;
                            char ans = (char) (answer + '0');
                            sbr.setCharAt(middle1, ans);
                            middle1--;
                        }

                        a = sbr.toString();
                        a = copyLowToHigh(a, 0, a.length() - 1);
                        break;
                    } else if (a.charAt(low) == (a.charAt(high))) {
                        low--;
                        high++;
                    }


                }
                System.out.println("a = " + a);


            } else {
                while (low >= 0 && high <= a.length() - 1) {
                    if (a.charAt(low) > a.charAt(high)) {

                        a = copyLowToHigh(a, 0, a.length() - 1);
                        break;
                    } else if (a.charAt(low) < a.charAt(high)) {

                        int carry = 1;
                        StringBuilder sbr = new StringBuilder(a);
                        while (mid >= 0 && carry != 0) {
                            int answer = sbr.charAt(mid) - '0';
                            answer = answer + carry;
                            carry = answer / 10;
                            answer = answer % 10;
                            char ans = (char) (answer + '0');
                            sbr.setCharAt(mid, ans);
                            mid--;
                        }

                        a = sbr.toString();

                        a = copyLowToHigh(a, 0, a.length() - 1);
                        break;

                    } else if (a.charAt(low) == (a.charAt(high))) {
                        low--;
                        high++;
                    }
                }

                System.out.println("a = " + a);

            }



    }

    private static String  copyLowToHigh(String a, int low, int high) {
        char[] chars = a.toCharArray();
        while(low<=high)
        {


            chars[high]=chars[low];
            low++;
            high--;

        }
        a = String.valueOf(chars);
        return a;

    }
}
