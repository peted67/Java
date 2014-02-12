import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.BasicDBObject;
import java.net.UnknownHostException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Map;
import org.bson.BasicBSONObject;

class MongoAddRecord {
    public static void main(String[] arguments) {
        MongoClient mongoClient;
        DB db = null;
        try {
            mongoClient = new MongoClient("localhost", 27017);
            db = mongoClient.getDB("mongodb-in-action");
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
            Logger.getLogger(MongoAddRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
            DBCollection coll = db.getCollection("users");
            BasicDBObject doc = new BasicDBObject("name", "Bob").
                    append("age", "86");
            coll.insert(doc);
    }
}

                            


