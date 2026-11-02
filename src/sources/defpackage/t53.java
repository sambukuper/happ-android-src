package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t53 implements d57 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t53(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.d57
    public final void a(f57 f57Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                x53 x53Var = (x53) obj;
                if (x53Var.d() != null) {
                    g18 g18Var = x53Var.x;
                    g18Var.getClass();
                    s08.b();
                    g18Var.f0 = true;
                    x53Var.I(true);
                    String strF = x53Var.f();
                    y53 y53Var = (y53) x53Var.h;
                    iz izVar = x53Var.i;
                    izVar.getClass();
                    b57 b57VarJ = x53Var.J(strF, y53Var, izVar);
                    x53Var.v = b57VarJ;
                    Object[] objArr = {b57VarJ.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    x53Var.G(Collections.unmodifiableList(arrayList));
                    x53Var.r();
                    g18 g18Var2 = x53Var.x;
                    g18Var2.getClass();
                    s08.b();
                    g18Var2.f0 = false;
                    g18Var2.b();
                    break;
                }
                break;
            case 1:
                lt5 lt5Var = (lt5) obj;
                if (lt5Var.d() != null) {
                    lt5Var.K((mt5) lt5Var.h, lt5Var.i);
                    lt5Var.r();
                    break;
                }
                break;
            default:
                Iterator it = ((e57) obj).n.iterator();
                while (it.hasNext()) {
                    ((d57) it.next()).a(f57Var);
                }
                break;
        }
    }
}
