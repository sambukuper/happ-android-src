package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kg3 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public Object h0;
    public Object i0;
    public byte j0;
    public /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;
    public final /* synthetic */ Object m0;
    public Object n0;
    public final /* synthetic */ Object o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg3(ky2 ky2Var, Resources resources, Context context, Activity activity, dn2 dn2Var, gn2 gn2Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 2;
        this.h0 = ky2Var;
        this.k0 = resources;
        this.n0 = context;
        this.o0 = activity;
        this.l0 = dn2Var;
        this.m0 = gn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((kg3) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                return ((kg3) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 2:
                return ((kg3) n((q51) obj2, (co6) obj)).q(dn8Var);
            default:
                return ((kg3) n((q51) obj2, (ze2) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.m0;
        Object obj3 = this.l0;
        Object obj4 = this.o0;
        switch (b) {
            case 0:
                kg3 kg3Var = new kg3((f15) obj3, (lg3) obj4, (gn2) obj2, q51Var, (byte) 0);
                kg3Var.k0 = obj;
                return kg3Var;
            case 1:
                kg3 kg3Var2 = new kg3((f15) obj3, (m15) obj4, (gn2) obj2, q51Var, (byte) 1);
                kg3Var2.k0 = obj;
                return kg3Var2;
            case 2:
                kg3 kg3Var3 = new kg3((ky2) this.h0, (Resources) this.k0, (Context) this.n0, (Activity) obj4, (dn2) obj3, (gn2) obj2, q51Var);
                kg3Var3.i0 = obj;
                return kg3Var3;
            default:
                kg3 kg3Var4 = new kg3((ContentResolver) this.k0, (Uri) this.n0, (c81) obj4, (x90) obj3, (Context) obj2, q51Var);
                kg3Var4.i0 = obj;
                return kg3Var4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0266 A[Catch: all -> 0x0254, TryCatch #2 {all -> 0x0254, blocks: (B:93:0x0240, B:94:0x0242, B:97:0x0249, B:105:0x025e, B:106:0x0260, B:108:0x0266, B:111:0x026d), top: B:173:0x01b9 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x026c A[LOOP:1: B:106:0x0260->B:110:0x026c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x034a A[Catch: all -> 0x0338, TryCatch #4 {all -> 0x0338, blocks: (B:145:0x0324, B:146:0x0326, B:149:0x032d, B:157:0x0342, B:158:0x0344, B:160:0x034a, B:163:0x0351), top: B:176:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0350 A[LOOP:3: B:158:0x0344->B:162:0x0350, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x002b, B:19:0x005b, B:23:0x006b, B:25:0x0073, B:15:0x0041, B:18:0x0054), top: B:169:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (r3.l(r4, r14) == r5) goto L27;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o15] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:10:0x002e). Please report as a decompilation issue!!! */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg3.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg3(f15 f15Var, Object obj, gn2 gn2Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.l0 = f15Var;
        this.o0 = obj;
        this.m0 = gn2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg3(ContentResolver contentResolver, Uri uri, c81 c81Var, x90 x90Var, Context context, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 3;
        this.k0 = contentResolver;
        this.n0 = uri;
        this.o0 = c81Var;
        this.l0 = x90Var;
        this.m0 = context;
    }
}
