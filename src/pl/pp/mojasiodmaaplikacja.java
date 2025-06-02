package pl.pp;

class Person {
    public String forename;
    public String surname;
    public int age;
    public String address;
    public int birthYear;

    public Person() {
    }

    public Person(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
    }

    public void hiToAll() {
        System.out.println("Nazywam się " + forename + " " + surname + ". Mam " + age + " lat.");
        if (address != null) {
            System.out.println("Mój adres: " + address);
        }
        if (birthYear != 0) {
            System.out.println("Rok urodzenia: " + birthYear);
        }
    }

    public void growOld(int years) {
        age += years;
    }

    public void beYounger() {
        if (age > 0) {
            age -= 1;
        }
    }

    public String getName() {
        return forename;
    }

    public void setName(String nameToSet) {
        forename = nameToSet;
    }
}


class mojaSiodmaAplikacja {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.hiToAll();

        person1.forename = "Mateusz";
        person1.surname = "Karmazyn";
        person1.age = 24;
        person1.address = "Warszawa, ul. Przykładowa 1";
        person1.birthYear = 2000;
        person1.hiToAll();

        Person person2 = new Person("Dariusz", "Walendziak", 42);
        person2.address = "Kraków, ul. Testowa 5";
        person2.birthYear = 1983;
        person2.hiToAll();

        person1.growOld(1);
        person2.growOld(3);

        person1.hiToAll();
        person2.hiToAll();

        System.out.println(person1.getName());
        person1.setName("Lolo");
        System.out.println(person1.getName());
        person1.hiToAll();

        person2.beYounger();
        person2.hiToAll();
    }
}
