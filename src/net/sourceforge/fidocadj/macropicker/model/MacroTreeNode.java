package net.sourceforge.fidocadj.macropicker.model;

import javax.swing.*;
import javax.swing.tree.*;

/**
 * Extended interface of JTree node for showing macros.
 */ 
public interface MacroTreeNode extends TreeNode
{
    /** 
     * Sort child nodes.
     * This must be called recursively.
     */ 
	void sortTree();
	
	/** Return icon for identifying node type. */
	Icon getIcon();
	
	/** Return string for label. */
	String toString();
}