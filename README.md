Monitoring MongoDB  
----------------------------------------  
1. GroovyScript  
  - Project demo for monitoring mongodb.  
  - Connect and get data from mongodb use MongoClient.  

2. Job  
  - Contains a list job monitoring mongodb.  

3. Others  
  - Contains note about information of monitoring mongodb.  
  - Contains default.params, job.params for job monitoring mongodb.  

4. How to run job monitoring mongodb  
  - Get source updated in https://github.com/maixuanthanh-luvina/wiperdog.git  
  - mvn install source wiperdog  
  - Push default.params, job.params from /Others to /var/job/  
  - Run startWiperdog.sh  
