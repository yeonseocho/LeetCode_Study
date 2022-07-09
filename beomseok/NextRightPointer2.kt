/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var left: Node? = null
 *     var right: Node? = null
 *     var next: Node? = null
 * }
 */

class Solution {
    fun connect(root: Node?): Node? {
        if (root == null) {
            return null
        }
        
        var prevNode: NodeWithDepth? = null
        val queue = LinkedList<NodeWithDepth>()
        queue.offer(NodeWithDepth(root, 0))
        
        while (!queue.isEmpty()) {
            val currentNode = queue.poll()
            if (prevNode != null) {
                if (prevNode.depth != currentNode.depth) {
                    prevNode.node.next = null
                } else {
                    prevNode.node.next = currentNode.node
                }
            }
            prevNode = currentNode
            val childDepth = currentNode.depth + 1
            if (currentNode.node.left != null) {
                queue.offer(NodeWithDepth(currentNode.node.left, childDepth))
            }
            if (currentNode.node.right != null) {
                queue.offer(NodeWithDepth(currentNode.node.right, childDepth))
            }
//             currentNode.node.left?.let { queue.offer(NodeWithDepth(it, childDepth)) }
//             currentNode.node.right?.let { queue.offer(NodeWithDepth(it, childDepth)) }
        }
        return root
    }
    
    data class NodeWithDepth(val node: Node, var depth: Int = 0)
}
