package gov.state.tx.nmvtis.file.central;

import gov.state.tx.nmvtis.file.AssembleNMVTISRecord;

/**
 * Created By: sameloyiv
 * Date: 10/16/12
 * Time: 10:11 AM
 * <p/>
 * <p/>
 * (c) Texas Department of Motor Vehicles  2012
 * ---------------------------------------------------------------------
 * Change History:
 * Name		    Date		Description
 * ------------	-----------	--------------------------------------------
 *
 * @author
 * @description
 * @date
 */
public interface Jurisdiction_NM3B extends AssembleNMVTISRecord {
    Byte[] getBJUCDE();                 //    1 2 BJUCDE JURISDICTION CODE

    Byte[] getGMSANI();                 //    3 7 GMSANI AAMVANET NETWORK ID

    Byte[] getBJUNAM();                  //    10 25 BJUNAM JURISDICTION NAME

    Byte getVSKYTU();                  //    35 1 VSKYTU STATE TITLE KEY USED INDICATOR

    Byte getBRAND();                 //    36 1 VNMPRT VIN POINTER PARTICIPATION MODE

    Byte getVNMPRB();                  //    37 1 VNMPRB BRAND PARTICIPATION MODE

    Byte[] getVNMDCL();                  //    38 9 VNMDCL NUMBER OF DUPLICATES CREATED AT

    Byte[] getBJUMBM();                   //    47 9 BJUMBM MAXIMUM NUMBER OF RECEIVED BATCH

    Byte getVNMMST();                  //    56 4 VNMMST BATCH MESSAGE SEND TIME
}
