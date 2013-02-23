package com.resit.remote.hbase;

import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.data.hadoop.hbase.TableCallback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"WordCountWorkflowTest-context.xml"})
public class WordCountWorkflowTest {

    @Autowired
    private ApplicationContext ctx;

    @Autowired
    private HbaseTemplate hbaseTemplate;

/*    @Test
    public void testWorkflowNS() throws Exception {
        if (hbaseTemplate == null) {
            throw new NullPointerException("template null!");
        }
        // Write to HBase
        InnerTableCallback itc = new InnerTableCallback("JustaString", 42);
        hbaseTemplate.execute("Wordcount", itc);
        itc = new InnerTableCallback("Anotherstring", 23);
        // Here the HBase insert fails
        hbaseTemplate.execute("Wordcount", itc);
    }

    @Test
    public void testWorkflowNSSucess() throws Exception {
        System.out.println("done");
    }
*/
    /**
     * This is a Inner class providing access to the HBase Table to store the
     * counted words and number of matches.
     * 
     * */
    class InnerTableCallback implements TableCallback<Object> {

        String foundStr;

        int no;

        /**
         * The constructor just saved the given foundStr/no tuple in inner
         * variables.
         * 
         * @param foundstr
         *            string found in the text
         * @param no
         *            number of found matches
         * @return null
         * */
        public InnerTableCallback(String foundStr, int no) {
            this.foundStr = foundStr;
            this.no = no;
        }

        /**
         * This Method puts the given String and number of found matches into
         * the HBase table the column family is "cf1" and the column is
         * "matches". The rowname is the found string.
         * */
        @Override
        public Object doInTable(HTableInterface table) throws Throwable {
            Put p = new Put(Bytes.toBytes(foundStr));
            // Put operation on hbase shell:
            // hbase(main):005:0> put 'testtable', 'myrow-2', 'colfam1:q2',
            // 'value-2'
            // add(byte[] family, byte[] qualifier, byte[] value)
            p.add(Bytes.toBytes("cf1"), Bytes.toBytes("matches"),
                    Bytes.toBytes(new Integer(no).toString()));
            table.put(p);
            return null;
        }
    }
}