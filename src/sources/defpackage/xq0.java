package defpackage;

import su.happ.proxyutility.dto.SubscriptionExtraStatus;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xq0 extends uy7 implements sn2 {
    public SubscriptionExtraStatus g0;
    public byte h0;
    public /* synthetic */ ze2 i0;
    public /* synthetic */ int j0;
    public final /* synthetic */ ar0 k0;
    public final /* synthetic */ SubscriptionItem l0;
    public final /* synthetic */ String m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq0(ar0 ar0Var, SubscriptionItem subscriptionItem, String str, q51 q51Var) {
        super(3, q51Var);
        this.k0 = ar0Var;
        this.l0 = subscriptionItem;
        this.m0 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (defpackage.u70.G(r0, r14) == r13) goto L28;
     */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r15) {
        /*
            r14 = this;
            ze2 r6 = r14.i0
            int r7 = r14.j0
            byte r0 = r14.h0
            r8 = 0
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            c71 r13 = defpackage.c71.X
            if (r0 == 0) goto L2b
            if (r0 == r11) goto L26
            if (r0 == r10) goto L20
            if (r0 != r9) goto L1a
            defpackage.w39.n0(r15)
            goto L99
        L1a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r0)
            return r12
        L20:
            su.happ.proxyutility.dto.SubscriptionExtraStatus r0 = r14.g0
            defpackage.w39.n0(r15)
            goto L7b
        L26:
            defpackage.w39.n0(r15)
            r0 = r15
            goto L6a
        L2b:
            defpackage.w39.n0(r15)
            su.happ.proxyutility.HappApplication r0 = su.happ.proxyutility.HappApplication.M0
            su.happ.proxyutility.HappApplication r0 = defpackage.k32.i()
            kf4 r0 = r0.d()
            wq0 r1 = new wq0
            su.happ.proxyutility.dto.SubscriptionItem r2 = r14.l0
            r1.<init>(r2, r7, r8)
            r0.h(r1)
            java.lang.String r0 = r2.getProviderId()
            if (r0 == 0) goto L4e
            su.happ.proxyutility.dto.ProviderId r1 = new su.happ.proxyutility.dto.ProviderId
            r1.<init>(r0)
            goto L4f
        L4e:
            r1 = r12
        L4f:
            if (r1 == 0) goto L9f
            java.lang.String r1 = r1.getValue()
            r14.i0 = r6
            r14.j0 = r7
            r14.h0 = r11
            ar0 r0 = r14.k0
            java.lang.String r2 = r14.m0
            su.happ.proxyutility.dto.SubscriptionItem r3 = r14.l0
            r4 = 1
            r5 = r14
            java.lang.Object r0 = r0.c(r1, r2, r3, r4, r5)
            if (r0 != r13) goto L6a
            goto L98
        L6a:
            su.happ.proxyutility.dto.SubscriptionExtraStatus r0 = (su.happ.proxyutility.dto.SubscriptionExtraStatus) r0
            r14.i0 = r12
            r14.g0 = r0
            r14.j0 = r7
            r14.h0 = r10
            java.lang.Object r1 = r6.l(r0, r14)
            if (r1 != r13) goto L7b
            goto L98
        L7b:
            if (r0 == 0) goto L7e
            goto L9a
        L7e:
            if (r7 >= r10) goto L9a
            be r0 = defpackage.gx1.Y
            r0 = 15
            lx1 r1 = defpackage.lx1.SECONDS
            long r0 = defpackage.vj8.l0(r0, r1)
            r14.i0 = r12
            r14.g0 = r12
            r14.j0 = r7
            r14.h0 = r9
            java.lang.Object r0 = defpackage.u70.G(r0, r14)
            if (r0 != r13) goto L99
        L98:
            return r13
        L99:
            r8 = r11
        L9a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L9f:
            java.lang.String r0 = "Required value was null."
            defpackage.bt.q(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq0.q(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        SubscriptionItem subscriptionItem = this.l0;
        String str = this.m0;
        xq0 xq0Var = new xq0(this.k0, subscriptionItem, str, (q51) obj3);
        xq0Var.i0 = (ze2) obj;
        xq0Var.j0 = iIntValue;
        return xq0Var.q(dn8.a);
    }
}
