public class Identificador {
    String name;
    String password;
    String alias;
    Integer edad;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAlias() {
        return alias;
    }

    public Integer getEdad() {
        return edad;
    }

    public Identificador(String name, String password, String alias, Integer edad) {
        this.name = name;
        this.password = password;
        this.alias = alias;
        this.edad = edad;
    }
}
