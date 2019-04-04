package com.manmath.tree;

public class BalancedTree {
  
  public boolean isBalanced(TreeNode node){
	  if(node == null) return false;
	  if(getHeight(node) == -1){
		  return false;
	  } else {
		  return true;
	  }  
  }
  
  public int getHeight(TreeNode node){
	  int leftH = getHeight(node.left);
	  int rightH = getHeight(node.right);
	  if(leftH == -1 || rightH == -1){
		  return -1;
	  }
	  int diff = leftH - rightH;
	  if(diff > 1) {
		  return -1;
	  } else {
		  return Math.max(leftH,rightH)+1;
	  }
  }
  
  class TreeNode{
	  int data;
	  TreeNode left;
	  TreeNode right;
  }

}
