package okhttp3.internal.publicsuffix;

import defpackage.d02;
import defpackage.dh3;
import defpackage.fm7;
import defpackage.ge1;
import defpackage.i21;
import defpackage.iq0;
import defpackage.kb0;
import defpackage.ra;
import defpackage.w27;
import defpackage.wv0;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", _UrlKt.FRAGMENT_ENCODE_SET, "publicSuffixList", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "(Lokhttp3/internal/publicsuffix/PublicSuffixList;)V", "getEffectiveTldPlusOne", _UrlKt.FRAGMENT_ENCODE_SET, "domain", "splitDomain", _UrlKt.FRAGMENT_ENCODE_SET, "findMatchingRule", "domainLabels", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE;
    private static final kb0 WILDCARD_LABEL;
    private static PublicSuffixDatabase instance;
    private final PublicSuffixList publicSuffixList;

    static {
        kb0 kb0Var = kb0.f0;
        WILDCARD_LABEL = new kb0(Arrays.copyOf(new byte[]{42}, 1));
        PREVAILING_RULE = i21.K("*");
        instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.INSTANCE));
    }

    public PublicSuffixDatabase(PublicSuffixList publicSuffixList) {
        publicSuffixList.getClass();
        this.publicSuffixList = publicSuffixList;
    }

    private final List<String> findMatchingRule(List<String> domainLabels) {
        String str;
        String strBinarySearch;
        String strBinarySearch2;
        this.publicSuffixList.ensureLoaded();
        int size = domainLabels.size();
        kb0[] kb0VarArr = new kb0[size];
        for (int i = 0; i < size; i++) {
            kb0 kb0Var = kb0.f0;
            kb0VarArr[i] = ra.g(domainLabels.get(i));
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                strBinarySearch = null;
                break;
            }
            strBinarySearch = INSTANCE.binarySearch(this.publicSuffixList.getBytes(), kb0VarArr, i2);
            if (strBinarySearch != null) {
                break;
            }
            i2++;
        }
        if (size <= 1) {
            strBinarySearch2 = null;
            break;
        }
        kb0[] kb0VarArr2 = (kb0[]) kb0VarArr.clone();
        int length = kb0VarArr2.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strBinarySearch2 = null;
                break;
            }
            kb0VarArr2[i3] = WILDCARD_LABEL;
            strBinarySearch2 = INSTANCE.binarySearch(this.publicSuffixList.getBytes(), kb0VarArr2, i3);
            if (strBinarySearch2 != null) {
                break;
            }
            i3++;
        }
        if (strBinarySearch2 != null) {
            int i4 = size - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                String strBinarySearch3 = INSTANCE.binarySearch(this.publicSuffixList.getExceptionBytes(), kb0VarArr, i5);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
            }
        }
        if (str != null) {
            return fm7.E0("!".concat(str), new char[]{'.'});
        }
        if (strBinarySearch == null && strBinarySearch2 == null) {
            return PREVAILING_RULE;
        }
        List<String> listE0 = d02.X;
        List<String> listE1 = strBinarySearch != null ? fm7.E0(strBinarySearch, new char[]{'.'}) : listE0;
        if (strBinarySearch2 != null) {
            listE0 = fm7.E0(strBinarySearch2, new char[]{'.'});
        }
        return listE1.size() > listE0.size() ? listE1 : listE0;
    }

    private final List<String> splitDomain(String domain) {
        List<String> listE0 = fm7.E0(domain, new char[]{'.'});
        return dh3.f(wv0.A0(listE0), _UrlKt.FRAGMENT_ENCODE_SET) ? wv0.p0(1, listE0) : listE0;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        int size;
        int size2;
        domain.getClass();
        String unicode = IDN.toUnicode(domain);
        unicode.getClass();
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        return w27.j0(w27.f0(wv0.l0(splitDomain(domain)), size - size2), ".", null, 62);
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lkb0;", _UrlKt.FRAGMENT_ENCODE_SET, "labels", _UrlKt.FRAGMENT_ENCODE_SET, "labelIndex", _UrlKt.FRAGMENT_ENCODE_SET, "binarySearch", "(Lkb0;[Lkb0;I)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "Ldn8;", "resetForTests$okhttp", "resetForTests", "WILDCARD_LABEL", "Lkb0;", _UrlKt.FRAGMENT_ENCODE_SET, "PREVAILING_RULE", "Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "EXCEPTION_MARKER", "C", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(ge1 ge1Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(kb0 kb0Var, kb0[] kb0VarArr, int i) {
            int i2;
            int iAnd;
            boolean z;
            int iAnd2;
            int iE = kb0Var.e();
            int i3 = 0;
            while (i3 < iE) {
                int i4 = (i3 + iE) / 2;
                while (i4 > -1 && kb0Var.j(i4) != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (kb0Var.j(i2) == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iAnd = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        iAnd = _UtilCommonKt.and(kb0VarArr[i8].j(i9), 255);
                        z = z3;
                    }
                    iAnd2 = iAnd - _UtilCommonKt.and(kb0Var.j(i5 + i10), 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (kb0VarArr[i8].e() != i9) {
                        z2 = z;
                    } else {
                        if (i8 == kb0VarArr.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i11 = i7 - i10;
                        int iE2 = kb0VarArr[i8].e() - i9;
                        int length = kb0VarArr.length;
                        for (int i12 = i8 + 1; i12 < length; i12++) {
                            iE2 += kb0VarArr[i12].e();
                        }
                        if (iE2 >= i11) {
                            if (iE2 <= i11) {
                                return kb0Var.p(i5, i7 + i5).o(iq0.a);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                iE = i4;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        public final void resetForTests$okhttp() {
            PublicSuffixDatabase.instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.INSTANCE));
        }

        private Companion() {
        }
    }
}
