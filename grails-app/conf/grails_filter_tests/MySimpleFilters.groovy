package grails_filter_tests

class MySimpleFilters {

    def filters = {
        all(controller:'simple', action:'index') {
            before = {
                applicationContext.getBean(SimpleService).aMethod()
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
