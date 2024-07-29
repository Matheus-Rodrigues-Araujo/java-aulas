import entities.Comment;
import entities.Post;

import java.text.SimpleDateFormat;

public class Posts_And_Comments_Exercise {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            Comment c1 = new Comment("Have a nice trip!");
            Comment c2 = new Comment("WOW that's awesome!");

            Post p1 = new Post(sdf.parse("21/04/2023 13:10:42"), "Traveling to Rio!", "I'll visit this wonderful country", 12);
            p1.addComment(c1);
            p1.addComment(c2);

            Comment p2_c1 = new Comment("Enyoy!");
            Comment p2_c2 = new Comment("Visit Times Square! It's pretty cool!");

            Post p2 = new Post(sdf.parse("12/05/2024 18:14:12"), "Traveling to New York City!", "I'll be learning about the culture", 524);
            p2.addComment(p2_c1);
            p2.addComment(p2_c2);

            System.out.println(p1);
            System.out.println("---------------------------");
            System.out.println(p2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
