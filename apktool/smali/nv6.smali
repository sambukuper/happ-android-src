.class public final Lnv6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lkv6;
.implements Lyv6;


# instance fields
.field public final synthetic X:Llv6;

.field public Y:Lg94;

.field public Z:Lxd6;


# direct methods
.method public constructor <init>(Llv6;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnv6;->X:Llv6;

    .line 5
    .line 6
    const-string v0, "androidx.savedstate.SavedStateRegistry"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Llv6;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v2, v1, Landroid/os/Bundle;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    check-cast v1, Landroid/os/Bundle;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, Lnv6;->Z:Lxd6;

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    new-instance v2, Lxv6;

    .line 27
    .line 28
    new-instance v3, Lhr5;

    .line 29
    .line 30
    const/16 v4, 0xe

    .line 31
    .line 32
    invoke-direct {v3, p0, v4}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, p0, v3}, Lxv6;-><init>(Lyv6;Lhr5;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Lxd6;

    .line 39
    .line 40
    const/4 v4, 0x5

    .line 41
    invoke-direct {v3, v2, v4}, Lxd6;-><init>(Lxv6;B)V

    .line 42
    .line 43
    .line 44
    iput-object v3, p0, Lnv6;->Z:Lxd6;

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Lxd6;->x(Landroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    new-instance v1, Lhr5;

    .line 50
    .line 51
    const/16 v2, 0xc

    .line 52
    .line 53
    invoke-direct {v1, p0, v2}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0, v1}, Llv6;->a(Ljava/lang/String;Ldn2;)Lf63;

    .line 57
    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ldn2;)Lf63;
    .locals 0

    .line 1
    iget-object p0, p0, Lnv6;->X:Llv6;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Llv6;->a(Ljava/lang/String;Ldn2;)Lf63;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnv6;->X:Llv6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Llv6;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lnv6;->X:Llv6;

    .line 2
    .line 3
    invoke-virtual {p0}, Llv6;->d()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lnv6;->X:Llv6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Llv6;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final f()Lxd6;
    .locals 3

    .line 1
    iget-object v0, p0, Lnv6;->Z:Lxd6;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lxv6;

    .line 6
    .line 7
    new-instance v1, Lhr5;

    .line 8
    .line 9
    const/16 v2, 0xe

    .line 10
    .line 11
    invoke-direct {v1, p0, v2}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lxv6;-><init>(Lyv6;Lhr5;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lxd6;

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    invoke-direct {v1, v0, v2}, Lxd6;-><init>(Lxv6;B)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lnv6;->Z:Lxd6;

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-virtual {v1, p0}, Lxd6;->x(Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    iget-object p0, v0, Lxd6;->Z:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lxd6;

    .line 33
    .line 34
    return-object p0
.end method

.method public final h()Lg94;
    .locals 2

    .line 1
    iget-object v0, p0, Lnv6;->Y:Lg94;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg94;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lg94;-><init>(Ld94;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lnv6;->Y:Lg94;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method
