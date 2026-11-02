package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gh2 implements eh2 {
    public final AndroidComposeView a;
    public final AndroidComposeView b;
    public final bh2 d;
    public b05 f;
    public ai2 h;
    public final ai2 c = new ai2(2, null, 14);
    public final fh2 e = new fh2(this);
    public final j05 g = new j05(1);

    public gh2(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.a = androidComposeView;
        this.b = androidComposeView2;
        this.d = new bh2(this, androidComposeView2);
    }

    public final boolean a(boolean z) {
        t6 t6Var;
        if (f() != null) {
            ai2 ai2VarF = f();
            i(null);
            if (ai2VarF != null) {
                yh2 yh2Var = yh2.X;
                yh2 yh2Var2 = yh2.Z;
                ai2VarF.Z0(yh2Var, yh2Var2);
                if (!ai2VarF.X.p0) {
                    wc3.b("visitAncestors called on an unattached node");
                }
                jx4 jx4Var = ai2VarF.X.g0;
                LayoutNode layoutNodeZ = yn0.Z(ai2VarF);
                while (layoutNodeZ != null) {
                    if ((((jx4) layoutNodeZ.H0.i0).f0 & 1024) != 0) {
                        while (jx4Var != null) {
                            if ((jx4Var.Z & 1024) != 0) {
                                jx4 jx4VarT = jx4Var;
                                c15 c15Var = null;
                                while (jx4VarT != null) {
                                    if (jx4VarT instanceof ai2) {
                                        ((ai2) jx4VarT).Z0(yh2.Y, yh2Var2);
                                    } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                        int i = 0;
                                        for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                            if ((jx4Var2.Z & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    jx4VarT = jx4Var2;
                                                } else {
                                                    if (c15Var == null) {
                                                        c15Var = new c15(0, new jx4[16]);
                                                    }
                                                    if (jx4VarT != null) {
                                                        c15Var.b(jx4VarT);
                                                        jx4VarT = null;
                                                    }
                                                    c15Var.b(jx4Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    jx4VarT = yn0.T(c15Var);
                                }
                            }
                            jx4Var = jx4Var.g0;
                        }
                    }
                    layoutNodeZ = layoutNodeZ.w();
                    jx4Var = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = os4.B(this.c).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                b61.c();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        AndroidComposeView androidComposeView = this.a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:103:0x0137 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x013c A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0142 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0180 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0190 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0195  */
    /* JADX WARN: Code duplicated, block: B:329:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0189 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x0172 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x008a A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0095 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[ADDED_TO_REGION, LOOP:12: B:52:0x00a1->B:80:0x00ed, LOOP_START, PHI: r5
  0x00a1: PHI (r5v30 jx4) = (r5v24 jx4), (r5v31 jx4) binds: [B:51:0x009f, B:80:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0106 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x010c A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0112 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x011f A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x012b A[ADDED_TO_REGION, LOOP:16: B:98:0x012b->B:126:0x0177, LOOP_START, PHI: r12
  0x012b: PHI (r12v14 jx4) = (r12v8 jx4), (r12v15 jx4) binds: [B:97:0x0129, B:126:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [c15] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [c15] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [jx4] */
    /* JADX WARN: Type inference failed for: r12v25, types: [jx4] */
    /* JADX WARN: Type inference failed for: r12v29, types: [jx4] */
    /* JADX WARN: Type inference failed for: r12v30, types: [jx4] */
    /* JADX WARN: Type inference failed for: r12v34, types: [jx4] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [jx4] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [c15] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v40 */
    public final boolean d(KeyEvent keyEvent, dn2 dn2Var) {
        jx4 jx4Var;
        LayoutNode layoutNodeZ;
        nh1 nh1Var;
        nh1 nh1Var2;
        jx4 jx4Var2;
        t6 t6Var;
        jx4 jx4VarT;
        c15 c15Var;
        jx4 jx4Var3;
        LayoutNode layoutNodeZ2;
        nh1 nh1Var3;
        nh1 nh1Var4;
        t6 t6Var2;
        c15 c15Var2;
        jx4 jx4VarT2;
        int size;
        t6 t6Var3;
        boolean z;
        ai2 ai2Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            long jN = w39.N(keyEvent);
            int iS = w39.S(keyEvent);
            if (iS == 2) {
                b05 b05Var = this.f;
                if (b05Var == null) {
                    b05Var = new b05(3);
                    this.f = b05Var;
                }
                b05Var.d(jN);
            } else if (iS == 1) {
                b05 b05Var2 = this.f;
                if (b05Var2 == null || !b05Var2.a(jN)) {
                    Trace.endSection();
                    return false;
                }
                b05 b05Var3 = this.f;
                if (b05Var3 != null) {
                    b05Var3.e(jN);
                }
            }
            ai2 ai2VarL = u15.l(ai2Var);
            if (ai2VarL != null) {
                if (!ai2VarL.X.p0) {
                    wc3.b("visitLocalDescendants called on an unattached node");
                }
                jx4 jx4Var4 = ai2VarL.X;
                if ((jx4Var4.f0 & 9216) != 0) {
                    jx4Var2 = null;
                    for (jx4 jx4Var5 = jx4Var4.h0; jx4Var5 != null; jx4Var5 = jx4Var5.h0) {
                        int i = jx4Var5.Z;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            jx4Var2 = jx4Var5;
                        }
                    }
                } else {
                    jx4Var2 = null;
                }
                if (jx4Var2 == null) {
                    if (ai2VarL == null) {
                        if (!ai2Var.X.p0) {
                            wc3.b("visitAncestors called on an unattached node");
                        }
                        jx4Var = ai2Var.X.g0;
                        layoutNodeZ = yn0.Z(ai2Var);
                        loop15: while (true) {
                            if (layoutNodeZ != null) {
                                nh1Var = null;
                                break;
                            }
                            if ((((jx4) layoutNodeZ.H0.i0).f0 & 8192) != 0) {
                                while (jx4Var != null) {
                                    if ((jx4Var.Z & 8192) != 0) {
                                        jx4VarT = jx4Var;
                                        c15Var = null;
                                        while (jx4VarT != null) {
                                            if (jx4VarT instanceof gx3) {
                                                nh1Var = jx4VarT;
                                                break loop15;
                                            }
                                            if ((jx4VarT.Z & 8192) == 0) {
                                            }
                                            jx4VarT = yn0.T(c15Var);
                                        }
                                    }
                                    jx4Var = jx4Var.g0;
                                }
                            }
                            layoutNodeZ = layoutNodeZ.w();
                            if (layoutNodeZ != null) {
                            }
                        }
                        nh1Var2 = (gx3) nh1Var;
                        if (nh1Var2 != null) {
                            jx4Var2 = ((jx4) nh1Var2).X;
                        } else {
                            jx4Var2 = null;
                        }
                    } else {
                        if (!ai2VarL.X.p0) {
                            wc3.b("visitAncestors called on an unattached node");
                        }
                        jx4Var3 = ai2VarL.X;
                        layoutNodeZ2 = yn0.Z(ai2VarL);
                        loop11: while (true) {
                            if (layoutNodeZ2 != null) {
                                nh1Var3 = null;
                                break;
                            }
                            if ((((jx4) layoutNodeZ2.H0.i0).f0 & 8192) != 0) {
                                while (jx4Var3 != null) {
                                    if ((jx4Var3.Z & 8192) != 0) {
                                        c15Var2 = null;
                                        jx4VarT2 = jx4Var3;
                                        while (jx4VarT2 != null) {
                                            if (jx4VarT2 instanceof gx3) {
                                                nh1Var3 = jx4VarT2;
                                                break loop11;
                                            }
                                            if ((jx4VarT2.Z & 8192) == 0) {
                                            }
                                            jx4VarT2 = yn0.T(c15Var2);
                                        }
                                    }
                                    jx4Var3 = jx4Var3.g0;
                                }
                            }
                            layoutNodeZ2 = layoutNodeZ2.w();
                            if (layoutNodeZ2 != null) {
                            }
                        }
                        nh1Var4 = (gx3) nh1Var3;
                        if (nh1Var4 != null) {
                            jx4Var2 = ((jx4) nh1Var4).X;
                        } else {
                            if (!ai2Var.X.p0) {
                                wc3.b("visitAncestors called on an unattached node");
                            }
                            jx4Var = ai2Var.X.g0;
                            layoutNodeZ = yn0.Z(ai2Var);
                            loop15: while (true) {
                                if (layoutNodeZ != null) {
                                    nh1Var = null;
                                    break;
                                }
                                if ((((jx4) layoutNodeZ.H0.i0).f0 & 8192) != 0) {
                                    while (jx4Var != null) {
                                        if ((jx4Var.Z & 8192) != 0) {
                                            jx4VarT = jx4Var;
                                            c15Var = null;
                                            while (jx4VarT != null) {
                                                if (jx4VarT instanceof gx3) {
                                                    nh1Var = jx4VarT;
                                                    break loop15;
                                                }
                                                if ((jx4VarT.Z & 8192) == 0) {
                                                }
                                                jx4VarT = yn0.T(c15Var);
                                            }
                                        }
                                        jx4Var = jx4Var.g0;
                                    }
                                }
                                layoutNodeZ = layoutNodeZ.w();
                                if (layoutNodeZ != null) {
                                }
                            }
                            nh1Var2 = (gx3) nh1Var;
                            if (nh1Var2 != null) {
                                jx4Var2 = ((jx4) nh1Var2).X;
                            } else {
                                jx4Var2 = null;
                            }
                        }
                    }
                }
            } else if (ai2VarL == null) {
                if (!ai2Var.X.p0) {
                    wc3.b("visitAncestors called on an unattached node");
                }
                jx4Var = ai2Var.X.g0;
                layoutNodeZ = yn0.Z(ai2Var);
                loop15: while (true) {
                    if (layoutNodeZ != null) {
                        nh1Var = null;
                        break;
                    }
                    if ((((jx4) layoutNodeZ.H0.i0).f0 & 8192) != 0) {
                        while (jx4Var != null) {
                            if ((jx4Var.Z & 8192) != 0) {
                                jx4VarT = jx4Var;
                                c15Var = null;
                                while (jx4VarT != null) {
                                    if (jx4VarT instanceof gx3) {
                                        nh1Var = jx4VarT;
                                        break loop15;
                                    }
                                    if ((jx4VarT.Z & 8192) == 0 && (jx4VarT instanceof oh1)) {
                                        jx4 jx4Var6 = ((oh1) jx4VarT).r0;
                                        int i2 = 0;
                                        while (jx4Var6 != null) {
                                            if ((jx4Var6.Z & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    jx4VarT = jx4VarT;
                                                    c15Var = c15Var;
                                                    c15Var = c15Var;
                                                    jx4VarT = jx4Var6;
                                                } else {
                                                    if (c15Var == null) {
                                                        c15Var = new c15(0, new jx4[16]);
                                                    }
                                                    if (jx4VarT != null) {
                                                        c15Var.b(jx4VarT);
                                                        jx4VarT = null;
                                                    }
                                                    c15Var.b(jx4Var6);
                                                }
                                            } else {
                                                jx4VarT = jx4VarT;
                                                c15Var = c15Var;
                                            }
                                            jx4Var6 = jx4Var6.h0;
                                            jx4VarT = jx4VarT;
                                            c15Var = c15Var;
                                        }
                                        if (i2 == 1) {
                                            jx4VarT = jx4VarT;
                                            c15Var = c15Var;
                                        } else {
                                            jx4VarT = jx4VarT;
                                            c15Var = c15Var;
                                        }
                                    }
                                    jx4VarT = yn0.T(c15Var);
                                }
                            }
                            jx4Var = jx4Var.g0;
                        }
                    }
                    layoutNodeZ = layoutNodeZ.w();
                    jx4Var = (layoutNodeZ != null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
                }
                nh1Var2 = (gx3) nh1Var;
                if (nh1Var2 != null) {
                    jx4Var2 = ((jx4) nh1Var2).X;
                } else {
                    jx4Var2 = null;
                }
            } else {
                if (!ai2VarL.X.p0) {
                    wc3.b("visitAncestors called on an unattached node");
                }
                jx4Var3 = ai2VarL.X;
                layoutNodeZ2 = yn0.Z(ai2VarL);
                loop11: while (true) {
                    if (layoutNodeZ2 != null) {
                        nh1Var3 = null;
                        break;
                    }
                    if ((((jx4) layoutNodeZ2.H0.i0).f0 & 8192) != 0) {
                        while (jx4Var3 != null) {
                            if ((jx4Var3.Z & 8192) != 0) {
                                c15Var2 = null;
                                jx4VarT2 = jx4Var3;
                                while (jx4VarT2 != null) {
                                    if (jx4VarT2 instanceof gx3) {
                                        nh1Var3 = jx4VarT2;
                                        break loop11;
                                    }
                                    if ((jx4VarT2.Z & 8192) == 0 && (jx4VarT2 instanceof oh1)) {
                                        jx4 jx4Var7 = ((oh1) jx4VarT2).r0;
                                        int i3 = 0;
                                        while (jx4Var7 != null) {
                                            if ((jx4Var7.Z & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    jx4VarT2 = jx4VarT2;
                                                    c15Var2 = c15Var2;
                                                    c15Var2 = c15Var2;
                                                    jx4VarT2 = jx4Var7;
                                                } else {
                                                    if (c15Var2 == null) {
                                                        c15Var2 = new c15(0, new jx4[16]);
                                                    }
                                                    if (jx4VarT2 != null) {
                                                        c15Var2.b(jx4VarT2);
                                                        jx4VarT2 = null;
                                                    }
                                                    c15Var2.b(jx4Var7);
                                                }
                                            } else {
                                                jx4VarT2 = jx4VarT2;
                                                c15Var2 = c15Var2;
                                            }
                                            jx4Var7 = jx4Var7.h0;
                                            jx4VarT2 = jx4VarT2;
                                            c15Var2 = c15Var2;
                                        }
                                        if (i3 == 1) {
                                            jx4VarT2 = jx4VarT2;
                                            c15Var2 = c15Var2;
                                        } else {
                                            jx4VarT2 = jx4VarT2;
                                            c15Var2 = c15Var2;
                                        }
                                    }
                                    jx4VarT2 = yn0.T(c15Var2);
                                }
                            }
                            jx4Var3 = jx4Var3.g0;
                        }
                    }
                    layoutNodeZ2 = layoutNodeZ2.w();
                    jx4Var3 = (layoutNodeZ2 != null || (t6Var2 = layoutNodeZ2.H0) == null) ? null : (f18) t6Var2.h0;
                }
                nh1Var4 = (gx3) nh1Var3;
                if (nh1Var4 != null) {
                    jx4Var2 = ((jx4) nh1Var4).X;
                } else {
                    if (!ai2Var.X.p0) {
                        wc3.b("visitAncestors called on an unattached node");
                    }
                    jx4Var = ai2Var.X.g0;
                    layoutNodeZ = yn0.Z(ai2Var);
                    loop15: while (true) {
                        if (layoutNodeZ != null) {
                            nh1Var = null;
                            break;
                        }
                        if ((((jx4) layoutNodeZ.H0.i0).f0 & 8192) != 0) {
                            while (jx4Var != null) {
                                if ((jx4Var.Z & 8192) != 0) {
                                    jx4VarT = jx4Var;
                                    c15Var = null;
                                    while (jx4VarT != null) {
                                        if (jx4VarT instanceof gx3) {
                                            nh1Var = jx4VarT;
                                            break loop15;
                                        }
                                        if ((jx4VarT.Z & 8192) == 0) {
                                        }
                                        jx4VarT = yn0.T(c15Var);
                                    }
                                }
                                jx4Var = jx4Var.g0;
                            }
                        }
                        layoutNodeZ = layoutNodeZ.w();
                        if (layoutNodeZ != null) {
                        }
                    }
                    nh1Var2 = (gx3) nh1Var;
                    if (nh1Var2 != null) {
                        jx4Var2 = ((jx4) nh1Var2).X;
                    } else {
                        jx4Var2 = null;
                    }
                }
            }
            if (jx4Var2 != null) {
                if (!jx4Var2.X.p0) {
                    wc3.b("visitAncestors called on an unattached node");
                }
                jx4 jx4Var8 = jx4Var2.X.g0;
                LayoutNode layoutNodeZ3 = yn0.Z(jx4Var2);
                ArrayList arrayList = null;
                while (layoutNodeZ3 != null) {
                    if ((((jx4) layoutNodeZ3.H0.i0).f0 & 8192) != 0) {
                        while (jx4Var8 != null) {
                            if ((jx4Var8.Z & 8192) != 0) {
                                jx4 jx4VarT3 = jx4Var8;
                                c15 c15Var3 = null;
                                while (jx4VarT3 != null) {
                                    if (jx4VarT3 instanceof gx3) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(jx4VarT3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (jx4VarT3.Z & 8192) != 0 && (jx4VarT3 instanceof oh1)) {
                                        int i4 = 0;
                                        for (jx4 jx4Var9 = ((oh1) jx4VarT3).r0; jx4Var9 != null; jx4Var9 = jx4Var9.h0) {
                                            if ((jx4Var9.Z & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    jx4VarT3 = jx4Var9;
                                                } else {
                                                    if (c15Var3 == null) {
                                                        c15Var3 = new c15(0, new jx4[16]);
                                                    }
                                                    if (jx4VarT3 != null) {
                                                        c15Var3.b(jx4VarT3);
                                                        jx4VarT3 = null;
                                                    }
                                                    c15Var3.b(jx4Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    jx4VarT3 = yn0.T(c15Var3);
                                }
                            }
                            jx4Var8 = jx4Var8.g0;
                        }
                    }
                    layoutNodeZ3 = layoutNodeZ3.w();
                    jx4Var8 = (layoutNodeZ3 == null || (t6Var3 = layoutNodeZ3.H0) == null) ? null : (f18) t6Var3.h0;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((gx3) arrayList.get(size)).l(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? T = jx4Var2.X;
                ?? c15Var4 = 0;
                while (T != 0) {
                    if (T instanceof gx3) {
                        if (((gx3) T).l(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((T.Z & 8192) != 0 && (T instanceof oh1)) {
                        jx4 jx4Var10 = ((oh1) T).r0;
                        int i6 = 0;
                        while (jx4Var10 != null) {
                            if ((jx4Var10.Z & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    c15Var4 = c15Var4;
                                    T = T;
                                    c15Var4 = c15Var4;
                                    T = jx4Var10;
                                } else {
                                    if (c15Var4 == 0) {
                                        c15Var4 = new c15(0, new jx4[16]);
                                    }
                                    if (T != 0) {
                                        c15Var4.b(T);
                                        T = 0;
                                    }
                                    c15Var4.b(jx4Var10);
                                }
                            } else {
                                c15Var4 = c15Var4;
                                T = T;
                            }
                            jx4Var10 = jx4Var10.h0;
                            c15Var4 = c15Var4;
                            T = T;
                        }
                        if (i6 == 1) {
                            c15Var4 = c15Var4;
                            T = T;
                        } else {
                            c15Var4 = c15Var4;
                            T = T;
                        }
                    }
                    T = yn0.T(c15Var4);
                }
                if (((Boolean) dn2Var.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? T2 = jx4Var2.X;
                ?? c15Var5 = 0;
                while (T2 != 0) {
                    if (T2 instanceof gx3) {
                        if (((gx3) T2).F(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((T2.Z & 8192) != 0 && (T2 instanceof oh1)) {
                        jx4 jx4Var11 = ((oh1) T2).r0;
                        int i7 = 0;
                        while (jx4Var11 != null) {
                            if ((jx4Var11.Z & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    T2 = T2;
                                    c15Var5 = c15Var5;
                                    c15Var5 = c15Var5;
                                    T2 = jx4Var11;
                                } else {
                                    if (c15Var5 == 0) {
                                        c15Var5 = new c15(0, new jx4[16]);
                                    }
                                    if (T2 != 0) {
                                        c15Var5.b(T2);
                                        T2 = 0;
                                    }
                                    c15Var5.b(jx4Var11);
                                }
                            } else {
                                T2 = T2;
                                c15Var5 = c15Var5;
                            }
                            jx4Var11 = jx4Var11.h0;
                            T2 = T2;
                            c15Var5 = c15Var5;
                        }
                        if (i7 == 1) {
                            T2 = T2;
                            c15Var5 = c15Var5;
                        } else {
                            T2 = T2;
                            c15Var5 = c15Var5;
                        }
                    }
                    T2 = yn0.T(c15Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((gx3) arrayList.get(i8)).F(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Boolean e(int i, s86 s86Var, gn2 gn2Var) {
        boolean zK;
        boolean z;
        ai2 ai2Var;
        t6 t6Var;
        boolean z2;
        ai2 ai2Var2 = this.c;
        ai2 ai2VarL = u15.l(ai2Var2);
        int i2 = 4;
        AndroidComposeView androidComposeView = this.b;
        if (ai2VarL != null) {
            z24 layoutDirection = androidComposeView.getLayoutDirection();
            jh2 jh2VarA1 = ai2VarL.a1();
            oh2 oh2Var = jh2VarA1.h;
            oh2 oh2Var2 = jh2VarA1.i;
            if (i == 1) {
                oh2Var = jh2VarA1.b;
            } else if (i == 2) {
                oh2Var = jh2VarA1.c;
            } else if (i == 5) {
                oh2Var = jh2VarA1.d;
            } else if (i == 6) {
                oh2Var = jh2VarA1.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        b61.c();
                        return null;
                    }
                    oh2Var = oh2Var2;
                }
                if (oh2Var == oh2.b) {
                    oh2Var = null;
                }
                if (oh2Var == null) {
                    oh2Var = jh2VarA1.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    oh2Var = oh2Var2;
                } else if (iOrdinal2 != 1) {
                    b61.c();
                    return null;
                }
                if (oh2Var == oh2.b) {
                    oh2Var = null;
                }
                if (oh2Var == null) {
                    oh2Var = jh2VarA1.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    bt.i("invalid FocusDirection");
                    return null;
                }
                fm0 fm0Var = new fm0();
                gh2 gh2Var = (gh2) yn0.a0(ai2VarL).getFocusOwner();
                ai2 ai2VarF = gh2Var.f();
                if (i == 7) {
                    jh2VarA1.j.B(fm0Var);
                } else {
                    jh2VarA1.k.B(fm0Var);
                }
                oh2Var = fm0Var.a ? oh2.c : ai2VarF != gh2Var.f() ? oh2.d : oh2.b;
            }
            oh2 oh2Var3 = oh2.c;
            if (!dh3.f(oh2Var, oh2Var3)) {
                if (dh3.f(oh2Var, oh2.d)) {
                    ai2 ai2VarL2 = u15.l(ai2Var2);
                    if (ai2VarL2 != null) {
                        return (Boolean) gn2Var.B(ai2VarL2);
                    }
                } else {
                    oh2 oh2Var4 = oh2.b;
                    if (!dh3.f(oh2Var, oh2Var4)) {
                        if (oh2Var == oh2Var4) {
                            bt.i("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (oh2Var == oh2Var3) {
                            bt.i("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        c15 c15Var = oh2Var.a;
                        int i3 = c15Var.Z;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            z2 = false;
                        } else {
                            Object[] objArr = c15Var.X;
                            boolean z3 = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                nh1 nh1Var = (qh2) objArr[i4];
                                if (!((jx4) nh1Var).X.p0) {
                                    wc3.b("visitChildren called on an unattached node");
                                }
                                c15 c15Var2 = new c15(0, new jx4[16]);
                                jx4 jx4Var = ((jx4) nh1Var).X;
                                jx4 jx4Var2 = jx4Var.h0;
                                if (jx4Var2 == null) {
                                    yn0.n(c15Var2, jx4Var);
                                } else {
                                    c15Var2.b(jx4Var2);
                                }
                                while (true) {
                                    int i5 = c15Var2.Z;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    jx4 jx4VarT = (jx4) c15Var2.k(i5 - 1);
                                    if ((jx4VarT.f0 & 1024) == 0) {
                                        yn0.n(c15Var2, jx4VarT);
                                    } else {
                                        while (jx4VarT != null) {
                                            if ((jx4VarT.Z & 1024) != 0) {
                                                c15 c15Var3 = null;
                                                while (jx4VarT != null) {
                                                    if (jx4VarT instanceof ai2) {
                                                        if (((Boolean) gn2Var.B((ai2) jx4VarT)).booleanValue()) {
                                                            z3 = true;
                                                            break;
                                                        }
                                                    } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                                        c15 c15Var4 = c15Var3;
                                                        int i6 = 0;
                                                        for (jx4 jx4Var3 = ((oh1) jx4VarT).r0; jx4Var3 != null; jx4Var3 = jx4Var3.h0) {
                                                            if ((jx4Var3.Z & 1024) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    jx4VarT = jx4Var3;
                                                                } else {
                                                                    if (c15Var4 == null) {
                                                                        c15Var4 = new c15(0, new jx4[16]);
                                                                    }
                                                                    if (jx4VarT != null) {
                                                                        c15Var4.b(jx4VarT);
                                                                        jx4VarT = null;
                                                                    }
                                                                    c15Var4.b(jx4Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                            c15Var3 = c15Var4;
                                                        } else {
                                                            c15Var3 = c15Var4;
                                                        }
                                                    }
                                                    jx4VarT = yn0.T(c15Var3);
                                                }
                                                break;
                                            }
                                            jx4VarT = jx4VarT.h0;
                                        }
                                    }
                                }
                            }
                            z2 = z3;
                        }
                        return Boolean.valueOf(z2);
                    }
                }
            }
            return null;
        }
        ai2VarL = null;
        z24 layoutDirection2 = androidComposeView.getLayoutDirection();
        sn snVar = new sn((Object) ai2VarL, (Object) this, (Object) gn2Var, (byte) 9);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zK = km4.D(ai2Var2, snVar);
            } else {
                if (i != 2) {
                    bt.i("This function should only be used for 1-D focus search");
                    return null;
                }
                zK = km4.k(ai2Var2, snVar);
            }
            return Boolean.valueOf(zK);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return gs8.p(i, snVar, ai2Var2, s86Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    b61.c();
                    return null;
                }
                i2 = 3;
            }
            ai2 ai2VarL3 = u15.l(ai2Var2);
            if (ai2VarL3 != null) {
                return gs8.p(i2, snVar, ai2VarL3, s86Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(ug2.a(i)).toString());
        }
        ai2 ai2VarL4 = u15.l(ai2Var2);
        if (ai2VarL4 != null) {
            if (!ai2VarL4.X.p0) {
                wc3.b("visitAncestors called on an unattached node");
            }
            jx4 jx4Var4 = ai2VarL4.X.g0;
            LayoutNode layoutNodeZ = yn0.Z(ai2VarL4);
            loop5: while (true) {
                if (layoutNodeZ == null) {
                    ai2Var = null;
                    break;
                }
                if ((((jx4) layoutNodeZ.H0.i0).f0 & 1024) != 0) {
                    while (jx4Var4 != null) {
                        if ((jx4Var4.Z & 1024) != 0) {
                            jx4 jx4VarT2 = jx4Var4;
                            c15 c15Var5 = null;
                            while (jx4VarT2 != null) {
                                if (jx4VarT2 instanceof ai2) {
                                    ai2 ai2Var3 = (ai2) jx4VarT2;
                                    if (ai2Var3.a1().a) {
                                        ai2Var = ai2Var3;
                                        break loop5;
                                    }
                                } else if ((jx4VarT2.Z & 1024) != 0 && (jx4VarT2 instanceof oh1)) {
                                    int i7 = 0;
                                    for (jx4 jx4Var5 = ((oh1) jx4VarT2).r0; jx4Var5 != null; jx4Var5 = jx4Var5.h0) {
                                        if ((jx4Var5.Z & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                jx4VarT2 = jx4Var5;
                                            } else {
                                                if (c15Var5 == null) {
                                                    c15Var5 = new c15(0, new jx4[16]);
                                                }
                                                if (jx4VarT2 != null) {
                                                    c15Var5.b(jx4VarT2);
                                                    jx4VarT2 = null;
                                                }
                                                c15Var5.b(jx4Var5);
                                            }
                                        }
                                    }
                                    if (i7 != 1) {
                                        jx4VarT2 = yn0.T(c15Var5);
                                    }
                                }
                                jx4VarT2 = yn0.T(c15Var5);
                            }
                        }
                        jx4Var4 = jx4Var4.g0;
                    }
                }
                layoutNodeZ = layoutNodeZ.w();
                jx4Var4 = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
            }
            z = false;
        } else {
            z = false;
            ai2Var = null;
        }
        return Boolean.valueOf((ai2Var == null || ai2Var == ai2Var2) ? z : ((Boolean) snVar.B(ai2Var)).booleanValue());
    }

    public final ai2 f() {
        ai2 ai2Var = this.h;
        if (ai2Var == null || !ai2Var.p0) {
            return null;
        }
        return ai2Var;
    }

    public final boolean g(int i, boolean z) {
        ea6 ea6Var = new ea6();
        ea6Var.X = Boolean.FALSE;
        ai2 ai2VarF = f();
        Boolean boolE = e(i, this.a.getEmbeddedViewFocusRect(), new wq0(ea6Var, i, (byte) 1));
        if (!dh3.f(boolE, Boolean.TRUE) || ai2VarF == f()) {
            if (boolE != null && ea6Var.X != null) {
                if (!boolE.booleanValue() || !((Boolean) ea6Var.X).booleanValue()) {
                    if ((i == 1 || i == 2) && z && b(i, false, false)) {
                        Boolean boolE2 = e(i, null, new qb((byte) 5, i));
                        if (boolE2 != null ? boolE2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean h(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean boolE = e(i, null, new qb((byte) 4, i));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void i(ai2 ai2Var) {
        ai2 ai2Var2 = this.h;
        this.h = ai2Var;
        j05 j05Var = this.g;
        Object[] objArr = j05Var.a;
        int i = j05Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((ch2) objArr[i2]).a(ai2Var2, ai2Var);
        }
    }
}
