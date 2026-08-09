class Solution {
    public int compress(char[] chars) {

        int n = chars.length;

        List<Character> characters = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        int i = 0;
        while (i < n) {

            char ch = chars[i];
            int count = 0;

            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            characters.add(ch);
            counts.add(count);
        }
        int index = 0;

        for (int j = 0; j < characters.size(); j++) {

            chars[index++] = characters.get(j);

            int count = counts.get(j);

            if (count > 1) {

                String s = String.valueOf(count);

                for (char c : s.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}