package chesil

class ContentService {
	def simpleRemoteServiceCache
    static transactional = false

    def getCachedUrlContent(String url) {
		if (simpleRemoteServiceCache.get(url)) {
			return simpleRemoteServiceCache.get(url).value
		} else {
			def content = new URL(url).text
			simpleRemoteServiceCache.put(new net.sf.ehcache.Element(url, content))
			return content
		}
    }
    
    def getXmlContent(String url) {
    	def content = getCachedUrlContent(url)
		def slurp = new XmlSlurper()
		return slurp.parseText(content)
    }
}
