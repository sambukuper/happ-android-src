package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e53 implements d57 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hq8 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e53(hq8 hq8Var, Object obj, byte b) {
        this.a = b;
        this.b = hq8Var;
        this.c = obj;
    }

    @Override // defpackage.d57
    public final void a(f57 f57Var) {
        byte b = this.a;
        Object obj = this.c;
        hq8 hq8Var = this.b;
        switch (b) {
            case 0:
                k53 k53Var = (k53) hq8Var;
                m53 m53Var = (m53) obj;
                if (k53Var.d() != null) {
                    s08.b();
                    c57 c57Var = k53Var.y;
                    if (c57Var != null) {
                        c57Var.b();
                        k53Var.y = null;
                    }
                    v73 v73Var = k53Var.x;
                    if (v73Var != null) {
                        v73Var.a();
                        k53Var.x = null;
                    }
                    m53Var.c();
                    k53Var.f();
                    o53 o53Var = (o53) k53Var.h;
                    iz izVar = k53Var.i;
                    izVar.getClass();
                    b57 b57VarI = k53Var.I(o53Var, izVar);
                    k53Var.w = b57VarI;
                    Object[] objArr = {b57VarI.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    k53Var.G(Collections.unmodifiableList(arrayList));
                    k53Var.r();
                    break;
                }
                break;
            default:
                lv4 lv4Var = (lv4) hq8Var;
                f57Var.getClass();
                lv4Var.G(i21.K(lv4Var.J((Size) obj).c()));
                lv4Var.r();
                break;
        }
    }
}
