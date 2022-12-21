package doubleHashing;

// Class 3
class HashTable2
{
    private int TABLE_SIZE;
    private int size; 
    private HashEntry[] table;
    private int primeSize;

	     /* Constructor */
	    public HashTable2(int ts) 
		    {
		        size = 0;
		        TABLE_SIZE = ts;
		        table = new HashEntry[TABLE_SIZE];
		        for (int i = 0; i < TABLE_SIZE; i++)
		            table[i] = null;
		        primeSize = getPrime();       
		    } 
	    /* Function to get prime number less than table size for myhash2 function */
	    public int getPrime()
		    {
		        for (int i = TABLE_SIZE - 1; i >= 1; i--)
		        {
		            int fact = 0;
		            for (int j = 2; j <= (int) Math.sqrt(i); j++)
		                if (i % j == 0)
		                    fact++;
		            if (fact == 0)
		                return i;
		        }
	        /* Return a prime number */
	        return 3;
	    }
	
	
	    /* Function to insert a key value pair */
	    public void insert(String key, int value) 
		    {
		        if (size == TABLE_SIZE)
		        {
		            System.out.println("Table full"); 
		            return;
		        }           
		        int hash1 = myhash1( key );
		        int hash2 = myhash2( key );        
		        while (table[hash1] != null)
		        {
		            hash1 += hash2;
		            hash1 %= TABLE_SIZE;
		        }
		        table[hash1] = new HashEntry(key, value);        
		        size++;
		    }
	
	    /* Function myhash which gives a hash value for a given string */
	    private int myhash1(String x )
		    {
		
		        int hashVal = x.hashCode( );
		        hashVal %= TABLE_SIZE;
		        if (hashVal < 0)
		            hashVal += TABLE_SIZE;
		        System.out.println("myhash1() : "+hashVal);
		        return hashVal;
		    }
	    /* Function myhash function for double hashing */
	    private int myhash2(String x )
		    {
		        int hashVal = x.hashCode( );
		        hashVal %= TABLE_SIZE;
		        if (hashVal < 0)
		            hashVal += TABLE_SIZE;
		        System.out.println("primeSize:"+primeSize +"- hashVal"+hashVal+"%primeSize"+primeSize);
		        int newHashVal = primeSize - hashVal % primeSize;
		        System.out.println("myhash2() : "+newHashVal);
		
		        return newHashVal;
		    }
	    /* Function to print hash table */
	    public void printHashTable2()
		    {
		        System.out.println("\nHash Table");
		        for (int i = 0; i < TABLE_SIZE; i++)
		            if (table[i] != null)
		                System.out.println(table[i].key +" "+table[i].value);
		    }
}

