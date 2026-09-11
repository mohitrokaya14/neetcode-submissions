class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> ast = new Stack<>();
        boolean alive=true;
        for(int e : asteroids){
            if(e<0){
                alive = true;
                while(!ast.isEmpty()&&ast.peek()>0){
                    int n = ast.peek();
                    if(n+e>0){
                        alive=false;
                        break;
                    }else if(n+e==0){
                        ast.pop();
                        alive=false;
                        break;
                    }
                    ast.pop();
                }
                if(alive){ast.push(e);}
            }
            else{
                ast.push(e);
            }
        }
        int[] res = new int[ast.size()];
        for(int i=ast.size()-1;i>=0;i--){
            res[i] = ast.pop();
        }
        return res;
    }
}