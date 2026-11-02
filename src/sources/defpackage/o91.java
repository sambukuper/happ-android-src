package defpackage;

import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;
import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o91 implements u06 {
    public final l91 X;
    public final n91 Y;
    public final t5 Z;
    public final byte f0;

    /* JADX WARN: Multi-variable type inference failed */
    public o91(l91 l91Var, n91 n91Var, t5 t5Var, int i) {
        this.X = l91Var;
        this.Y = n91Var;
        this.Z = t5Var;
        this.f0 = i;
    }

    @Override // defpackage.v06
    public final Object get() {
        l91 l91Var = this.X;
        t5 t5Var = this.Z;
        n91 n91Var = this.Y;
        byte b = this.f0;
        switch (b) {
            case 0:
                jr8 jr8Var = (jr8) ((u06) t5Var.Y).get();
                pr8 pr8Var = (pr8) n91Var.k.get();
                if (((u06) t5Var.Z).get() == null) {
                    return new nq8(jr8Var, pr8Var, (qq8) ((u06) t5Var.n0).get(), (u06) t5Var.l0, (u06) t5Var.k0, (u06) t5Var.j0);
                }
                c2.m();
                return null;
            case 1:
                jq8 jq8Var = (jq8) t5Var.X;
                ok0 ok0Var = (ok0) n91Var.y.get();
                jq8Var.getClass();
                ok0Var.getClass();
                hi5.i0("CXCP");
                return new jr8(new iq8(jq8Var, (byte) 0), ok0Var, jq8Var.b, new iq8(jq8Var, (byte) 1));
            case 2:
                ((jq8) t5Var.X).getClass();
                return null;
            case 3:
                return new gh1((u06) t5Var.m0, (pr8) n91Var.k.get());
            case 4:
                return new wq8((u06) t5Var.j0, (u06) t5Var.g0, (jr8) ((u06) t5Var.Y).get(), (u06) t5Var.l0, (pr8) n91Var.k.get(), (bm0) l91Var.a.i0);
            case 5:
                u06 u06Var = (u06) t5Var.h0;
                u06 u06Var2 = (u06) t5Var.i0;
                u06Var.getClass();
                u06Var2.getClass();
                if (in0.c) {
                    Object obj = u06Var2.get();
                    obj.getClass();
                    return (en0) obj;
                }
                Object obj2 = u06Var.get();
                obj2.getClass();
                return (en0) obj2;
            case 6:
                zm0 zm0Var = (zm0) ((u06) t5Var.f0).get();
                pd2 pd2Var = (pd2) n91Var.r.get();
                uc8 uc8Var = (uc8) n91Var.q.get();
                nv8 nv8Var = (nv8) n91Var.u.get();
                pr8 pr8Var2 = (pr8) n91Var.k.get();
                lx0 lx0Var = (lx0) n91Var.m.get();
                ik0 ik0Var = (ik0) n91Var.j.get();
                zh0 zh0VarA = n91Var.c.a();
                bh3 bh3Var = (bh3) n91Var.E.get();
                ik0Var.getClass();
                bh3Var.getClass();
                return new hn0(zm0Var, pd2Var, uc8Var, nv8Var, pr8Var2, lx0Var, ik0Var.a().a(UseTorchAsFlashQuirk.class) ? new lr5(ik0Var, zh0VarA, bh3Var) : qe4.k0, (qj0) n91Var.e.get(), (u06) t5Var.g0, (jr8) ((u06) t5Var.Y).get());
            case 7:
                qj0 qj0Var = (qj0) n91Var.e.get();
                jr8 jr8Var2 = (jr8) ((u06) t5Var.Y).get();
                t79 t79Var = (t79) n91Var.f.get();
                pr8 pr8Var3 = (pr8) n91Var.k.get();
                n91Var.a();
                qj0Var.getClass();
                jr8Var2.getClass();
                t79Var.getClass();
                pr8Var3.getClass();
                zm0 zm0Var2 = new zm0();
                ij0 ij0Var = jj0.h;
                jj0 jj0Var = qj0Var.b;
                ij0Var.getClass();
                ij0.c(jj0Var);
                return zm0Var2;
            case 8:
                return new br8((jr8) ((u06) t5Var.Y).get(), n91Var.a());
            case 9:
                return new in0((qj0) n91Var.e.get(), (u06) t5Var.h0, (pr8) n91Var.k.get(), (uc8) n91Var.q.get());
            case 10:
                pr8 pr8Var4 = (pr8) n91Var.k.get();
                rj0 rj0Var = (rj0) l91Var.a.f0;
                hi5.R(rj0Var);
                ik0 ik0Var2 = (ik0) n91Var.j.get();
                ik0Var2.getClass();
                i26 i26VarA = ik0Var2.a();
                return new or8(pr8Var4, rj0Var, (i26VarA.a(ConfigureSurfaceToSecondarySessionFailQuirk.class) || i26VarA.a(PreviewOrientationIncorrectQuirk.class) || i26VarA.a(TextureViewIsClosedQuirk.class)) ? new e93() : lh4.j0, (h57) ((u06) t5Var.k0).get());
            case 11:
                return ((jq8) t5Var.X).c;
            default:
                throw new AssertionError((int) b);
        }
    }
}
