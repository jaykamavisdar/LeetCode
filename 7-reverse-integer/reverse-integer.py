class Solution:
    def reverse(self, x: int) -> int:
        if (((-2)**31) > x > ((2**31)-1)):
            return 0
        elif (x >= 0):
            xStr = str(x)
            xRev = int(xStr[::-1])
        else:
            x = -x
            xStr = str(x)
            xRev = (-1*(int(xStr[::-1])))
        if (((-2)**31) < xRev < ((2**31)-1)):
            return xRev
        else:
            return 0