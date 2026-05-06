package samplewebsite.site;

	class Company {
	    private int code;
	    private String name;
	    private String requirements;
	    private String team;
	    private String phone;
	    private String location;

	    public Company(int code, String name, String requirements, String team, String phone, String location) {
	        this.code = code;
	        this.name = name;
	        this.requirements = requirements;
	        this.team = team;
	        this.phone = phone;
	        this.location = location;
	    }

	    public int getCode() {
	        return code;
	    }

	    public String getRequirements() {
	        return requirements;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void display() {
	        System.out.println("Code: " + code);
	        System.out.println("Name: " + name);
	        System.out.println("Requirements: " + requirements);
	        System.out.println("Team: " + team);
	        System.out.println("Phone: " + phone);
	        System.out.println("Location: " + location);
	        System.out.println("------------------------");
	    }
	}


