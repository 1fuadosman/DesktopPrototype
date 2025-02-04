package com.prototype.framework.utilities;

import cucumber.api.DataTable;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class CucumberUtil {

    private static Dictionary<String, DataCollection> _dataCollection = new Hashtable<>();

    public static Dictionary<String, DataCollection> convertDataTableToDict(DataTable table)
    {
        List<List<String>> data = table.raw();

        int rowNumber = 0;

        //store col names and for each col name store the values
        for(List<String> col : data)
        {
            for(int colIndex=0; colIndex <col.size(); colIndex++)
            {
                _dataCollection.put(data.get(0).get(colIndex), new DataCollection(data.get(0).get(colIndex), col.get(colIndex), rowNumber));
            }

            rowNumber++;
        }

        return _dataCollection;
    }


    //ToDo: Passing the rowIndex to get the columnValue based on Row number
    public static String getCellValue(String columnName)
    {
        return _dataCollection.get(columnName).columnValue;

    }

    private static class DataCollection
    {
        private String columnName;
        private String columnValue;
        private int rowNumber;

        public DataCollection(String columnName, String columnValue, int rowNumber) {
            this.columnName = columnName;
            this.columnValue = columnValue;
            this.rowNumber = rowNumber;
        }
    }

}

