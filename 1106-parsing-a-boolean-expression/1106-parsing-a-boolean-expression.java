class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for(Character ch : expression.toCharArray()) {
            if(ch == '(' || ch == ',')
                continue;
            
            if(ch == ')') {
                boolean hasTrue = false, hasFalse = false;
                while(stack.peek() == 't' || stack.peek() =='f') {
                    if(stack.pop() == 't')
                        hasTrue = true;
                    else
                        hasFalse = true;
                }
                
                char op = stack.pop(), ans='f';
                if(op == '&') {
                    ans = hasFalse ? 'f' : 't';
                }
                else if(op == '|') {
                    ans = hasTrue ? 't' : 'f';
                }
                else if(op == '!') {
                    ans = hasTrue ? 'f' : 't';
                }
                stack.push(ans);
                continue;
            }
            stack.push(ch);
        }
        return stack.pop() == 't' ? true : false;
    }
}

//discussion section
//https://leetcode.com/problems/parsing-a-boolean-expression/discuss/1945463/Java-oror-Stack-Solution-oror-Simple-oror-With-Comments