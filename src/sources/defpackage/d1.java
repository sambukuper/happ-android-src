package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d1 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ eo5 Y;

    public /* synthetic */ d1(eo5 eo5Var, byte b) {
        this.X = b;
        this.Y = eo5Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        eo5 eo5Var = this.Y;
        do5 do5Var = (do5) obj;
        switch (b) {
            case 0:
                do5.h(do5Var, eo5Var, 0, 0);
                break;
            case 1:
                do5.f(do5Var, eo5Var, 0, 0);
                break;
            case 2:
                do5.h(do5Var, eo5Var, 0, 0);
                break;
            case 3:
                do5.f(do5Var, eo5Var, 0, 0);
                break;
            case 4:
                do5.h(do5Var, eo5Var, 0, 0);
                break;
            case 5:
                do5Var.getClass();
                do5.h(do5Var, eo5Var, (-eo5Var.X) / 2, (-eo5Var.Y) - do5Var.x0(24.0f));
                break;
            case 6:
                do5.h(do5Var, eo5Var, 0, 0);
                break;
            case 7:
                if (do5Var.b() == z24.X || do5Var.c() == 0) {
                    do5Var.d(eo5Var);
                    eo5Var.S(hf3.c(0L, eo5Var.g0), 0.0f, null);
                } else {
                    long jC = ((long) (do5Var.c() - eo5Var.X)) << 32;
                    do5Var.d(eo5Var);
                    eo5Var.S(hf3.c(jC, eo5Var.g0), 0.0f, null);
                }
                break;
            case 8:
                do5.f(do5Var, eo5Var, 0, 0);
                break;
            case 9:
                do5.h(do5Var, eo5Var, 0, 0);
                break;
            case 10:
                do5.j(do5Var, eo5Var, 0, 0);
                break;
            case 11:
                do5.h(do5Var, eo5Var, 0, 0);
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                do5.f(do5Var, eo5Var, 0, 0);
                break;
            case 13:
                do5.f(do5Var, eo5Var, 0, 0);
                break;
            case 14:
                do5.f(do5Var, eo5Var, 0, 0);
                break;
            case 15:
                do5.h(do5Var, eo5Var, 0, 0);
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                do5.f(do5Var, eo5Var, 0, 0);
                break;
            case 17:
                do5.f(do5Var, eo5Var, 0, 0);
                break;
            case 18:
                do5.f(do5Var, eo5Var, 0, 0);
                break;
            default:
                do5.h(do5Var, eo5Var, 0, 0);
                break;
        }
        return dn8Var;
    }
}
