class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
     st.push(val);

     if(minSt.isEmpty() || minSt.peek() > val){
        minSt.push(val);
     }else{
        minSt.push(minSt.peek());
     }   
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }
    
    public int getMin() {
        if(minSt.isEmpty()){
            return -1;
        }
        return minSt.peek();
    }
}
