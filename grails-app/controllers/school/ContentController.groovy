package school
import grails.plugins.springsecurity.Secured

@Secured('ROLE_ADMIN')

class ContentController {

    static scaffold = Content

}