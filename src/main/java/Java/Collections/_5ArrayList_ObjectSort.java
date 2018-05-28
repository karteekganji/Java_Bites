package Java.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _5ArrayList_ObjectSort {

	public static class Student implements Comparable<Student>{
		private String studentname;
		private int rollno;
		private int studentage;

		public Student(int rollno, String studentname, int studentage) {
			this.rollno = rollno;
			this.studentname = studentname;
			this.studentage = studentage;
		}

		public String getStudentname() {
			return studentname;
		}

		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public int getStudentage() {
			return studentage;
		}

		public void setStudentage(int studentage) {
			this.studentage = studentage;
		}

		public int compareTo(Student comparestu) {
			int compareage = comparestu.getStudentage();
			/* For Ascending order */
			return this.studentage - compareage;

			/* For Descending order do like this */
			// return compareage-this.studentage;
		}

		@Override
		public String toString() {
			return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
		}
		
		public static class ObjectSorting_Comparable {

			public static void main(String args[]) {
				ArrayList<Student> arraylist = new ArrayList<Student>();
				arraylist.add(new Student(223, "Chaitanya", 26));
				arraylist.add(new Student(245, "Rahul", 24));
				arraylist.add(new Student(209, "Ajeet", 32));
				arraylist.add(new Student(215, "Krunal", 20));
				arraylist.add(new Student(230, "Vamshi", 36));
				
				Collections.sort(arraylist);
				
				for (Student str : arraylist) {
					System.out.println(str);
				}
			}
		}
		
		/* Comparator for sorting the list by Student Name */
		public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

			public int compare(Student s1, Student s2) {
				String StudentName1 = s1.getStudentname().toUpperCase();
				String StudentName2 = s2.getStudentname().toUpperCase();

				// ascending order
				return StudentName1.compareTo(StudentName2);

				// descending order
				// return StudentName2.compareTo(StudentName1);
			}
		};

		/* Comparator for sorting the list by roll no */
		public static Comparator<Student> StuRollno = new Comparator<Student>() {

			public int compare(Student s1, Student s2) {

				int rollno1 = s1.getRollno();
				int rollno2 = s2.getRollno();

				/* For ascending order */
				return rollno1 - rollno2;

				/* For descending order */
				// rollno2-rollno1;
			}
		};

		public static class ObjectSorting_Comparator {

			public static void main(String args[]) {
				ArrayList<Student> arraylist = new ArrayList<Student>();
				arraylist.add(new Student(101, "Zues", 26));
				arraylist.add(new Student(505, "Abey", 24));
				arraylist.add(new Student(809, "Vignesh", 32));

				/* Sorting based on Student Name */
				System.out.println("Student Name Sorting:");
				Collections.sort(arraylist, Student.StuNameComparator);

				for (Student str : arraylist) {
					System.out.println(str);
				}

				/* Sorting on Rollno property */
				System.out.println("RollNum Sorting:");
				Collections.sort(arraylist, Student.StuRollno);
				for (Student str : arraylist) {
					System.out.println(str);
				}
			}
		}
	}
	
	public static class Demo {
		public static void main(String[] args) {
			/*
			 * Integer class implements Comparable Interface so we can use the
			 * sort method
			 */
			int[] arr = { 11, 55, 22, 0, 89 };
			Arrays.sort(arr);
			System.out.print("Sorted Int Array: ");
			System.out.println(Arrays.toString(arr));

			/*
			 * String class implements Comparable Interface so we can use the
			 * sort method
			 */
			System.out.print("Sorted String Array: ");
			String[] names = { "Steve", "Ajeet", "Kyle" };
			Arrays.sort(names);
			System.out.println(Arrays.toString(names));

			/*
			 * String class implements Comparable Interface so we can use the
			 * sort method
			 */
			System.out.print("Sorted List: ");
			List<String> fruits = new ArrayList<String>();
			fruits.add("Orange");
			fruits.add("Banana");
			fruits.add("Apple");
			fruits.add("Guava");
			fruits.add("Grapes");
			Collections.sort(fruits);
			System.out.println(fruits);
			for (String s : fruits)
				System.out.print(s + ", ");
		}
	}
	
	/**
	 * Example: Sorting Custom object by implementing Comparable interface
	 */

	/*
	 * As you can see I have implemented the Comparable interface in my Author
	 * class because I want to sort the objects of this class. I have written
	 * the logic of sorting in the compareTo() method, you can write logic based
	 * on the requirement. I wanted to sort the author names by last name first
	 * and if the last name is same then by first name. If you want to sort by
	 * the last name only then first line inside compareTo() method is enough.
	 */

	public static class Author implements Comparable<Author> {

		String firstName;
		String lastName;
		String bookName;

		Author(String first, String last, String book) {
			this.firstName = first;
			this.lastName = last;
			this.bookName = book;
		}

		@Override
		/*
		 * This is where we write the logic to sort. This method sort
		 * automatically by the first name in case that the last name is the
		 * same.
		 */
		public int compareTo(Author au) {
			/*
			 * Sorting by last name. compareTo should return < 0 if
			 * this(keyword) is supposed to be less than au, > 0 if this is
			 * supposed to be greater than object au and 0 if they are supposed
			 * to be equal.
			 */
			int last = this.lastName.compareTo(au.lastName);
			// Sorting by first name if last name is same d
			return last == 0 ? this.firstName.compareTo(au.firstName) : last;
		}

		public static class SortAuthByNames {
			public static void main(String args[]) {
				// List of objects of Author class
				ArrayList<Author> al = new ArrayList<Author>();
				al.add(new Author("Henry", "Miller", "Tropic of Cancer"));
				al.add(new Author("Nalo", "Hopkinson", "Brown Girl in the Ring"));
				al.add(new Author("Frank", "Miller", "300"));
				al.add(new Author("Deborah", "Hopkinson", "Sky Boys"));
				al.add(new Author("George R. R.", "Martin", "Song of Ice and Fire"));

				/*
				 * Sorting the list using Collections.sort() method, we can use
				 * this method because we have implemented the Comparable
				 * interface in our user defined class Author
				 */
				Collections.sort(al);
				for (Author str : al) {
					System.out.println(str.firstName + " " + str.lastName + " " + "Book: " + str.bookName);
				}
			}
		}
	}
	
	public static class Author1 implements Comparable<Author1> {
		String firstName;
		String bookName;
		int auAge;

		Author1(String first, String book, int age) {
			this.firstName = first;
			this.bookName = book;
			this.auAge = age;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public int getAuAge() {
			return auAge;
		}

		public void setAuAge(int auAge) {
			this.auAge = auAge;
		}

		@Override
		/*
		 * When we only use Comparable, this is where we write sorting logic.
		 * This method is called when we implement the Comparable interface in
		 * our class and call Collections.sort()
		 */
		public int compareTo(Author1 au) {
			return this.firstName.compareTo(au.firstName);
		}

		public static class SortingPgm {

			public static class AuthorAgeComparator implements Comparator<Author1> {
				public int compare(Author1 a1, Author1 a2) {
					if (a1.auAge == a2.auAge)
						return 0;
					else if (a1.auAge > a2.auAge)
						return 1;
					else
						return -1;
				}
			}

			public static class BookNameComparator implements Comparator<Author1> {
				public int compare(Author1 a1, Author1 a2) {
					return a1.bookName.compareTo(a2.bookName);
				}
			}

			public static void main(String args[]) {
				// List of objects of Author class
				ArrayList<Author1> al = new ArrayList<Author1>();
				al.add(new Author1("Henry", "Tropic of Cancer", 45));
				al.add(new Author1("Nalo", "Brown Girl in the Ring", 56));
				al.add(new Author1("Frank", "300", 65));
				al.add(new Author1("Deborah", "Sky Boys", 51));
				al.add(new Author1("George R. R.", "A Song of Ice and Fire", 62));
				/*
				 * Sorting the list using Collections.sort() method, we can use
				 * this method because we have implemented the Comparable
				 * interface in our user defined class Author
				 */
				System.out.println("Sorting by Author First Name:");
				Collections.sort(al);
				for (Author1 au : al) {
					System.out.println(au.getFirstName() + ", " + au.getBookName() + ", " + au.getAuAge());
				}
				/* Sorting using AuthorAgeComparator */
				System.out.println("Sorting by Author Age:");
				Collections.sort(al, new AuthorAgeComparator());
				for (Author1 au : al) {
					System.out.println(au.getFirstName() + ", " + au.getBookName() + ", " + au.getAuAge());
				}
				/* Sorting using BookNameComparator */
				System.out.println("Sorting by Book Name:");
				Collections.sort(al, new BookNameComparator());
				for (Author1 au : al) {
					System.out.println(au.getFirstName() + ", " + au.getBookName() + ", " + au.getAuAge());
				}
			}
		}
	}
}
