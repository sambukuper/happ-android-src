package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.Map;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wu1 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public byte h0;
    public /* synthetic */ Object i0;
    public Object j0;
    public Object k0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu1(i87 i87Var, xe2 xe2Var, w05 w05Var, Object obj, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 1;
        this.j0 = i87Var;
        this.k0 = xe2Var;
        this.l0 = w05Var;
        this.i0 = obj;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                return ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 2:
                return ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 3:
                ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case 4:
                return ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 5:
                return ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 6:
                return ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 7:
                ((wu1) n((q51) obj2, (ze2) obj)).q(dn8Var);
                return c71Var;
            case 8:
                ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case 9:
                return ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 10:
                return ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 11:
                ((wu1) n((q51) obj2, (ze2) obj)).q(dn8Var);
                return c71Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((wu1) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [int[], java.io.Serializable] */
    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.l0;
        switch (b) {
            case 0:
                wu1 wu1Var = new wu1(obj2, q51Var, (byte) 0);
                wu1Var.i0 = obj;
                return wu1Var;
            case 1:
                return new wu1((i87) this.j0, (xe2) this.k0, (w05) obj2, this.i0, q51Var);
            case 2:
                return new wu1((be7) this.j0, (oi) this.k0, (y05) this.i0, (y05) obj2, q51Var, (byte) 2);
            case 3:
                wu1 wu1Var2 = new wu1((y05) this.k0, (nc3) obj2, q51Var, (byte) 3);
                wu1Var2.i0 = obj;
                return wu1Var2;
            case 4:
                wu1 wu1Var3 = new wu1((wl6) this.k0, (rn2) obj2, q51Var, (byte) 4);
                wu1Var3.i0 = obj;
                return wu1Var3;
            case 5:
                return new wu1((q15) this.i0, (rn2) obj2, q51Var);
            case 6:
                return new wu1(this.k0, this.i0, obj2, q51Var, (byte) 6);
            case 7:
                wu1 wu1Var4 = new wu1((d27) this.k0, (String) obj2, q51Var, (byte) 7);
                wu1Var4.i0 = obj;
                return wu1Var4;
            case 8:
                return new wu1(this.k0, this.i0, obj2, q51Var, (byte) 8);
            case 9:
                wu1 wu1Var5 = new wu1(this.j0, (Serializable) this.k0, obj2, q51Var, (byte) 9);
                wu1Var5.i0 = obj;
                return wu1Var5;
            case 10:
                wu1 wu1Var6 = new wu1(obj2, q51Var, (byte) 10);
                wu1Var6.i0 = obj;
                return wu1Var6;
            case 11:
                wu1 wu1Var7 = new wu1(this.j0, (Serializable) this.k0, obj2, q51Var, (byte) 11);
                wu1Var7.i0 = obj;
                return wu1Var7;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new wu1((wq8) this.j0, (pq8) this.k0, (Map) this.i0, (k11) obj2, q51Var, (byte) 12);
            default:
                return new wu1((ec4) this.j0, (l49) this.k0, (lj2) this.i0, (Context) obj2, q51Var, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:339:0x0679 A[PHI: r0 r3
  0x0679: PHI (r0v18 ea6) = (r0v9 ea6), (r0v25 ea6) binds: [B:338:0x0678, B:364:0x06f9] A[DONT_GENERATE, DONT_INLINE]
  0x0679: PHI (r3v10 b71) = (r3v7 b71), (r3v12 b71) binds: [B:338:0x0678, B:364:0x06f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:345:0x06a7 A[PHI: r5
  0x06a7: PHI (r5v11 b71) = (r5v4 b71), (r5v5 b71), (r5v5 b71), (r5v5 b71), (r5v9 b71), (r5v14 b71) binds: [B:335:0x066a, B:373:0x0715, B:375:0x0721, B:369:0x070e, B:382:0x0737, B:344:0x06a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:347:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:349:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:352:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:357:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:360:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:372:0x0713 A[Catch: CancellationException -> 0x0711, TryCatch #1 {CancellationException -> 0x0711, blocks: (B:366:0x06fc, B:368:0x0702, B:372:0x0713, B:374:0x0717), top: B:388:0x06fc }] */
    /* JADX WARN: Code duplicated, block: B:374:0x0717 A[Catch: CancellationException -> 0x0711, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0711, blocks: (B:366:0x06fc, B:368:0x0702, B:372:0x0713, B:374:0x0717), top: B:388:0x06fc }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v182 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, xe2] */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94, types: [rn2] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, w05, ze2] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v17, types: [o15] */
    /* JADX WARN: Type inference failed for: r1v20, types: [o15] */
    /* JADX WARN: Type inference failed for: r1v23, types: [o15] */
    /* JADX WARN: Type inference failed for: r1v28, types: [o15] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0208 -> B:99:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x02f3 -> B:162:0x02c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x035a -> B:182:0x0320). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:270:0x050e -> B:274:0x052d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:272:0x052a -> B:274:0x052d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:369:0x070e -> B:345:0x06a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:373:0x0715 -> B:345:0x06a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:375:0x0721 -> B:345:0x06a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:380:0x0733 -> B:344:0x06a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:382:0x0737 -> B:345:0x06a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu1.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu1(q15 q15Var, rn2 rn2Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 5;
        this.i0 = q15Var;
        this.l0 = rn2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu1(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu1(Object obj, Serializable serializable, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
        this.k0 = serializable;
        this.l0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu1(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.k0 = obj;
        this.l0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu1(Object obj, Object obj2, Object obj3, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.k0 = obj;
        this.i0 = obj2;
        this.l0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu1(Object obj, Object obj2, Object obj3, Object obj4, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
        this.k0 = obj2;
        this.i0 = obj3;
        this.l0 = obj4;
    }
}
