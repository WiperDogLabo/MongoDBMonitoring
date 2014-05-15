Prepare to run job:
 - Copy mongo-java-driver-2.12.1.jar to lib/java/bundle.wrap
 - Update listBundle.csv:
		wrapfile,lib/java/bundle.wrap/mongo-java-driver-2.12.1.jar,3,
 - Update defaultJobCaller.groovy: binding dbmongo and json slurper to job
		runFetchAction method:
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
  			DB dbMongo = mongo.getDB("admin");
			def slurper = new JsonSlurper()
			binding.setVariable("dbMongo", dbMongo)
			binding.setVariable("slurper", slurper)
