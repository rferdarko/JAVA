package Students;

class Students {  // class Student
    // attributes
    String name;  // String variable name
    public int age;  // int variable age
    String major; // String variable for major

    public Students(String name, int age, String major) {  // Constructor
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
