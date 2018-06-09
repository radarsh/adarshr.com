package com.adarshr.controller

import org.springframework.ui.ModelMap
import spock.lang.Specification


class GreetingControllerSpec extends Specification {

    def "greeting"() {
        given:
            def model = new ModelMap()
        when:
            def view = new GreetingController().greeting('Foo', model)
        then:
            view == 'greeting'
            model.name == 'Foo'
    }
}
