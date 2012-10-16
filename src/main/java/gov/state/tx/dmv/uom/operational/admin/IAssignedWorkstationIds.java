package gov.state.tx.dmv.uom.operational.admin;

import rtssource.old.data.util.RTSDate;

import java.io.Serializable;
import java.util.Map;

/**
 * Created By: sameloyiv
 * Date: 9/24/12
 * Time: 1:29 PM
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
public interface IAssignedWorkstationIds extends Serializable, Comparable {
    int getAMDate();

    Map getAttributes();

    String getCashWsCd();

    int getCashWsId();

    RTSDate getChngTimestmp();

    String getCPName();

    int getDeleteIndi();

    int getOfcIssuanceCd();

    int getOfcIssuanceNo();

    String getProdStatusCd();

    int getRedirPrtWsId();

    int getStkrVersionNo();

    int getSubstaId();

    String getTimeZone();

    int getTranstime();

    String getWsCd();

    int getWsId();
}
