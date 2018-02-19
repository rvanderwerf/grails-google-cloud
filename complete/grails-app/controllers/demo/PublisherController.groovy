package demo

class PublisherController {
    PublisherService publisherService

    def index() { }

    def doPublisherDemo(String topicId) {
        publisherService.publisherDemo(topicId,1)
        render "Messages sent!"
    }
}
