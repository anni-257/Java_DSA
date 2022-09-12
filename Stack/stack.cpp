#include<iostream>
using namespace std;

class Node{

    public:

    int val;
    Node* next;
    Node(int data){
        val=data;
        next=nullptr; 
    }
};

class Stack{
    Node* top;
    public:
        Stack(){
            top=NULL;
        }

        void push(int data); // done
        void pop(); // done
        int peek(); // done;
        bool isEmpty(); // done
        void display(); // done
        void reverse();


};

bool Stack::isEmpty(){
    if(top==NULL){
        return true;
    }

    return false;
}

void Stack::push(int data){
    Node* newNode=new Node(data);
    if(isEmpty()){
        top=newNode;
    }else{
        newNode->next=top;
        top=newNode;
    }
}

void Stack::pop(){
    Node* newNode=top;  
    if(isEmpty()){
        return;
    }else{
        top=top->next;
        delete newNode;
    }
}

int Stack::peek(){
    if(isEmpty()){
        return -1;
    }

    return top->val;
}

void Stack::display(){
    Node* temp=top;
    cout<<"Stack: ";
    while(temp!=NULL){

        cout<<temp->val<<" ";
        temp=temp->next;

    }cout<<endl;
}

void Stack:: reverse(){
    Node* newHead=NULL;
    while(top!=0){
        Node* new1=top->next;
        top->next=newHead;
        newHead=top;
        top=new1;
    }

    top=newHead;
}



int main(){

    Stack st;
    cout<<"isEmpty: "<<std::boolalpha<<st.isEmpty()<<endl;
    st.push(10);
    st.push(20);
    st.push(30);
    st. display();
    st. reverse();
    st.display();

    // cout<<"top: "<<st.peek()<<endl;
    // cout<<"isEmpty: "<<std::boolalpha<<st.isEmpty()<<endl;
    // st.display();
    // st.pop();
    // st.pop();
    // st.display();
    return 0;
}