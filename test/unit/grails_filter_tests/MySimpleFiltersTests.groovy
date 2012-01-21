package grails_filter_tests

import grails.test.mixin.*
import org.junit.Test

@TestMixin(grails.test.mixin.web.FiltersUnitTestMixin)
@Mock(grails_filter_tests.MySimpleFilters)
class MySimpleFiltersTests {

    @Test
    public void testFilter(){
        defineBeans {
            simpleService(StubbedSimpleService)
        }

        
        SimpleController controller = mockController(SimpleController);

        withFilters(controller:"simple" , action:"index"){
            controller.index()    
        }
    }
}

class StubbedSimpleService extends SimpleService {

    def aMethod(){
        println "Stubbed Filter Method"
    }
}
