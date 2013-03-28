package school

class Section {
    String sectionCode
    String name
    String description
    String text

    static belongsTo =[course: Course]
    static hasMany = [content: Content]
    static constraints = {
    }
}
