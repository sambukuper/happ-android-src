package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jr8 {
    public final iq8 a;
    public final ok0 b;
    public final st2 c;
    public final iq8 d;
    public final vz7 e;
    public final vz7 f;

    public jr8(iq8 iq8Var, ok0 ok0Var, st2 st2Var, iq8 iq8Var2) {
        this.a = iq8Var;
        this.b = ok0Var;
        this.c = st2Var;
        this.d = iq8Var2;
        final byte b = 0;
        this.e = new vz7(new dn2(this) { // from class: ir8
            public final /* synthetic */ jr8 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                jr8 jr8Var = this.Y;
                switch (b2) {
                    case 0:
                        return (qi0) jr8Var.a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) jr8Var.d.get()).entrySet()) {
                            el0 el0Var = (el0) entry.getKey();
                            wg1 wg1Var = (wg1) entry.getValue();
                            cl7 cl7Var = jr8Var.a().Z;
                            cl7Var.getClass();
                            el0Var.getClass();
                            fl0 fl0Var = (fl0) cl7Var.Y.get(el0Var);
                            if (fl0Var != null) {
                                linkedHashMap.put(wg1Var, new dl7(fl0Var.a));
                            }
                        }
                        return zp4.Q(linkedHashMap);
                }
            }
        });
        final byte b2 = 1;
        this.f = new vz7(new dn2(this) { // from class: ir8
            public final /* synthetic */ jr8 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                jr8 jr8Var = this.Y;
                switch (b3) {
                    case 0:
                        return (qi0) jr8Var.a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) jr8Var.d.get()).entrySet()) {
                            el0 el0Var = (el0) entry.getKey();
                            wg1 wg1Var = (wg1) entry.getValue();
                            cl7 cl7Var = jr8Var.a().Z;
                            cl7Var.getClass();
                            el0Var.getClass();
                            fl0 fl0Var = (fl0) cl7Var.Y.get(el0Var);
                            if (fl0Var != null) {
                                linkedHashMap.put(wg1Var, new dl7(fl0Var.a));
                            }
                        }
                        return zp4.Q(linkedHashMap);
                }
            }
        });
    }

    public final qi0 a() {
        Object value = this.e.getValue();
        value.getClass();
        return (qi0) value;
    }

    public final LinkedHashSet b(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dl7 dl7Var = (dl7) ((Map) this.f.getValue()).get((wg1) it.next());
            if (dl7Var != null) {
                linkedHashSet.add(dl7Var);
            }
        }
        return linkedHashSet;
    }
}
