class employee {
    private int id;
    private String name;

    // Setter for Name: uses '=' for assignment
    public void setName(String n) { 
        name = n;
    }

    // Getter for Name: returns the string
    public String getName() { 
        return name;
    }

    // Setter for ID
    public void setId(int i) {
        id = i;
    }

    // Getter for ID: no parameters needed!
    public int getId() {
        return id;
    }
}

public class privatemodifier {
    public static void main(String args[]) {
        employee pranav = new employee();
        
        pranav.setName("Pranav");
        pranav.setId(67);

        // Wrap getter in System.out.println to display the output
        System.out.println("Name: " + pranav.getName());
        System.out.println("ID: " + pranav.getId());
    }
}