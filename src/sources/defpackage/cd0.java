package defpackage;

import java.text.DateFormat;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cd0 extends ec1 {
    public static final cd0 i0 = new cd0(null, null);

    public cd0(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        Calendar calendar = (Calendar) obj;
        if (r(t37Var)) {
            ro3Var.u0(calendar == null ? 0L : calendar.getTimeInMillis());
        } else {
            s(calendar.getTime(), ro3Var, t37Var);
        }
    }
}
