List monitoring for mongodb (version 2.4.9)  
----------------------------------------    
 1. Monitoring information of server (command: db.serverStatus())  
 - The note corresponding to /Others/Note_MonitoringMongoDB.xlsx sheet "ServerStatus"  
 1.1. MongoDB.ServerStatus.GeneralInfo.job  
   - get server general informations  
	+ host (string): the host field contains the system’s hostname.  
	+ version (string): the version field contains the version of MongoDB running on the current mongod or mongos instance.  
	+ process (string): the process field identifies which kind of MongoDB instance is running (mongos, mongod).  
	+ pid (number):  id of process.  
	+ uptime (second):  the number of the mongos or mongod process has been active.  
	+ localTime (datetime): the current time, according to the server.  
	+ asserts: reports the number of assertions or errors produced by the server.  
	+ extra_info: platform specific information.  
	+ indexCounters: information regarding the state and use of indexes in MongoDB.  

 1.2. MongoDB.ServerStatus.IOStats.job  
   - get I/O informations
	+ backgroundFlushing: contains data regarding these operations, mongod periodically flushes writes to disk (default 60seconds).  
	+ recordStats: reports data on MongoDB’s ability to predict page faults and yield write operations when required data isn’t in memory.  

 1.3. MongoDB.ServerStatus.NetworkStats.job  
   - get network informations  
	+ Connections: current number of open connections.  
	+ Networks: data regarding MongoDB’s network use and state.  
	+ cursors: current cursor use and state.  
	+ dur: contains data regarding the mongod‘s journaling-related operations and performance.  

 1.4. MongoDB.ServerStatus.LockInfo.job  
   - get lock informations  
	+ globalLock: information regarding the database’s current lock state, historical lock status, current operation queue, and the number of active clients.  

 1.5. MongoDB.ServerStatus.ActivitesStats.job  
   - get activities informations  
	+ opcounters: Reports the number of operations this MongoDB instance has processed.  
	+ opcountersRepl: Reports the number of replicated operations.  

 1.6. MongoDB.ServerStatus.MemoryInfo.job  
   - get memory informations  
	+ Memory Usage: current memory use.  
	+ metrics: The metrics document holds a number of statistics that reflect the current use and state of a running mongod instance.  


 2. Monitoring host information (command: db.hostInfo())  
 - The note corresponding to /Others/Note_MonitoringMongoDB.xlsx sheet "HostInfo"  
 2.1. MongoDB.HostInfo.System  
   - About the underlying environment of the system running the mongod or mongos.  
	+ currentTime (datetime): the current system time.  
	+ hostname (string): The system name, which should correspond to the output of hostname -f on Linux systems.  
	+ cpuAddrSize (number): A number reflecting the architecture of the system. Either 32 or 64.  
	+ memSizeMB (MB): The total amount of system memory (RAM) in megabytes.  
	+ numCores (number): The total number of available logical processor cores.  
	+ cpuArch (string): A string that represents the system architecture. Either x86 or x86_64.  
	+ numaEnabled (boolean): false if NUMA is interleaved (i.e. disabled), otherwise true.  

 2.2. MongoDB.HostInfo.OS  
   - A sub-document that contains information about the operating system running the mongod and mongos.  
	+ type (string): A string representing the type of operating system, such as Linux or Windows.  
	+ name (string): A display name for the operating system.  
	+ version (string): The name of the distribution or operating system.  

 2.3. MongoDB.HostInfo.Extra  
   - Extra information about the operating system and the underlying hardware.  
	+ versionString (string): A complete string of the operating system version and identification.  
	+ libcVersion (string): The release of the system libc. libcVersion only appears on Linux systems.  
	+ kernelVersion (string): The release of the Linux kernel in current use. kernelVersion only appears on Linux systems.  
	+ cpuFrequencyMHz (string): The clock speed of the system’s processor in megahertz.  
	+ cpuFeatures (string): The processor feature flags. On Linux systems this the same information that /proc/cpuinfo includes in the flags fields.  
	+ pageSize (bytes): the default system page size in bytes.  
	+ numPages (page): numPages only appears on Linux systems.  
	+ maxOpenFiles (number): The current system limits on open file handles. maxOpenFiles only appears on Linux systems.  

 3. Monitoring statistics for a given database (command: db.stats())  
  - MongoDB.Statistics.DatabaseInfo (get all database infomations)  
	+ db (string): the name of the database.  
	+ collections (number): the number of collections in that database.  
	+ objects (number): the number of objects in the database across all collections.  
	+ avgObjSize (bytes): The average size of each document in bytes. This is the dataSize divided by the number of documents.  
	+ dataSize (bytes): The total size in bytes of the data held in this database including the padding factor.  
	+ storageSize (bytes): The total amount of space in bytes allocated to collections in this database for document storage.  
	+ numExtents (number): the number of extents in the database across all collections.  
	+ indexes (number): the total number of indexes across all collections in the database.  
	+ indexSize (bytes): The total size in bytes of all indexes created on this database.  
	+ fileSize (bytes): The total size in bytes of the data files that hold the database.  
	+ nsSizeMB (MB): The total size of the namespace files for this database.  
	+ dataFileVersion: information about the on-disk format of the data files for the database.  
  - note corresponding to /Others/Note_MonitoringMongoDB.xlsx sheet "dbStats"  

 4. Monitoring statistics for a given collection (command: db.collection.stats())  
  - MongoDB.Statistics.CollectionsInfo (get infomations of each collection in database)  
	+ ns (String): namespace.  
	+ count (Number): number of documents.  
	+ size (bytes): collections size in bytes.  
	+ avgObjSize (bytes): average object size in bytes.  
	+ storageSize (bytes): (pre) allocated space for the collection in bytes.  
	+ numExtents (number): number of extents (contiguously allocated chunks of datafile space).  
	+ nindexes (number): number of indexes.  
	+ lastExtentSize (bytes): size of the most recently created extent in bytes.  
	+ paddingFactor (number): padding can speed up updates if document grow.  
	+ totalIndexSize (bytes): total index size in bytes.  
	+ indexSize (bytes): size of specific indexes in bytes.  
  - note corresponding to /Others/Note_MonitoringMongoDB.xlsx sheet "collectionStats"  

 5. Monitoring slow queries  
  - MongoDB.Statistics.SlowQuery  
	+ ts(datetime)  
	+ op(string)  
	+ ns(string)  
	+ query(map)  
	+ updateobj(map)  
	+ nscanned(number)  
	+ scanAndOrder(boolean)  
	+ moved(boolean)  
	+ nmoved(number)  
	+ nupdated(number)  
	+ keyUpdates(number)  
	+ numYield(number)  
	+ lockStats(map)  
	+ millis(ms)  
	+ client(string)  
	+ user(string)  
  - note corresponding to /Others/Note_MonitoringMongoDB.xlsx sheet "Slow queries"  
