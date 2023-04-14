package HashMaps;

public class hashtableinterviewquestion {
	
// Differences between HashMap and HashTable
// 
//	The first one is hash map is not synchronized and it is not thread safe.
//
//	So what is meant by non synchronized?
//
//	Now, if multiple programs simultaneously are simltaneously accessing this hash map, then hash map, you know, keep
//
//	on updating.
//
//	Now, let's say there are five threads which are working on this hash map.
//
//	That means five different programs, or threads can access this hash map at a time concurrently.
//
//	That means there is no synchronization.
//
//	But whereas when you are going to hash table, if one program is accessing this hash table, the other
//
//	program need to wait until the first program releases the  hashtable resources.
//
//	That's the major difference.
//
//	So that's the reason we say that hashTable is threadsafe.
//
//	That means the operation will be performed only once the other thread completes its task on hash table,
//
//	whereas in Hashmap, the multiple threads or multiple programs can access the Hashmap at time and that makes 
//	it non synchronized.
//
//	Hashmap is not synchronized or not thread safe whereas hash table it's completely
//
//	thread safe, only one program or, one thread at a time can access the table.
//
//	And next, Hashmap, allows null keys and any number of null values, you can actually pass null values
//
//	as well, Here it accepts 
//
//	I would just leave it as a null or I would just say null, because sometimes it might be
//
//	required, let's say that you are actually entering the employee records into your database.
//
//	And this is an employee ID and employee name
//
//	I mean, by the time you are uploading the employee details into your database, maybe you feel that
//
//	you do not know his phone number, but you enter the field called, phone number in a key value and
//
//	index value for now.
//
//	You can leave as null.
//
//	I mean, you could update in the later point of time.
//
//	So that works in Hashmap.
//
//	But when you're working with has HashTable, it will not allow any null keys and null values.
//
//	OK, if that is your requirement, you should work on Hashmap only.
//
//	And if you feel that you want to make your program very secure and you should block the multi threads
//
//	accessing it simultaneously, then you should go for HashTable
//
//	it is thread safe and it will not release its.
//
//	Object to other program until one program completes its operation on the HashTable
//
//	OK, that based upon your requirement, you could use Hashmap HashTable.
//
//	And hash map object values are iterated by using iterator, which we have seen in our
//
//	previous example, how to iterate thru Hashmap objects using iterators interface , but whereas
//
//	hashtable it will not work
//
//	Where you need to use other interface called enumerator to iterate the values thru hash table, you
//
//	cannot go with iterator interface.
//
//	These are the core three differences between the Hashmat and has stable, apart from these three differences,
//
//	everything works the same.
//
//	Just replace hash map stable with hashtable and  put everything and you can get them.
//
// The operations are the same across both the hash map and table, except these three differences.
//
//	OK, one is synchronization and null key values and iterating the values.
//
//	Right.
//
//	So that pretty much every different word and hash map and hash table, which is the main core and interview
//
//	question asked in many companies.
//
//	So to explain this difference only I have deliberately taken this iterators example.
//
//	Just to say this cannot be achieved in the hashtable, you need to come up with other enumerator.
//
//	So that's the reason I specifically took this topic and explained that in a Hashmap.	
	
	
}
