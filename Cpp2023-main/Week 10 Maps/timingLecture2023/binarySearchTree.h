//Header File Binary Search Tree

#ifndef H_binarySearchTree
#define H_binarySearchTree
#include <iostream>
#include <cassert>
#include "binaryTree.h"

//*************************************************************
// Author: D.S. Malik
//
// This class specifies the basic operations to implement a
// binary search tree.
//*************************************************************

using namespace std;

template <class elemType>
class bSearchTreeType: public binaryTreeType<elemType>
{
public:
    bool search(const elemType& searchItem) const;
      //Function to determine if searchItem is in the binary
      //search tree.
      //Postcondition: Returns true if searchItem is found in the
      //    binary search tree; otherwise, returns false.

    void insert(const elemType& insertItem);
      //Function to insert insertItem in the binary search tree.
      //Postcondition: If no node in the binary search tree has the
      //    same info as insertItem, a node with the info insertItem
      //     is created and inserted in the binary search tree.

    void deleteNode(const elemType& deleteItem);
      //Function to delete deleteItem from the binary search tree
      //Postcondition: If a node with the same info as deleteItem
      //    is found, it is deleted from the binary search tree.

	void insertPostorder(bSearchTreeType<elemType>& otherTree);
	void insertPreorder(bSearchTreeType<elemType>& otherTree);

private:
    void deleteFromTree(binaryTreeNode<elemType>* &p);
      //Function to delete the node to which p points is deleted
      //from the binary search tree.
      //Postcondition: The node to which p points is deleted from
      //    the binary search tree.

	void insertPost(bSearchTreeType<elemType>& otherTree, binaryTreeNode<elemType> *p);
	void insertPre(bSearchTreeType<elemType>& otherTree, binaryTreeNode<elemType> *p);
};

template <class elemType>
void bSearchTreeType<elemType>::insertPostorder(bSearchTreeType<elemType>& otherTree)
{
	insertPost(otherTree, this->root);
}

template <class elemType>
void bSearchTreeType<elemType>::
          insertPreorder(bSearchTreeType<elemType>& otherTree)
{
	insertPre(otherTree, this->root);
}


template <class elemType>
void bSearchTreeType<elemType>::
           insertPost(bSearchTreeType<elemType>& otherTree,
                     binaryTreeNode<elemType> *p)
{
    if (p != nullptr)
    {
        insertPost(otherTree, p->llink);
        insertPost(otherTree, p->rlink);
        cout << p->info << " ";
		otherTree.insert(p->info);
    }
}

template <class elemType>
void bSearchTreeType<elemType>::
          insertPre(bSearchTreeType<elemType>& otherTree,
                    binaryTreeNode<elemType> *p)
{
    if (p != nullptr)
    {
        cout << p->info << " ";
		otherTree.insert(p->info);
		insertPre(otherTree, p->llink);
        insertPre(otherTree, p->rlink);

    }
}

template <class elemType>
bool bSearchTreeType<elemType>::
              search(const elemType& searchItem) const
{
    binaryTreeNode<elemType> *current;
    bool found = false;

    if (this->root == nullptr)
       cerr << "Cannot search the empty tree." << endl;
    else
    {
        current = this->root;

        while (current != nullptr && !found)
        {
            if (current->info == searchItem)
                found = true;
            else if (current->info > searchItem)
                current = current->llink;
            else
                current = current->rlink;
        }//end while
    }//end else

    return found;
}//end search

template <class elemType>
void bSearchTreeType<elemType>::insert(const elemType& insertItem)
{
    binaryTreeNode<elemType> *current;  //pointer to traverse the tree
    binaryTreeNode<elemType> *trailCurrent = nullptr; //pointer
                                                      //behind current
    binaryTreeNode<elemType> *newNode;  //pointer to create the node

    newNode = new binaryTreeNode<elemType>;
    assert(newNode != nullptr);
    newNode->info = insertItem;
    newNode->llink = nullptr;
    newNode->rlink = nullptr;

    if (this->root == nullptr)
        this->root = newNode;
    else
    {
        current = this->root;

        while (current != nullptr)
        {
            trailCurrent = current;

            if (current->info == insertItem)
            {
                cerr << "The insert item is already in the list-";
                cerr << "duplicates are not allowed."
                     << insertItem << endl;
                return;
            }
            else if (current->info > insertItem)
                current = current->llink;
            else
                current = current->rlink;
        }//end while

        if (trailCurrent->info > insertItem)
            trailCurrent->llink = newNode;
        else
            trailCurrent->rlink = newNode;
    }
}//end insert

template <class elemType>
void bSearchTreeType<elemType>::deleteNode(const elemType& deleteItem)
{
    binaryTreeNode<elemType> *current;  //pointer to traverse the tree
    binaryTreeNode<elemType> *trailCurrent; //pointer behind current
    bool found = false;

    if (this->root == nullptr)
        cout << "Cannot delete from the empty tree." << endl;
    else
    {
        current = this->root;
        trailCurrent = this->root;

        while (current != nullptr && !found)
        {
            if (current->info == deleteItem)
                found = true;
            else
            {
                trailCurrent = current;

                if (current->info > deleteItem)
                    current = current->llink;
                else
                    current = current->rlink;
            }
        }//end while

        if (current == nullptr)
            cout << "The delete item is not in the tree." << endl;
        else if (found)
        {
            if (current == this->root)
                deleteFromTree(this->root);
            else if (trailCurrent->info > deleteItem)
                deleteFromTree(trailCurrent->llink);
            else
                deleteFromTree(trailCurrent->rlink);
        }//end if
    }
}//end deleteNode

template <class elemType>
void bSearchTreeType<elemType>::deleteFromTree
                                 (binaryTreeNode<elemType>* &p)
{
    binaryTreeNode<elemType> *current; //pointer to traverse the tree
    binaryTreeNode<elemType> *trailCurrent;   //pointer behind current
    binaryTreeNode<elemType> *temp;        //pointer to delete the node

    if (p == nullptr)
        cerr << "Error: The node to be deleted does not exist." << endl;
    else if(p->llink == nullptr && p->rlink == nullptr)
    {
        temp = p;
        p = nullptr;
        delete temp;
    }
    else if(p->llink == nullptr)
    {
        temp = p;
        p = temp->rlink;
        delete temp;
    }
    else if(p->rlink == nullptr)
    {
        temp = p;
        p = temp->llink;
        delete temp;
    }
    else
    {
        current = p->llink;
        trailCurrent = nullptr;

        while (current->rlink != nullptr)
        {
            trailCurrent = current;
            current = current->rlink;
        }//end while

        p->info = current->info;

        if (trailCurrent == nullptr) //current did not move;
                                  //current == p->llink; adjust p
            p->llink = current->llink;
        else
            trailCurrent->rlink = current->llink;

        delete current;
    }//end else
}//end deleteFromTree


#endif
