package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g98 {
    public static final z31 a = new z31("NO_THREAD_ELEMENTS", (byte) 3);
    public static final c68 b = new c68((byte) 1);
    public static final c68 c = new c68((byte) 2);
    public static final c68 d = new c68((byte) 3);

    public static final void a(s61 s61Var, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof n98)) {
            Object objU = s61Var.U(c, null);
            objU.getClass();
            ((i98) objU).a(obj);
            return;
        }
        n98 n98Var = (n98) obj;
        i98[] i98VarArr = n98Var.c;
        int length = i98VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            i98 i98Var = i98VarArr[length];
            i98Var.getClass();
            i98Var.a(n98Var.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(s61 s61Var) {
        Object objU = s61Var.U(b, 0);
        objU.getClass();
        return objU;
    }

    public static final Object c(s61 s61Var, Object obj) {
        if (obj == null) {
            obj = b(s61Var);
        }
        if (obj == 0) {
            return a;
        }
        if (!(obj instanceof Integer)) {
            return ((i98) obj).b();
        }
        return s61Var.U(d, new n98(((Number) obj).intValue(), s61Var));
    }
}
