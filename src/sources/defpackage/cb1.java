package defpackage;

import android.hardware.camera2.params.MeteringRectangle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cb1 extends uy7 implements gn2 {
    public final /* synthetic */ byte g0;
    public byte h0;
    public Object i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb1(Object obj, q51 q51Var, byte b) {
        super(1, q51Var);
        this.g0 = b;
        this.j0 = obj;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        q51 q51Var = (q51) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((cb1) m(q51Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        byte b = this.g0;
        Object obj = this.j0;
        switch (b) {
            case 0:
                return new cb1((ib1) obj, q51Var, (byte) 0);
            case 1:
                return new cb1((k92) obj, q51Var, (byte) 1);
            default:
                return new cb1((wq8) obj, q51Var, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.io.Closeable] */
    @Override // defpackage.r10
    public final Object q(Object obj) throws Exception {
        Object objA;
        hh7 u66Var;
        Object objG;
        Object o05Var;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        Object objG2;
        xg1 xg1Var;
        Object objK;
        AutoCloseable autoCloseable;
        Object objK2;
        Object objM;
        byte b = this.g0;
        ?? r2 = "call to 'resume' before 'invoke' with coroutine";
        c71 c71Var = c71.X;
        boolean z = true;
        Object obj2 = this.j0;
        switch (b) {
            case 0:
                ib1 ib1Var = (ib1) obj2;
                byte b2 = this.h0;
                try {
                    if (b2 == 0) {
                        w39.n0(obj);
                        this.h0 = (byte) 1;
                        objG = ib1Var.g(true, this);
                        if (objG == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (b2 != 1) {
                            if (b2 != 2) {
                                bt.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) this.i0;
                            w39.n0(obj);
                            objA = obj;
                            u66Var = new u66(th, ((Number) objA).intValue());
                            return new qg5(u66Var, Boolean.TRUE);
                        }
                        w39.n0(obj);
                        objG = obj;
                    }
                    u66Var = (hh7) objG;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    ja7 ja7VarB = ib1Var.b();
                    this.i0 = th;
                    this.h0 = (byte) 2;
                    objA = ja7VarB.a();
                    if (objA == c71Var) {
                        return c71Var;
                    }
                }
                return new qg5(u66Var, Boolean.TRUE);
            case 1:
                k92 k92Var = (k92) obj2;
                byte b3 = this.h0;
                try {
                    try {
                        try {
                            if (b3 == 0) {
                                w39.n0(obj);
                                FileInputStream fileInputStream3 = new FileInputStream(k92Var.a);
                                this.i0 = fileInputStream3;
                                this.h0 = (byte) 1;
                                o05Var = qe4.K0(fileInputStream3);
                                r2 = fileInputStream3;
                                if (o05Var == c71Var) {
                                    return c71Var;
                                }
                            } else {
                                if (b3 != 1) {
                                    if (b3 != 2) {
                                        bt.i("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    fileInputStream2 = (FileInputStream) this.i0;
                                    try {
                                        w39.n0(obj);
                                        o05Var = obj;
                                        oc.h(fileInputStream2, null);
                                        return o05Var;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileInputStream = fileInputStream2;
                                        th = th;
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            oc.h(fileInputStream, th);
                                            throw th4;
                                        }
                                    }
                                }
                                FileInputStream fileInputStream4 = (FileInputStream) this.i0;
                                w39.n0(obj);
                                o05Var = obj;
                                r2 = fileInputStream4;
                            }
                            oc.h(r2, null);
                            break;
                        } catch (FileNotFoundException unused) {
                            if (k92Var.a.exists()) {
                                fileInputStream = new FileInputStream(k92Var.a);
                                try {
                                    this.i0 = fileInputStream;
                                    this.h0 = (byte) 2;
                                    o05Var = qe4.K0(fileInputStream);
                                    if (o05Var == c71Var) {
                                        return c71Var;
                                    }
                                    fileInputStream2 = fileInputStream;
                                } catch (Throwable th5) {
                                    th = th5;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                o05Var = new o05(z);
                            }
                        }
                        return o05Var;
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw os4.W(k92Var.a.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } catch (Throwable th6) {
                    ?? r8 = r2;
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        oc.h(r8, th6);
                        throw th7;
                    }
                }
            default:
                jr8 jr8Var = ((wq8) obj2).c;
                byte b4 = this.h0;
                try {
                    try {
                        try {
                            try {
                                if (b4 != 0) {
                                    if (b4 == 1) {
                                        w39.n0(obj);
                                        objK2 = obj;
                                    } else if (b4 == 2) {
                                        AutoCloseable autoCloseable2 = (AutoCloseable) this.i0;
                                        w39.n0(obj);
                                        objM = obj;
                                        r2 = autoCloseable2;
                                        xg1Var = (xg1) objM;
                                        u15.h(r2, null);
                                        this.i0 = null;
                                        this.h0 = (byte) 3;
                                        if (xg1Var.J0(this) == c71Var) {
                                            return c71Var;
                                        }
                                        qi0 qi0VarA = jr8Var.a();
                                        this.h0 = (byte) 4;
                                        objK = qi0VarA.k(this);
                                        if (objK == c71Var) {
                                            return c71Var;
                                        }
                                    } else if (b4 == 3) {
                                        w39.n0(obj);
                                        qi0 qi0VarA2 = jr8Var.a();
                                        this.h0 = (byte) 4;
                                        objK = qi0VarA2.k(this);
                                        if (objK == c71Var) {
                                            return c71Var;
                                        }
                                    } else {
                                        if (b4 != 4) {
                                            bt.i("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        w39.n0(obj);
                                        objK = obj;
                                    }
                                    autoCloseable = (AutoCloseable) objK;
                                    MeteringRectangle[] meteringRectangleArr = ii0.a;
                                    List listX = eu.X(meteringRectangleArr);
                                    List listAsList = Arrays.asList(meteringRectangleArr);
                                    listAsList.getClass();
                                    List listAsList2 = Arrays.asList(meteringRectangleArr);
                                    listAsList2.getClass();
                                    objG2 = uh0.g((ti0) autoCloseable, null, null, null, listX, listAsList, listAsList2, 7);
                                    u15.h(autoCloseable, null);
                                    return objG2;
                                }
                                w39.n0(obj);
                                hi5.i0("CXCP");
                                qi0 qi0VarA3 = jr8Var.a();
                                this.h0 = (byte) 1;
                                objK2 = qi0VarA3.k(this);
                                if (objK2 == c71Var) {
                                    return c71Var;
                                }
                                MeteringRectangle[] meteringRectangleArr2 = ii0.a;
                                List listX2 = eu.X(meteringRectangleArr2);
                                List listAsList3 = Arrays.asList(meteringRectangleArr2);
                                listAsList3.getClass();
                                List listAsList4 = Arrays.asList(meteringRectangleArr2);
                                listAsList4.getClass();
                                objG2 = uh0.g((ti0) autoCloseable, null, null, null, listX2, listAsList3, listAsList4, 7);
                                u15.h(autoCloseable, null);
                            } catch (Throwable th8) {
                                try {
                                    throw th8;
                                } catch (Throwable th9) {
                                    u15.h(autoCloseable, th8);
                                    throw th9;
                                }
                            }
                            AutoCloseable autoCloseable3 = (AutoCloseable) objK2;
                            this.i0 = autoCloseable3;
                            this.h0 = (byte) 2;
                            objM = ti0.m((ti0) autoCloseable3, 0L, 56);
                            r2 = autoCloseable3;
                            if (objM == c71Var) {
                                return c71Var;
                            }
                            xg1Var = (xg1) objM;
                            u15.h(r2, null);
                        } catch (Throwable th10) {
                            ?? r4 = r2;
                            try {
                                throw th10;
                            } catch (Throwable th11) {
                                u15.h(r4, th10);
                                throw th11;
                            }
                        }
                    } catch (CancellationException unused2) {
                        hi5.i0("CXCP");
                        xg1Var = wq8.l;
                    }
                    this.i0 = null;
                    this.h0 = (byte) 3;
                    if (xg1Var.J0(this) == c71Var) {
                        return c71Var;
                    }
                    qi0 qi0VarA4 = jr8Var.a();
                    this.h0 = (byte) 4;
                    objK = qi0VarA4.k(this);
                    if (objK == c71Var) {
                        return c71Var;
                    }
                    autoCloseable = (AutoCloseable) objK;
                } catch (CancellationException unused3) {
                    hi5.i0("CXCP");
                    objG2 = wq8.l;
                }
                return objG2;
        }
    }
}
