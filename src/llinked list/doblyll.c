#include<stdio.h>
#include<stdlib.h>

struct node{
    int data ;
    struct node* next;
    struct node* prev;
};

struct node* head;

struct node* getnewnode(int x){
    struct node* newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=x;
    newnode->next=NULL;
    newnode->prev=NULL;
    return newnode;
}
void inathead( int x){
    struct node* newnode=getnewnode(x);
    if(head==NULL){
        head=newnode;
        return;
    }
    head->prev=newnode;
    newnode->next=head;
    head=newnode;
    
}
void print(){
    struct node* temp=head;
    while(temp!=NULL){
        printf("%d \n",temp->data);
        temp=temp->next;
    }
    printf("\n");
}
void revprint(){
    struct node* temp=head;
    if(temp==NULL){
        return;
    }
    while(temp->next !=NULL){
        temp=temp->next;
    }
    while(temp!=NULL){
        printf("%d\n",temp->data);
        temp=temp->prev;
    }
}
void inattail(int x){
    struct node* newnode=getnewnode(x);
    if(head==NULL){
        head=newnode;
        return;
    }
    struct node* temp2=head;
    while(temp2->next!=NULL){
        temp2=temp2->next;
    }
    temp2->prev=newnode;
    newnode->next=temp2;
    temp2=newnode;
    free(temp2);
}

int main(){
    
    
    inathead(10);
    inathead(12);
    inattail(4);
    inathead(14);
    inathead(16);
    //inattail(8);
    
    printf("list");
    print();
    
    
    
    //printf(" reverse list");
    //revprint();
    
}