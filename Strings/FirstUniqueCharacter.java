class FirstUniqueCharacter {

    public int firstUniqChar(String s) {

        char[] arr1 = s.toCharArray();
        int[] freq1 = new int[26];
        for (char c : arr1) {
            freq1[c - 'a']++;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (freq1[arr1[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;

        // Working nested for loop approach but shows TLE Error

        // char[] arr1 = s.toCharArray();
        // int size = arr1.length;

        // int[] freq1 = new int[size];

        // for(int i = 0; i < size; i++) {

        //     int count = 0;

        //     for(int j = 0; j < size; j++) {

        //         if(arr1[i] == arr1[j]) {
        //             count++;
        //         }

        //     }

        //     freq1[i] = count;
        // }

        // for(int i = 0; i < size; i++) {

        //     if(freq1[i] == 1) {
        //         return i;
        //     }

        // }

        // return -1;
    }
}