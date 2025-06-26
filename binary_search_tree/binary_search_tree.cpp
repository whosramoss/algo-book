#include <iostream>

struct BST {
    int value;
    BST* left = nullptr;
    BST* right = nullptr;

    BST(int val) : value(val) {}

    BST* insert(int val) {
        BST* current = this;
        while (true) {
            if (val < current->value) {
                if (!current->left) {
                    current->left = new BST(val);
                    break;
                } else {
                    current = current->left;
                }
            } else {
                if (!current->right) {
                    current->right = new BST(val);
                    break;
                } else {
                    current = current->right;
                }
            }
        }
        return this;
    }

    bool contains(int val) {
        BST* current = this;
        while (current) {
            if (val < current->value) {
                current = current->left;
            } else if (val > current->value) {
                current = current->right;
            } else {
                return true;
            }
        }
        return false;
    }

    int getMinValue() {
        BST* current = this;
        while (current->left)
            current = current->left;
        return current->value;
    }

    BST* remove(int val, BST* parent = nullptr) {
        BST* current = this;
        while (current) {
            if (val < current->value) {
                parent = current;
                current = current->left;
            } else if (val > current->value) {
                parent = current;
                current = current->right;
            } else {
                if (current->left && current->right) {
                    current->value = current->right->getMinValue();
                    current->right->remove(current->value, current);
                } else if (!parent) {
                    if (current->left) {
                        current->value = current->left->value;
                        current->right = current->left->right;
                        current->left = current->left->left;
                    } else if (current->right) {
                        current->value = current->right->value;
                        current->left = current->right->left;
                        current->right = current->right->right;
                    }
                } else if (parent->left == current) {
                    parent->left = current->left ? current->left : current->right;
                } else if (parent->right == current) {
                    parent->right = current->left ? current->left : current->right;
                }
                break;
            }
        }
        return this;
    }
};

int main() {
    BST* root = new BST(10);
    root->insert(5)->insert(4)->insert(6)->insert(15)->insert(12)->insert(17);
    root->remove(10);
    std::cout << std::boolalpha << root->contains(10) << std::endl;
    return 0;
}
