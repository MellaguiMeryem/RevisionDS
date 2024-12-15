/**
* Représente un employé dans une entreprise.
*/
public class Employee {
// TODO: Ajoutez les attributs ici (nom, id, position).
    private string nom;
    private int id;
    private string position;
// TODO: Ajoutez un constructeur pour initialiser les attributs.
    public Employee(string nom,int id ,string position){
        super();
        this.nom=nom;
        this.id=id;
        this.position=position;
    }
// TODO: Ajoutez des méthodes pour récupérer les valeurs des attributs (getters).
    public string getNom(){
        return nom;
    }
    public void setNom(string nom){
        this.nom=nom;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public string getPosition(){
        return position;
    }
    public void setPosition(string position){
        this.position=position;
    }
// TODO: Ajoutez une méthode toString() pour représenter un employé en texte.
    public String toString(){
        return "Employe [nom= "+ nom + "id = "+ id + "position="+position+"]";

    }
}
