// Place your Spring DSL code here
beans = {
  simpleRemoteServiceCache(org.springframework.cache.ehcache.EhCacheFactoryBean) {
  	def timeToLive = 60 // life span in seconds
  }
}