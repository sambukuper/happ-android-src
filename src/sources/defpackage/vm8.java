package defpackage;

import io.sentry.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.HpkeSuite;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vm8 {
    public static final ArrayList a = wv0.H0(wv0.F0(new bq0('a', 'z'), new bq0('A', 'Z')), i21.L('[', ']', '\''));

    public static final void a(md4 md4Var, String str) {
        List list;
        List list2;
        ArrayList arrayListN = i21.N(new ArrayList());
        int length = str.length();
        int i = 0;
        boolean z = false;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        Character chValueOf = null;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (chValueOf != null && cCharAt == chValueOf.charValue()) {
                i++;
            } else if (!z) {
                if (i > 0) {
                    List list3 = (List) wv0.A0(arrayListN);
                    if (list3 != null) {
                        chValueOf.getClass();
                        list3.add(d(chValueOf.charValue(), i));
                    }
                    i = 0;
                    chValueOf = null;
                }
                if (a.contains(Character.valueOf(cCharAt))) {
                    if (!str2.equals(_UrlKt.FRAGMENT_ENCODE_SET)) {
                        List list4 = (List) wv0.A0(arrayListN);
                        if (list4 != null) {
                            list4.add(new tm8(str2));
                        }
                        str2 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    if (cCharAt == '\'') {
                        z = true;
                        str2 = _UrlKt.FRAGMENT_ENCODE_SET;
                    } else if (cCharAt == '[') {
                        arrayListN.add(new ArrayList());
                    } else if (cCharAt != ']') {
                        chValueOf = Character.valueOf(cCharAt);
                        i = 1;
                    } else {
                        List list5 = (List) bw0.j0(arrayListN);
                        if (list5 == null) {
                            bt.q("Unmatched closing bracket");
                            return;
                        } else {
                            List list6 = (List) wv0.A0(arrayListN);
                            if (list6 != null) {
                                list6.add(new rm8(new sm8(list5)));
                            }
                        }
                    }
                } else {
                    str2 = str2 + cCharAt;
                }
            } else if (cCharAt == '\'') {
                List list7 = (List) wv0.A0(arrayListN);
                if (list7 != null) {
                    if (str2.length() == 0) {
                        str2 = "'";
                    }
                    list7.add(new tm8(str2));
                }
                z = false;
                str2 = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                str2 = str2 + cCharAt;
            }
        }
        if (i > 0 && (list2 = (List) wv0.A0(arrayListN)) != null) {
            chValueOf.getClass();
            list2.add(d(chValueOf.charValue(), i));
        }
        if (!str2.equals(_UrlKt.FRAGMENT_ENCODE_SET) && (list = (List) wv0.A0(arrayListN)) != null) {
            list.add(new tm8(str2));
        }
        List list8 = (List) bw0.j0(arrayListN);
        if (list8 != null) {
            b(md4Var, new sm8(list8));
        } else {
            bt.q("Unmatched opening bracket");
        }
    }

    public static final void b(cc1 cc1Var, um8 um8Var) {
        if (um8Var instanceof tm8) {
            cc1Var.a(((tm8) um8Var).a);
            return;
        }
        if (um8Var instanceof sm8) {
            Iterator it = ((sm8) um8Var).a.iterator();
            while (it.hasNext()) {
                b(cc1Var, (um8) it.next());
            }
            return;
        }
        byte b = 0;
        if (um8Var instanceof rm8) {
            z68.i(cc1Var, new gn2[]{new b58((byte) 9)}, new py7(um8Var, (byte) 10));
            return;
        }
        if (!(um8Var instanceof qm8)) {
            b61.c();
            return;
        }
        qm8 qm8Var = (qm8) um8Var;
        if (qm8Var instanceof nm8) {
            if (cc1Var instanceof ac1) {
                ((nm8) um8Var).c((ac1) cc1Var);
                return;
            } else {
                em7.h("A time-based directive ", um8Var, " was used in a format builder that doesn't support time components");
                return;
            }
        }
        if (qm8Var instanceof om8) {
            if (cc1Var instanceof bc1) {
                ((om8) um8Var).d((bc1) cc1Var);
                return;
            } else {
                em7.h("A year-month-based directive ", um8Var, " was used in a format builder that doesn't support year-month components");
                return;
            }
        }
        if (qm8Var instanceof hm8) {
            if (cc1Var instanceof zb1) {
                ((hm8) um8Var).c((zb1) cc1Var);
                return;
            } else {
                em7.h("A date-based directive ", um8Var, " was used in a format builder that doesn't support date components");
                return;
            }
        }
        if (qm8Var instanceof pm8) {
            em7.h("A time-zone-based directive ", um8Var, " was used in a format builder that doesn't support time-zone components");
            return;
        }
        if (!(qm8Var instanceof im8)) {
            if (qm8Var instanceof kn8) {
                c2.j("The meaning of the directive '", um8Var, "' is unknown");
                return;
            } else {
                b61.c();
                return;
            }
        }
        if (!(cc1Var instanceof wr8)) {
            em7.h("A UTC-offset-based directive ", um8Var, " was used in a format builder that doesn't support UTC offset components");
            return;
        }
        im8 im8Var = (im8) um8Var;
        wr8 wr8Var = (wr8) cc1Var;
        int i = 4;
        switch (im8Var.a) {
            case 0:
                c(im8Var);
                throw null;
            case 1:
                int i2 = im8Var.b;
                if (i2 == 1) {
                    im8Var.c(wr8Var, true, false);
                    return;
                }
                if (i2 == 2) {
                    im8Var.c(wr8Var, true, false);
                    return;
                }
                if (i2 == 3) {
                    im8Var.c(wr8Var, true, true);
                    return;
                }
                if (i2 == 4) {
                    im8Var.c(wr8Var, true, false);
                    return;
                } else if (i2 == 5) {
                    im8Var.c(wr8Var, true, true);
                    return;
                } else {
                    e(im8Var);
                    throw null;
                }
            case 2:
                int i3 = im8Var.b;
                if (i3 == 1) {
                    im8Var.c(wr8Var, false, false);
                    return;
                }
                if (i3 == 2) {
                    im8Var.c(wr8Var, false, false);
                    return;
                }
                if (i3 == 3) {
                    im8Var.c(wr8Var, false, true);
                    return;
                }
                if (i3 == 4) {
                    im8Var.c(wr8Var, false, false);
                    return;
                } else if (i3 == 5) {
                    im8Var.c(wr8Var, false, true);
                    return;
                } else {
                    e(im8Var);
                    throw null;
                }
            default:
                int i4 = im8Var.b;
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    im8Var.c(wr8Var, false, false);
                    return;
                }
                if (i4 == 4) {
                    c(new im8(b, i));
                    throw null;
                }
                if (i4 == 5) {
                    im8Var.c(wr8Var, false, true);
                    return;
                } else {
                    e(im8Var);
                    throw null;
                }
        }
    }

    public static void c(qm8 qm8Var) {
        throw new IllegalArgumentException("The directive '" + qm8Var + "' is locale-dependent, but locales are not supported in Kotlin");
    }

    public static final qm8 d(char c, int i) {
        switch (c) {
            case 'A':
                return new mm8((byte) 1, i);
            case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
            case 'C':
            case 'I':
            case 'J':
            case 'K':
            case 'P':
            case 'R':
            case 'T':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'b':
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'o':
            case 'p':
            case 't':
            default:
                return new kn8(c, i);
            case 'D':
                return new gm8((byte) 3, i);
            case 'E':
                return new gm8((byte) 1, i);
            case 'F':
                return new gm8((byte) 2, i);
            case 'G':
                return new om8((byte) 1, i);
            case 'H':
                return new jm8((byte) 2, i);
            case 'L':
                return new om8((byte) 5, i);
            case 'M':
                return new om8((byte) 2, i);
            case 'N':
                return new mm8((byte) 2, i);
            case 'O':
                return new im8((byte) 0, i);
            case 'Q':
                return new om8((byte) 3, i);
            case 'S':
                return new mm8((byte) 0, i);
            case 'U':
                return new om8((byte) 0, i);
            case 'V':
                return new pm8((byte) 1, i);
            case 'W':
                return new gm8((byte) 8, i);
            case 'X':
                return new im8((byte) 1, i);
            case 'Y':
                return new gm8((byte) 7, i);
            case 'Z':
                return new im8((byte) 3, i);
            case 'a':
                return new jm8((byte) 1, i);
            case 'c':
                return new gm8((byte) 6, i);
            case 'd':
                return new gm8((byte) 0, i);
            case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                return new gm8((byte) 4, i);
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                return new gm8((byte) 5, i);
            case 'h':
                return new jm8((byte) 0, i);
            case 'm':
                return new jm8((byte) 3, i);
            case 'n':
                return new mm8((byte) 3, i);
            case 'q':
                return new om8((byte) 6, i);
            case 'r':
                return new om8((byte) 4, i);
            case 's':
                return new km8(i);
            case 'u':
                return new om8((byte) 7, i);
            case 'v':
                return new pm8((byte) 0, i);
            case 'w':
                return new gm8((byte) 9, i);
            case 'x':
                return new im8((byte) 2, i);
            case 'y':
                return new om8((byte) 8, i);
            case 'z':
                return new pm8((byte) 2, i);
        }
    }

    public static final void e(qm8 qm8Var) {
        throw new IllegalArgumentException("Unknown length " + qm8Var.a() + " for the " + qm8Var.b() + " directive");
    }

    public static final void f(String str, String str2) {
        throw new UnsupportedOperationException(oi0.p(p61.p("kotlinx.datetime formatting does not support the ", str, " field. "), str2 != null ? str2.concat(" ") : _UrlKt.FRAGMENT_ENCODE_SET, "Please report your use case to https://github.com/Kotlin/kotlinx-datetime/issues"));
    }

    public static final void g(om8 om8Var, int i) {
        StringBuilder sbL = ie2.l("Padding do ", i, " digits is not supported for the ");
        sbL.append(om8Var.b());
        sbL.append(" directive");
        throw new UnsupportedOperationException(sbL.toString());
    }
}
