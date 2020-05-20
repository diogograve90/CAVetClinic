package Staff;

public class Staff {
	private int id;
    private String name;
    private String salary;
    private String task;

    public Staff(int id, String name, String salary, String task) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.task = task;
    }
        
    public Staff() {
		super();
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
        
    
    public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
    public String toString() {
        return  "id=" + id + '\n' +
                "   name='" + name + '\'' + '\n' +
                "   salary='" + salary + '\'' + '\n' ;
    }
}