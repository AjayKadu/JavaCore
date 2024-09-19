package com.sunbeam;

import java.util.Objects;

public class Cricketer implements Comparable<Cricketer> {
    private String name;
    private String gender;
    private int age;
    private String email_id;
    private long contact;
    private double rating;
    private Role role;  // Using enum for role

    public Cricketer(String name, String gender, int age, String email_id, long contact, double rating, Role role) throws OverratedException, UnderratedException {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email_id = email_id;
        this.contact = contact;
        
        if (rating < 0) {
            throw new UnderratedException("Rating cannot be negative");
        } else if (rating > 5) {
            throw new OverratedException("Rating cannot be more than 5");
        }
        this.rating = rating;
        this.role = role;
    }

    // Getters and Setters...
    

    @Override
    public String toString() {
        return "Cricketer [name=" + name + ", gender=" + gender + ", age=" + age + ", email_id=" + email_id
                + ", contact=" + contact + ", rating=" + rating + ", role=" + role + "]";
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(String string) {
		this.role = string;
	}

	@Override
    public int compareTo(Cricketer other) {
        return this.name.compareTo(other.name);
    }
}
