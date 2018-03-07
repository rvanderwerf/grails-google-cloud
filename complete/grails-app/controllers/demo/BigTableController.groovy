package demo

import org.apache.hadoop.hbase.client.Result

class BigTableController {

    AppEngineService appEngineService

    def index() {
        String result = appEngineService.doHelloWorld()
        render(result)
    }

    def list() {
       HashMap bigTable = appEngineService.list()
        //respond bigTable, model:[bigTableCount:bigTable.size()]

        render(view: "list", model: [bigTable: bigTable,bigTableCount:bigTable.size()])


    }

    def edit() {
        String id = params.id
        Result result = appEngineService.getItem(id)
        respond result

    }
}
