class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        
        if (s.length % 2 != 0) {
            return false
        }
        
        val temp = s.replace("()", "").replace("{}", "").replace("[]", "")
        for (i in temp.indices) {
            when (temp[i]) {
                '(', '{', '[' -> stack.push(temp[i])
                else -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    val popValue = stack.pop()
                    if (temp[i] == ')' && popValue != '(') {
                        return false
                    } else if (temp[i] == '}' && popValue != '{') {
                        return false
                    } else if (temp[i] == ']' && popValue != '[') {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}
