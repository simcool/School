import school.*;

class BootStrap {

    def init = { servletContext ->
      Role roleAdmin = Role.findByAuthority('ROLE_ADMIN')
      if (!roleAdmin){
           roleAdmin = new Role(authority: 'ROLE_ADMIN').save()
      }
        User user = User.executeQuery("select u from User u, UserRole ur where u.id = ur.user.id and ur.role.authority = 'ROLE_ADMIN'")


    }
    def destroy = {
    }
}
