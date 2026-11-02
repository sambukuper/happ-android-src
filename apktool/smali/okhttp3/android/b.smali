.class public final synthetic Lokhttp3/android/b;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:Lokhttp3/internal/dns/DnsQuery$Callback;

.field public final synthetic Y:Ljava/lang/SecurityException;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/dns/DnsQuery$Callback;Ljava/lang/SecurityException;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/android/b;->X:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 5
    .line 6
    iput-object p2, p0, Lokhttp3/android/b;->Y:Ljava/lang/SecurityException;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/android/b;->X:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 2
    .line 3
    iget-object p0, p0, Lokhttp3/android/b;->Y:Ljava/lang/SecurityException;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lokhttp3/android/AndroidDns$AndroidQuery;->b(Lokhttp3/internal/dns/DnsQuery$Callback;Ljava/lang/SecurityException;)Ldn8;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
