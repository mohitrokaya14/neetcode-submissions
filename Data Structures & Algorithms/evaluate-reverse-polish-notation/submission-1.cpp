class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int>st;
        int temp,output=0,a,b;

        for(string& token:tokens){
            if(isdigit(token[0])||(token.size() > 1 && token[0] == '-')){
                st.push(stoi(token));
            }else{
                a = st.top();st.pop();
                b = st.top();st.pop();
                if(token=="+")output = a+b;
                else if(token=="-")output =b-a;
                else if(token=="*")output = a*b;
                else if(token=="/")output = b/a;
                st.push(output);
            }
        }
        return st.top();
    }
};
