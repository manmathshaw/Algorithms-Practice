/**
 * 
 */
package com.manmath.linkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * @author manmathshaw
 *
 */
public class ReverseLinkList {
  private static Node reverseLink(Node current){
    
    if(current == null || current.nextNode == null){
      return current;
    }
  
    Node reverse_list = reverseLink(current.nextNode);
    current.nextNode.nextNode=current;
    current.nextNode=null;
    return reverse_list;
  }

}
