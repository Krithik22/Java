public class FlipAndInvertImage {
        public int[][] flip(int[][] image){
            for(int i = 0; i < image.length; i++){
                int start = 0;
                int end = image.length - 1;
                while(start < end){
                    int temp = image[i][start];
                    image[i][start] = image[i][end];
                    image[i][end] = temp;
                    start++;
                    end--;
                }
            }
            return image;
        }
        public int[][] invert(int[][] image){
            for(int i = 0; i < image.length; i++){
                for(int j = 0; j < image.length; j++){
                    if(image[i][j] == 1){
                        image[i][j] = 0;
                    } else{
                        image[i][j] = 1;
                    }
                }
            }
            return image;
        }
        public int[][] flipAndInvertImage(int[][] image) {
            int[][] flippedImage = flip(image);
            int[][] invertedImage = invert(flippedImage);
            return invertedImage;
        }
}
