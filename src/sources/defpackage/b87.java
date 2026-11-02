package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b87 {
    public final ar6 a;
    public final dl4 b;
    public final Context c;
    public final String d;
    public final vz7 e;
    public final Set f;

    public b87(Context context, String str, Set set, ar6 ar6Var, dl4 dl4Var) {
        set.getClass();
        a23 a23Var = new a23((Object) context, (Object) str, (byte) 20);
        this.a = ar6Var;
        this.b = dl4Var;
        this.c = context;
        this.d = str;
        this.e = new vz7(a23Var);
        this.f = set == d87.a ? null : wv0.b1(set);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, s51 s51Var) {
        a87 a87Var;
        if (s51Var instanceof a87) {
            a87Var = (a87) s51Var;
            int i = a87Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                a87Var.h0 = i - Integer.MIN_VALUE;
            } else {
                a87Var = new a87(this, s51Var);
            }
        } else {
            a87Var = new a87(this, s51Var);
        }
        Object objK = a87Var.f0;
        int i2 = a87Var.h0;
        boolean z = true;
        if (i2 == 0) {
            w39.n0(objK);
            a87Var.h0 = 1;
            objK = this.a.K(obj, a87Var);
            c71 c71Var = c71.X;
            if (objK == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objK);
        }
        if (!((Boolean) objK).booleanValue()) {
            return Boolean.FALSE;
        }
        vz7 vz7Var = this.e;
        Set set = this.f;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) vz7Var.getValue()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) vz7Var.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
