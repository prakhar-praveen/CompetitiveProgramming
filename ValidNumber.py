class Solution:
    def isNumber(self, s: str) -> bool:
        pattern = '\s*([+-]?((\d+\.)|(\d+\.\d+)|(\.\d+)|\d+)(e[+-]?\d+)?)\s*'
        return re.fullmatch(pattern, s)
 

