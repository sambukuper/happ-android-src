package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class zb6 {
    public zu3 b(Class cls) {
        return new ct0(cls);
    }

    public mv3 c(Class cls) {
        return new ag5(cls);
    }

    public String i(bo2 bo2Var) {
        String string = bo2Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(g24 g24Var) {
        return i(g24Var);
    }

    public pw3 k(zu3 zu3Var, boolean z) {
        List list = Collections.EMPTY_LIST;
        return new oi8(zu3Var, z);
    }

    public pv3 a(mo2 mo2Var) {
        return mo2Var;
    }

    public wv3 d(i58 i58Var) {
        return i58Var;
    }

    public yv3 e(p05 p05Var) {
        return p05Var;
    }

    public jw3 f(a74 a74Var) {
        return a74Var;
    }

    public lw3 g(lx5 lx5Var) {
        return lx5Var;
    }

    public mw3 h(mx5 mx5Var) {
        return mx5Var;
    }
}
