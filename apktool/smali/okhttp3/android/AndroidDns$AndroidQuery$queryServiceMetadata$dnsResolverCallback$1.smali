.class public final Lokhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/net/DnsResolver$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/android/AndroidDns$AndroidQuery;->queryServiceMetadata(Lokhttp3/internal/dns/DnsQuery$Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/net/DnsResolver$Callback;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "okhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1",
        "Landroid/net/DnsResolver$Callback;",
        "",
        "answer",
        "",
        "rcode",
        "Ldn8;",
        "onAnswer",
        "([BI)V",
        "Landroid/net/DnsResolver$DnsException;",
        "e",
        "onError",
        "(Landroid/net/DnsResolver$DnsException;)V",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $callback:Lokhttp3/internal/dns/DnsQuery$Callback;


# direct methods
.method public constructor <init>(Lokhttp3/internal/dns/DnsQuery$Callback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1;->$callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic onAnswer(Ljava/lang/Object;I)V
    .locals 0

    .line 36
    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lokhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1;->onAnswer([BI)V

    return-void
.end method

.method public onAnswer([BI)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance p2, Lokhttp3/internal/dns/DnsMessageReader;

    .line 5
    .line 6
    new-instance v0, Li90;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    array-length v1, p1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, p1, v2, v1}, Li90;->write([BII)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p2, v0}, Lokhttp3/internal/dns/DnsMessageReader;-><init>(Lba0;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lokhttp3/internal/dns/DnsMessageReader;->read()Lokhttp3/internal/dns/DnsMessage;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    iget-object p0, p0, Lokhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1;->$callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 24
    .line 25
    invoke-interface {p0, p1}, Lokhttp3/internal/dns/DnsQuery$Callback;->onResponse(Lokhttp3/internal/dns/DnsMessage;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p1

    .line 30
    iget-object p0, p0, Lokhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1;->$callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 31
    .line 32
    invoke-interface {p0, p1}, Lokhttp3/internal/dns/DnsQuery$Callback;->onFailure(Ljava/io/IOException;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public onError(Landroid/net/DnsResolver$DnsException;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lokhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1;->$callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 5
    .line 6
    new-instance v0, Ljava/io/IOException;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "HTTPS query failed with code "

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget v2, p1, Landroid/net/DnsResolver$DnsException;->code:I

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v0}, Lokhttp3/internal/dns/DnsQuery$Callback;->onFailure(Ljava/io/IOException;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
