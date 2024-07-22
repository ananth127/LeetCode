class Solution {
    public String[] sortPeople(String[] array2, int[] array1) {

        // Create an array of pairs
        Pair[] pairs = new Pair[array1.length];
        for (int i = 0; i < array1.length; i++) {
            pairs[i] = new Pair(array1[i], array2[i]);
        }

        // Sort the array of pairs using a custom comparator for descending order
        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.number < p2.number) {
                    return 1;  // p1 should come after p2
                } else if (p1.number > p2.number) {
                    return -1; // p1 should come before p2
                } else {
                    return 0;  // they are equal
                }
            }
        });

        // Reflect changes back to array2
        for (int i = 0; i < pairs.length; i++) {
            array2[i] = pairs[i].text;
        }
        return array2;
    }

    class Pair {
        int number;
        String text;

        Pair(int number, String text) {
            this.number = number;
            this.text = text;
        }
    }
}
