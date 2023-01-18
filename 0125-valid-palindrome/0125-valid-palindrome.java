

class Solution {
    public boolean isPalindrome(String s) {
        // 우선 모두 문자열을 String.LowerCase를 이용하여 소문자로 만들고
        // ASCII를 이용하여 해당 값을 제외한 나머지를 제거하거나, String.trim이었나, 몇몇 문자를 자르는 망식으로 진행을 해보려고 한다.
        // 그런데 : 같은 것들도 있어서, 나는 ASCII 가 더 안정적일 것 같아서 이걸 쓸 것이다.
        // 그리고 left pointer와 right pointer를 이용하여, 해당 값이 같은지 체크한 후, 값이 같다면 한칸씩 이동하고, 겹치거나 right가 left보다
        // 작을 때 true를 return 하는 걸로하자.
        //97-122  
        // 임시로 문자를 넣을 stringBuilder 생성
        StringBuilder sb = new StringBuilder();

        boolean answer = true;

        // 문자열을 소문자로 변경
        String ala = s.toLowerCase();
        // char 배열로 변환
        char[] ch = ala.toCharArray();

        // 각 문자마다, 소문자 범위 내에 있는지 확인 후, 그렇다면 StringBuilder 내에 append
        for(char c : ch) {
            if((c >= 97 && c <=122) || (c >= 48 && c <= 57)) sb.append(c);
        }

        // 소문자만 남은 Stringbuilder를 이용하여 String을 만든 후, toCharArray를 활용하여 배열 생성
        String b = sb.toString();
        

        // leftPointer와 rightPointer를 활용하여 하나씩 체크

        int left = 0;
        int right = 0;
        // 만약 almost 배열이 0인 경우 aplindrome 상  true이기 때문에 뒤로 return
        if(b.length() != 0) right = b.length() - 1;
        else return answer = true;

        while(left <= right) {
            //
            if(b.charAt(left) != b.charAt(right)) {
                return answer = false;
            }
            else {
                left++;
                right--;
            }
        }
        return answer;
    }
}