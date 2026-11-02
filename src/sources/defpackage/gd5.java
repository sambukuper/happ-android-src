package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gd5 extends aq7 {
    public static final ed5[] x0 = new ed5[0];
    public final aq7 g0;
    public final boolean h0;
    public fd5 j0;
    public volatile Queue k0;
    public volatile k01 l0;
    public volatile ConcurrentLinkedQueue m0;
    public volatile boolean n0;
    public boolean o0;
    public boolean p0;
    public long s0;
    public long t0;
    public int u0;
    public int w0;
    public final int i0 = Integer.MAX_VALUE;
    public final Object q0 = new Object();
    public volatile ed5[] r0 = x0;
    public final int v0 = Integer.MAX_VALUE;

    public gd5(aq7 aq7Var, boolean z) {
        this.g0 = aq7Var;
        this.h0 = z;
        e(Long.MAX_VALUE);
    }

    public static void k(ed5 ed5Var, Object obj) {
        pr6 pr6Var;
        pr6 pr6Var2 = ed5Var.j0;
        if (pr6Var2 == null) {
            int i = pr6.Y;
            if (sn8.a == null || sn8.b) {
                bg7 bg7Var = new bg7(i);
                pr6Var = new pr6();
                pr6Var.X = bg7Var;
            } else {
                pr6Var = new pr6();
                pr6Var.X = new xf7(i);
            }
            pr6Var2 = pr6Var;
            ed5Var.X.b(pr6Var2);
            ed5Var.j0 = pr6Var2;
        }
        if (obj == null) {
            try {
                obj = ch3.d;
            } catch (aw4 e) {
                ed5Var.c();
                ed5Var.onError(e);
                return;
            } catch (IllegalStateException e2) {
                if (ed5Var.X.Y) {
                    return;
                }
                ed5Var.c();
                ed5Var.onError(e2);
                return;
            }
        }
        pr6Var2.b(obj);
    }

    @Override // defpackage.u85
    public final void b() throws Throwable {
        this.n0 = true;
        h();
    }

    public final boolean g() {
        if (this.g0.X.Y) {
            return true;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.m0;
        if (this.h0 || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return false;
        }
        try {
            n();
            return true;
        } finally {
            c();
        }
    }

    public final void h() throws Throwable {
        synchronized (this) {
            try {
                if (this.o0) {
                    this.p0 = true;
                } else {
                    this.o0 = true;
                    i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0200 */
    /* JADX WARN: Code duplicated, block: B:101:0x0126 A[Catch: all -> 0x0129, DONT_GENERATE, TryCatch #3 {all -> 0x0129, blocks: (B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:207:0x0122, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x012b A[Catch: all -> 0x0129, TryCatch #3 {all -> 0x0129, blocks: (B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:207:0x0122, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0133 A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0137  */
    /* JADX WARN: Code duplicated, block: B:112:0x0139  */
    /* JADX WARN: Code duplicated, block: B:125:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0159 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0166  */
    /* JADX WARN: Code duplicated, block: B:131:0x0177 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x017a A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0181 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0188  */
    /* JADX WARN: Code duplicated, block: B:144:0x019f  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a1 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b1 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x01bb A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x01c1 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:192:0x0204  */
    /* JADX WARN: Code duplicated, block: B:193:0x0205  */
    /* JADX WARN: Code duplicated, block: B:207:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0155 A[EDGE_INSN: B:247:0x0155->B:124:0x0155 BREAK  A[LOOP:6: B:90:0x0110->B:114:0x013d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0104 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x010c A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0114 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x011c A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0121 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd5.i():void");
    }

    public final ConcurrentLinkedQueue j() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        ConcurrentLinkedQueue concurrentLinkedQueue2 = this.m0;
        if (concurrentLinkedQueue2 != null) {
            return concurrentLinkedQueue2;
        }
        synchronized (this) {
            try {
                concurrentLinkedQueue = this.m0;
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    this.m0 = concurrentLinkedQueue;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentLinkedQueue;
    }

    public final void l(Object obj) throws Throwable {
        Queue cg7Var;
        Queue dg7Var = this.k0;
        if (dg7Var == null) {
            int i = this.i0;
            if (i == Integer.MAX_VALUE) {
                dg7Var = new dg7(pr6.Y);
            } else {
                if (((i - 1) & i) == 0) {
                    cg7Var = (sn8.a == null || sn8.b) ? new bg7(i) : new xf7(i);
                } else {
                    cg7Var = new cg7(i);
                }
                dg7Var = cg7Var;
            }
            this.k0 = dg7Var;
        }
        if (dg7Var.offer(obj == null ? ch3.d : obj)) {
            return;
        }
        c();
        aw4 aw4Var = new aw4();
        ma5.a(obj, aw4Var);
        onError(aw4Var);
    }

    public final void m(ed5 ed5Var) {
        HashSet hashSet;
        pr6 pr6Var = ed5Var.j0;
        if (pr6Var != null) {
            synchronized (pr6Var) {
            }
        }
        k01 k01Var = this.l0;
        if (!k01Var.Y) {
            synchronized (k01Var) {
                if (!k01Var.Y && (hashSet = (HashSet) k01Var.Z) != null) {
                    boolean zRemove = hashSet.remove(ed5Var);
                    if (zRemove) {
                        ed5Var.c();
                    }
                }
            }
        }
        synchronized (this.q0) {
            try {
                ed5[] ed5VarArr = this.r0;
                int length = ed5VarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (ed5Var.equals(ed5VarArr[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    this.r0 = x0;
                    return;
                }
                ed5[] ed5VarArr2 = new ed5[length - 1];
                System.arraycopy(ed5VarArr, 0, ed5VarArr2, 0, i);
                System.arraycopy(ed5VarArr, i + 1, ed5VarArr2, i, (length - i) - 1);
                this.r0 = ed5VarArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        ArrayList arrayList = new ArrayList(this.m0);
        int size = arrayList.size();
        aq7 aq7Var = this.g0;
        if (size == 1) {
            aq7Var.onError((Throwable) arrayList.get(0));
        } else {
            aq7Var.onError(new g01(arrayList));
        }
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) throws Throwable {
        j().offer(th);
        this.n0 = true;
        h();
    }

    /* JADX WARN: Code duplicated, block: B:140:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00b7  */
    @Override // defpackage.u85
    public final void onNext(Object obj) throws Throwable {
        boolean z;
        q85 q85Var = (q85) obj;
        if (q85Var == null) {
            return;
        }
        boolean z2 = true;
        if (q85Var == g02.X) {
            int i = this.w0 + 1;
            if (i != this.v0) {
                this.w0 = i;
                return;
            } else {
                this.w0 = 0;
                e(i);
                return;
            }
        }
        if (!(q85Var instanceof ow6)) {
            long j = this.s0;
            this.s0 = 1 + j;
            ed5 ed5Var = new ed5(this, j);
            k01 k01Var = this.l0;
            if (k01Var == null) {
                synchronized (this) {
                    try {
                        k01Var = this.l0;
                        if (k01Var == null) {
                            k01Var = new k01((byte) 0);
                            this.l0 = k01Var;
                        } else {
                            z2 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z2) {
                    this.X.b(k01Var);
                }
            }
            if (!ed5Var.X.Y) {
                if (k01Var.Y) {
                    ed5Var.c();
                } else {
                    synchronized (k01Var) {
                        try {
                            if (k01Var.Y) {
                                ed5Var.c();
                            } else {
                                HashSet hashSet = (HashSet) k01Var.Z;
                                if (hashSet == null) {
                                    hashSet = new HashSet(4);
                                    k01Var.Z = hashSet;
                                }
                                hashSet.add(ed5Var);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            synchronized (this.q0) {
                ed5[] ed5VarArr = this.r0;
                int length = ed5VarArr.length;
                ed5[] ed5VarArr2 = new ed5[length + 1];
                System.arraycopy(ed5VarArr, 0, ed5VarArr2, 0, length);
                ed5VarArr2[length] = ed5Var;
                this.r0 = ed5VarArr2;
            }
            q85Var.d(ed5Var);
            h();
            return;
        }
        Object obj2 = ((ow6) q85Var).Y;
        long j2 = this.j0.get();
        if (j2 != 0) {
            synchronized (this) {
                try {
                    j2 = this.j0.get();
                    if (this.o0 || j2 == 0) {
                        z = false;
                    } else {
                        this.o0 = true;
                        z = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            l(obj2);
            h();
            return;
        }
        Queue queue = this.k0;
        if (queue != null && !queue.isEmpty()) {
            l(obj2);
            i();
            return;
        }
        try {
            try {
                this.g0.onNext(obj2);
            } catch (Throwable th4) {
                try {
                    if (!this.h0) {
                        vr3.c0(th4);
                        c();
                        onError(th4);
                        return;
                    }
                    j().offer(th4);
                } catch (Throwable th5) {
                    th = th5;
                    z2 = false;
                    if (!z2) {
                        synchronized (this) {
                            this.o0 = false;
                        }
                    }
                    throw th;
                }
            }
            if (j2 != Long.MAX_VALUE) {
                this.j0.addAndGet(-1L);
            }
            int i2 = this.w0 + 1;
            if (i2 == this.v0) {
                this.w0 = 0;
                e(i2);
            } else {
                this.w0 = i2;
            }
            synchronized (this) {
                try {
                    if (this.p0) {
                        this.p0 = false;
                        i();
                    } else {
                        this.o0 = false;
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            if (!z2) {
                synchronized (this) {
                    this.o0 = false;
                }
            }
            throw th;
        }
    }
}
