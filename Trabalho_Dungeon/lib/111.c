/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void maiorProfund(struct TreeNode* root,struct TreeNode* raiz, int profundidade,int *maiorProfu1, struct TreeNode* nodoTemp,struct TreeNode** nodo){
    if(root==NULL){return;}
    profundidade++;
    if(profundidade==*(maiorProfu1)){
        nodoTemp=root;
    }
    if(profundidade>*(maiorProfu1)){
        (*maiorProfu1)=profundidade;
        if(nodoTemp==raiz){
            *nodo=root;
        }else{
            *nodo=nodoTemp;
        }
    }

    maiorProfund(root->left, raiz, profundidade, maiorProfu1, nodoTemp, nodo);
    maiorProfund(root->right, raiz, profundidade, maiorProfu1, nodoTemp, nodo);
}

struct TreeNode* subtreeWithAllDeepest(struct TreeNode* root) {
    int *maiorProfu1=malloc(sizeof(int)*1);
    int profundidade=0;
    struct TreeNode* nodo=(struct TreeNode*)malloc(sizeof(struct TreeNode)*1);
    struct TreeNode* raiz=(struct TreeNode*)malloc(sizeof(struct TreeNode)*1);
    struct TreeNode* nodoTemp=(struct TreeNode*)malloc(sizeof(struct TreeNode)*1);
    raiz=root;
    nodo=root;
    nodoTemp=root;
    maiorProfund(root, raiz, profundidade, maiorProfu1, nodoTemp, &nodo);

    return nodo;
}