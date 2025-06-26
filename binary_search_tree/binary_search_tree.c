#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct BST {
    int value;
    struct BST* left;
    struct BST* right;
} BST;

BST* newBST(int value) {
    BST* node = (BST*)malloc(sizeof(BST));
    node->value = value;
    node->left = NULL;
    node->right = NULL;
    return node;
}

BST* insert(BST* root, int value) {
    BST* current = root;
    while (true) {
        if (value < current->value) {
            if (current->left == NULL) {
                current->left = newBST(value);
                break;
            } else {
                current = current->left;
            }
        } else {
            if (current->right == NULL) {
                current->right = newBST(value);
                break;
            } else {
                current = current->right;
            }
        }
    }
    return root;
}

bool contains(BST* root, int value) {
    BST* current = root;
    while (current != NULL) {
        if (value < current->value)
            current = current->left;
        else if (value > current->value)
            current = current->right;
        else
            return true;
    }
    return false;
}

int getMinValue(BST* node) {
    BST* current = node;
    while (current->left != NULL) {
        current = current->left;
    }
    return current->value;
}

BST* removeNode(BST* root, int value, BST* parent) {
    BST* current = root;
    while (current != NULL) {
        if (value < current->value) {
            parent = current;
            current = current->left;
        } else if (value > current->value) {
            parent = current;
            current = current->right;
        } else {
            if (current->left != NULL && current->right != NULL) {
                current->value = getMinValue(current->right);
                current->right = removeNode(current->right, current->value, current);
            } else if (parent == NULL) {
                if (current->left != NULL) {
                    *current = *current->left;
                } else if (current->right != NULL) {
                    *current = *current->right;
                }
            } else if (parent->left == current) {
                parent->left = current->left != NULL ? current->left : current->right;
            } else if (parent->right == current) {
                parent->right = current->left != NULL ? current->left : current->right;
            }
            break;
        }
    }
    return root;
}

int main() {
    BST* root = newBST(10);
    insert(root, 5);
    insert(root, 4);
    insert(root, 6);
    insert(root, 15);
    insert(root, 12);
    insert(root, 17);

    removeNode(root, 10, NULL);
    printf("%s\n", contains(root, 10) ? "true" : "false");
    return 0;
}
