package gov.state.tx.dmv.uom.common.person;

import gov.state.tx.dmv.uom.common.contact.IContactInformation;
import gov.state.tx.dmv.uom.common.vehicle.ILicensePlate;
import gov.state.tx.dmv.uom.common.vehicle.IVehicle;
import gov.state.tx.dmv.uom.common.vehicle.IVIN;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created By: Sam Loy
 * Date: 09/19/2012
 * Time: 9:00AM
 * <p/>
 * <p/>
 * (c) Texas Department of Motor Vehicles  ${YEAR}
 * ---------------------------------------------------------------------
 * Change History:
 * Name		    Date		Description
 * ------------	-----------	--------------------------------------------
 *
 * @author
 * @description
 * @date
 */
public interface IPerson<T extends PERSON_TYPE> extends Serializable {
    void setType(T personType);

    T getType();

    String getFirstName();

    String getMiddleName();

    String getLastName();

    String getSalutation();

    String getNameSuffix();

    Set<IContactInformation> getKnownAddresses();

    List<IVehicle> getAllVehicles();

    IVehicle getVehicle(IVIN vin);

    IVehicle getVehicleByMake(String make);

    IVehicle getVehicleByLicensePlate(ILicensePlate licensePlate);
}
