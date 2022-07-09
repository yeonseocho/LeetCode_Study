class Solution:
    def isValid(self, s: str) -> bool:
        parentheses = {
            "(" : ")",
            "{" : "}",
            "[" : "]"
        } 
        stack = [] 

        for par in s:
            if par in parentheses.keys():
                stack.append(par) 
            else: 
                try:
                    op = stack.pop()
                    if parentheses[op] != par:
                        return False
                except:
                    return False

        if stack:
            return False

        else:
            return True 

        
