package chesil

class AboutController {
   def contentService
	
    def theatre = {
    	def content = contentService.getXmlContent("http://picasaweb.google.com/data/feed/api/user/102429012613963938150/album/our_theatre?kind=photo&alt=rss&hl=en_US&access=public&thumbsize=144u")
    	[content:content]
    }
    
    def taking_part = {
    	def content = contentService.getXmlContent("http://picasaweb.google.com/data/feed/api/user/102429012613963938150/album/taking_part?kind=photo&alt=rss&hl=en_US&access=public&thumbsize=144u")
    	[content:content]
    }
    
    def youth_theatre = {
    	def content = contentService.getXmlContent("http://picasaweb.google.com/data/feed/api/user/102429012613963938150/album/youth?kind=photo&alt=rss&hl=en_US&access=public&thumbsize=144u")
    	[content:content]
    }
}
