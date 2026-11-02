package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v76 {
    public static final /* synthetic */ int f = 0;
    public final s76 a;
    public final m51 b = gv3.c(g33.K(pw7.b(), new h71(oy1.p0, 2)));
    public final dq c;
    public final uy0 d;
    public volatile /* synthetic */ int e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(v76.class, "e");
    }

    public v76(s76 s76Var) {
        this.a = s76Var;
        wg wgVar = new wg();
        wgVar.b = new WeakReference(this);
        wgVar.c = new vg(wgVar, this);
        byte b = 1;
        wgVar.d = new fe(wgVar, b);
        dq dqVar = new dq(this);
        this.c = dqVar;
        y5 y5Var = new y5(s76Var.f);
        ArrayList arrayList = (ArrayList) y5Var.Y;
        ArrayList arrayList2 = (ArrayList) y5Var.f0;
        ArrayList arrayList3 = (ArrayList) y5Var.g0;
        ArrayList arrayList4 = (ArrayList) y5Var.h0;
        t63 t63Var = s76Var.b;
        Object obj = t63Var.n.a.get(g63.a);
        byte b2 = 0;
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList2.add(new w76(b2));
            arrayList4.add(new w76(b));
        }
        ci ciVar = new ci(b2);
        zb6 zb6Var = yb6.a;
        y5Var.m(ciVar, zb6Var.b(Uri.class));
        y5Var.m(new ci((byte) 3), zb6Var.b(Integer.class));
        arrayList3.add(new qg5(new gg((byte) 0), zb6Var.b(dq8.class)));
        y5Var.o(new tu(b2), zb6Var.b(dq8.class));
        y5Var.o(new tu((byte) 4), zb6Var.b(dq8.class));
        y5Var.o(new tu((byte) 9), zb6Var.b(dq8.class));
        y5Var.o(new tu((byte) 6), zb6Var.b(Drawable.class));
        f4 f4Var = h63.a;
        Object obj2 = t63Var.n.a.get(h63.a);
        int iIntValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i = l17.a;
        k17 k17Var = new k17(iIntValue, 0);
        int i2 = Build.VERSION.SDK_INT;
        Object obj3 = e62.a;
        if (i2 >= 29) {
            Object obj4 = t63Var.n.a.get(h63.c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = t63Var.n.a.get(h63.b);
                if (((e62) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    arrayList4.add(new ty0(new fi7(k17Var), b));
                }
            }
        }
        Object obj6 = t63Var.n.a.get(h63.b);
        arrayList4.add(new ty0(new z50(k17Var, (e62) (obj6 != null ? obj6 : obj3)), b));
        y5Var.m(new ci(b), zb6Var.b(File.class));
        y5Var.o(new tu((byte) 8), zb6Var.b(dq8.class));
        y5Var.o(new tu((byte) 3), zb6Var.b(ByteBuffer.class));
        y5Var.m(new ci((byte) 4), zb6Var.b(String.class));
        byte b3 = 2;
        y5Var.m(new ci(b3), zb6Var.b(oi5.class));
        arrayList3.add(new qg5(new gg((byte) 1), zb6Var.b(dq8.class)));
        arrayList3.add(new qg5(new gg((byte) 2), zb6Var.b(dq8.class)));
        y5Var.o(new tu((byte) 7), zb6Var.b(dq8.class));
        y5Var.o(new tu(b3), zb6Var.b(byte[].class));
        y5Var.o(new tu((byte) 5), zb6Var.b(dq8.class));
        y5Var.o(new tu(b), zb6Var.b(Bitmap.class));
        arrayList.add(new n12(this, wgVar, dqVar));
        this.d = new uy0(w51.O(arrayList), w51.O((ArrayList) y5Var.Z), w51.O(arrayList3), w51.O(arrayList2), w51.O(arrayList4));
    }

    /* JADX WARN: Code duplicated, block: B:106:0x017e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b5 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:138:0x0225, B:140:0x0229, B:143:0x0235, B:144:0x023a, B:28:0x006a, B:119:0x01ae, B:121:0x01b5, B:123:0x01bf, B:124:0x01c9, B:125:0x01cc), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01bf A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:138:0x0225, B:140:0x0229, B:143:0x0235, B:144:0x023a, B:28:0x006a, B:119:0x01ae, B:121:0x01b5, B:123:0x01bf, B:124:0x01c9, B:125:0x01cc), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:134:0x0212  */
    /* JADX WARN: Code duplicated, block: B:137:0x021c A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:138:0x0225, B:140:0x0229, B:143:0x0235, B:144:0x023a, B:28:0x006a, B:119:0x01ae, B:121:0x01b5, B:123:0x01bf, B:124:0x01c9, B:125:0x01cc), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0225 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:138:0x0225, B:140:0x0229, B:143:0x0235, B:144:0x023a, B:28:0x006a, B:119:0x01ae, B:121:0x01b5, B:123:0x01bf, B:124:0x01c9, B:125:0x01cc), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0229 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:138:0x0225, B:140:0x0229, B:143:0x0235, B:144:0x023a, B:28:0x006a, B:119:0x01ae, B:121:0x01b5, B:123:0x01bf, B:124:0x01c9, B:125:0x01cc), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0235 A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:138:0x0225, B:140:0x0229, B:143:0x0235, B:144:0x023a, B:28:0x006a, B:119:0x01ae, B:121:0x01b5, B:123:0x01bf, B:124:0x01c9, B:125:0x01cc), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:153:0x024f A[Catch: all -> 0x025c, TRY_LEAVE, TryCatch #4 {all -> 0x025c, blocks: (B:151:0x024b, B:153:0x024f, B:158:0x025e, B:159:0x0264), top: B:169:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:158:0x025e A[Catch: all -> 0x025c, TRY_ENTER, TryCatch #4 {all -> 0x025c, blocks: (B:151:0x024b, B:153:0x024f, B:158:0x025e, B:159:0x0264), top: B:169:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a5, code lost:
    
        if (r1.a(r9) == r14) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, v76] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, v63] */
    /* JADX WARN: Type inference failed for: r3v15, types: [oy1] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, oy1] */
    /* JADX WARN: Type inference failed for: r3v18, types: [v63] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [oy1] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, oy1] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, v63] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, oy1] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [v63] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, v63] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v9, types: [v63] */
    /* JADX WARN: Type inference failed for: r5v0, types: [v63] */
    /* JADX WARN: Type inference failed for: r5v1, types: [re6] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r6v13, types: [gn2] */
    /* JADX WARN: Type inference failed for: r6v8, types: [gn2] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.v63 r18, int r19, defpackage.s51 r20) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v76.a(v63, int, s51):java.lang.Object");
    }

    public final Object b(v63 v63Var, s51 s51Var) {
        return ((v63Var.c instanceof lq2) || (v63Var.o instanceof f86) || ((g94) z68.F(v63Var, b73.e)) != null) ? gv3.n(new qk4((Object) this, (Object) v63Var, (q51) null, (byte) 12), s51Var) : a(v63Var, 1, s51Var);
    }

    public final a86 c() {
        return (a86) this.a.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final void d(m32 m32Var, r18 r18Var, oy1 oy1Var) {
        v63 v63Var = m32Var.b;
        d53 d53Var = m32Var.a;
        if (r18Var instanceof ke8) {
            ae8 ae8VarA = ((td8) z68.F(v63Var, b73.a)).a((ke8) r18Var, m32Var);
            if (ae8VarA instanceof y55) {
                r18Var.onError(d53Var);
            } else {
                oy1Var.getClass();
                ae8VarA.a();
            }
        } else if (r18Var != null) {
            r18Var.onError(d53Var);
        }
        oy1Var.getClass();
        v63Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final void e(jw7 jw7Var, r18 r18Var, oy1 oy1Var) {
        v63 v63Var = jw7Var.b;
        d53 d53Var = jw7Var.a;
        if (r18Var instanceof ke8) {
            ae8 ae8VarA = ((td8) z68.F(v63Var, b73.a)).a((ke8) r18Var, jw7Var);
            if (ae8VarA instanceof y55) {
                r18Var.onSuccess(d53Var);
            } else {
                oy1Var.getClass();
                ae8VarA.a();
            }
        } else if (r18Var != null) {
            r18Var.onSuccess(d53Var);
        }
        oy1Var.getClass();
        v63Var.getClass();
    }
}
