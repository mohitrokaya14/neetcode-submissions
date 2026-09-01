class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int add;
        int sum=0;

        for(int i=0;i<operations.length;i++){
            String c = operations[i];
            if(c.equals("+")){
                int temp = stack.pop();
                add = temp + stack.peek();
                stack.add(temp);
                stack.add(add);
                sum+=add;
            }else if(c.equals("D")){
                add = stack.peek()*2;
                stack.add(add);
                sum+=add;
            }else if(c.equals("C")){
                sum-=stack.pop();
            }else{
                sum += Integer.parseInt(c);
                stack.add(Integer.parseInt(c));
            }
        }

        return sum;
    }
}