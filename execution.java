import java.util.ArrayList;
import java.util.*;
public class execution {
    ArrayList<person> emplist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addcontacts() {


        person obj = new person();
        System.out.println("enter first name (only alphabets allowed)");
        while (!sc.hasNext("[A-Za-z]+")) {
            System.out.println("Nope, that's not correct please enter valid name!");
            sc.next();
        }
        String word = sc.next();
        obj.setFirstname(word);
        System.out.println("enter last name (only alphabets allowed)");
        while (!sc.hasNext("[A-Za-z]+")) {
            System.out.println("Nope, that's not correct please enter valid name!");
            sc.next();
        }
        String word2 = sc.next();
        obj.setSecondname(word2);
        System.out.println("how many phone  no you want to add ");
        int add = sc.nextInt();
        int c = 0;
        while (add > 0) {
            System.out.println("enter contact no. (10 digit no starting with 6,7,8,9 are allowed)");
            while (!sc.hasNext("[6789]{1}[0-9]{9}")) {
                System.out.println("Nope, that's not correct please enter valid contact no!");
                sc.next();
            }
            c++;
            String word3 = sc.next();
            if (c == 1) {
                obj.setContactno(word3);
            } else {
                obj.setContactno(obj.getContactno() + "\n" + word3);
            }
            add--;
        }
        sc.nextLine();
        System.out.println("enter address");
        obj.setAddress(sc.nextLine());
        System.out.println("enter mailid (like:- abc123@gmail.com )");
        while (true) {
            String s = sc.nextLine();
            if (s.matches("^[a-z]+[0-9]+@[a-z]+\\.[a-z]+$")) {
                obj.setMailid(s);
                break;
            } else {
                System.out.println("Invalid email address ! Enter again");
            }
        }
        emplist.add(obj);
    }

    public void displaycontacts() {
        for (person e : emplist) {
            System.out.println(e);
        }
    }

    public void search() {
        person emp = null;
        System.out.println("enter that you want to search");
        String attr = sc.nextLine();
        System.out.println("you want to search by which attribute");
        String s = sc.nextLine();
        for (int i = 0; i < emplist.size(); i++) {
            emp = emplist.get(i);
            if (s.equalsIgnoreCase("firstname")) {
                if (emp.getFirstname().equalsIgnoreCase(attr)) {
                    System.out.println("match found"+"\n");
                    System.out.println("<-----------x------x---------->");
                    System.out.println(emp);
                }
            } else if (s.equalsIgnoreCase("secondname")) {
                if (emp.getSecondname().equalsIgnoreCase(attr)) {
                    System.out.println("match found"+"\n");
                    System.out.println("<-----------x------x---------->");
                    System.out.println(emp);
                }
            } else if (s.equalsIgnoreCase("contactno")) {
                if (emp.getContactno().contains(attr)) {
                    System.out.println("match found"+"\n");
                    System.out.println("<-----------x------x---------->");
                    System.out.println(emp);
                }
            } else if (s.equalsIgnoreCase("address")) {
                if (emp.getAddress().equalsIgnoreCase(attr)) {
                    System.out.println("match found"+"\n");
                    System.out.println("<-----------x------x---------->");
                    System.out.println(emp);
                }
            } else if (s.equalsIgnoreCase("mailid")) {
                if (emp.getMailid().equalsIgnoreCase(attr)) {
                    System.out.println("match found"+"\n");
                    System.out.println("<-----------x------x---------->");
                    System.out.println(emp);
                }
            } else {
                System.out.println("please enter valid attribute");
            }
        }
    }

    public void delete() {
        person emp = null;
        System.out.println("enter that you want to remove");
        String attr = sc.nextLine();
        System.out.println("you want to search by which attribute");
        String s = sc.nextLine();
        for (int i = 0; i < emplist.size(); i++) {
            emp = emplist.get(i);
            if (s.equalsIgnoreCase("firstname")) {
                if (emp.getFirstname().equalsIgnoreCase(attr)) {
                    System.out.println("match found"+"\n");
                    System.out.println("<-----------x------x---------->");
                    emplist.remove(emp);
                    System.out.println("the contact of " + emp.getFirstname()+" has deleted" );
                }
            } else if (s.equalsIgnoreCase("secondname")) {
                if (emp.getSecondname().equalsIgnoreCase(attr)) {
                    System.out.println("match found"+"\n");
                    System.out.println("<-----------x------x---------->");
                    emplist.remove(emp);
                    System.out.println("the contact of " + emp.getFirstname()+" has deleted" );
                }
            } else if (s.equalsIgnoreCase("contactno")) {
                if (emp.getContactno().contains(attr)) {
                    System.out.println("match found"+"\n");
                    System.out.println("<-----------x------x---------->");
                    emplist.remove(emp);
                    System.out.println("the contact of " + emp.getFirstname()+" has deleted" );
                }
            } else if (s.equalsIgnoreCase("address")) {
                if (emp.getAddress().equalsIgnoreCase(attr)) {
                    System.out.println("match found"+"\n");
                    System.out.println("<-----------x------x---------->");
                    emplist.remove(emp);
                    System.out.println("the contact of " + emp.getFirstname()+" has deleted" );
                }
            } else if (s.equalsIgnoreCase("mailid")) {
                if (emp.getMailid().equalsIgnoreCase(attr)) {
                    System.out.println("match found"+"\n");
                    System.out.println("<-----------x------x---------->");
                    emplist.remove(emp);
                    System.out.println("the contact of " + emp.getFirstname()+" has deleted" );
                }
            } else {
                System.out.println("please enter valid attribute");
            }
        }
    }
}
