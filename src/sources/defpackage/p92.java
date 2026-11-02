package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p92 implements su0 {
    public final File a;
    public final ja7 b;
    public final o7 c;
    public final AtomicBoolean d;
    public final q15 e;

    public p92(File file, ja7 ja7Var, o7 o7Var) {
        ja7Var.getClass();
        this.a = file;
        this.b = ja7Var;
        this.c = o7Var;
        this.d = new AtomicBoolean(false);
        this.e = r15.a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:34:0x006f, B:43:0x0080, B:42:0x007d, B:39:0x0078), top: B:50:0x0020, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [p92] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [ta1] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    public final Object a(ta1 ta1Var, s51 s51Var) throws Throwable {
        n92 n92Var;
        ?? D;
        Throwable th;
        k92 k92Var;
        ?? r5;
        if (s51Var instanceof n92) {
            n92Var = (n92) s51Var;
            int i = n92Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                n92Var.j0 = i - Integer.MIN_VALUE;
            } else {
                n92Var = new n92(this, s51Var);
            }
        } else {
            n92Var = new n92(this, s51Var);
        }
        Object obj = n92Var.h0;
        int i2 = n92Var.j0;
        q15 q15Var = this.e;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = n92Var.f0;
                k92Var = n92Var.g0;
                try {
                    w39.n0(obj);
                    r5 = this;
                    try {
                        k92Var.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r5 != 0) {
                        q15Var.m(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        k92Var.close();
                    } catch (Throwable th4) {
                        gv3.g(th, th4);
                    }
                    throw th;
                }
            }
            w39.n0(obj);
            if (this.d.get()) {
                bt.i("StorageConnection has already been disposed.");
                return null;
            }
            D = q15Var.d();
            try {
                k92 k92Var2 = new k92(this.a);
                try {
                    Boolean boolValueOf = Boolean.valueOf((boolean) D);
                    n92Var.g0 = k92Var2;
                    n92Var.f0 = D;
                    n92Var.j0 = 1;
                    Object objX = ta1Var.x(k92Var2, boolValueOf, n92Var);
                    c71 c71Var = c71.X;
                    if (objX == c71Var) {
                        return c71Var;
                    }
                    obj = objX;
                    r5 = D == true ? 1 : 0;
                    k92Var = k92Var2;
                    k92Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r5 != 0) {
                        q15Var.m(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    this = D == true ? 1 : 0;
                    k92Var = k92Var2;
                    k92Var.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (D != 0) {
                    q15Var.m(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            D = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bc A[Catch: all -> 0x00f3, IOException -> 0x00f5, TRY_ENTER, TryCatch #0 {all -> 0x00f3, blocks: (B:42:0x00bc, B:44:0x00c2, B:46:0x00c8, B:50:0x00d4, B:51:0x00f2, B:47:0x00cd, B:58:0x00fe, B:70:0x0115, B:72:0x011b, B:73:0x011e, B:65:0x010d, B:64:0x010a), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2 A[Catch: all -> 0x00f3, IOException -> 0x00f5, TryCatch #0 {all -> 0x00f3, blocks: (B:42:0x00bc, B:44:0x00c2, B:46:0x00c8, B:50:0x00d4, B:51:0x00f2, B:47:0x00cd, B:58:0x00fe, B:70:0x0115, B:72:0x011b, B:73:0x011e, B:65:0x010d, B:64:0x010a), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[Catch: all -> 0x00f3, IOException -> 0x00f5, TryCatch #0 {all -> 0x00f3, blocks: (B:42:0x00bc, B:44:0x00c2, B:46:0x00c8, B:50:0x00d4, B:51:0x00f2, B:47:0x00cd, B:58:0x00fe, B:70:0x0115, B:72:0x011b, B:73:0x011e, B:65:0x010d, B:64:0x010a), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd A[Catch: all -> 0x00f3, IOException -> 0x00f5, TryCatch #0 {all -> 0x00f3, blocks: (B:42:0x00bc, B:44:0x00c2, B:46:0x00c8, B:50:0x00d4, B:51:0x00f2, B:47:0x00cd, B:58:0x00fe, B:70:0x0115, B:72:0x011b, B:73:0x011e, B:65:0x010d, B:64:0x010a), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4 A[Catch: all -> 0x00f3, IOException -> 0x00f5, TryCatch #0 {all -> 0x00f3, blocks: (B:42:0x00bc, B:44:0x00c2, B:46:0x00c8, B:50:0x00d4, B:51:0x00f2, B:47:0x00cd, B:58:0x00fe, B:70:0x0115, B:72:0x011b, B:73:0x011e, B:65:0x010d, B:64:0x010a), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe A[Catch: all -> 0x00f3, IOException -> 0x00f5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f3, blocks: (B:42:0x00bc, B:44:0x00c2, B:46:0x00c8, B:50:0x00d4, B:51:0x00f2, B:47:0x00cd, B:58:0x00fe, B:70:0x0115, B:72:0x011b, B:73:0x011e, B:65:0x010d, B:64:0x010a), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00d4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o92, q51] */
    /* JADX WARN: Type inference failed for: r1v3, types: [o15] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [o15] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, q15] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [rn2] */
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
    public final Object b(hb1 hb1Var, s51 s51Var) throws Throwable {
        ?? o92Var;
        ?? r10;
        ?? r9;
        ?? r8;
        File file;
        ca2 ca2Var;
        Throwable th;
        ca2 ca2Var2;
        ?? r1;
        File file2;
        boolean zRenameTo;
        if (s51Var instanceof o92) {
            o92 o92Var2 = (o92) s51Var;
            int i = o92Var2.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o92Var2.k0 = i - Integer.MIN_VALUE;
                o92Var = o92Var2;
            } else {
                o92Var = new o92(this, s51Var);
            }
        } else {
            o92Var = new o92(this, s51Var);
        }
        Object obj = o92Var.i0;
        int i2 = o92Var.k0;
        File file3 = this.a;
        c71 c71Var = c71.X;
        try {
            try {
                try {
                    try {
                        try {
                            if (i2 == 0) {
                                w39.n0(obj);
                                if (this.d.get()) {
                                    bt.i("StorageConnection has already been disposed.");
                                    return null;
                                }
                                File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        b61.h(file3, "Unable to create parent directories of ");
                                        return null;
                                    }
                                }
                                o92Var.f0 = hb1Var;
                                ?? r11 = this.e;
                                o92Var.g0 = r11;
                                o92Var.k0 = 1;
                                Object objG = r11.g(o92Var);
                                r8 = r11;
                                r9 = hb1Var;
                                if (objG != c71Var) {
                                }
                                return c71Var;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    bt.i("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ca2Var2 = o92Var.h0;
                                File file4 = (File) o92Var.g0;
                                o15 o15Var = (o15) o92Var.f0;
                                try {
                                    w39.n0(obj);
                                    r1 = o15Var;
                                    file2 = file4;
                                    try {
                                        ca2Var2.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (file2.exists()) {
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            zRenameTo = ue3.B(file2, file3);
                                        } else {
                                            zRenameTo = file2.renameTo(file3);
                                        }
                                        if (zRenameTo) {
                                            throw new IOException("Unable to rename " + file2 + " to " + file3 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    r1.m(null);
                                    return dn8.a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        ca2Var2.close();
                                    } catch (Throwable th4) {
                                        gv3.g(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            o15 o15Var2 = (o15) o92Var.g0;
                            rn2 rn2Var = (rn2) o92Var.f0;
                            w39.n0(obj);
                            r8 = o15Var2;
                            r9 = rn2Var;
                            o92Var.f0 = r8;
                            o92Var.g0 = file;
                            o92Var.h0 = ca2Var;
                            o92Var.k0 = 2;
                            if (r9.K(ca2Var, o92Var) != c71Var) {
                                r1 = r8;
                                file2 = file;
                                ca2Var2 = ca2Var;
                                ca2Var2.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = ue3.B(file2, file3);
                                    } else {
                                        zRenameTo = file2.renameTo(file3);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + file2 + " to " + file3 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                r1.m(null);
                                return dn8.a;
                            }
                            return c71Var;
                        } catch (Throwable th5) {
                            th = th5;
                            ca2Var2 = ca2Var;
                            ca2Var2.close();
                            throw th;
                        }
                        ca2Var = new ca2(file);
                    } catch (IOException e) {
                        e = e;
                        r10 = file;
                        if (!r10.exists()) {
                            throw e;
                        }
                        r10.delete();
                        throw e;
                    }
                    file = new File(file3.getAbsolutePath() + ".tmp");
                } catch (Throwable th6) {
                    o92Var = r8;
                    th = th6;
                    o92Var.m(null);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (IOException e2) {
            e = e2;
            r10 = hb1Var;
        }
    }

    @Override // defpackage.su0
    public final void close() {
        this.d.set(true);
        this.c.invoke();
    }
}
