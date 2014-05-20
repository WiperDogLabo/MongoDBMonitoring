Monitoring MongoDB  
----------------------------------------  
List monitoring for mongodb (version 2.4.9)
 1. Monitoring information of server  
  - using command mongodb: db.serverStatus()  
  - Jobs monitoring server status of mongodb  
	+ MongoDB.ServerStatus.GeneralInfo  
	+ MongoDB.ServerStatus.IOStats  
	+ MongoDB.ServerStatus.NetworkStats  
	+ MongoDB.ServerStatus.LockInfo  
	+ MongoDB.ServerStatus.ActivitesStats  
	+ MongoDB.ServerStatus.MemoryInfo  
  - source corresponding to /Job/MongoDB.ServerStatus...  
  - note corresponding to /Others/Note_MonitoringMongoDB.xlsx sheet "ServerStatus"  

 2. Monitoring host information  
  - using command mongodb: db.hostInfo() with mongodb version > 2.2  
	+ MongoDB.HostInfo.System  
	+ MongoDB.HostInfo.OS  
	+ MongoDB.HostInfo.Extra  
  - source corresponding to /Job/MongoDB.HostInfo...  
  - note corresponding to /Others/Note_MonitoringMongoDB.xlsx sheet "HostInfo"  

 3. Monitoring statistics for a given database  
  - using command mongodb: db.stats() with mongodb version > 2.2  
	+ MongoDB.Statistics.DatabaseInfo  
  - source corresponding to /Job/MongoDB.Statistics.DatabaseInfo  
  - note corresponding to /Others/Note_MonitoringMongoDB.xlsx sheet "dbStats"  

 4. Monitoring statistics for a given collection  
  - using command mongodb: db.collection.stats()  
	+ MongoDB.Statistics.CollectionsInfo  
  - source corresponding to /Job/MongoDB.Statistics.CollectionsInfo  
  - note corresponding to /Others/Note_MonitoringMongoDB.xlsx sheet "collectionStats"  

