package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends qj6 implements rn2 {
    public kt Z;
    public Iterator f0;
    public boolean g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ oi5 i0;
    public final /* synthetic */ s92 j0;
    public final /* synthetic */ boolean k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(oi5 oi5Var, s92 s92Var, boolean z, q51 q51Var) {
        super(2, q51Var);
        this.i0 = oi5Var;
        this.j0 = s92Var;
        this.k0 = z;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((e) n((q51) obj2, (v27) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        e eVar = new e(this.i0, this.j0, this.k0, q51Var);
        eVar.h0 = obj;
        return eVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:13:0x005d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005b -> B:14:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r9.g0
            s92 r2 = r9.j0
            r8 = 1
            if (r0 == 0) goto L20
            if (r0 != r8) goto L19
            java.util.Iterator r0 = r9.f0
            kt r1 = r9.Z
            java.lang.Object r3 = r9.h0
            v27 r3 = (defpackage.v27) r3
            defpackage.w39.n0(r10)
            r7 = r3
            r3 = r1
            r1 = r7
            r7 = r9
            goto L5e
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r9)
            r9 = 0
            return r9
        L20:
            defpackage.w39.n0(r10)
            java.lang.Object r10 = r9.h0
            v27 r10 = (defpackage.v27) r10
            kt r0 = new kt
            r0.<init>()
            oi5 r1 = r9.i0
            r0.addLast(r1)
            java.util.List r1 = r2.list(r1)
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
            r0 = r1
            r1 = r10
        L3c:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L60
            java.lang.Object r10 = r0.next()
            r4 = r10
            oi5 r4 = (defpackage.oi5) r4
            r9.h0 = r1
            r9.Z = r3
            r9.f0 = r0
            r9.g0 = r8
            boolean r5 = r9.k0
            r6 = 0
            r7 = r9
            java.lang.Object r9 = defpackage.jm4.u(r1, r2, r3, r4, r5, r6, r7)
            c71 r10 = defpackage.c71.X
            if (r9 != r10) goto L5e
            return r10
        L5e:
            r9 = r7
            goto L3c
        L60:
            dn8 r9 = defpackage.dn8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.q(java.lang.Object):java.lang.Object");
    }
}
