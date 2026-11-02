package io.sentry.android.core.internal.threaddump;

import defpackage.pc6;
import defpackage.x21;
import io.sentry.d;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.c;
import io.sentry.protocol.c0;
import io.sentry.protocol.e0;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t5;
import io.sentry.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final Pattern h = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    public static final Pattern i = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    public static final Pattern j = Pattern.compile("----- pid (\\d+) at .*");
    public static final Pattern k = Pattern.compile("\\s*\\|\\s*sysTid=(\\d+).*");
    public static final Pattern l = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");
    public static final Pattern m = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern n = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    public static final Pattern o = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern p = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern q = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern r = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern s = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    public static final Pattern t = Pattern.compile(" *- waiting to lock an unknown object");
    public static final Pattern u = Pattern.compile("\\s+");
    public final s6 a;
    public final boolean b;
    public Long c;
    public final z d;
    public final d g = new d((byte) 3);
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();

    public b(s6 s6Var, boolean z) {
        this.a = s6Var;
        this.b = z;
        this.d = new z(s6Var);
    }

    public static void a(e0 e0Var, t5 t5Var) {
        Map map = e0Var.l0;
        if (map == null) {
            map = new HashMap();
        }
        t5 t5Var2 = (t5) map.get(t5Var.Y);
        if (t5Var2 != null) {
            t5Var2.X = Math.max(t5Var2.X, t5Var.X);
        } else {
            String str = t5Var.Y;
            t5 t5Var3 = new t5();
            t5Var3.X = t5Var.X;
            t5Var3.Y = str;
            t5Var3.Z = t5Var.Z;
            t5Var3.f0 = t5Var.f0;
            t5Var3.g0 = t5Var.g0;
            t5Var3.h0 = io.sentry.util.b.p(t5Var.h0);
            map.put(str, t5Var3);
        }
        e0Var.l0 = map;
    }

    public static Long b(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    public static boolean c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:105:0x030c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0352  */
    /* JADX WARN: Code duplicated, block: B:123:0x0375  */
    /* JADX WARN: Code duplicated, block: B:125:0x0380  */
    /* JADX WARN: Code duplicated, block: B:131:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:134:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:135:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:137:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:139:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:140:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:142:0x040a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0415  */
    /* JADX WARN: Code duplicated, block: B:146:0x041f  */
    /* JADX WARN: Code duplicated, block: B:153:0x045a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0460 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0462  */
    /* JADX WARN: Code duplicated, block: B:157:0x0484  */
    /* JADX WARN: Code duplicated, block: B:159:0x048a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x048c  */
    /* JADX WARN: Code duplicated, block: B:161:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:163:0x04b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:165:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:167:0x04df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:170:0x0510  */
    /* JADX WARN: Code duplicated, block: B:171:0x0512  */
    /* JADX WARN: Code duplicated, block: B:173:0x051b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x051d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0542  */
    /* JADX WARN: Code duplicated, block: B:178:0x0544  */
    /* JADX WARN: Code duplicated, block: B:180:0x054d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x054f  */
    /* JADX WARN: Code duplicated, block: B:182:0x055c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0562  */
    /* JADX WARN: Code duplicated, block: B:191:0x0591  */
    /* JADX WARN: Code duplicated, block: B:217:0x057d A[EDGE_INSN: B:217:0x057d->B:188:0x057d BREAK  A[LOOP:1: B:89:0x02c3->B:187:0x056b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x057d A[EDGE_INSN: B:218:0x057d->B:188:0x057d BREAK  A[LOOP:1: B:89:0x02c3->B:187:0x056b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x056b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d8 A[PHI: r21 r23 r25 r26 r28 r31 r34
  0x01d8: PHI (r21v2 java.util.regex.Matcher) = (r21v3 java.util.regex.Matcher), (r21v4 java.util.regex.Matcher) binds: [B:63:0x01d2, B:189:0x058d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r23v2 java.util.regex.Pattern) = (r23v3 java.util.regex.Pattern), (r23v4 java.util.regex.Pattern) binds: [B:63:0x01d2, B:189:0x058d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r25v1 java.util.regex.Matcher) = (r25v2 java.util.regex.Matcher), (r25v3 java.util.regex.Matcher) binds: [B:63:0x01d2, B:189:0x058d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r26v1 java.util.regex.Matcher) = (r26v2 java.util.regex.Matcher), (r26v3 java.util.regex.Matcher) binds: [B:63:0x01d2, B:189:0x058d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r28v1 java.util.ArrayList) = (r28v2 java.util.ArrayList), (r28v3 java.util.ArrayList) binds: [B:63:0x01d2, B:189:0x058d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r31v2 java.lang.String) = (r4v1 java.lang.String), (r31v4 java.lang.String) binds: [B:63:0x01d2, B:189:0x058d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r34v2 int) = (r2v1 int), (r34v5 int) binds: [B:63:0x01d2, B:189:0x058d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:95:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e7  */
    public final void d(x21 x21Var) {
        Pattern pattern;
        Matcher matcher;
        Pattern pattern2;
        ArrayList arrayList;
        Matcher matcher2;
        Matcher matcher3;
        s6 s6Var;
        ArrayList arrayList2;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Matcher matcher10;
        Matcher matcher11;
        Matcher matcher12;
        Matcher matcher13;
        Matcher matcher14;
        a0 a0Var;
        c0 c0Var;
        a aVarA;
        String str;
        Matcher matcher15;
        Matcher matcher16;
        Matcher matcher17;
        String strGroup;
        String strGroup2;
        a0 a0Var2;
        String strGroup3;
        Integer numValueOf;
        String strGroup4;
        String strA;
        HashMap map;
        String strGroup5;
        String strGroup6;
        String strGroup7;
        Integer numValueOf2;
        Long lB;
        x21 x21Var2 = x21Var;
        int i2 = x21Var2.b;
        Pattern pattern3 = h;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        Matcher matcher18 = pattern3.matcher(_UrlKt.FRAGMENT_ENCODE_SET);
        Pattern pattern4 = i;
        Matcher matcher19 = pattern4.matcher(_UrlKt.FRAGMENT_ENCODE_SET);
        Matcher matcher20 = j.matcher(_UrlKt.FRAGMENT_ENCODE_SET);
        while (true) {
            int i3 = x21Var2.c;
            ArrayList<e0> arrayList3 = this.f;
            if (i3 >= i2) {
                for (e0 e0Var : arrayList3) {
                    Boolean bool = Boolean.TRUE;
                    if (bool.equals(e0Var.j0)) {
                        e0Var.Z = "main";
                        e0Var.g0 = bool;
                        e0Var.h0 = Boolean.valueOf(!this.b);
                    } else {
                        Boolean bool2 = Boolean.FALSE;
                        e0Var.g0 = bool2;
                        e0Var.h0 = bool2;
                        e0Var.j0 = bool2;
                    }
                }
                return;
            }
            a aVarA2 = x21Var2.a();
            String str3 = "Internal error while parsing thread dump.";
            s6 s6Var2 = this.a;
            if (aVarA2 == null) {
                s6Var2.getLogger().h(s5.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str4 = aVarA2.a;
            Long lValueOf = null;
            if (c(matcher18, str4) || c(matcher19, str4)) {
                x21Var2.c--;
                e0 e0Var2 = new e0();
                Matcher matcher21 = pattern3.matcher(str2);
                Matcher matcher22 = pattern4.matcher(str2);
                pattern = pattern3;
                if (x21Var2.c >= i2) {
                    matcher = matcher18;
                    pattern2 = pattern4;
                    matcher3 = matcher19;
                    matcher2 = matcher20;
                    arrayList = arrayList3;
                    e0Var2 = null;
                } else {
                    a aVarA3 = x21Var2.a();
                    if (aVarA3 == null) {
                        s6Var2.getLogger().h(s5.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                        matcher = matcher18;
                        pattern2 = pattern4;
                        matcher3 = matcher19;
                        matcher2 = matcher20;
                        arrayList = arrayList3;
                        e0Var2 = null;
                    } else {
                        String str5 = aVarA3.a;
                        matcher = matcher18;
                        pattern2 = pattern4;
                        if (c(matcher21, str5)) {
                            Long lB2 = b(matcher21, 4);
                            if (lB2 == null) {
                                s6Var2.getLogger().h(s5.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                matcher3 = matcher19;
                                matcher2 = matcher20;
                                arrayList = arrayList3;
                                e0Var2 = null;
                            } else {
                                e0Var2.X = lB2;
                                String strGroup8 = matcher21.group(1);
                                e0Var2.Z = strGroup8;
                                if ("main".equals(strGroup8)) {
                                    e0Var2.j0 = Boolean.TRUE;
                                }
                                String strGroup9 = matcher21.group(5);
                                if (strGroup9 != null) {
                                    if (strGroup9.contains(" ")) {
                                        e0Var2.f0 = strGroup9.substring(0, strGroup9.indexOf(32));
                                    } else {
                                        e0Var2.f0 = strGroup9;
                                    }
                                }
                                s6Var = this.d.X;
                                arrayList2 = new ArrayList();
                                matcher4 = l.matcher(str2);
                                matcher5 = m.matcher(str2);
                                matcher6 = n.matcher(str2);
                                matcher7 = o.matcher(str2);
                                matcher8 = q.matcher(str2);
                                matcher3 = matcher19;
                                matcher9 = p.matcher(str2);
                                matcher2 = matcher20;
                                matcher10 = s.matcher(str2);
                                Matcher matcher23 = r.matcher(str2);
                                arrayList = arrayList3;
                                matcher11 = t.matcher(str2);
                                matcher12 = u.matcher(str2);
                                matcher13 = k.matcher(str2);
                                str2 = str2;
                                matcher14 = matcher23;
                                a0Var = null;
                                while (true) {
                                    if (x21Var2.c >= i2) {
                                        aVarA = x21Var2.a();
                                        if (aVarA == null) {
                                            s6Var2.getLogger().h(s5.WARNING, str3, new Object[0]);
                                        } else {
                                            str = aVarA.a;
                                            if (c(matcher13, str)) {
                                                lB = b(matcher13, 1);
                                                if (lB != null && lB.equals(this.c)) {
                                                    e0Var2.j0 = Boolean.TRUE;
                                                }
                                                i2 = i2;
                                            } else {
                                                i2 = i2;
                                                if (c(matcher5, str)) {
                                                    a0Var = new a0();
                                                    strGroup5 = matcher5.group(1);
                                                    strGroup6 = matcher5.group(2);
                                                    if (strGroup5 != null && !strGroup5.isEmpty()) {
                                                        strGroup6 = pc6.p(strGroup5, ".", strGroup6);
                                                    }
                                                    a0Var.h0 = strGroup6;
                                                    a0Var.g0 = matcher5.group(3);
                                                    a0Var.f0 = matcher5.group(4);
                                                    strGroup7 = matcher5.group(5);
                                                    if (strGroup7 != null || strGroup7.length() == 0) {
                                                        numValueOf2 = null;
                                                    } else {
                                                        int i4 = Integer.parseInt(strGroup7);
                                                        numValueOf2 = Integer.valueOf(i4);
                                                        if (i4 < 0) {
                                                            numValueOf2 = null;
                                                        }
                                                    }
                                                    a0Var.i0 = numValueOf2;
                                                    a0Var.m0 = z.c(strGroup6, s6Var.getInAppIncludes(), s6Var.getInAppExcludes());
                                                    arrayList2.add(a0Var);
                                                } else {
                                                    matcher13 = matcher13;
                                                    if (c(matcher4, str)) {
                                                        a0Var2 = new a0();
                                                        a0Var2.n0 = matcher4.group(3);
                                                        a0Var2.g0 = matcher4.group(6);
                                                        strGroup3 = matcher4.group(7);
                                                        if (strGroup3 != null || strGroup3.length() == 0) {
                                                            numValueOf = null;
                                                        } else {
                                                            numValueOf = Integer.valueOf(Integer.parseInt(strGroup3));
                                                        }
                                                        a0Var2.i0 = numValueOf;
                                                        a0Var2.s0 = "0x" + matcher4.group(2);
                                                        a0Var2.p0 = "native";
                                                        strGroup4 = matcher4.group(8);
                                                        if (strGroup4 == null) {
                                                            strA = null;
                                                        } else {
                                                            strA = io.sentry.config.a.a(strGroup4);
                                                        }
                                                        if (strA != null) {
                                                            map = this.e;
                                                            if (!map.containsKey(strA)) {
                                                                DebugImage debugImage = new DebugImage();
                                                                debugImage.setDebugId(strA);
                                                                debugImage.setType("elf");
                                                                debugImage.setCodeFile(matcher4.group(4));
                                                                debugImage.setCodeId(strGroup4);
                                                                map.put(strA, debugImage);
                                                            }
                                                            a0Var2.t0 = "rel:".concat(strA);
                                                        } else {
                                                            matcher5 = matcher5;
                                                            str3 = str3;
                                                        }
                                                        arrayList2.add(a0Var2);
                                                        a0Var = null;
                                                    } else {
                                                        matcher5 = matcher5;
                                                        str3 = str3;
                                                        if (c(matcher6, str)) {
                                                            a0Var = new a0();
                                                            strGroup = matcher6.group(1);
                                                            strGroup2 = matcher6.group(2);
                                                            if (strGroup != null && !strGroup.isEmpty()) {
                                                                strGroup2 = pc6.p(strGroup, ".", strGroup2);
                                                            }
                                                            a0Var.h0 = strGroup2;
                                                            a0Var.g0 = matcher6.group(3);
                                                            a0Var.m0 = z.c(strGroup2, s6Var.getInAppIncludes(), s6Var.getInAppExcludes());
                                                            a0Var.o0 = Boolean.TRUE;
                                                            arrayList2.add(a0Var);
                                                        } else if (c(matcher7, str)) {
                                                            if (a0Var != null) {
                                                                t5 t5Var = new t5();
                                                                t5Var.X = 1;
                                                                t5Var.Y = matcher7.group(1);
                                                                t5Var.Z = matcher7.group(2);
                                                                t5Var.f0 = matcher7.group(3);
                                                                a0Var.x0 = t5Var;
                                                                a(e0Var2, t5Var);
                                                            }
                                                        } else if (c(matcher8, str)) {
                                                            if (a0Var != null) {
                                                                t5 t5Var2 = new t5();
                                                                t5Var2.X = 2;
                                                                t5Var2.Y = matcher8.group(1);
                                                                t5Var2.Z = matcher8.group(2);
                                                                t5Var2.f0 = matcher8.group(3);
                                                                a0Var.x0 = t5Var2;
                                                                a(e0Var2, t5Var2);
                                                            }
                                                        } else if (c(matcher9, str)) {
                                                            if (a0Var != null) {
                                                                t5 t5Var3 = new t5();
                                                                t5Var3.X = 4;
                                                                t5Var3.Y = matcher9.group(1);
                                                                t5Var3.Z = matcher9.group(2);
                                                                t5Var3.f0 = matcher9.group(3);
                                                                a0Var.x0 = t5Var3;
                                                                a(e0Var2, t5Var3);
                                                            }
                                                        } else if (c(matcher10, str)) {
                                                            if (a0Var != null) {
                                                                t5 t5Var4 = new t5();
                                                                t5Var4.X = 8;
                                                                t5Var4.Y = matcher10.group(1);
                                                                t5Var4.Z = matcher10.group(2);
                                                                t5Var4.f0 = matcher10.group(3);
                                                                t5Var4.g0 = b(matcher10, 4);
                                                                a0Var.x0 = t5Var4;
                                                                a(e0Var2, t5Var4);
                                                            }
                                                            matcher16 = matcher11;
                                                            matcher17 = matcher12;
                                                            matcher15 = matcher14;
                                                        } else {
                                                            matcher15 = matcher14;
                                                            if (c(matcher15, str)) {
                                                                matcher16 = matcher11;
                                                                if (c(matcher16, str)) {
                                                                    if (str.length() != 0) {
                                                                        break;
                                                                    }
                                                                    matcher17 = matcher12;
                                                                    if (c(matcher17, str)) {
                                                                        break;
                                                                    }
                                                                } else if (a0Var != null) {
                                                                    t5 t5Var5 = new t5();
                                                                    t5Var5.X = 8;
                                                                    a0Var.x0 = t5Var5;
                                                                    a(e0Var2, t5Var5);
                                                                }
                                                            } else {
                                                                if (a0Var != null) {
                                                                    t5 t5Var6 = new t5();
                                                                    t5Var6.X = 8;
                                                                    t5Var6.Y = matcher15.group(1);
                                                                    t5Var6.Z = matcher15.group(2);
                                                                    t5Var6.f0 = matcher15.group(3);
                                                                    a0Var.x0 = t5Var6;
                                                                    a(e0Var2, t5Var6);
                                                                }
                                                                matcher16 = matcher11;
                                                            }
                                                            matcher17 = matcher12;
                                                        }
                                                    }
                                                    matcher16 = matcher11;
                                                    matcher17 = matcher12;
                                                    matcher15 = matcher14;
                                                }
                                                matcher14 = matcher15;
                                                matcher12 = matcher17;
                                                matcher11 = matcher16;
                                                matcher5 = matcher5;
                                                matcher13 = matcher13;
                                                i2 = i2;
                                                str3 = str3;
                                                x21Var2 = x21Var;
                                            }
                                            matcher5 = matcher5;
                                            str3 = str3;
                                            matcher16 = matcher11;
                                            matcher17 = matcher12;
                                            matcher15 = matcher14;
                                            matcher14 = matcher15;
                                            matcher12 = matcher17;
                                            matcher11 = matcher16;
                                            matcher5 = matcher5;
                                            matcher13 = matcher13;
                                            i2 = i2;
                                            str3 = str3;
                                            x21Var2 = x21Var;
                                        }
                                    }
                                    i2 = i2;
                                    break;
                                }
                                Collections.reverse(arrayList2);
                                c0Var = new c0(arrayList2);
                                c0Var.Z = Boolean.TRUE;
                                if (arrayList2.isEmpty()) {
                                    e0Var2 = null;
                                } else {
                                    e0Var2.k0 = c0Var;
                                }
                            }
                        } else {
                            if (c(matcher22, str5)) {
                                Long lB3 = b(matcher22, 3);
                                if (lB3 == null) {
                                    s6Var2.getLogger().h(s5.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                    matcher3 = matcher19;
                                    matcher2 = matcher20;
                                    arrayList = arrayList3;
                                    e0Var2 = null;
                                } else {
                                    e0Var2.X = lB3;
                                    e0Var2.Z = matcher22.group(1);
                                    if (lB3.equals(this.c)) {
                                        e0Var2.j0 = Boolean.TRUE;
                                    }
                                }
                            }
                            s6Var = this.d.X;
                            arrayList2 = new ArrayList();
                            matcher4 = l.matcher(str2);
                            matcher5 = m.matcher(str2);
                            matcher6 = n.matcher(str2);
                            matcher7 = o.matcher(str2);
                            matcher8 = q.matcher(str2);
                            matcher3 = matcher19;
                            matcher9 = p.matcher(str2);
                            matcher2 = matcher20;
                            matcher10 = s.matcher(str2);
                            Matcher matcher24 = r.matcher(str2);
                            arrayList = arrayList3;
                            matcher11 = t.matcher(str2);
                            matcher12 = u.matcher(str2);
                            matcher13 = k.matcher(str2);
                            str2 = str2;
                            matcher14 = matcher24;
                            a0Var = null;
                            while (true) {
                                if (x21Var2.c >= i2) {
                                    aVarA = x21Var2.a();
                                    if (aVarA == null) {
                                        s6Var2.getLogger().h(s5.WARNING, str3, new Object[0]);
                                    } else {
                                        str = aVarA.a;
                                        if (c(matcher13, str)) {
                                            lB = b(matcher13, 1);
                                            if (lB != null) {
                                                e0Var2.j0 = Boolean.TRUE;
                                            }
                                            i2 = i2;
                                        } else {
                                            i2 = i2;
                                            if (c(matcher5, str)) {
                                                a0Var = new a0();
                                                strGroup5 = matcher5.group(1);
                                                strGroup6 = matcher5.group(2);
                                                if (strGroup5 != null) {
                                                    strGroup6 = pc6.p(strGroup5, ".", strGroup6);
                                                }
                                                a0Var.h0 = strGroup6;
                                                a0Var.g0 = matcher5.group(3);
                                                a0Var.f0 = matcher5.group(4);
                                                strGroup7 = matcher5.group(5);
                                                if (strGroup7 != null) {
                                                    numValueOf2 = null;
                                                } else {
                                                    numValueOf2 = null;
                                                }
                                                a0Var.i0 = numValueOf2;
                                                a0Var.m0 = z.c(strGroup6, s6Var.getInAppIncludes(), s6Var.getInAppExcludes());
                                                arrayList2.add(a0Var);
                                            } else {
                                                matcher13 = matcher13;
                                                if (c(matcher4, str)) {
                                                    a0Var2 = new a0();
                                                    a0Var2.n0 = matcher4.group(3);
                                                    a0Var2.g0 = matcher4.group(6);
                                                    strGroup3 = matcher4.group(7);
                                                    if (strGroup3 != null) {
                                                        numValueOf = null;
                                                    } else {
                                                        numValueOf = null;
                                                    }
                                                    a0Var2.i0 = numValueOf;
                                                    a0Var2.s0 = "0x" + matcher4.group(2);
                                                    a0Var2.p0 = "native";
                                                    strGroup4 = matcher4.group(8);
                                                    if (strGroup4 == null) {
                                                        strA = null;
                                                    } else {
                                                        strA = io.sentry.config.a.a(strGroup4);
                                                    }
                                                    if (strA != null) {
                                                        map = this.e;
                                                        if (!map.containsKey(strA)) {
                                                            DebugImage debugImage2 = new DebugImage();
                                                            debugImage2.setDebugId(strA);
                                                            debugImage2.setType("elf");
                                                            debugImage2.setCodeFile(matcher4.group(4));
                                                            debugImage2.setCodeId(strGroup4);
                                                            map.put(strA, debugImage2);
                                                        }
                                                        a0Var2.t0 = "rel:".concat(strA);
                                                    } else {
                                                        matcher5 = matcher5;
                                                        str3 = str3;
                                                    }
                                                    arrayList2.add(a0Var2);
                                                    a0Var = null;
                                                } else {
                                                    matcher5 = matcher5;
                                                    str3 = str3;
                                                    if (c(matcher6, str)) {
                                                        a0Var = new a0();
                                                        strGroup = matcher6.group(1);
                                                        strGroup2 = matcher6.group(2);
                                                        if (strGroup != null) {
                                                            strGroup2 = pc6.p(strGroup, ".", strGroup2);
                                                        }
                                                        a0Var.h0 = strGroup2;
                                                        a0Var.g0 = matcher6.group(3);
                                                        a0Var.m0 = z.c(strGroup2, s6Var.getInAppIncludes(), s6Var.getInAppExcludes());
                                                        a0Var.o0 = Boolean.TRUE;
                                                        arrayList2.add(a0Var);
                                                    } else if (c(matcher7, str)) {
                                                        if (a0Var != null) {
                                                            t5 t5Var7 = new t5();
                                                            t5Var7.X = 1;
                                                            t5Var7.Y = matcher7.group(1);
                                                            t5Var7.Z = matcher7.group(2);
                                                            t5Var7.f0 = matcher7.group(3);
                                                            a0Var.x0 = t5Var7;
                                                            a(e0Var2, t5Var7);
                                                        }
                                                    } else if (c(matcher8, str)) {
                                                        if (a0Var != null) {
                                                            t5 t5Var8 = new t5();
                                                            t5Var8.X = 2;
                                                            t5Var8.Y = matcher8.group(1);
                                                            t5Var8.Z = matcher8.group(2);
                                                            t5Var8.f0 = matcher8.group(3);
                                                            a0Var.x0 = t5Var8;
                                                            a(e0Var2, t5Var8);
                                                        }
                                                    } else if (c(matcher9, str)) {
                                                        if (a0Var != null) {
                                                            t5 t5Var9 = new t5();
                                                            t5Var9.X = 4;
                                                            t5Var9.Y = matcher9.group(1);
                                                            t5Var9.Z = matcher9.group(2);
                                                            t5Var9.f0 = matcher9.group(3);
                                                            a0Var.x0 = t5Var9;
                                                            a(e0Var2, t5Var9);
                                                        }
                                                    } else if (c(matcher10, str)) {
                                                        if (a0Var != null) {
                                                            t5 t5Var10 = new t5();
                                                            t5Var10.X = 8;
                                                            t5Var10.Y = matcher10.group(1);
                                                            t5Var10.Z = matcher10.group(2);
                                                            t5Var10.f0 = matcher10.group(3);
                                                            t5Var10.g0 = b(matcher10, 4);
                                                            a0Var.x0 = t5Var10;
                                                            a(e0Var2, t5Var10);
                                                        }
                                                        matcher16 = matcher11;
                                                        matcher17 = matcher12;
                                                        matcher15 = matcher14;
                                                    } else {
                                                        matcher15 = matcher14;
                                                        if (c(matcher15, str)) {
                                                            matcher16 = matcher11;
                                                            if (c(matcher16, str)) {
                                                                if (str.length() != 0) {
                                                                    break;
                                                                    break;
                                                                }
                                                                matcher17 = matcher12;
                                                                if (c(matcher17, str)) {
                                                                    break;
                                                                    break;
                                                                }
                                                            } else if (a0Var != null) {
                                                                t5 t5Var11 = new t5();
                                                                t5Var11.X = 8;
                                                                a0Var.x0 = t5Var11;
                                                                a(e0Var2, t5Var11);
                                                            }
                                                        } else {
                                                            if (a0Var != null) {
                                                                t5 t5Var12 = new t5();
                                                                t5Var12.X = 8;
                                                                t5Var12.Y = matcher15.group(1);
                                                                t5Var12.Z = matcher15.group(2);
                                                                t5Var12.f0 = matcher15.group(3);
                                                                a0Var.x0 = t5Var12;
                                                                a(e0Var2, t5Var12);
                                                            }
                                                            matcher16 = matcher11;
                                                        }
                                                        matcher17 = matcher12;
                                                    }
                                                }
                                                matcher16 = matcher11;
                                                matcher17 = matcher12;
                                                matcher15 = matcher14;
                                            }
                                            matcher14 = matcher15;
                                            matcher12 = matcher17;
                                            matcher11 = matcher16;
                                            matcher5 = matcher5;
                                            matcher13 = matcher13;
                                            i2 = i2;
                                            str3 = str3;
                                            x21Var2 = x21Var;
                                        }
                                        matcher5 = matcher5;
                                        str3 = str3;
                                        matcher16 = matcher11;
                                        matcher17 = matcher12;
                                        matcher15 = matcher14;
                                        matcher14 = matcher15;
                                        matcher12 = matcher17;
                                        matcher11 = matcher16;
                                        matcher5 = matcher5;
                                        matcher13 = matcher13;
                                        i2 = i2;
                                        str3 = str3;
                                        x21Var2 = x21Var;
                                    }
                                }
                                i2 = i2;
                                break;
                            }
                            Collections.reverse(arrayList2);
                            c0Var = new c0(arrayList2);
                            c0Var.Z = Boolean.TRUE;
                            if (arrayList2.isEmpty()) {
                                e0Var2 = null;
                            } else {
                                e0Var2.k0 = c0Var;
                            }
                        }
                    }
                }
                if (e0Var2 != null) {
                    arrayList.add(e0Var2);
                }
            } else {
                if (c(matcher20, str4)) {
                    this.c = b(matcher20, 1);
                } else {
                    boolean zStartsWith = str4.startsWith("Free memory until OOME ");
                    d dVar = this.g;
                    if (zStartsWith) {
                        dVar.g().k0 = d.h(str4.substring(23));
                    } else if (str4.startsWith("Free memory until GC ")) {
                        dVar.g().j0 = d.h(str4.substring(21));
                    } else if (str4.startsWith("Free memory ")) {
                        dVar.g().i0 = d.h(str4.substring(12));
                    } else if (str4.startsWith("Total memory ")) {
                        dVar.g().l0 = d.h(str4.substring(13));
                    } else if (str4.startsWith("Max memory ")) {
                        dVar.g().m0 = d.h(str4.substring(11));
                    } else if (str4.startsWith("Total time waiting for GC to complete: ")) {
                        dVar.g().h0 = d.i(str4.substring(39));
                    } else if (str4.startsWith("Total GC time: ")) {
                        dVar.g().Y = d.i(str4.substring(15));
                    } else if (str4.startsWith("Total GC count: ")) {
                        c cVarG = dVar.g();
                        try {
                            lValueOf = Long.valueOf(Long.parseLong(str4.substring(16).trim()));
                        } catch (NumberFormatException unused) {
                        }
                        cVarG.X = lValueOf;
                    } else if (str4.startsWith("Total blocking GC time: ")) {
                        dVar.g().f0 = d.i(str4.substring(24));
                    } else if (str4.startsWith("Total blocking GC count: ")) {
                        c cVarG2 = dVar.g();
                        try {
                            lValueOf = Long.valueOf(Long.parseLong(str4.substring(25).trim()));
                        } catch (NumberFormatException unused2) {
                        }
                        cVarG2.Z = lValueOf;
                    } else if (str4.startsWith("Total pre-OOME GC count: ")) {
                        c cVarG3 = dVar.g();
                        try {
                            lValueOf = Long.valueOf(Long.parseLong(str4.substring(25).trim()));
                        } catch (NumberFormatException unused3) {
                        }
                        cVarG3.g0 = lValueOf;
                    }
                }
                i2 = i2;
                pattern = pattern3;
                str2 = str2;
                matcher = matcher18;
                pattern2 = pattern4;
                matcher3 = matcher19;
                matcher2 = matcher20;
            }
            x21Var2 = x21Var;
            pattern3 = pattern;
            matcher18 = matcher;
            pattern4 = pattern2;
            matcher19 = matcher3;
            matcher20 = matcher2;
            str2 = str2;
            i2 = i2;
        }
    }
}
