package defpackage;

import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xb1 extends ec1 {
    public static final xb1 i0 = new xb1(null, null);

    public xb1(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        Date date = (Date) obj;
        if (r(t37Var)) {
            ro3Var.u0(date == null ? 0L : date.getTime());
        } else {
            s(date, ro3Var, t37Var);
        }
    }

    @Override // defpackage.ec1
    public final ec1 t(Boolean bool, DateFormat dateFormat) {
        return new xb1(bool, dateFormat);
    }
}
