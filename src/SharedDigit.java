public class SharedDigit {
    public static boolean hasSharedDigit (int one, int two){
        if (one < 10 || one > 99 || two < 10 || two > 99){
            return false;
        }
        else{
            int oneOne = one / 10;
            int oneTwo = one % 10;
            int twoOne = two / 10;
            int twoTwo = two % 10;
//            System.out.println(oneOne);
//            System.out.println(oneTwo);
//            System.out.println(twoOne);
//            System.out.println(twoTwo);
            if (oneOne == twoOne || oneOne == twoTwo || oneTwo == twoOne || oneTwo == twoTwo){
                return true;
            }
            else{
                return false;
            }

        }
    }
}
