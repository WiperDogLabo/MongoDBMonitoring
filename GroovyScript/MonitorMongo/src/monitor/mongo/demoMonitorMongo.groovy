package monitor.mongo

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

import groovy.json.JsonSlurper;

class demoMonitorMongo {
	def static slurper = new JsonSlurper()
	
	public static void main(def args) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		DB db = mongo.getDB("admin");
		def finalData = [:]
		// Server status
		def serverStatusStr = db.command("serverStatus").toString()
		def mapDataServerStatus = this.slurper.parseText(serverStatusStr)
		finalData['host'] = mapDataServerStatus['host']
		finalData['version'] = mapDataServerStatus['version']
		finalData['memory'] = mapDataServerStatus['mem']
		finalData['connections'] = mapDataServerStatus['connections']
		finalData['network'] = mapDataServerStatus['network']
		finalData['global_lock'] = mapDataServerStatus['globalLock']
		finalData['background_flushing'] = mapDataServerStatus['backgroundFlushing']
		finalData['index_counters'] = mapDataServerStatus['indexCounters']
		finalData['opcounters'] = mapDataServerStatus['opcounters']
		finalData['asserts'] = mapDataServerStatus['asserts']
		// Database info
		finalData['database_info'] = db.command("listDatabases")
		println finalData
		// Stats
		def dbStatsStr = db.command("stats").toString()
		def mapDataDbStats = this.slurper.parseText(dbStatsStr)
		// collStats, replSetGetStatus, ...
	}
}
