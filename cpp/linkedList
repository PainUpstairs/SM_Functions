#include<iostream>
using namespace std;

struct Node{

    string data;
    Node *next;

};

void addFirst( struct Node** head, string dataNew)
{
    struct Node *newNode = new Node;
    newNode->data = dataNew;
    newNode->next = *head;
    *head = newNode;

}

void insertNext( int n, string dataNew, struct Node *head){

    struct Node *newNode = new Node;
    while( n!=1){
        head = head->next;
        n--;
    }
    newNode->data = dataNew;
    newNode->next = head->next;
    head->next = newNode; 
}

void addLast( struct Node* head, string datanew ){
    if( head == NULL){
        cout << "Please add an item first" << endl;
        return;
    }

    struct Node* LastNode = new Node;
    struct Node* Second_LNode = new Node;
    struct Node* newNode = new Node;

    Second_LNode = head;
    LastNode = Second_LNode->next;

    while( LastNode != NULL){
        Second_LNode = Second_LNode->next;
        LastNode = LastNode->next;
    }

    newNode->data = datanew;
    newNode->next = NULL;
    Second_LNode->next = newNode;
}

void printList( struct Node *head){
    if( head == NULL){
        cout << "List is Empty";
        return;
    }

    while( head != NULL){
        cout << head->data << "-->";
        head = head->next;
    }
    
    cout << "NULL" << endl;

}

int main()
{
    struct Node *head = NULL;
    // at the adress of head NULL is stored 
    // addFirst( &head, "ra");
    // addFirst( &head, "Shi");
    addLast( head, "j");
    // insertNext( 1, "v", head);
    printList(head);


    return 0;
}
