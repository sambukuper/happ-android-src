package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r44 implements dn2 {
    public final /* synthetic */ byte X;
    public final t44 Y;

    public /* synthetic */ r44(t44 t44Var, byte b) {
        this.X = b;
        this.Y = t44Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        t44 t44Var = this.Y;
        switch (b) {
            case 0:
                Class<?>[] declaredClasses = t44Var.o.a.getDeclaredClasses();
                declaredClasses.getClass();
                return wv0.c1(w27.n0(w27.m0(new la2(eu.Y(declaredClasses), false, cd5.k0), cd5.l0)));
            case 1:
                List listB = t44Var.o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((za6) obj).a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iG = aq4.G(xv0.Z(arrayList, 10));
                if (iG < 16) {
                    iG = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((za6) obj2).c(), obj2);
                }
                return linkedHashMap;
            default:
                return q57.Z(t44Var.c(), t44Var.g());
        }
    }
}
