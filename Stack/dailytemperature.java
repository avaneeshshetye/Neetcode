class dailytemperature {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];
        
        for (int i = 0; i < temperatures.length - 1; i++) {
            int k = i + 1; // Initializing k to the next day
            while (k < temperatures.length && temperatures[i] >= temperatures[k]) {
                k++; // Move to the next day until a warmer temperature is found
            }
            if (k < temperatures.length) {
                answer[i] = k - i; // Number of days until a warmer temperature is found
            } else {
                answer[i] = 0; // No warmer temperature found in the future days
            }
        }
        // For the last day, there's no future day with a warmer temperature
        answer[temperatures.length - 1] = 0;
        
        return answer;
    }
}

