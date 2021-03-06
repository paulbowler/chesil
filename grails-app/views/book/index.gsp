<html>
    <head>
        <meta name="layout" content="new" />
        <title>Book Tickets - Chesil Theatre</title>
        <script src="/js/jquery-1.4.2.js" type="text/javascript"></script>
		<script src="/js/jquery.cross-slide.js" type="text/javascript"></script>
		<script type="text/javascript">
     		$(document).ready(function(){
       			$('#slider').crossSlide({
				  sleep: 3,
				  fade: 1
				}, [
					<g:each in="${content.channel.item}" var="item" status="i">
						{ src: '${item.group.content.@url}' }<g:if test="${i < content.channel.item.size() - 1}">,</g:if>
					</g:each>
				]);
     		});
   		</script>
    </head>
    <body>
    	<div id="topsection">
			<img id="logo" src="/img/logo.png" alt="Chesil Theatre"/>
			<div id="menu">
			</div>
			<div id="mainmenu">
				<a href="/whatson"><img src="/img/whatson.png" alt="Whats on"/></a>
				<a href="/about"><img src="/img/about.png" alt="About"/></a>
				<a href="/support"><img src="/img/support.png" alt="Support"/></a>
				<a href="/news" target="_blank"><img src="/img/news.png" alt="News"/></a>
				<a href="/book"><img src="/img/book_on.png" alt="Book"/></a>
				<a href="/contact"><img src="/img/contact.png" alt="Contact"/></a>
			</div>
		</div>
		<div id="contentwrapper">
			<div id="contentcolumn">
				<div class="innertube">
					${content.channel.description}
					<a href="http://www.ticketsource.co.uk/chesiltheatre"><img src="/img/booking.png" alt="Booking" /></a>
				</div>
			</div>
		</div>
		<div id="rightcolumn">
			<div class="innertube">
				<div id="sliderholder">
					<div id="slider"><img src="${content.channel.item[0].group.content.@url}" alt="Booking"/></div>
				</div>
			</div>
			<div class="innertube">
				<g:render template="/shared/social" />
			</div>
		</div>
    </body>
</html>
