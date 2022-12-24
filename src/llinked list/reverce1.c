#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* next;
};
struct node* head;
void insert(int);
void print();
void reverse(){
    struct node *current,*prev,*next;
    current=head;
    prev=NULL;
    while(current!=NULL){
        next=current->next;
        current->next=prev;
        prev=current;
        current=next;
    }
    head=prev;
}

int main()
{
    int n,i,x;
    head=NULL;
    insert(1);
    insert(2);
    insert(3);
    insert(4);
    print();
    reverse();
    print();
    
    return 0;
}
void insert(int x){
    
    struct node* temp= (struct node* )malloc(sizeof(struct node));
    temp -> data=x;
    temp-> next=head;
    head=temp;
    
}
void print(){
    struct node* temp=head;
    printf("list is");
    while(temp!=NULL){
        printf("%d--",temp->data);
        temp=temp->next;
        }
        printf("\n");
}