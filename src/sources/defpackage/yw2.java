package defpackage;

import com.google.gson.a;
import java.util.Objects;
import su.happ.proxyutility.dto.FlexibleStringList;
import su.happ.proxyutility.util.adapters.FlexibleStringListAdapter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yw2 {
    public static final su2 a;
    public static final a b;
    public static final a c;
    public static final a d;

    static {
        su2 su2Var = new su2();
        su2Var.c(FlexibleStringList.class, new FlexibleStringListAdapter());
        a = su2Var;
        b = new a(su2Var);
        su2Var.i = 1;
        c = new a(su2Var);
        sj2 sj2Var = sj2.e;
        Objects.requireNonNull(sj2Var);
        su2Var.f = sj2Var;
        su2Var.e = false;
        xw2 xw2Var = new xw2();
        su2Var.c(xw2Var.b, new ww2());
        d = new a(su2Var);
    }
}
