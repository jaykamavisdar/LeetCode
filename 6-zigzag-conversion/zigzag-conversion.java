class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++){
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()){
            rows[currentRow].append(c);

            if(currentRow == 0 || currentRow == numRows -1){
                goingDown = !goingDown;
            }

            if (goingDown == true) currentRow++;
            else currentRow--;
        }

        StringBuilder finalStr = new StringBuilder();
        for (StringBuilder row : rows){
            finalStr.append(row);
        }
        return finalStr.toString();
    }
}