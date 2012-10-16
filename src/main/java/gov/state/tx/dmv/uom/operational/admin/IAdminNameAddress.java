package gov.state.tx.dmv.uom.operational.admin;

import rtssource.old.data.util.RTSDate;

import java.io.Serializable;

/**
 * Created By: sameloyiv
 * Date: 9/24/12
 * Time: 12:59 PM
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
public interface IAdminNameAddress extends Serializable {
    RTSDate getChngTimestmp();

    int getDeleteIndi();

    int getId();

    int getOfcIssuanceNo();

    int getSubstaId();

    void setChngTimestmp(RTSDate aaChngTimestmp);
}
