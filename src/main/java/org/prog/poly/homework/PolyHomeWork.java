package org.prog.poly.homework;



/** TODO: HOMEWORK
 * Write interface for a cell phone which can (ICellPhone):
 * - call
 * - scan biometrics
 * - make photo
 *
 * Add Adnroid and Apple phones which implement this interface
 * Write method that will accept ICellPhone as parameter
 * And it will scan,make photo, call;
 */
public class PolyHomeWork {
    public static void main(String[] args) {

        ICellPhone androidPhone = new AndroidPhone();
        ICellPhone applePhone = new ApplePhone();

        cellPhone(androidPhone);
        cellPhone(applePhone);

    }

    public static void cellPhone(ICellPhone iCellPhone) {

        iCellPhone.call();
        iCellPhone.scanBiometrics();
        iCellPhone.makePhoto();
    }
}
