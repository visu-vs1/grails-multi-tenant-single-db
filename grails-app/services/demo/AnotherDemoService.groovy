package demo
/**
 * Scope configured using Grails convention.
 * @author Kim A. Betti <kim@developer-b.com>
 */
class AnotherDemoService {

    static transactional = false
    static scope = "tenant"

    def touchedByTenant = "none"
}
