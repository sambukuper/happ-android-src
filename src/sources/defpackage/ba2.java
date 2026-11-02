package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ba2 extends uy7 implements gn2 {
    public FileOutputStream g0;
    public FileOutputStream h0;
    public boolean i0;
    public final /* synthetic */ ca2 j0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba2(ca2 ca2Var, Object obj, q51 q51Var) {
        super(1, q51Var);
        this.j0 = ca2Var;
        this.k0 = obj;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return ((ba2) m((q51) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        return new ba2(this.j0, this.k0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Exception {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        File file = this.j0.a;
        boolean z = this.i0;
        dn8 dn8Var = dn8.a;
        if (!z) {
            w39.n0(obj);
            try {
                fileOutputStream = new FileOutputStream(file);
                Object obj2 = this.k0;
                try {
                    tl8 tl8Var = new tl8(fileOutputStream);
                    this.g0 = fileOutputStream;
                    this.h0 = fileOutputStream;
                    this.i0 = true;
                    qe4.R0(obj2, tl8Var);
                    c71 c71Var = c71.X;
                    if (dn8Var == c71Var) {
                        return c71Var;
                    }
                    fileOutputStream2 = fileOutputStream;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    throw th;
                }
            } catch (Exception e) {
                if (e instanceof FileNotFoundException) {
                    throw os4.W(file.getParent(), (FileNotFoundException) e);
                }
                throw e;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream = this.h0;
            fileOutputStream2 = this.g0;
            try {
                w39.n0(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    oc.h(fileOutputStream2, th);
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        oc.h(fileOutputStream2, null);
        return dn8Var;
    }
}
