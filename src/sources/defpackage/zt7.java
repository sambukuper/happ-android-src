package defpackage;

import com.tencent.mmkv.MMKV;
import su.happ.proxyutility.domain.sub.SubId;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zt7 {
    public final MMKV a;
    public final MMKV b;
    public final oh7 c;

    public zt7() {
        Object value;
        kw4 kw4Var = kw4.a;
        MMKV mmkvM = kw4.m();
        Object value2 = kw4.i.getValue();
        value2.getClass();
        MMKV mmkv = (MMKV) value2;
        mmkvM.getClass();
        this.a = mmkvM;
        this.b = mmkv;
        dm5 dm5Var = dm5.f0;
        dm5Var.getClass();
        oh7 oh7VarA = ph7.a(dm5Var);
        this.c = oh7VarA;
        String[] strArrA = mmkv.a();
        la2 la2VarM0 = w27.m0(w27.m0(eu.Y(strArrA == null ? new String[0] : strArrA), new t16((Object) this, (byte) 27)), new zx6((byte) 13));
        dm5Var.getClass();
        em5 em5Var = new em5(dm5Var);
        zp4.M(em5Var, la2VarM0);
        cm5 cm5VarF = em5Var.f();
        do {
            value = oh7VarA.getValue();
            ((cm5) value).getClass();
        } while (!oh7VarA.k(value, cm5VarF));
    }

    public final qs7 a(String str) {
        str.getClass();
        return (qs7) ((cm5) this.c.getValue()).get(new SubId(str));
    }

    public final qs7 b(String str, gn2 gn2Var) {
        Object value;
        str.getClass();
        oh7 oh7Var = this.c;
        qs7 qs7Var = (qs7) ((cm5) oh7Var.getValue()).get(new SubId(str));
        if (qs7Var == null) {
            qs7Var = new qs7();
        }
        qs7 qs7Var2 = (qs7) gn2Var.B(qs7Var);
        String str2 = !fm7.o0(str) ? str : null;
        if (str2 == null) {
            str2 = SubId.SERVER_LIST_NAME;
        }
        cp3 cp3Var = mr.a;
        g55 g55Var = cp3Var.b;
        this.b.q(str2, cp3Var.b(qs7.Companion.serializer(), qs7Var2));
        do {
            value = oh7Var.getValue();
        } while (!oh7Var.k(value, ((cm5) value).d(new SubId(str), qs7Var2)));
        return qs7Var2;
    }
}
