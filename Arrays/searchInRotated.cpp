#include<iostream>
using namespace std;

int  indexOfElement(int arr[],int size,int key){
    int l=0,h=size-1;
    int mid=l+(h-l)/2;

    while(l<=h){
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[l]<arr[mid]){
            if(key>=arr[l] && key<arr[mid]){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }else{
            if(key>arr[mid] && key<=arr[h]){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }

        mid=l+(h-l)/2;
    }

    return -1;
}
int main(){

    int arr[]={45,67,78,12,23,34};
    int size=sizeof(arr)/sizeof(arr[0]);
    int key;
    cout<<"Enter key: ";
    cin>>key;
    cout<<"index of "<<key<<" is: "<<indexOfElement(arr,size,key);

    return 0;
}