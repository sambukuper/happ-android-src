.class public final synthetic Lokhttp3/android/a;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:Lokhttp3/android/AndroidDns;

.field public final synthetic Y:Lokhttp3/android/AndroidDns$AndroidQuery;

.field public final synthetic Z:Lokhttp3/internal/dns/DnsQuery$Callback;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/android/AndroidDns;Lokhttp3/android/AndroidDns$AndroidQuery;Lokhttp3/internal/dns/DnsQuery$Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/android/a;->X:Lokhttp3/android/AndroidDns;

    .line 5
    .line 6
    iput-object p2, p0, Lokhttp3/android/a;->Y:Lokhttp3/android/AndroidDns$AndroidQuery;

    .line 7
    .line 8
    iput-object p3, p0, Lokhttp3/android/a;->Z:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/android/a;->Y:Lokhttp3/android/AndroidDns$AndroidQuery;

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/android/a;->Z:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 4
    .line 5
    iget-object p0, p0, Lokhttp3/android/a;->X:Lokhttp3/android/AndroidDns;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lokhttp3/android/AndroidDns$AndroidQuery;->a(Lokhttp3/android/AndroidDns;Lokhttp3/android/AndroidDns$AndroidQuery;Lokhttp3/internal/dns/DnsQuery$Callback;)Ldn8;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
