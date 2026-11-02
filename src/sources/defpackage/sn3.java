package defpackage;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sn3 implements v02 {
    public static final qn3 f;
    public static final qn3 g;
    public final HashMap a;
    public final HashMap b;
    public final pn3 c;
    public boolean d;
    public static final pn3 e = new pn3((byte) 0);
    public static final rn3 h = new rn3();

    /* JADX WARN: Type inference failed for: r0v1, types: [qn3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [qn3] */
    static {
        final byte b = 0;
        f = new ht8() { // from class: qn3
            @Override // defpackage.u02
            public final void a(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        ((it8) obj2).b((String) obj);
                        break;
                    default:
                        ((it8) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final byte b2 = 1;
        g = new ht8() { // from class: qn3
            @Override // defpackage.u02
            public final void a(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        ((it8) obj2).b((String) obj);
                        break;
                    default:
                        ((it8) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public sn3() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final v02 a(Class cls, b85 b85Var) {
        this.a.put(cls, b85Var);
        this.b.remove(cls);
        return this;
    }
}
