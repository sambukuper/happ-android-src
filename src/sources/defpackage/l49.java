package defpackage;

import androidx.work.OverwritingInputMerger;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l49 {
    public static final em7 z;
    public final String a;
    public u39 b;
    public final String c;
    public String d;
    public u91 e;
    public u91 f;
    public long g;
    public long h;
    public long i;
    public p31 j;
    public int k;
    public z00 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public yd5 r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public final Boolean y;

    static {
        lh4.a1("WorkSpec");
        z = new em7((byte) 24);
    }

    public /* synthetic */ l49(String str, u39 u39Var, String str2, String str3, u91 u91Var, u91 u91Var2, long j, long j2, long j3, p31 p31Var, int i, z00 z00Var, long j4, long j5, long j6, long j7, boolean z2, yd5 yd5Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? u39.X : u39Var, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? u91.b : u91Var, (i5 & 32) != 0 ? u91.b : u91Var2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0L : j3, (i5 & 512) != 0 ? p31.j : p31Var, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? z00.X : z00Var, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? yd5.X : yd5Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? Boolean.FALSE : bool);
    }

    public static l49 b(l49 l49Var, String str, u39 u39Var, String str2, u91 u91Var, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3 = (i5 & 1) != 0 ? l49Var.a : str;
        u39 u39Var2 = (i5 & 2) != 0 ? l49Var.b : u39Var;
        String str4 = (i5 & 4) != 0 ? l49Var.c : str2;
        String str5 = l49Var.d;
        u91 u91Var2 = (i5 & 16) != 0 ? l49Var.e : u91Var;
        u91 u91Var3 = l49Var.f;
        long j3 = l49Var.g;
        long j4 = l49Var.h;
        long j5 = l49Var.i;
        p31 p31Var = l49Var.j;
        int i6 = (i5 & 1024) != 0 ? l49Var.k : i;
        z00 z00Var = l49Var.l;
        long j6 = l49Var.m;
        long j7 = (i5 & 8192) != 0 ? l49Var.n : j;
        long j8 = l49Var.o;
        long j9 = l49Var.p;
        boolean z2 = l49Var.q;
        yd5 yd5Var = l49Var.r;
        int i7 = (i5 & 262144) != 0 ? l49Var.s : i2;
        int i8 = (i5 & 524288) != 0 ? l49Var.t : i3;
        long j10 = (i5 & 1048576) != 0 ? l49Var.u : j2;
        int i9 = (i5 & 2097152) != 0 ? l49Var.v : i4;
        int i10 = l49Var.w;
        String str6 = l49Var.x;
        Boolean bool = l49Var.y;
        str3.getClass();
        u39Var2.getClass();
        str4.getClass();
        str5.getClass();
        u91Var2.getClass();
        u91Var3.getClass();
        p31Var.getClass();
        z00Var.getClass();
        yd5Var.getClass();
        return new l49(str3, u39Var2, str4, str5, u91Var2, u91Var3, j3, j4, j5, p31Var, i6, z00Var, j6, j7, j8, j9, z2, yd5Var, i7, i8, j10, i9, i10, str6, bool);
    }

    public final long a() {
        return c18.a(this.b == u39.X && this.k > 0, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l49)) {
            return false;
        }
        l49 l49Var = (l49) obj;
        return dh3.f(this.a, l49Var.a) && this.b == l49Var.b && dh3.f(this.c, l49Var.c) && dh3.f(this.d, l49Var.d) && dh3.f(this.e, l49Var.e) && dh3.f(this.f, l49Var.f) && this.g == l49Var.g && this.h == l49Var.h && this.i == l49Var.i && dh3.f(this.j, l49Var.j) && this.k == l49Var.k && this.l == l49Var.l && this.m == l49Var.m && this.n == l49Var.n && this.o == l49Var.o && this.p == l49Var.p && this.q == l49Var.q && this.r == l49Var.r && this.s == l49Var.s && this.t == l49Var.t && this.u == l49Var.u && this.v == l49Var.v && this.w == l49Var.w && dh3.f(this.x, l49Var.x) && dh3.f(this.y, l49Var.y);
    }

    public final int hashCode() {
        int iE = oi0.e(this.w, oi0.e(this.v, p61.g(oi0.e(this.t, oi0.e(this.s, (this.r.hashCode() + pc6.f(p61.g(p61.g(p61.g(p61.g((this.l.hashCode() + oi0.e(this.k, (this.j.hashCode() + p61.g(p61.g(p61.g((this.f.hashCode() + ((this.e.hashCode() + pc6.e(pc6.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, this.g, 31), this.h, 31), this.i, 31)) * 31, 31)) * 31, this.m, 31), this.n, 31), this.o, 31), this.p, 31), 31, this.q)) * 31, 31), 31), this.u, 31), 31), 31);
        String str = this.x;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return pc6.p("{WorkSpec: ", this.a, "}");
    }

    public l49(String str, u39 u39Var, String str2, String str3, u91 u91Var, u91 u91Var2, long j, long j2, long j3, p31 p31Var, int i, z00 z00Var, long j4, long j5, long j6, long j7, boolean z2, yd5 yd5Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        u39Var.getClass();
        str2.getClass();
        str3.getClass();
        u91Var.getClass();
        u91Var2.getClass();
        p31Var.getClass();
        z00Var.getClass();
        yd5Var.getClass();
        this.a = str;
        this.b = u39Var;
        this.c = str2;
        this.d = str3;
        this.e = u91Var;
        this.f = u91Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = p31Var;
        this.k = i;
        this.l = z00Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = yd5Var;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
