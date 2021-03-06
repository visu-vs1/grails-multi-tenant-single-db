package demo

import grails.plugin.multitenant.core.annotation.MultiTenant

@MultiTenant
class DemoAnimal {

    static belongsTo = [owner: DemoPetOwner]

    String name

    static constraints = {
        owner nullable: true
    }


    @Override
    public String toString() {
        "Animal[name: $name, tenantId: $tenantId]"
    }
}
