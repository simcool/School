package school

class Section {

    String name
    String description
    String text

    static belongsTo =[course: Course]
    static constraints = {
    }
}
