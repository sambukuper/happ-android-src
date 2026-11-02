.class final Lzw0;
.super Lqx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lqx4;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lzw0;",
        "Lqx4;",
        "Lcx0;",
        "foundation"
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
.field public final X:Lxz4;

.field public final Y:Ltb3;

.field public final Z:Z

.field public final f0:Ldn2;

.field public final g0:Ldn2;


# direct methods
.method public constructor <init>(Ldn2;Ldn2;Ltb3;Lxz4;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lzw0;->X:Lxz4;

    .line 5
    .line 6
    iput-object p3, p0, Lzw0;->Y:Ltb3;

    .line 7
    .line 8
    iput-boolean p5, p0, Lzw0;->Z:Z

    .line 9
    .line 10
    iput-object p1, p0, Lzw0;->f0:Ldn2;

    .line 11
    .line 12
    iput-object p2, p0, Lzw0;->g0:Ldn2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 6

    .line 1
    new-instance v0, Lcx0;

    .line 2
    .line 3
    iget-object v3, p0, Lzw0;->Y:Ltb3;

    .line 4
    .line 5
    iget-boolean v5, p0, Lzw0;->Z:Z

    .line 6
    .line 7
    iget-object v1, p0, Lzw0;->f0:Ldn2;

    .line 8
    .line 9
    iget-object v2, p0, Lzw0;->g0:Ldn2;

    .line 10
    .line 11
    iget-object v4, p0, Lzw0;->X:Lxz4;

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lcx0;-><init>(Ldn2;Ldn2;Ltb3;Lxz4;Z)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 10

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcx0;

    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, v0, Lcx0;->N0:Z

    .line 6
    .line 7
    iget-object v1, v0, Lcx0;->M0:Ldn2;

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    move v1, p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v8

    .line 15
    :goto_0
    iget-object v2, p0, Lzw0;->g0:Ldn2;

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    move v3, p1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v3, v8

    .line 22
    :goto_1
    if-eq v1, v3, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Lx0;->d1()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lch3;->I(Lw07;)V

    .line 28
    .line 29
    .line 30
    move v1, p1

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v1, v8

    .line 33
    :goto_2
    iput-object v2, v0, Lcx0;->M0:Ldn2;

    .line 34
    .line 35
    iget-boolean v2, v0, Lx0;->x0:Z

    .line 36
    .line 37
    iget-boolean v4, p0, Lzw0;->Z:Z

    .line 38
    .line 39
    if-eq v2, v4, :cond_3

    .line 40
    .line 41
    move v9, p1

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move v9, v1

    .line 44
    :goto_3
    iget-object v1, p0, Lzw0;->X:Lxz4;

    .line 45
    .line 46
    iget-object v2, p0, Lzw0;->Y:Ltb3;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    iget-object v7, p0, Lzw0;->f0:Ldn2;

    .line 52
    .line 53
    invoke-virtual/range {v0 .. v7}, Lx0;->o1(Lxz4;Ltb3;ZZLjava/lang/String;Lkl6;Ldn2;)V

    .line 54
    .line 55
    .line 56
    if-eqz v9, :cond_4

    .line 57
    .line 58
    invoke-virtual {v0, v8}, Lcx0;->p1(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lcx0;->p1(Z)V

    .line 62
    .line 63
    .line 64
    :cond_4
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-nez p1, :cond_1

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_1
    const-class v1, Lzw0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v1, v2, :cond_2

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_2
    check-cast p1, Lzw0;

    .line 18
    .line 19
    iget-object v1, p0, Lzw0;->X:Lxz4;

    .line 20
    .line 21
    iget-object v2, p1, Lzw0;->X:Lxz4;

    .line 22
    .line 23
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v1, p0, Lzw0;->Y:Ltb3;

    .line 31
    .line 32
    iget-object v2, p1, Lzw0;->Y:Ltb3;

    .line 33
    .line 34
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget-boolean v1, p0, Lzw0;->Z:Z

    .line 42
    .line 43
    iget-boolean v2, p1, Lzw0;->Z:Z

    .line 44
    .line 45
    if-eq v1, v2, :cond_5

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_5
    iget-object v1, p0, Lzw0;->f0:Ldn2;

    .line 49
    .line 50
    iget-object v2, p1, Lzw0;->f0:Ldn2;

    .line 51
    .line 52
    if-eq v1, v2, :cond_6

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_6
    iget-object p0, p0, Lzw0;->g0:Ldn2;

    .line 56
    .line 57
    iget-object p1, p1, Lzw0;->g0:Ldn2;

    .line 58
    .line 59
    if-eq p0, p1, :cond_7

    .line 60
    .line 61
    :goto_0
    const/4 p0, 0x0

    .line 62
    return p0

    .line 63
    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lzw0;->X:Lxz4;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-object v3, p0, Lzw0;->Y:Ltb3;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v3}, Ltb3;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v3, v0

    .line 25
    :goto_1
    add-int/2addr v1, v3

    .line 26
    mul-int/2addr v1, v2

    .line 27
    invoke-static {v1, v2, v0}, Lpc6;->f(IIZ)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget-boolean v2, p0, Lzw0;->Z:Z

    .line 32
    .line 33
    const/16 v3, 0x745f

    .line 34
    .line 35
    invoke-static {v1, v3, v2}, Lpc6;->f(IIZ)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v2, p0, Lzw0;->f0:Ldn2;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/2addr v2, v1

    .line 46
    mul-int/lit16 v2, v2, 0x3c1

    .line 47
    .line 48
    iget-object p0, p0, Lzw0;->g0:Ldn2;

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    :cond_2
    add-int/2addr v2, v0

    .line 57
    mul-int/lit16 v2, v2, 0x3c1

    .line 58
    .line 59
    const/4 p0, 0x1

    .line 60
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v2

    .line 65
    return p0
.end method
