package chesil

class ContactController {
	def contentService

    def index = {
    	def content = contentService.getXmlContent("http://picasaweb.google.com/data/feed/api/user/102429012613963938150/album/contact?kind=photo&alt=rss&hl=en_US&access=public&thumbsize=144u")
    	[content:content]
    }
}
