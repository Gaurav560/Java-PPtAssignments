package Assignment8;

public class Q4 {

    //Session is a lightweight object. Session provides a physical connectivity between your application and database. The Session will be established each time your application wants do something with database. Session object will be provided by SessionFactory object. All the persistent objects will be saved and retrieved through Session object. The session object must be destroyed after using it.
    //
    //The lifecycle of a Session is bounded by the beginning and end of a logical transaction. The main function of the Session is to offer create, read and delete operations for instances of mapped entity classes. Instances may exist in one of three states:
    //
    //transient: never persistent, not associated with any Session.
    //persistent: associated with a unique Session.
    //detached: previously persistent, not associated with any Session.
}
