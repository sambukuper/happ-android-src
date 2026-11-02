.class public final Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsu/happ/proxyutility/dto/MetaParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ResetInfo"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u0004\u001a\u0004\u0008\n\u0010\u0006\"\u0004\u0008\u000b\u0010\u0008R\"\u0010\u000c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0004\u001a\u0004\u0008\r\u0010\u0006\"\u0004\u0008\u000e\u0010\u0008R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0004\u001a\u0004\u0008\u0010\u0010\u0006\"\u0004\u0008\u0011\u0010\u0008R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0004\u001a\u0004\u0008\u0013\u0010\u0006\"\u0004\u0008\u0014\u0010\u0008R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0004\u001a\u0004\u0008\u0016\u0010\u0006\"\u0004\u0008\u0017\u0010\u0008R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0004\u001a\u0004\u0008\u0019\u0010\u0006\"\u0004\u0008\u001a\u0010\u0008\u00a8\u0006\u001b"
    }
    d2 = {
        "Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;",
        "Landroid/os/Parcelable;",
        "",
        "fallbackUrl",
        "Z",
        "c",
        "()Z",
        "p",
        "(Z)V",
        "notificationSubsExpire",
        "k",
        "C",
        "fragment",
        "d",
        "u",
        "resolveAddress",
        "m",
        "E",
        "host",
        "e",
        "y",
        "insecure",
        "g",
        "B",
        "providerId",
        "l",
        "D",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private fallbackUrl:Z

.field private fragment:Z

.field private host:Z

.field private insecure:Z

.field private notificationSubsExpire:Z

.field private providerId:Z

.field private resolveAddress:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo$Creator;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    .line 19
    invoke-direct/range {v0 .. v7}, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;-><init>(ZZZZZZZ)V

    return-void
.end method

.method public constructor <init>(ZZZZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fallbackUrl:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->notificationSubsExpire:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fragment:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->resolveAddress:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->host:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->insecure:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->providerId:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final B(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->insecure:Z

    .line 2
    .line 3
    return-void
.end method

.method public final C(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->notificationSubsExpire:Z

    .line 2
    .line 3
    return-void
.end method

.method public final D(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->providerId:Z

    .line 2
    .line 3
    return-void
.end method

.method public final E(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->resolveAddress:Z

    .line 2
    .line 3
    return-void
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fallbackUrl:Z

    .line 2
    .line 3
    return p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fragment:Z

    .line 2
    .line 3
    return p0
.end method

.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->host:Z

    .line 2
    .line 3
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
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
    instance-of v1, p1, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;

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
    check-cast p1, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;

    .line 12
    .line 13
    iget-boolean v1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fallbackUrl:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fallbackUrl:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-boolean v1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->notificationSubsExpire:Z

    .line 21
    .line 22
    iget-boolean v3, p1, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->notificationSubsExpire:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-boolean v1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fragment:Z

    .line 28
    .line 29
    iget-boolean v3, p1, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fragment:Z

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget-boolean v1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->resolveAddress:Z

    .line 35
    .line 36
    iget-boolean v3, p1, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->resolveAddress:Z

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    iget-boolean v1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->host:Z

    .line 42
    .line 43
    iget-boolean v3, p1, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->host:Z

    .line 44
    .line 45
    if-eq v1, v3, :cond_6

    .line 46
    .line 47
    return v2

    .line 48
    :cond_6
    iget-boolean v1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->insecure:Z

    .line 49
    .line 50
    iget-boolean v3, p1, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->insecure:Z

    .line 51
    .line 52
    if-eq v1, v3, :cond_7

    .line 53
    .line 54
    return v2

    .line 55
    :cond_7
    iget-boolean p0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->providerId:Z

    .line 56
    .line 57
    iget-boolean p1, p1, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->providerId:Z

    .line 58
    .line 59
    if-eq p0, p1, :cond_8

    .line 60
    .line 61
    return v2

    .line 62
    :cond_8
    return v0
.end method

.method public final g()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->insecure:Z

    .line 2
    .line 3
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fallbackUrl:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->notificationSubsExpire:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lpc6;->f(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fragment:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lpc6;->f(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->resolveAddress:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lpc6;->f(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->host:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lpc6;->f(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->insecure:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Lpc6;->f(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean p0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->providerId:Z

    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->notificationSubsExpire:Z

    .line 2
    .line 3
    return p0
.end method

.method public final l()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->providerId:Z

    .line 2
    .line 3
    return p0
.end method

.method public final m()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->resolveAddress:Z

    .line 2
    .line 3
    return p0
.end method

.method public final p(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fallbackUrl:Z

    .line 2
    .line 3
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fallbackUrl:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->notificationSubsExpire:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fragment:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->resolveAddress:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->host:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->insecure:Z

    .line 12
    .line 13
    iget-boolean p0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->providerId:Z

    .line 14
    .line 15
    new-instance v6, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v7, "ResetInfo(fallbackUrl="

    .line 18
    .line 19
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", notificationSubsExpire="

    .line 26
    .line 27
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, ", fragment="

    .line 34
    .line 35
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, ", resolveAddress="

    .line 42
    .line 43
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, ", host="

    .line 50
    .line 51
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, ", insecure="

    .line 58
    .line 59
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, ", providerId="

    .line 66
    .line 67
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v0, ")"

    .line 71
    .line 72
    invoke-static {v6, p0, v0}, Lp61;->o(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

.method public final u(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fragment:Z

    .line 2
    .line 3
    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fallbackUrl:Z

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 7
    .line 8
    .line 9
    iget-boolean p2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->notificationSubsExpire:Z

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 12
    .line 13
    .line 14
    iget-boolean p2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->fragment:Z

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 17
    .line 18
    .line 19
    iget-boolean p2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->resolveAddress:Z

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 22
    .line 23
    .line 24
    iget-boolean p2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->host:Z

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 27
    .line 28
    .line 29
    iget-boolean p2, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->insecure:Z

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    .line 33
    .line 34
    iget-boolean p0, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->providerId:Z

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final y(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lsu/happ/proxyutility/dto/MetaParams$ResetInfo;->host:Z

    .line 2
    .line 3
    return-void
.end method
