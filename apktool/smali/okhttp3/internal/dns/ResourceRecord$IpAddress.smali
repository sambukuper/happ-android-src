.class public final Lokhttp3/internal/dns/ResourceRecord$IpAddress;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/internal/dns/ResourceRecord;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/dns/ResourceRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IpAddress"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Lokhttp3/internal/dns/ResourceRecord$IpAddress;",
        "Lokhttp3/internal/dns/ResourceRecord;",
        "name",
        "",
        "timeToLive",
        "",
        "address",
        "Ljava/net/InetAddress;",
        "<init>",
        "(Ljava/lang/String;ILjava/net/InetAddress;)V",
        "getName",
        "()Ljava/lang/String;",
        "getTimeToLive",
        "()I",
        "getAddress",
        "()Ljava/net/InetAddress;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
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
.field private final address:Ljava/net/InetAddress;

.field private final name:Ljava/lang/String;

.field private final timeToLive:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/net/InetAddress;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->name:Ljava/lang/String;

    .line 11
    .line 12
    iput p2, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->timeToLive:I

    .line 13
    .line 14
    iput-object p3, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->address:Ljava/net/InetAddress;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic copy$default(Lokhttp3/internal/dns/ResourceRecord$IpAddress;Ljava/lang/String;ILjava/net/InetAddress;ILjava/lang/Object;)Lokhttp3/internal/dns/ResourceRecord$IpAddress;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->name:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget p2, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->timeToLive:I

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->address:Ljava/net/InetAddress;

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->copy(Ljava/lang/String;ILjava/net/InetAddress;)Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()I
    .locals 0

    .line 1
    iget p0, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->timeToLive:I

    .line 2
    .line 3
    return p0
.end method

.method public final component3()Ljava/net/InetAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->address:Ljava/net/InetAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;ILjava/net/InetAddress;)Lokhttp3/internal/dns/ResourceRecord$IpAddress;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3}, Lokhttp3/internal/dns/ResourceRecord$IpAddress;-><init>(Ljava/lang/String;ILjava/net/InetAddress;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 12
    .line 13
    iget-object v1, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->name:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->name:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->timeToLive:I

    .line 25
    .line 26
    iget v3, p1, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->timeToLive:I

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object p0, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->address:Ljava/net/InetAddress;

    .line 32
    .line 33
    iget-object p1, p1, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->address:Ljava/net/InetAddress;

    .line 34
    .line 35
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    return v0
.end method

.method public final getAddress()Ljava/net/InetAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->address:Ljava/net/InetAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTimeToLive()I
    .locals 0

    .line 1
    iget p0, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->timeToLive:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->name:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->timeToLive:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Loi0;->e(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->address:Ljava/net/InetAddress;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/net/InetAddress;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "IpAddress(name="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->name:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", timeToLive="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->timeToLive:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", address="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->address:Ljava/net/InetAddress;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 p0, 0x29

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
