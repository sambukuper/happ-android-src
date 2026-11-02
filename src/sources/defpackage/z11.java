package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z11 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public a21 a() {
        return new a21(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(wr0... wr0VarArr) {
        if (!this.a) {
            bt.q("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(wr0VarArr.length);
        for (wr0 wr0Var : wr0VarArr) {
            arrayList.add(wr0Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        if (!this.a) {
            bt.q("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            bt.q("At least one cipher suite is required");
        }
    }

    public void d(db8... db8VarArr) {
        if (!this.a) {
            bt.q("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(db8VarArr.length);
        for (db8 db8Var : db8VarArr) {
            arrayList.add(db8Var.X);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        if (!this.a) {
            bt.q("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.d = (String[]) strArr.clone();
        } else {
            bt.q("At least one TLS version is required");
        }
    }
}
