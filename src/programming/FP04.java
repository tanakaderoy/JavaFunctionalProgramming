package programming;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Course {
    private String courseName, category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String courseName, String category, int reviewScore, int noOfStudents) {
        this.courseName = courseName;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore=" + reviewScore +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}


public class FP04 {
    public static void main(String[] args) {

        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 30212),
                new Course("Spring Boot", "Framework", 88, 3299),
                new Course("API", "Framework", 94, 83921),
                new Course("FullStack", "FullStack", 89, 67783),
                new Course("AWS", "Cloud", 90, 10293),
                new Course("Docker", "Cloud", 99, 2837),
                new Course("Kubernetes", "Cloud", 92, 10231),
                new Course("Microservices", "Microservices", 98, 92013)
        );

//        System.out.println(courses.stream().noneMatch(c-> c.getReviewScore() > 87));
        Comparator<Course> comparingByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);
        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudents.thenComparing(Course::getReviewScore))
                        .skip(2)
                        .collect(Collectors.toList()));
    }
}
