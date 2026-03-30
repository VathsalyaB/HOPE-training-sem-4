class AddDigits {
    public static void main(String[] args) {
        AddDigits ad = new AddDigits();
        System.out.println(ad.addDigits(38));
    }
    public int addDigits(int num) {

        int number = num;

        while(number >= 10){
            int sum = 0;
            while(number > 0){
            int digit = number%10;
            sum += digit;       //38%10 = 8 3%10 = 3
            number /= 10;
        }
        number = sum;
    }
    return number;
        
    }
}
