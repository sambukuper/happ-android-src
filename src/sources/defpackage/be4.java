package defpackage;

import j$.time.LocalTime;
import j$.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class be4 implements ow3 {
    public static final be4 a = new be4();
    public static final bu5 b = km4.h("kotlinx.datetime.LocalTime");

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        xd4 xd4Var = (xd4) obj;
        xd4Var.getClass();
        ol7Var.t(xd4Var.toString());
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        wd4 wd4Var = xd4.Companion;
        String strS = rd1Var.s();
        vz7 vz7Var = ae4.a;
        zd4 zd4Var = (zd4) vz7Var.getValue();
        wd4Var.getClass();
        strS.getClass();
        zd4Var.getClass();
        if (zd4Var != ((zd4) vz7Var.getValue())) {
            return (xd4) zd4Var.e(strS);
        }
        try {
            return new xd4(LocalTime.parse(strS));
        } catch (DateTimeParseException e) {
            throw new dc1(e);
        }
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
