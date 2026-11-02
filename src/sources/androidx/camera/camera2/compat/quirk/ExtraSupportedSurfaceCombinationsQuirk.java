package androidx.camera.camera2.compat.quirk;

import defpackage.eu;
import defpackage.f26;
import defpackage.ie2;
import defpackage.jl7;
import defpackage.nx7;
import defpackage.ox7;
import defpackage.qx7;
import defpackage.rx7;
import defpackage.we5;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "Lf26;", "wl7", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraSupportedSurfaceCombinationsQuirk implements f26 {
    public static final nx7 a;
    public static final nx7 b;
    public static final Set c;
    public static final Set d;

    static {
        nx7 nx7Var = new nx7();
        jl7 jl7Var = rx7.e;
        ox7 ox7Var = ox7.VGA;
        jl7 jl7Var2 = rx7.e;
        qx7 qx7Var = qx7.Y;
        nx7Var.a(we5.f(qx7Var, ox7Var, jl7Var2));
        ox7 ox7Var2 = ox7.PREVIEW;
        qx7 qx7Var2 = qx7.X;
        nx7Var.a(we5.f(qx7Var2, ox7Var2, jl7Var2));
        ox7 ox7Var3 = ox7.MAXIMUM;
        nx7Var.a(we5.f(qx7Var, ox7Var3, jl7Var2));
        a = nx7Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(we5.f(qx7Var, ox7Var, jl7Var2));
        arrayList.add(we5.f(qx7Var, ox7Var2, jl7Var2));
        arrayList.add(we5.f(qx7Var, ox7Var3, jl7Var2));
        nx7 nx7Var2 = new nx7();
        ie2.o(nx7Var2, we5.f(qx7Var2, ox7Var2, jl7Var2), qx7Var2, ox7Var, jl7Var2);
        nx7Var2.a(we5.f(qx7Var, ox7Var3, jl7Var2));
        b = nx7Var2;
        c = eu.L0(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"});
        d = eu.L0(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"});
    }
}
