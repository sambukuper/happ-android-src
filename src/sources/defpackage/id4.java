package defpackage;

import j$.time.LocalDate;
import j$.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class id4 implements ow3 {
    public static final id4 a = new id4();
    public static final bu5 b = km4.h("kotlinx.datetime.LocalDate");

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        dd4 dd4Var = (dd4) obj;
        dd4Var.getClass();
        ol7Var.t(dd4Var.toString());
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        bd4 bd4Var = dd4.Companion;
        String strS = rd1Var.s();
        int i = cd4.a;
        vz7 vz7Var = gd4.a;
        g1 g1Var = (g1) vz7Var.getValue();
        bd4Var.getClass();
        strS.getClass();
        g1Var.getClass();
        if (g1Var != ((g1) vz7Var.getValue())) {
            return (dd4) g1Var.e(strS);
        }
        try {
            String string = strS.toString();
            string.getClass();
            return new dd4(LocalDate.parse(du7.f(6, string)));
        } catch (DateTimeParseException e) {
            throw new dc1(e);
        }
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
