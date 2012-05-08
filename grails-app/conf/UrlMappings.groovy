class UrlMappings {

	static mappings = {
		"/whatson"(controller:"whatson", action:"current")
		"/whatson/future"(controller:"whatson", action:"future")
		"/whatson/current"(controller:"whatson", action:"current")
		"/whatson/archive"(controller:"whatson", action:"archive")
		"/whatson/$name/${guid}"(controller:"whatson", action:"play")
		"/whatson"(controller:"whatson", action:"index")
		"/about"(controller:"about", action:"theatre")
		"/about/theatre"(controller:"about", action:"theatre")
		"/about/youth_theatre"(controller:"about", action:"youth_theatre")
		"/about/taking_part"(controller:"about", action:"taking_part")
		"/support/"(controller:"support", action:"join")
		"/support/join"(controller:"support", action:"join")
		"/support/development"(controller:"support", action:"development")
		"/support/giving"(controller:"support", action:"giving")
		"/members/"(controller:"members", action:"index")
		"/book/"(controller:"book", action:"index")
		"/contact/"(controller:"contact", action:"index")
		"/news"(controller:"news", action:"twitter")
		"/"(controller:"whatson", action:"current")
		"500"(view:'/error')
	}
}
