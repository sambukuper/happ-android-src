.class public final Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$enqueue$1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery;->enqueue(Lokhttp3/internal/dns/DnsQuery$Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "okhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$enqueue$1",
        "Lokhttp3/Callback;",
        "Lokhttp3/Call;",
        "call",
        "Ljava/io/IOException;",
        "e",
        "Ldn8;",
        "onFailure",
        "(Lokhttp3/Call;Ljava/io/IOException;)V",
        "Lokhttp3/Response;",
        "response",
        "onResponse",
        "(Lokhttp3/Call;Lokhttp3/Response;)V",
        "okhttp-dnsoverhttps"
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
    iput-object p1, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$enqueue$1;->$callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$enqueue$1;->$callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 8
    .line 9
    invoke-interface {p0, p2}, Lokhttp3/internal/dns/DnsQuery$Callback;->onFailure(Ljava/io/IOException;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {p2}, Lokhttp3/dnsoverhttps/internal/_DnsOverHttpsQueryKt;->decodeResponse(Lokhttp3/Response;)Lokhttp3/internal/dns/DnsMessage;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    iget-object p0, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$enqueue$1;->$callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lokhttp3/internal/dns/DnsQuery$Callback;->onResponse(Lokhttp3/internal/dns/DnsMessage;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p1

    .line 18
    iget-object p0, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$enqueue$1;->$callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 19
    .line 20
    invoke-interface {p0, p1}, Lokhttp3/internal/dns/DnsQuery$Callback;->onFailure(Ljava/io/IOException;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
