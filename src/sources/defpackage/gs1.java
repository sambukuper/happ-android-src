package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gs1 extends uy7 implements sn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public /* synthetic */ long i0;
    public /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs1(Object obj, Object obj2, q51 q51Var, byte b) {
        super(3, q51Var);
        this.g0 = b;
        this.k0 = obj;
        this.l0 = obj2;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws te8.d {
        byte b = this.g0;
        Object obj2 = this.l0;
        Object obj3 = this.k0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                byte[] bArr = (byte[]) this.j0;
                long j = this.i0;
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                vk1 vk1Var = ((is1) obj2).b;
                this.j0 = null;
                this.i0 = j;
                this.h0 = true;
                Serializable serializableA = ll8.a.a(bArr, (String) obj3, j, vk1Var, this);
                return serializableA == c71Var ? c71Var : serializableA;
            default:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    dt5 dt5Var = (dt5) this.j0;
                    long j2 = this.i0;
                    xz4 xz4Var = (xz4) obj3;
                    if (xz4Var != null) {
                        s68 s68Var = new s68(dt5Var, (r68) obj2, j2, xz4Var, null);
                        this.h0 = true;
                        if (gv3.n(s68Var, this) == c71Var) {
                            return c71Var;
                        }
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
        }
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        Object obj4 = this.l0;
        Object obj5 = this.k0;
        switch (b) {
            case 0:
                long jLongValue = ((Number) obj2).longValue();
                gs1 gs1Var = new gs1((String) obj5, (is1) obj4, (q51) obj3, (byte) 0);
                gs1Var.j0 = (byte[]) obj;
                gs1Var.i0 = jLongValue;
                return gs1Var.q(dn8Var);
            default:
                long j = ((z85) obj2).a;
                gs1 gs1Var2 = new gs1((xz4) obj5, (r68) obj4, (q51) obj3, (byte) 1);
                gs1Var2.j0 = (dt5) obj;
                gs1Var2.i0 = j;
                return gs1Var2.q(dn8Var);
        }
    }
}
