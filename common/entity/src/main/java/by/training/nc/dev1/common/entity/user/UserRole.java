package by.training.nc.dev1.common.entity.user;

/**
 * Created by dmbu0616 on 4/3/2017.
 */
public enum UserRole {
    ADMIN("Portal Admin", 1), MANAGER("Shop Manager", 2), CUSTOMER("Registered Customer", 3), GUEST("Non-Registered Customer", 4);

    private String name;
    private Integer role;

    UserRole(String name, Integer role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public Boolean isAdmin(){
        return this == ADMIN;
    }

    public Boolean isManager(){
        return this == MANAGER;
    }

    public Boolean isCustomer(){
        return this == CUSTOMER;
    }

    public Boolean isGuest(){
        return this == GUEST;
    }
}
