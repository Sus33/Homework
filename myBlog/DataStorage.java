package myBlog;

public class DataStorage extends Post {
    private Post[] posts;
    private int size;


    @Override
    public void printAllPosts() {
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
        }
    }
}
