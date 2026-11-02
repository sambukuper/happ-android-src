package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ch8 implements Iterable, qv3 {
    public static final xd6 Y = new xd6((byte) 18);
    public static final ch8 Z = new ch8(d02.X);
    public final ut X;

    public ch8(List list) {
        this.X = wz1.X;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wm wmVar = (wm) it.next();
            wmVar.getClass();
            String strP = yb6.a.b(wm.class).p();
            strP.getClass();
            int iR = Y.r(strP);
            int iA = this.X.a();
            if (iA != 0) {
                if (iA == 1) {
                    ut utVar = this.X;
                    try {
                        utVar.getClass();
                        cb5 cb5Var = (cb5) utVar;
                        int i = cb5Var.Y;
                        if (i == iR) {
                            this.X = new cb5(iR, wmVar);
                        } else {
                            xt xtVar = new xt();
                            xtVar.X = new Object[20];
                            xtVar.Y = 0;
                            xtVar.b(i, cb5Var.X);
                            this.X = xtVar;
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException(a(utVar, 1, "OneElementArrayMap"), e);
                    }
                }
                this.X.b(iR, wmVar);
            } else {
                ut utVar2 = this.X;
                if (!(utVar2 instanceof wz1)) {
                    bt.i(a(utVar2, 0, "EmptyArrayMap"));
                    throw null;
                }
                this.X = new cb5(iR, wmVar);
            }
        }
    }

    public static String a(ut utVar, int i, String str) {
        StringBuilder sb = new StringBuilder("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(utVar.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) Y.Y;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(xv0.Z(utVar, 10));
        int i2 = 0;
        for (Object obj : utVar) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 < 0) {
                i21.X();
                throw null;
            }
            for (Object obj3 : concurrentHashMap.entrySet()) {
                if (((Number) ((Map.Entry) obj3).getValue()).intValue() == i2) {
                    obj2 = obj3;
                    break;
                }
            }
            sb3.append("  " + ((Map.Entry) obj2) + '[' + i2 + "]: " + obj);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb3.append("]");
        sb3.append('\n');
        sb.append("Content: ".concat(sb3.toString()));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        return this.X.a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.X.iterator();
    }
}
