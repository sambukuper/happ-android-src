package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nl6 {
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public j78 h;
    public boolean i;
    public boolean o;
    public boolean p;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final t91 j = new t91((byte) 2);
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet l = new LinkedHashSet();
    public final ArrayList m = new ArrayList();
    public boolean n = true;
    public final zu3 a = yb6.a.b(WorkDatabase.class);

    public nl6(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    public final void a(pv4... pv4VarArr) {
        for (pv4 pv4Var : pv4VarArr) {
            Integer numValueOf = Integer.valueOf(pv4Var.a);
            LinkedHashSet linkedHashSet = this.l;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(pv4Var.b));
        }
        for (pv4 pv4Var2 : (pv4[]) Arrays.copyOf(pv4VarArr, pv4VarArr.length)) {
            this.j.a(pv4Var2);
        }
    }
}
