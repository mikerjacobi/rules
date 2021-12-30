
save-changes:
	@rm -rf temp
	@git clone ssh://admin@0.0.0.0:8001/MySpace/rules temp
	@rm -rf src && mv temp/src src
	@rm -rf temp