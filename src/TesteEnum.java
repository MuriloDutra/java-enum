
public class TesteEnum {
	public static void main (String [] args) {
		Prioridade pMax = Prioridade.MAX;
		Person person = Person.MARRIED;

		System.out.println("Prioridade: " + pMax.name() + ", " + pMax.ordinal() + ", " + pMax.getValor());
		System.out.println("Person: " + person.name() + ", " + person.ordinal() + ", " + person.getStatus());
	}
}
