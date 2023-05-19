package org.evenos.callouts;

import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MOrder;
import org.compiere.util.CLogger;

public class MyCallout implements IColumnCallout {

	private MOrder order;

	CLogger log = CLogger.getCLogger(MyCallout.class);
	
	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		// TODO Auto-generated method stub
		
//		log.warning("ColumnName: "+mField.getColumnName());
//		log.warning("NewValue: "+value.toString());
//		log.warning("OldValue: "+oldValue.toString());
		
//		mTab.setValue(MOrder.COLUMNNAME_DocumentNo, "test");
		
		 String isiComment = (String) mTab.getValue(MOrder.COLUMNNAME_Description);
		 mTab.setValue("comments", isiComment); 
	
		return null;
	}
}
