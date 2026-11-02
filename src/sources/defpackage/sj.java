package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sj implements sd1 {
    public final d73 a;
    public final pd5 b;
    public final boolean c;

    public sj(d73 d73Var, pd5 pd5Var, boolean z) {
        this.a = d73Var;
        this.b = pd5Var;
        this.c = z;
    }

    public static final Drawable b(sj sjVar, aa6 aa6Var) {
        d73 d73VarB0 = w39.b0(sjVar.a, sjVar.c);
        try {
            ImageDecoder.Source sourceM = wa.M(d73VarB0, sjVar.b, true);
            if (sourceM == null) {
                ba0 ba0VarSource = d73VarB0.source();
                try {
                    ba0VarSource.request(Long.MAX_VALUE);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) ba0VarSource.c().Y);
                    while (!ba0VarSource.c().F()) {
                        ba0VarSource.c().read(byteBufferAllocateDirect);
                    }
                    byteBufferAllocateDirect.flip();
                    ba0VarSource.close();
                    sourceM = ImageDecoder.createSource(byteBufferAllocateDirect);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        oc.h(ba0VarSource, th);
                        throw th2;
                    }
                }
            }
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceM, new pj(sjVar, aa6Var, (byte) 0));
            u15.h(d73VarB0, null);
            return drawableDecodeDrawable;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u15.h(d73VarB0, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sd1
    public final Object a(q51 q51Var) {
        oj ojVar;
        aa6 aa6Var;
        Object objW;
        aa6 aa6Var2;
        if (q51Var instanceof oj) {
            ojVar = (oj) q51Var;
            int i = ojVar.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ojVar.i0 = i - Integer.MIN_VALUE;
            } else {
                ojVar = new oj(this, (s51) q51Var);
            }
        } else {
            ojVar = new oj(this, (s51) q51Var);
        }
        Object obj = ojVar.g0;
        int i2 = ojVar.i0;
        q51 q51Var2 = null;
        Object obj2 = c71.X;
        if (i2 == 0) {
            w39.n0(obj);
            aa6Var = new aa6();
            p5 p5Var = new p5(this, aa6Var, (byte) 5);
            ojVar.f0 = aa6Var;
            ojVar.i0 = 1;
            objW = w51.W(b02.X, new pg3(p5Var, q51Var2, (byte) 0), ojVar);
            if (objW != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            aa6 aa6Var3 = ojVar.f0;
            w39.n0(obj);
            objW = obj;
            aa6Var = aa6Var3;
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aa6Var2 = ojVar.f0;
            w39.n0(obj);
        }
        return new nd1(z39.h((Drawable) obj), aa6Var2.X);
        ojVar.f0 = aa6Var;
        ojVar.i0 = 2;
        Object objC = c((Drawable) objW, ojVar);
        if (objC != obj2) {
            aa6 aa6Var4 = aa6Var;
            obj = objC;
            aa6Var2 = aa6Var4;
            return new nd1(z39.h((Drawable) obj), aa6Var2.X);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Drawable drawable, s51 s51Var) {
        qj qjVar;
        if (s51Var instanceof qj) {
            qjVar = (qj) s51Var;
            int i = qjVar.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                qjVar.i0 = i - Integer.MIN_VALUE;
            } else {
                qjVar = new qj(this, s51Var);
            }
        } else {
            qjVar = new qj(this, s51Var);
        }
        Object obj = qjVar.g0;
        int i2 = qjVar.i0;
        pd5 pd5Var = this.b;
        if (i2 == 0) {
            w39.n0(obj);
            if (!(drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            f4 f4Var = w63.a;
            if (((Number) z68.G(pd5Var, f4Var)).intValue() != -2) {
                ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) z68.G(pd5Var, f4Var)).intValue());
            }
            dn2 dn2Var = (dn2) z68.G(pd5Var, w63.c);
            dn2 dn2Var2 = (dn2) z68.G(pd5Var, w63.d);
            if (dn2Var != null || dn2Var2 != null) {
                nf1 nf1Var = tp1.a;
                hv2 hv2Var = dm4.a.h0;
                rj rjVar = new rj(drawable, dn2Var, dn2Var2, null);
                qjVar.f0 = drawable;
                qjVar.i0 = 1;
                Object objW = w51.W(hv2Var, rjVar, qjVar);
                c71 c71Var = c71.X;
                if (objW == c71Var) {
                    return c71Var;
                }
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            drawable = (Drawable) qjVar.f0;
            w39.n0(obj);
        }
        return new rw6(drawable, pd5Var.c);
    }
}
