package chesil

class SupportController {
    def contentService
	
    def join = {
    	def content = contentService.getXmlContent("http://picasaweb.google.com/data/feed/api/user/102429012613963938150/album/join?kind=photo&alt=rss&hl=en_US&access=public&thumbsize=144u")
    	[content:content]
    }
    
    def development = {
    	def content = contentService.getXmlContent("http://picasaweb.google.com/data/feed/api/user/102429012613963938150/album/development?kind=photo&alt=rss&hl=en_US&access=public&thumbsize=144u")
    	[content:content]
    }
    
    def giving = {
    	def content = contentService.getXmlContent("http://picasaweb.google.com/data/feed/api/user/102429012613963938150/album/giving?kind=photo&alt=rss&hl=en_US&access=public&thumbsize=144u")
    	[content:content]
    }
}
