.class public final Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/internal/dns/DnsQuery;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery;",
        "Lokhttp3/internal/dns/DnsQuery;",
        "Lokhttp3/Call;",
        "call",
        "<init>",
        "(Lokhttp3/Call;)V",
        "Lokhttp3/internal/dns/DnsQuery$Callback;",
        "callback",
        "Ldn8;",
        "enqueue",
        "(Lokhttp3/internal/dns/DnsQuery$Callback;)V",
        "cancel",
        "()V",
        "Lokhttp3/Call;",
        "Factory",
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
.field private final call:Lokhttp3/Call;


# direct methods
.method public constructor <init>(Lokhttp3/Call;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery;->call:Lokhttp3/Call;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery;->call:Lokhttp3/Call;

    .line 2
    .line 3
    invoke-interface {p0}, Lokhttp3/Call;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public enqueue(Lokhttp3/internal/dns/DnsQuery$Callback;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery;->call:Lokhttp3/Call;

    .line 5
    .line 6
    new-instance v0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$enqueue$1;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$enqueue$1;-><init>(Lokhttp3/internal/dns/DnsQuery$Callback;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
