<html>
    <head>
        <meta name="layout" content="new" />
        <title>Contact Us - Chesil Theatre</title>
        <script src="/js/jquery-1.4.2.js"></script>
		<script src="/js/jquery.cross-slide.js"></script>
		<script type="text/javascript">
     		$(document).ready(function(){
       			$('#slider').crossSlide({
				  sleep: 3,
				  fade: 1
				}, [
					<g:each in="${content.channel.item}" var="item">
						{ src: '${item.group.content.@url}' },
					</g:each>
				]);
     		});
   		</script>
    </head>
    <body>
    	<div id="topsection">
			<img id="logo" src="/img/logo.png">
			<div id="menu">
			</div>
			<div id="mainmenu">
				<a href="/whatson"><img src="/img/whatson.png"/></a>
				<a href="/about"><img src="/img/about.png"/></a>
				<a href="/support"><img src="/img/support.png"/></a>
				<a href="/news" target="_blank"><img src="/img/news.png"/></a>
				<a href="/book"><img src="/img/book.png"/></a>
				<a href="/contact"><img src="/img/contact_on.png"/></a>
			</div>
		</div>
        <div id="contentwrapper">
			<div id="contentcolumn">
				<div class="innertube">
					${content.channel.description}
				</div>
			</div>
		</div>
		<div id="rightcolumn">
			<div class="innertube">
				<div id="sliderholder">
					<div id="slider"><img src="${content.channel.item[0].group.content.@url}" alt="Contact Us"/></div>
				</div>
			</div>
			<div class="innertube">
				<g:render template="/shared/social" />
			</div>
		</div>
    </body>
</html>
