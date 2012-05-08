package chesil

class WhatsonController {
	def contentService
	
    def current = {
    	def content = contentService.getXmlContent("http://picasaweb.google.com/data/feed/api/user/102429012613963938150/album/current?kind=photo&alt=rss&hl=en_US&access=public&thumbsize=144u")
    	[content:content]
    }
    
    def archive = {
    	def content = contentService.getXmlContent("http://picasaweb.google.com/data/feed/api/user/102429012613963938150/album/archive?kind=photo&alt=rss&hl=en_US&access=public&thumbsize=144u")
    	[content:content]
    }

    def play = {
    	def play = contentService.getXmlContent("https://picasaweb.google.com/data/feed/base/user/102429012613963938150/albumid/${params.guid}?alt=rss&kind=photo&hl=en_US")
    	[play:play]
    }
    
}
