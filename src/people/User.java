package people;

public abstract class User {
    protected String name;
    protected String phoneNumber;
    protected String email;
    protected String password;
    protected String dateOfBirth;
    protected String cnic;
    protected Gender gender;

    public User() {}
    
    public User(String name, String phoneNumber, String email, String password, String dateOfBirth, String cnic, Gender gender) {
        this.name = name;
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setPassword(password);
        setDateOfBirth(dateOfBirth);
        setCnic(cnic);
        this.gender = gender;  // This line was missing in your code
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 11) {
            boolean isValid = true;
            for (int i = 0; i < phoneNumber.length(); i++) {
                if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                this.phoneNumber = phoneNumber;
            } else {
                System.out.println("Invalid phone number: Must contain only digits");
            }
        } else {
                }
    }

    
   public void setEmail(String var1) {
    String var2 = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    if (var1 != null && var1.matches(var2)) {
       this.email = var1;
    } else {
       System.out.println("Invalid email format");
    }

 }

 public void setPassword(String var1) {
    if (var1.length() >= 8) {
       this.password = var1;
    } else {
       System.out.println("Invalid password");
    }

 }

 public void setDateOfBirth(String date) {

       this.dateOfBirth = date;

 }

 public void setCnic(String var1) {
    if (var1.length() == 13) {
       for(int var2 = 0; var2 < 13; ++var2) {
          if (var1.charAt(var2) >= '0' && var1.charAt(var2) <= '9') {
             this.cnic = var1;
          } else {
             System.out.println("Invalid cnic");
          }
       }
    } else {
       System.out.println("Invalid cnic");
    }

 }

 public String getName() {
    return name;
 }

 public String getPhoneNumber() {
    return phoneNumber;
 }

 public String getEmail() {
    return email;
 }

 public String getPassword() {
    return password;
 }

 public String getDateOfBirth() {
    return dateOfBirth;
 }

 public String getCnic() {
    return cnic;
 }

 public Gender getGender() {
    return gender;
 }

 

    // Rest of your methods remain the same...
}