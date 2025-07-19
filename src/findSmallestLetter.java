public class findSmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        char res=nextGreatestLetter(letters,target);
        System.out.println(res);
    }

        static char nextGreatestLetter(char[] letters, char target) {
            int start=0;
            int end=letters.length-1;
            int middle=0;


            while(start<=end){
                middle=start+(end-start)/2;

                if(letters[middle]<=target){
                    start=middle+1;
                }
                else{
                    end=middle-1;
                }


            }

            return letters[start % letters.length];

        }
    }

