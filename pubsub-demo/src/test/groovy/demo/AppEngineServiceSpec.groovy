package demo

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class AppEngineServiceSpec extends Specification implements ServiceUnitTest<AppEngineService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
