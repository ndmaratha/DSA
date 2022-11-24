#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* next;
};
struct node* head;
void insert(int);
void print();

int main()
{
    int n,i,x;
    head=NULL;
    
    printf("How many numbers");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("enter the number");
        scanf("%d",&x);
        insert(x);
        print();
    }

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