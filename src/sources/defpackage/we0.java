package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class we0 implements AutoCloseable {
    public final m51 X;
    public final CopyOnWriteArrayList Y;

    public we0(z47 z47Var, String str) {
        m51 m51VarC = gv3.c(g33.K(((s98) z47Var.Z).f, new ow7((bm3) z47Var.f0)));
        this.X = m51VarC;
        this.Y = new CopyOnWriteArrayList();
        w51.G(m51VarC, null, null, new r0((Object) z47Var, (Object) str, (Object) this, (q51) null, (byte) 7), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        gv3.i(this.X, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(long j, s51 s51Var) {
        ue0 ue0Var;
        Object obj;
        if (s51Var instanceof ue0) {
            ue0Var = (ue0) s51Var;
            int i = ue0Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ue0Var.i0 = i - Integer.MIN_VALUE;
            } else {
                ue0Var = new ue0(this, s51Var);
            }
        } else {
            ue0Var = new ue0(this, s51Var);
        }
        Object obj2 = ue0Var.g0;
        int i2 = ue0Var.i0;
        Object[] objArr = 0;
        CopyOnWriteArrayList copyOnWriteArrayList = this.Y;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(obj2);
            ux0 ux0Var = new ux0();
            copyOnWriteArrayList.add(ux0Var);
            ve0 ve0Var = new ve0(ux0Var, q51Var, objArr == true ? 1 : 0);
            ue0Var.f0 = ux0Var;
            ue0Var.i0 = 1;
            Object objX = a28.x(j, ve0Var, ue0Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
            obj2 = objX;
            obj = ux0Var;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = ue0Var.f0;
            w39.n0(obj2);
        }
        boolean z = obj2 != null;
        copyOnWriteArrayList.remove(obj);
        return Boolean.valueOf(z);
    }
}
